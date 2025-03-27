package com.nuestrolenguaje;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.nuestrolenguaje.manbelParser.FloopContext;
import com.nuestrolenguaje.manbelParser.InstruccionContext;

public class manbelCustomVisitor extends manbelBaseVisitor<Object> {

    private final Map<String, Object> tablaSimbolos = new HashMap<>();
    private boolean debugMode = true;

    // ========== MÉTODOS PRINCIPALES ==========

    @Override
    public Object visitPrograma(manbelParser.ProgramaContext ctx) {
        log("=== INICIANDO EJECUCION ===");

        for (manbelParser.InstruccionContext instr : ctx.instruccion()) {
            visit(instr);
        }

        log("\n=== TABLA DE SIMBOLOS FINAL ===");
        tablaSimbolos.forEach((k, v) -> System.out.printf("%-10s = %-8s (%s)%n",
                k, v, (v != null) ? v.getClass().getSimpleName() : "null"));

        return null;
    }

    @Override
    public Object visitInstruccion(InstruccionContext ctx) {
        
        String tipoInstruccion = getTipoInstruccion(ctx);
        log("\nProcesando " + tipoInstruccion + ": " + ctx.getText().replaceAll("\\s+", " "));

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
        } else {
            logError("Instruccion no reconocida: " + ctx.getText());
            return null;
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

        log("Declarado: " + tipo + " " + id + " = " + valor);
        return valor;
    }

    @Override
    public Object visitAsig(manbelParser.AsigContext ctx) {
        String id = ctx.ID().getText();
        Object valor = visit(ctx.expr());

        // Verificar si la variable existe
        if (!tablaSimbolos.containsKey(id)) {
            logError("Variable no declarada: " + id);
            return null;
        }

        // Convertir al tipo original
        Object valorOriginal = tablaSimbolos.get(id);
        valor = convertirValor(valor, valorOriginal);

        tablaSimbolos.put(id, valor);
        log("Asignado: " + id + " = " + valor);
        return valor;
    }

    // ========== EXPRESIONES MATEMÁTICAS ==========

