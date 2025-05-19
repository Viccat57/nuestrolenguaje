package com.nuestrolenguaje;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.nuestrolenguaje.manbelParser.FloopContext;
import com.nuestrolenguaje.manbelParser.InstruccionContext;


public class manbelCustomVisitor extends manbelBaseVisitor<Object> {

    private final Map<String, Object> tablaSimbolos = new HashMap<>();

    // ========== MÉTODOS PRINCIPALES ==========

    @Override
    public Object visitPrograma(manbelParser.ProgramaContext ctx) {

        for (manbelParser.InstruccionContext instr : ctx.instruccion()) {
            visit(instr);
        }
        return null;
    }

    @Override
    public Object visitInstruccion(InstruccionContext ctx) {
        String tipoInstruccion = getTipoInstruccion(ctx);
    
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
        } else {
            logError("Instruccion no reconocida: " + ctx.getText());
            throw new RuntimeException("Instruccion no reconocida: " + ctx.getText());
        }
    }

    // ========== DECLARACIONES Y ASIGNACIONES ==========

    @Override
    public Object visitDeclaracion(manbelParser.DeclaracionContext ctx) {
        String tipo = ctx.TIPO().getText();
        String id = ctx.ID().getText();
        Object valor = (ctx.expr() != null) ? visit(ctx.expr()) : getValorPorDefecto(tipo);
        valor = convertirTipo(valor, tipo);
        tablaSimbolos.put(id, valor);

        return valor;
    }


    @Override
    public Object visitMostrar(manbelParser.MostrarContext ctx) {
        Object valor = visit(ctx.expr());
        
        if (valor instanceof Boolean) {
            String output = (Boolean) valor ? "neta" : "falacia";
            System.out.println(output);
        } else {
            System.out.println(valor.toString());
        }
        
        return null;
    }

    @Override
    public Object visitAsig(manbelParser.AsigContext ctx) {
        String id = ctx.ID().getText();
        Object valor = visit(ctx.expr());

        if (!tablaSimbolos.containsKey(id)) {
            logError("Variable no declarada: " + id);
            throw new RuntimeException("Variable no declarada: " + id);
        }

        Object valorOriginal = tablaSimbolos.get(id);
        valor = convertirValor(valor, valorOriginal);

        tablaSimbolos.put(id, valor);
        return valor;
    }

    // ========== EXPRESIONES MATEMÁTICAS ==========

// Manejo de expresiones aritméticas (suma/resta)
@Override
public Object visitExpresionAritmetica(manbelParser.ExpresionAritmeticaContext ctx) {
    Object resultado = visit(ctx.termino(0));

    for (int i = 1; i < ctx.termino().size(); i++) {
        String operador = ctx.op.getText(); 
        Object termino = visit(ctx.termino(i));

        switch (operador) {
            case "+":
                resultado = sumar(resultado, termino);
                break;
            case "-":
                resultado = restar(resultado, termino);
                break;
        }
    }
    return resultado;
}

// Manejo de comparaciones (>, <, ==, etc.)
@Override
public Object visitExpresionComparacion(manbelParser.ExpresionComparacionContext ctx) {
    Object izquierda = visit(ctx.expr(0));
    Object derecha = visit(ctx.expr(1));
    String operador = ctx.op.getText();
    
    if (operador.matches("[<>]=?")) {
        double numIzq = convertToNumber(izquierda);
        double numDer = convertToNumber(derecha);
        switch (operador) {
            case ">":  return numIzq > numDer;
            case "<":  return numIzq < numDer;
            case ">=": return numIzq >= numDer;
            case "<=": return numIzq <= numDer;
        }
    } else if (operador.equals("==")) {
        return Objects.equals(izquierda, derecha);
    }
    
    throw new RuntimeException("Operador no manejado: " + operador);
}

@Override
public Object visitExpresionIncremento(manbelParser.ExpresionIncrementoContext ctx) {
    return visit(ctx.incremento()); 
}

    @Override
    public Object visitTermino(manbelParser.TerminoContext ctx) {
        Object resultado = visit(ctx.factor(0));

        for (int i = 1; i < ctx.factor().size(); i++) {
            String operador = ctx.getChild(i * 2 - 1).getText();
            Object factor = visit(ctx.factor(i));

            switch (operador) {
                case "*":
                    resultado = multiplicar(resultado, factor);
                    break;
                case "/":
                    resultado = dividir(resultado, factor);
                    break;
            }
        }

        return resultado;
    }

    // ========== ESTRUCTURAS DE CONTROL ==========

