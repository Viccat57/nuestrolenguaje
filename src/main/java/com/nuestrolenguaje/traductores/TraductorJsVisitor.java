package com.nuestrolenguaje.traductores;

import com.nuestrolenguaje.manbelBaseVisitor;
import com.nuestrolenguaje.manbelParser;
import com.nuestrolenguaje.manbelParser.InstruccionContext;

/**
 * Visitor que traduce código de un lenguaje personalizado (manbel) a
 * JavaScript.
 * Hereda de manbelBaseVisitor para implementar métodos de visita específicos.
 */
public class TraductorJsVisitor extends manbelBaseVisitor<String> {

    /**
     * Visita un programa (conjunto de instrucciones) y las traduce a JS.
     * 
     * @param ctx Contexto del programa
     * @return Código JavaScript equivalente
     */
    @Override
    public String visitPrograma(manbelParser.ProgramaContext ctx) {
        StringBuilder jsCode = new StringBuilder();
        // Procesa cada instrucción del programa
        for (manbelParser.InstruccionContext instr : ctx.instruccion()) {
            String translated = visitInstruccion(instr);
            if (translated != null) {
                jsCode.append(translated).append("\n");
            }
        }
        return jsCode.toString();
    }

    /**
     * Traduce una declaración de variable a JS (let).
     * 
     * @param ctx Contexto de declaración
     * @return Declaración JS con let
     */
    @Override
    public String visitDeclaracion(manbelParser.DeclaracionContext ctx) {
        String id = ctx.ID().getText();
        // Si tiene expresión, la traduce, sino usa 0 como valor por defecto
        String valor = (ctx.expr() != null) ? visit(ctx.expr()) : "0";
        return "let " + id + " = " + valor + ";";
    }

    /**
     * Traduce una asignación de variable a JS.
     * 
     * @param ctx Contexto de asignación
     * @return Asignación JS
     */
    @Override
    public String visitAsig(manbelParser.AsigContext ctx) {
        String id = ctx.ID().getText();
        String valor = visit(ctx.expr());
        return id + " = " + valor + ";";
    }

    /**
     * Traduce una instrucción de mostrar (print) a console.log de JS.
     * 
     * @param ctx Contexto de mostrar
     * @return console.log equivalente
     */
    @Override
    public String visitMostrar(manbelParser.MostrarContext ctx) {
        String expr = visit(ctx.expr());
        return "console.log(" + expr + ");";
    }

    /**
     * Traduce una expresión aritmética a JS, manejando operadores binarios.
     * 
     * @param ctx Contexto de expresión aritmética
     * @return Expresión aritmética en JS con paréntesis para precedencia
     */
    @Override
    public String visitExpresionAritmetica(manbelParser.ExpresionAritmeticaContext ctx) {
        String left = visit(ctx.termino(0));
        // Combina términos con el operador
        for (int i = 1; i < ctx.termino().size(); i++) {
            String op = ctx.op.getText();
            String right = visit(ctx.termino(i));
            left = "(" + left + " " + op + " " + right + ")";
        }
        return left;
    }

    /**
     * Traduce una expresión de comparación a JS.
     * 
     * @param ctx Contexto de comparación
     * @return Expresión de comparación en JS
     */
    @Override
    public String visitExpresionComparacion(manbelParser.ExpresionComparacionContext ctx) {
        String left = visit(ctx.expr(0));
        String right = visit(ctx.expr(1));
        String op = ctx.op.getText();
        return left + " " + op + " " + right;
    }

    /**
     * Traduce un bucle floop (for) a un for de JS.
     * 
     * @param ctx Contexto del bucle floop
     * @return Bucle for equivalente en JS
     */
    @Override
    public String visitFloop(manbelParser.FloopContext ctx) {
        StringBuilder jsFor = new StringBuilder();

        // Inicialización del for
        String init = "";
        if (ctx.declaracion() != null) {
            init = visit(ctx.declaracion()).replace("let ", "").replace(";", "");
        } else if (!ctx.asig().isEmpty()) {
            init = visit(ctx.asig(0)).replace(";", "");
        }

        // Condición del for (si no hay, usa true)
        String cond = (ctx.condicion() != null) ? visit(ctx.condicion()) : "true";

        // Actualización del for
        String update = "";
        if (!ctx.asig().isEmpty()) {
            update = visit(ctx.asig(ctx.asig().size() - 1)).replace(";", "");
        } else if (ctx.incremento() != null) {
            update = visit(ctx.incremento());
        }

        // Construye la estructura del for
        jsFor.append("for (let ").append(init).append("; ").append(cond).append("; ").append(update).append(") {\n");

        // Cuerpo del for
        for (InstruccionContext instr : ctx.instruccion()) {
            String bodyInstr = visit(instr);
            if (bodyInstr != null) {
                jsFor.append("    ").append(bodyInstr).append("\n");
            }
        }

        jsFor.append("}");
        return jsFor.toString();
    }

