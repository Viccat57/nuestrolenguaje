package com.nuestrolenguaje;

import java.io.IOException;
import java.io.PrintStream;

import java.nio.charset.StandardCharsets;
import javax.swing.*;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import com.nuestrolenguaje.GUI.EditorGUI;

/**
 * Punto de entrada principal de la aplicación.
 * Maneja tanto el modo GUI como el modo consola.
 */
public class Main {
    public static final String EXTENSION = "manbel"; // Extensión de archivos del lenguaje
    public static final String DIRBASE = "src/test/resources/"; // Directorio base para archivos

    public static void main(String[] args) throws IOException {
        // Configurar encoding UTF-8 para salida estándar
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, StandardCharsets.UTF_8));

        if (args.length == 0) {
            // Modo GUI - Ejecutar en el hilo de eventos de Swing
            SwingUtilities.invokeLater(() -> {
                try {
                    // Configurar look and feel nativo de Windows
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                } catch (Exception e) {
                    System.out.println(e);
                }
                EditorGUI editor = new EditorGUI();
                editor.setVisible(true);
            });
        } else {
            // Modo consola - Procesar cada archivo pasado como argumento
            EditorGUI editor = new EditorGUI(); // Se crea instancia solo para usar processCode
            for (String file : args) {
                try {
                    CharStream input = CharStreams.fromFileName(DIRBASE + file);
                    editor.processCode(input.toString(), file);
                } catch (IOException e) {
                    System.err.println("Error al leer el archivo " + file + ": " + e.getMessage());
                }
            }
        }
    }
}