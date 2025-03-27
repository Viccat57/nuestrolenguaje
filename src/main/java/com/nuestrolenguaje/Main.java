package com.nuestrolenguaje;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import org.antlr.v4.runtime.*;

public class Main {

    private static final String EXTENSION = "manbel";
    private static final String DIRBASE = "src/test/resources/";

    public static void main(String[] args) throws IOException {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, StandardCharsets.UTF_8));
        String files[] = args.length == 0 ? new String[] { "test." + EXTENSION } : args;
        System.out.println("Dirbase: " + DIRBASE);

        for (String file : files) {
            System.out.println("START: " + file);

            CharStream in = CharStreams.fromFileName(DIRBASE + file);
            manbelLexer lexer = new manbelLexer(in);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            manbelParser parser = new manbelParser(tokens);

            // Manejador de errores personalizado
            parser.removeErrorListeners();
            parser.addErrorListener(new DiagnosticErrorListener()); // Para más detalles
            parser.addErrorListener(new ConsoleErrorListener()); // Para imprimir en consola

            // Intenta obtener el árbol
            try {
                manbelParser.ProgramaContext tree = parser.programa();
                System.out.println("Arbol generado:\n" + tree.toStringTree(parser));
                tokens.fill();
                for (Token token : tokens.getTokens()) {
                    if (token.getType() != Token.EOF) {
                        System.out.println(lexer.getVocabulary().getSymbolicName(token.getType()) +
                                ": '" + token.getText() + "'");
                    }
                }

                manbelCustomVisitor visitor = new manbelCustomVisitor();
                visitor.visit(tree);
            } catch (RecognitionException | IllegalArgumentException e) {
                System.err.println("Error durante la ejecución:");
                System.err.println("An error occurred: " + e.getMessage());
            }

            System.out.println("FINISH: " + file);
        }
    }

}