@Override
public Object visitDef(manbelParser.DefContext ctx) {
    boolean condicionCheca = (Boolean) visit(ctx.condicion());

    if (condicionCheca) {
        ctx.instruccion().forEach(this::visit);
    } else {
        boolean algunSinoChecaEjecutado = false;
        for (manbelParser.Else_ifContext elseIfCtx : ctx.else_if()) {
            boolean condicionSinoCheca = (Boolean) visit(elseIfCtx.condicion());

            if (condicionSinoCheca && !algunSinoChecaEjecutado) {
                elseIfCtx.instruccion().forEach(this::visit);
                algunSinoChecaEjecutado = true;
            }
        }

        if (!algunSinoChecaEjecutado && ctx.else_block() != null) {
            ctx.else_block().instruccion().forEach(this::visit);
        }
    }
    return null;
}

    @Override
    public Object visitCondicion(manbelParser.CondicionContext ctx) {
       
        Object izquierda = visit(ctx.expr(0));
        Object derecha = visit(ctx.expr(1));
    
        String operador;
        if (ctx.MAYOR() != null) {
            operador = ">";
        } else if (ctx.MENOR() != null) {
            operador = "<";
        } else if (ctx.MAYOR_EQ() != null) {
            operador = ">=";
        } else if (ctx.MENOR_EQ() != null) {
            operador = "<=";
        } else if (ctx.IGUAL() != null) {
            operador = "==";
        } else {
            logError("Operador de comparación no reconocido");
            throw new RuntimeException("Operador de comparación no reconocido");
        }
    
        if (operador.matches("[<>]=?")) {
            try {
                double numIzq = convertToNumber(izquierda);
                double numDer = convertToNumber(derecha);
    
                switch (operador) {
                    case ">":  return numIzq > numDer;
                    case "<":  return numIzq < numDer;
                    case ">=": return numIzq >= numDer;
                    case "<=": return numIzq <= numDer;
                }
            } catch (RuntimeException e) {
                logError("Error en comparación numérica: " + e.getMessage());
                throw e;
            }
        }
    
        if (operador.equals("==")) {
            if (izquierda instanceof Number && derecha instanceof Number) {
                return ((Number) izquierda).doubleValue() == ((Number) derecha).doubleValue();
            }
            return Objects.equals(izquierda, derecha);
        }
    
        throw new RuntimeException("Operador no manejado: " + operador);
    }

    @Override
    public Object visitFactor(manbelParser.FactorContext ctx) {
        if (ctx.NUM() != null) {
            String numText = ctx.NUM().getText();
            try {
                if (numText.contains(".")) {
                    return Double.parseDouble(numText);
                } else {
                    return Integer.parseInt(numText);
                }
            } catch (NumberFormatException e) {
                logError("Formato numerico invalido: " + numText);
                throw new RuntimeException("Formato numerico invalido: " + numText);
            }
        } else if (ctx.ID() != null) {
            // Manejo de variables (búsqueda en tabla de símbolos)
            String id = ctx.ID().getText();
            if (!tablaSimbolos.containsKey(id)) {
                logError("Variable no declarada: " + id);
                throw new RuntimeException("Variable no declarada: " + id);
            }
            return tablaSimbolos.get(id);
        } else if (ctx.STRING() != null) {
            // Manejo de strings (removiendo comillas)
            return ctx.STRING().getText().replaceAll("^\"|\"$", "");
        } else if (ctx.BOOL() != null) {
            // Manejo de booleanos
            return Boolean.parseBoolean(ctx.BOOL().getText());
        } else if (ctx.expr() != null) {
            // Manejo de expresiones entre paréntesis
            return visit(ctx.expr());
        } else {
            logError("Factor no reconocido: " + ctx.getText());
            throw new RuntimeException("Factor no reconocido: " + ctx.getText());
        }
    }

    // ========== MÉTODOS AUXILIARES ==========

    @Override
    public Object visitFloop(FloopContext ctx) {
        try {
            if (ctx.declaracion() != null) {
                visit(ctx.declaracion());
            } else if (!ctx.asig().isEmpty()) {
                visit(ctx.asig(0));
            }
    
            while (true) {
                if (ctx.condicion() != null) {
                    Object cond = visit(ctx.condicion());
                    if (!(cond instanceof Boolean)) {
                        logError("La condición debe ser booleana");
                        throw new RuntimeException("La condición debe ser booleana");
                    }
                    if (!(Boolean) cond) {
                        break; 
                    }
                }
    
                // 2.2 Ejecutar cuerpo del foopi
                for (InstruccionContext instr : ctx.instruccion()) {
                    visit(instr);
                }
    
                // 2.3 Paso de actualización (¡Clave aquí!)
                if (!ctx.asig().isEmpty()) {
                    visit(ctx.asig(ctx.asig().size() - 1)); 
                } else if (ctx.incremento() != null) {
                    visit(ctx.incremento()); 
                }
            }
        } catch (Exception e) {
            logError("Error en ciclo foopi: " + e.getMessage());
            throw new RuntimeException("Error en ciclo foopi: " + e.getMessage());
        }
        return null;
    }

    private Object convertirTipo(Object valor, String tipo) {
        try {
            switch (tipo) {
                case "enterito":     
                    return ((Number) valor).intValue();
                case "pedacito":   
                    return ((Number) valor).doubleValue();
                case "bolas":       
                    return Boolean.parseBoolean(valor.toString());
                case "texto":       
                    return valor.toString();
                default:
                    return valor;
            }
        } catch (Exception e) {
            throw new RuntimeException("Error de conversion: " + e.getMessage());
        }
    }
    private Object getValorPorDefecto(String tipo) {
        switch (tipo) {
            case "enterito":
                return 0;
            case "pedacito":
                return 0.0;
            case "bolas":
                return false; 
            case "texto":
                return "";
            default:
                return null;
        }
    }

    private void logError(String mensaje) {
        System.err.println("[ERROR] " + mensaje);
    }


    private Object sumar(Object a, Object b) {
        if (a instanceof String || b instanceof String) {
            return a.toString() + b.toString();
        }
        return ((Number) a).doubleValue() + ((Number) b).doubleValue();
    }

    private Object restar(Object a, Object b) {
        return ((Number) a).doubleValue() - ((Number) b).doubleValue();
    }

    private Object multiplicar(Object a, Object b) {
        return ((Number) a).doubleValue() * ((Number) b).doubleValue();
    }

    private Object dividir(Object a, Object b) {
        try {
            double divisor = ((Number) b).doubleValue();
            if (divisor == 0) {
                throw new ArithmeticException("Division por cero no permitida"); 
            }
            return ((Number) a).doubleValue() / divisor;
        } catch (ArithmeticException e) {
            logError(e.getMessage());
            throw new ArithmeticException("Division por cero no permitida");
        }
    }

