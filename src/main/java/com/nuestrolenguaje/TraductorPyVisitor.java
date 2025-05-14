package com.nuestrolenguaje;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.tree.ParseTree;

public class TraductorPyVisitor extends manbelBaseVisitor<String> {
    private int indentLevel = 0;
    private final Map<String, String> symbolTable = new HashMap<>();

    public String translate(String inputCode) {
        try {
            CharStream input = CharStreams.fromString(inputCode);
            manbelLexer lexer = new manbelLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            manbelParser parser = new manbelParser(tokens);
            
            parser.removeErrorListeners();
            parser.addErrorListener(new BaseErrorListener() {
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                    int line, int charPositionInLine,
                                    String msg, RecognitionException e) {
                    throw new RuntimeException("Error en línea " + line + ":" + charPositionInLine + " - " + msg);
                }
            });
            
            ParseTree tree = parser.programa();
            return visit(tree);
        } catch (Exception e) {
            throw new RuntimeException("Error al traducir: " + e.getMessage());
        }
    }

    @Override
    public String visitPrograma(manbelParser.ProgramaContext ctx) {
        StringBuilder pyCode = new StringBuilder();
        
        if (ctx.instruccion() != null) {
            for (manbelParser.InstruccionContext instr : ctx.instruccion()) {
                String translated = visit(instr);
                if (translated != null && !translated.trim().isEmpty()) {
                    pyCode.append(translated);
                    // Añadir salto de línea solo si no termina con uno
                    if (!translated.endsWith("\n")) {
                        pyCode.append("\n");
                    }
                }
            }
        }
        return pyCode.toString();
    }

    @Override
    public String visitDeclaracion(manbelParser.DeclaracionContext ctx) {
        if (ctx.TIPO() == null || ctx.ID() == null) return "";
        String tipo = ctx.TIPO().getText();
        String nombre = ctx.ID().getText();
        String valor = ctx.expr() != null ? visit(ctx.expr()) : getDefaultValue(tipo);
        symbolTable.put(nombre, tipo);
        return nombre + " = " + valor;
    }

    @Override
    public String visitAsig(manbelParser.AsigContext ctx) {
        return ctx.ID().getText() + " = " + visit(ctx.expr());
    }

    @Override
    public String visitMostrar(manbelParser.MostrarContext ctx) {
        String expresion = visit(ctx.expr());
        // Simplemente generar el print con la expresión tal cual
        return "print(" + expresion + ")";
    }

    @Override
    public String visitFloop(manbelParser.FloopContext ctx) {
        StringBuilder pyCode = new StringBuilder();
        
        // Manejo de foopi con inicialización, condición y actualización
        if (ctx.declaracion() != null || !ctx.asig().isEmpty()) {
            String init = ctx.declaracion() != null ? visit(ctx.declaracion()) : visit(ctx.asig(0));
            String varName = init.split(" = ")[0];
            String startVal = init.split(" = ")[1];

            String condition = ctx.condicion() != null ? visit(ctx.condicion()) : "True";
            String endVal = condition.replaceAll(".*(<|<=)\\s*", ""); // Extrae el valor final

            String step = "1";
            if (!ctx.asig().isEmpty()) {
                String update = visit(ctx.asig(ctx.asig().size() - 1)); // Ej: "i = i + 1"
                if (update.contains("+")) {
                    step = "1";
                } else if (update.contains("-")) {
                    step = "-1";
                }
            }

            pyCode.append("for ").append(varName).append(" in range(")
                  .append(startVal).append(", ").append(endVal).append(", ").append(step).append("):\n");
        } else {
            // Si no hay inicialización/cláusula, usamos while
            String condition = ctx.condicion() != null ? visit(ctx.condicion()) : "True";
            pyCode.append("while ").append(condition).append(":\n");
        }

        // Cuerpo del loop (indentado)
        indentLevel++;
        for (manbelParser.InstruccionContext instr : ctx.instruccion()) {
            pyCode.append("    ".repeat(indentLevel)).append(visit(instr)).append("\n");
        }
        indentLevel--;

        return pyCode.toString();
    }

    @Override
    public String visitDef(manbelParser.DefContext ctx) {
        StringBuilder pyCode = new StringBuilder();
        pyCode.append("if ").append(visit(ctx.condicion())).append(":\n");
        
        indentLevel++;
        for (manbelParser.InstruccionContext instr : ctx.instruccion()) {
            pyCode.append("    ".repeat(indentLevel)).append(visit(instr)).append("\n");
        }
        indentLevel--;

        // Else-if (sino checa)
        for (manbelParser.Else_ifContext elifCtx : ctx.else_if()) {
            pyCode.append("elif ").append(visit(elifCtx.condicion())).append(":\n");
            indentLevel++;
            for (manbelParser.InstruccionContext instr : elifCtx.instruccion()) {
                pyCode.append("    ".repeat(indentLevel)).append(visit(instr)).append("\n");
            }
            indentLevel--;
        }

        // Else (sino)
        if (ctx.else_block() != null) {
            pyCode.append("else:\n");
            indentLevel++;
            for (manbelParser.InstruccionContext instr : ctx.else_block().instruccion()) {
                pyCode.append("    ".repeat(indentLevel)).append(visit(instr)).append("\n");
            }
            indentLevel--;
        }

        return pyCode.toString();
    }

    @Override
    public String visitTermino(manbelParser.TerminoContext ctx) {
        StringBuilder pyCode = new StringBuilder(visit(ctx.factor(0)));
        for (int i = 1; i < ctx.factor().size(); i++) {
            String op = ctx.getChild(i * 2 - 1).getText();
            pyCode.append(" ").append(op).append(" ").append(visit(ctx.factor(i)));
        }
        return pyCode.toString();
    }

    @Override
    public String visitFactor(manbelParser.FactorContext ctx) {
        if (ctx.NUM() != null) {
            return ctx.NUM().getText();
        }
        if (ctx.ID() != null) {
            String id = ctx.ID().getText();
            if (!symbolTable.containsKey(id)) {
                throw new RuntimeException("Variable no declarada: " + id);
            }
            return id;
        }
        if (ctx.STRING() != null) {
            return ctx.STRING().getText(); // Conserva las comillas
        }
        if (ctx.BOOL() != null) {
            return ctx.BOOL().getText().equals("neta") ? "True" : "False";
        }
        if (ctx.expr() != null) {
            return "(" + visit(ctx.expr()) + ")"; // Mantiene paréntesis
        }
        throw new RuntimeException("Factor no reconocido: " + ctx.getText());
    }

    @Override
    public String visitExpresionAritmetica(manbelParser.ExpresionAritmeticaContext ctx) {
        StringBuilder pyCode = new StringBuilder(visit(ctx.termino(0)));
        for (int i = 1; i < ctx.termino().size(); i++) {
            String op = ctx.op.getText(); // Operador (+ o -)
            pyCode.append(" ").append(op).append(" ").append(visit(ctx.termino(i)));
        }
        return pyCode.toString();
    }

    @Override
    public String visitExpresionComparacion(manbelParser.ExpresionComparacionContext ctx) {
        String izquierda = visit(ctx.expr(0));
        String derecha = visit(ctx.expr(1));
        String operador = ctx.op.getText();
        
        return izquierda + " " + operador + " " + derecha;
    }

    @Override
    public String visitCondicion(manbelParser.CondicionContext ctx) {
        String izquierda = visit(ctx.expr(0));
        String derecha = visit(ctx.expr(1));
        
        if (ctx.MAYOR() != null) return izquierda + " > " + derecha;
        if (ctx.MENOR() != null) return izquierda + " < " + derecha;
        if (ctx.MAYOR_EQ() != null) return izquierda + " >= " + derecha;
        if (ctx.MENOR_EQ() != null) return izquierda + " <= " + derecha;
        if (ctx.IGUAL() != null) return izquierda + " == " + derecha;
        
        throw new RuntimeException("Operador de comparación no reconocido");
    }

    @Override
    public String visitInstruccion(manbelParser.InstruccionContext ctx) {
        // Asegurar que todas las posibles instrucciones sean visitadas
        if (ctx.declaracion() != null) {
            return visit(ctx.declaracion());
        } else if (ctx.asig() != null) {
            return visit(ctx.asig());
        } else if (ctx.mostrar() != null) {
            return visit(ctx.mostrar());
        } else if (ctx.floop() != null) {
            return visit(ctx.floop());
        } else if (ctx.def() != null) {
            return visit(ctx.def());
        } else if (ctx.incremento() != null) {
            return visit(ctx.incremento());
        } else if (ctx.expr() != null) {
            return visit(ctx.expr()) + (ctx.SEMI() != null ? "" : "");
        }
        return "";
    }

    @Override
    public String visitIncremento(manbelParser.IncrementoContext ctx) {
        String id = ctx.ID().getText();
        return id + " += 1"; // Simplificado para Python
    }

    private String getDefaultValue(String tipo) {
        switch(tipo) {
            case "enterito": return "0";
            case "pedacito": return "0.0";
            case "texto":    return "\"\"";
            case "bolas":    return "False";
            default:         return "None";
        }
    }
}