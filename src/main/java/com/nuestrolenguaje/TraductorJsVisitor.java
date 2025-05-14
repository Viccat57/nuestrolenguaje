package com.nuestrolenguaje;

import com.nuestrolenguaje.manbelParser.*;

public class TraductorJsVisitor extends manbelBaseVisitor<String> {

    @Override
    public String visitPrograma(manbelParser.ProgramaContext ctx) {
        StringBuilder jsCode = new StringBuilder();
        for (manbelParser.InstruccionContext instr : ctx.instruccion()) {
            String translated = visit(instr);
            if (translated != null) {
                jsCode.append(translated).append("\n");
            }
        }
        return jsCode.toString();
    }

    @Override
    public String visitDeclaracion(manbelParser.DeclaracionContext ctx) {
        String id = ctx.ID().getText();
        String valor = (ctx.expr() != null) ? visit(ctx.expr()) : "0";
        return "let " + id + " = " + valor + ";";
    }

    @Override
    public String visitAsig(manbelParser.AsigContext ctx) {
        String id = ctx.ID().getText();
        String valor = visit(ctx.expr());
        return id + " = " + valor + ";";
    }

    @Override
    public String visitMostrar(manbelParser.MostrarContext ctx) {
        String expr = visit(ctx.expr());
        return "console.log(" + expr + ");";
    }

    @Override
    public String visitExpresionAritmetica(manbelParser.ExpresionAritmeticaContext ctx) {
        String left = visit(ctx.termino(0));
        for (int i = 1; i < ctx.termino().size(); i++) {
            String op = ctx.op.getText();
            String right = visit(ctx.termino(i));
            left = "(" + left + " " + op + " " + right + ")";
        }
        return left;
    }

    @Override
    public String visitExpresionComparacion(manbelParser.ExpresionComparacionContext ctx) {
        String left = visit(ctx.expr(0));
        String right = visit(ctx.expr(1));
        String op = ctx.op.getText();
        return "(" + left + " " + op + " " + right + ")";
    }

    @Override
    public String visitFloop(manbelParser.FloopContext ctx) {
        StringBuilder jsFor = new StringBuilder();
        
        // Inicialización
        String init = "";
        if (ctx.declaracion() != null) {
            init = visit(ctx.declaracion()).replace("let ", "").replace(";", "");
        } else if (!ctx.asig().isEmpty()) {
            init = visit(ctx.asig(0)).replace(";", "");
        }
        
        // Condición
        String cond = (ctx.condicion() != null) ? visit(ctx.condicion()) : "true";
        
        // Actualización
        String update = "";
        if (!ctx.asig().isEmpty()) {
            update = visit(ctx.asig(ctx.asig().size() - 1)).replace(";", "");
        } else if (ctx.incremento() != null) {
            update = visit(ctx.incremento());
        }
        
        jsFor.append("for (let ").append(init).append("; ").append(cond).append("; ").append(update).append(") {\n");
        
        // Cuerpo
        for (InstruccionContext instr : ctx.instruccion()) {
            String bodyInstr = visit(instr);
            if (bodyInstr != null) {
                jsFor.append("    ").append(bodyInstr).append("\n");
            }
        }
        
        jsFor.append("}");
        return jsFor.toString();
    }

    @Override
    public String visitDef(manbelParser.DefContext ctx) {
        StringBuilder jsIf = new StringBuilder();
        jsIf.append("if (").append(visit(ctx.condicion())).append(") {\n");
        
        // Bloque if
        for (InstruccionContext instr : ctx.instruccion()) {
            String ifInstr = visit(instr);
            if (ifInstr != null) {
                jsIf.append("    ").append(ifInstr).append("\n");
            }
        }
        jsIf.append("}");
        
        // Else if
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
        
        // Else
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

    @Override
    public String visitIncremento(manbelParser.IncrementoContext ctx) {
        String var = ctx.ID().getText();
        return ctx.getChild(0) == ctx.ID() ? var + "++" : "++" + var;
    }

    @Override
    public String visitCondicion(manbelParser.CondicionContext ctx) {
        String left = visit(ctx.expr(0));
        String right = visit(ctx.expr(1));
        String op = "";
        
        if (ctx.MAYOR() != null) op = ">";
        else if (ctx.MENOR() != null) op = "<";
        else if (ctx.MAYOR_EQ() != null) op = ">=";
        else if (ctx.MENOR_EQ() != null) op = "<=";
        else if (ctx.IGUAL() != null) op = "==";
        
        return left + " " + op + " " + right;
    }

    @Override
    public String visitTermino(manbelParser.TerminoContext ctx) {
        String result = visit(ctx.factor(0));
        for (int i = 1; i < ctx.factor().size(); i++) {
            String op = ctx.getChild(i * 2 - 1).getText();
            String factor = visit(ctx.factor(i));
            result = "(" + result + " " + op + " " + factor + ")";
        }
        return result;
    }

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