private String getTipoInstruccion(InstruccionContext ctx) {
    if (ctx.declaracion() != null) return "Declaracion";
    if (ctx.asig() != null) return "Asignacion";
    if (ctx.incremento() != null) return "Incremento";
    if (ctx.expr() != null) return "Expresion";
    if (ctx.def() != null) return "Checa-Sino";  
    if (ctx.floop() != null) return "Foopi";     
    if (ctx.mostrar() != null) return "Mostrar";
    return "Instruccion desconocida";
}

    private Object convertirValor(Object nuevoValor, Object valorOriginal) {
        if (valorOriginal instanceof Integer) {
            return ((Number) nuevoValor).intValue();
        } else if (valorOriginal instanceof Double) {
            return ((Number) nuevoValor).doubleValue();
        }
        return nuevoValor;
    }

    @Override
    public Object visitElse_if(manbelParser.Else_ifContext ctx) {
        return visit(ctx.condicion());
    }

    @Override
    public Object visitElse_block(manbelParser.Else_blockContext ctx) {
        return null;
    }

    private double convertToNumber(Object value) {
        if (value instanceof Number) {
            return ((Number) value).doubleValue();
        }
        try {
            return Double.parseDouble(value.toString());
        } catch (NumberFormatException e) {
            logError("No se pudo convertir a número: " + value);
            throw new RuntimeException("No se pudo convertir a número: " + value);
        }
    }

    @Override
    public Object visitIncremento(manbelParser.IncrementoContext ctx) {

        String varName = ctx.ID().getText();

        // Verificar si la variable existe
        if (!tablaSimbolos.containsKey(varName)) {
            logError("Variable no declarada: " + varName);
            throw new RuntimeException("Variable no declarada: " + varName);
        }

        // Obtener el valor actual
        Object currentValue = tablaSimbolos.get(varName);
        double numericValue;

        // Convertir a número
        try {
            numericValue = convertToNumber(currentValue);
        } catch (NumberFormatException e) {
            logError("No se puede incrementar una variable no numérica: " + varName);
            throw new RuntimeException("No se puede incrementar una variable no numérica: " + varName);
        }

        // Incrementar el valor
        double newValue = numericValue + 1;

        // Actualizar la tabla de símbolos
        if (currentValue instanceof Integer) {
            tablaSimbolos.put(varName, (int) newValue);
        } else if (currentValue instanceof Double) {
            tablaSimbolos.put(varName, newValue);
        } else {
            // Si no es numérico, lo convertimos a entero
            tablaSimbolos.put(varName, (int) newValue);
        }

        // Retornar el valor según sea pre o post-incremento
        if (ctx.getChild(0) == ctx.ID()) {
            // Post-incremento (i++): retorna el valor antes de incrementar
            return currentValue;
        } else {
            // Pre-incremento (++i): retorna el valor después de incrementar
            return newValue;
        }
    }

}