    @Override
    public Object visitExpr(manbelParser.ExprContext ctx) {
        Object resultado = visit(ctx.termino(0));

        for (int i = 1; i < ctx.termino().size(); i++) {
            String operador = ctx.getChild(i * 2 - 1).getText();
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

        log("Resultado expresion: " + resultado);
        return resultado;
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
        boolean condicionIf = (Boolean) visit(ctx.condicion());
        log("Evaluando if: " + ctx.condicion().getText() + " -> " + condicionIf);

        if (condicionIf) {
            // Ejecutar bloque if
            ctx.instruccion().forEach(this::visit);
        } else {
            // Probar else ifs
            boolean algunElseIfEjecutado = false;
            for (manbelParser.Else_ifContext elseIfCtx : ctx.else_if()) {
                boolean condicionElseIf = (Boolean) visit(elseIfCtx.condicion());
                log("Evaluando else if: " + elseIfCtx.condicion().getText() + " -> " + condicionElseIf);
                
                if (condicionElseIf && !algunElseIfEjecutado) {
                    elseIfCtx.instruccion().forEach(this::visit);
                    algunElseIfEjecutado = true;
                }
            }
            
            // Si no se ejecutó ningún else if, probar else
            if (!algunElseIfEjecutado && ctx.else_block() != null) {
                log("Ejecutando else");
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
            return false;
        }

        // Realizar la comparación numérica para operadores relacionales
        if (operador.matches("[<>]=?")) {
            double numIzq = convertToNumber(izquierda);
            double numDer = convertToNumber(derecha);
            
            switch (operador) {
                case ">": return numIzq > numDer;
                case "<": return numIzq < numDer;
                case ">=": return numIzq >= numDer;
                case "<=": return numIzq <= numDer;
            }
        }

        // Comparación de igualdad/desigualdad
        boolean igualdad = Objects.equals(izquierda, derecha);
        return operador.equals("==") ? igualdad : !igualdad;
    }

    @Override
    public Object visitFactor(manbelParser.FactorContext ctx) {
        if (ctx.NUM() != null) {
            // Manejo de números (enteros y decimales)
            String numText = ctx.NUM().getText();
            try {
                if (numText.contains(".")) {
                    return Double.parseDouble(numText);
                } else {
                    return Integer.parseInt(numText);
                }
            } catch (NumberFormatException e) {
                logError("Formato numerico invalido: " + numText);
                return 0; // Valor por defecto
            }
        } else if (ctx.ID() != null) {
            // Manejo de variables (búsqueda en tabla de símbolos)
            String id = ctx.ID().getText();
            if (!tablaSimbolos.containsKey(id)) {
                logError("Variable no declarada: " + id);
                return 0; // Valor por defecto
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
            return null;
        }
    }

    


    // ========== MÉTODOS AUXILIARES ==========

    @Override
    public Object visitFloop(FloopContext ctx) {
        try {
            // 1. Inicialización (declaración o asignación)
            if (ctx.declaracion() != null) {
                visit(ctx.declaracion());
            } else if (ctx.asig() != null && ctx.asig().size() > 0) {
                visit(ctx.asig(0));
            }

            // 2. Bucle principal
            while (true) {
                // 2.1 Verificar condición
                if (ctx.condicion() != null) {
                    Object cond = visit(ctx.condicion());
                    if (!(cond instanceof Boolean)) {
                        logError("La condición debe ser booleana");
                        break;
                    }
                    if (!(Boolean) cond) {
                        break;
                    }
                } else if (ctx.declaracion() == null && ctx.asig() == null) {
                    break; // For infinito sin condición ni inicialización
                }

                // 2.2 Ejecutar cuerpo
                for (manbelParser.InstruccionContext instr : ctx.instruccion()) {
                    visit(instr);
                }

                // 2.3 Paso de actualización (asignación o expresión)
                if (ctx.asig() != null && ctx.asig().size() > 1) {
                    visit(ctx.asig(1));
                } else if (ctx.expr() != null) {
                    visit(ctx.expr());
                } else {
                    break; // No hay actualización
                }
            }
        } catch (Exception e) {
            logError("Error en ciclo for: " + e.getMessage());
        }
        return null;
    }

    private Object convertirTipo(Object valor, String tipo) {
        try {
            switch (tipo) {
                case "int":
                    return ((Number) valor).intValue();
                case "double":
                    return ((Number) valor).doubleValue();
                case "boolean":
                    return Boolean.parseBoolean(valor.toString());
                case "String":
                    return valor.toString();
                default:
                    return valor;
            }
        } catch (Exception e) {
            logError("Error de conversión: " + e.getMessage());
            return getValorPorDefecto(tipo);
        }
    }

    private Object getValorPorDefecto(String tipo) {
        switch (tipo) {
            case "int":
                return 0;
            case "double":
                return 0.0;
            case "boolean":
                return false;
            case "String":
                return "";
            default:
                return null;
        }
    }

    private void log(String mensaje) {
        if (debugMode)
            System.out.println("[LOG] " + mensaje);
    }

    private void logError(String mensaje) {
        System.err.println("[ERROR] " + mensaje);
    }

    // ... (métodos sumar, restar, multiplicar, dividir)

    // Agrega estos métodos en la misma clase

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
        double divisor = ((Number) b).doubleValue();
        if (divisor == 0) {
            logError("Division por cero");
            return Double.NaN;
        }
        return ((Number) a).doubleValue() / divisor;
    }

    private String getTipoInstruccion(InstruccionContext ctx) {
        if (ctx.declaracion() != null) 
            return "Declaracion";
        if (ctx.asig() != null) 
            return "Asignacion";
        if (ctx.incremento() != null) 
            return "Incremento";
        if (ctx.expr() != null) return 
            "Expresion";
        if (ctx.def() != null) return 
            "If-Else";
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
        // Esta visita ya se maneja en visitDef, pero necesitamos implementarla
        return visit(ctx.condicion());
    }

    @Override
    public Object visitElse_block(manbelParser.Else_blockContext ctx) {
        // Esta visita ya se maneja en visitDef
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
            return 0.0;
        }
    }

    @Override
    public Object visitIncremento(manbelParser.IncrementoContext ctx) {
    
        String varName = ctx.ID().getText();

        // Verificar si la variable existe
        if (!tablaSimbolos.containsKey(varName)) {
            logError("Variable no declarada: " + varName);
            return null;
        }

        // Obtener el valor actual
        Object currentValue = tablaSimbolos.get(varName);
        double numericValue;

        // Convertir a número
        try {
            numericValue = convertToNumber(currentValue);
        } catch (NumberFormatException e) {
            logError("No se puede incrementar una variable no numérica: " + varName);
            return null;
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
            log("Post-incremento: " + varName + "++ (valor anterior: " + currentValue + ")");
            return currentValue;
        } else {
            // Pre-incremento (++i): retorna el valor después de incrementar
            log("Pre-incremento: ++" + varName + " (nuevo valor: " + newValue + ")");
            return newValue;
        }
    }

    
}