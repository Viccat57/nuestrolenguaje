package com.nuestrolenguaje;

public class TraductorPyVisitor extends manbelBaseVisitor<String> {
    enum Lang { PYTHON }
    enum type { INT, FLOAT, BOOLEAN, STRING }
    private Lang lang;

    public TraductorPyVisitor(Lang lang) {
        this.lang = lang;
    }

    @Override
    public String visitPrograma(manbelParser.ProgramaContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (manbelParser.InstruccionContext instruccion : ctx.instruccion()) {
            sb.append(visit(instruccion));
        }
        return sb.toString();
    }

    @Override
    public String visitInstruccion(manbelParser.InstruccionContext ctx) {
        if (ctx.declaracion() != null) {
            return visit(ctx.declaracion());
        } else if (ctx.asig() != null) {
            return visit(ctx.asig());
        } else if (ctx.incremento() != null) {
            return visit(ctx.incremento());
        } else if (ctx.expr() != null) {
            return visit(ctx.expr());
        } else if (ctx.def() != null) {
            return visit(ctx.def());
        } else if (ctx.floop() != null) {
            return visit(ctx.floop());
        } else if (ctx.mostrar() != null) {
            return visit(ctx.mostrar());
        }

        return "";
    }


}
