package com.nuestrolenguaje;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import javax.swing.*;

// Añade estos imports de ANTLR
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static final String EXTENSION = "manbel";
    public static final String DIRBASE = "src/test/resources/";

    public static void main(String[] args) throws IOException {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, StandardCharsets.UTF_8));

        if (args.length == 0) {
            // Modo GUI
            SwingUtilities.invokeLater(() -> {
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                } catch (Exception e) {
                    System.out.println(e);
                }
                EditorGUI editor = new EditorGUI();
                editor.setVisible(true);
            });
        } else {
            // Modo consola
            EditorGUI editor = new EditorGUI(); // Creamos instancia para usar processCode
            for (String file : args) {
                try {
                    CharStream input = CharStreams.fromFileName(DIRBASE + file);
                    String content = input.toString();
                    editor.processCode(content, file);
                } catch (IOException e) {
                    System.err.println("Error al leer el archivo " + file + ": " + e.getMessage());
                }
            }
        }
    }
}