    /**
     * Traduce una estructura condicional def (if) a JS.
     * 
     * @param ctx Contexto del if
     * @return Estructura if-else if-else equivalente en JS
     */
    @Override
    public String visitDef(manbelParser.DefContext ctx) {
        StringBuilder jsIf = new StringBuilder();
        // Bloque if principal
        jsIf.append("if (").append(visit(ctx.condicion())).append(") {\n");

        // Instrucciones dentro del if
        for (InstruccionContext instr : ctx.instruccion()) {
            String ifInstr = visit(instr);
            if (ifInstr != null) {
                jsIf.append("    ").append(ifInstr).append("\n");
            }
        }
        jsIf.append("}");

        // Bloques else if
        for (manbelParser.Else_ifContext elseIfCtx : ctx.else_if()) {
            jsIf.append(" else if (").append(visit(elseIfCtx.condicion())).append(") {\n");
            for (InstruccionContext instr : elseIfCtx.instruccion()) {
                String elseIfInstr = visit(instr);
                if (elseIfInstr != null) {
                    jsIf.append("    ").append(elseIfInstr).append("\n");
                }
            }
            jsIf.append("}");
        }

        // Bloque else
        if (ctx.else_block() != null) {
            jsIf.append(" else {\n");
            for (InstruccionContext instr : ctx.else_block().instruccion()) {
                String elseInstr = visit(instr);
                if (elseInstr != null) {
                    jsIf.append("    ").append(elseInstr).append("\n");
                }
            }
            jsIf.append("}");
        }

        return jsIf.toString();
    }

    /**
     * Traduce un factor (elemento básico de expresión) a JS.
     * 
     * @param ctx Contexto del factor
     * @return Representación JS del factor (número, variable, string, etc.)
     */
    @Override
    public String visitFactor(manbelParser.FactorContext ctx) {
        if (ctx.NUM() != null) {
            return ctx.NUM().getText();
        } else if (ctx.ID() != null) {
            return ctx.ID().getText();
        } else if (ctx.STRING() != null) {
            return ctx.STRING().getText();
        } else if (ctx.BOOL() != null) {
            return ctx.BOOL().getText();
        } else if (ctx.expr() != null) {
            return "(" + visit(ctx.expr()) + ")";
        }
        return "";
    }

    /**
     * Traduce un incremento (pre o post) a JS.
     * 
     * @param ctx Contexto del incremento
     * @return Incremento en JS (++var o var++)
     */
    @Override
    public String visitIncremento(manbelParser.IncrementoContext ctx) {
        String var = ctx.ID().getText();
        // Determina si es pre-incremento o post-incremento
        return ctx.getChild(0) == ctx.ID() ? var + "++" : "++" + var;
    }

    /**
     * Traduce una condición de comparación a JS.
     * 
     * @param ctx Contexto de la condición
     * @return Expresión condicional en JS
     */
    @Override
    public String visitCondicion(manbelParser.CondicionContext ctx) {
        String left = visit(ctx.expr(0));
        String right = visit(ctx.expr(1));
        String op = "";

        // Determina el operador de comparación
        if (ctx.MAYOR() != null)
            op = ">";
        else if (ctx.MENOR() != null)
            op = "<";
        else if (ctx.MAYOR_EQ() != null)
            op = ">=";
        else if (ctx.MENOR_EQ() != null)
            op = "<=";
        else if (ctx.IGUAL() != null)
            op = "==";

        return left + " " + op + " " + right;
    }

    /**
     * Traduce un término (multiplicación/división de factores) a JS.
     * 
     * @param ctx Contexto del término
     * @return Expresión JS con operaciones de multiplicación/división
     */
    @Override
    public String visitTermino(manbelParser.TerminoContext ctx) {
        String result = visit(ctx.factor(0));
        // Combina factores con operadores de multiplicación/división
        for (int i = 1; i < ctx.factor().size(); i++) {
            String op = ctx.getChild(i * 2 - 1).getText();
            String factor = visit(ctx.factor(i));
            result = "(" + result + " " + op + " " + factor + ")";
        }
        return result;
    }

    /**
     * Método genérico para visitar cualquier instrucción y delegar al método
     * específico.
     * 
     * @param ctx Contexto de la instrucción
     * @return Instrucción traducida a JS
     */
    @Override
    public String visitInstruccion(manbelParser.InstruccionContext ctx) {
        if (ctx.declaracion() != null) {
            return visit(ctx.declaracion());
        } else if (ctx.asig() != null) {
            return visit(ctx.asig());
        } else if (ctx.incremento() != null) {
            return visit(ctx.incremento());
        } else if (ctx.mostrar() != null) {
            return visit(ctx.mostrar());
        } else if (ctx.def() != null) {
            return visit(ctx.def());
        } else if (ctx.floop() != null) {
            return visit(ctx.floop());
        } else if (ctx.expr() != null) {
            return visit(ctx.expr()) + ";";
        }
        return "";
    }
}