package com.nuestrolenguaje;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import org.antlr.v4.runtime.*;

public class EditorGUI extends JFrame {
    private JTextArea textArea;
    private JTextArea consoleArea;
    private JButton executeBtn;
    private JButton loadTestBtn;
    private PrintStream originalOut;
    private PrintStream originalErr;
    
    public EditorGUI() {
        setTitle("Editor Manbel");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Configurar paneles
        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel editorPanel = new JPanel(new BorderLayout());
        JPanel consolePanel = new JPanel(new BorderLayout());
        JPanel buttonPanel = new JPanel(new FlowLayout());
        
        // Área de edición
        textArea = new JTextArea();
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane editorScroll = new JScrollPane(textArea);
        
        // Consola de salida (no editable)
        consoleArea = new JTextArea();
        consoleArea.setEditable(false);
        consoleArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        consoleArea.setBackground(Color.BLACK);
        consoleArea.setForeground(Color.WHITE);
        JScrollPane consoleScroll = new JScrollPane(consoleArea);
        
        // Botones
        executeBtn = new JButton("Ejecutar Código");
        loadTestBtn = new JButton("Cargar test.manbel");
        
        executeBtn.addActionListener(this::executeCode);
        loadTestBtn.addActionListener(this::loadTestFile);
        
        // Configurar redirección de salida
        redirectSystemStreams();
        
        // Ensamblar interfaz
        buttonPanel.add(executeBtn);
        buttonPanel.add(loadTestBtn);
        
        editorPanel.add(new JLabel("Editor de Código"), BorderLayout.NORTH);
        editorPanel.add(editorScroll, BorderLayout.CENTER);
        editorPanel.add(buttonPanel, BorderLayout.SOUTH);
        
        consolePanel.add(new JLabel("Consola de Salida"), BorderLayout.NORTH);
        consolePanel.add(consoleScroll, BorderLayout.CENTER);
        
        JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, editorPanel, consolePanel);
        splitPane.setResizeWeight(0.7);
        
        mainPanel.add(splitPane, BorderLayout.CENTER);
        add(mainPanel);
    }
    
    private void redirectSystemStreams() {
        originalOut = System.out;
        originalErr = System.err;
        
        OutputStream out = new OutputStream() {
            @Override
            public void write(int b) throws IOException {
                consoleArea.append(String.valueOf((char) b));
                consoleArea.setCaretPosition(consoleArea.getDocument().getLength());
            }
            
            @Override
            public void write(byte[] b, int off, int len) throws IOException {
                consoleArea.append(new String(b, off, len));
                consoleArea.setCaretPosition(consoleArea.getDocument().getLength());
            }
        };
        
        System.setOut(new PrintStream(out, true));
        System.setErr(new PrintStream(out, true));
    }
    
    private void executeCode(ActionEvent e) {
        consoleArea.setText(""); // Limpiar consola antes de ejecutar
        String code = textArea.getText();
        processCode(code, "Editor");
    }
    
    private void loadTestFile(ActionEvent e) {
        try {
            CharStream input = CharStreams.fromFileName(Main.DIRBASE + "test." + Main.EXTENSION);
            String testContent = input.toString();
            textArea.setText(testContent);
            consoleArea.setText(""); // Limpiar consola
            processCode(testContent, "test.manbel");
        } catch (IOException ex) {
            consoleArea.append("Error al cargar el archivo de prueba:\n" + ex.getMessage() + "\n");
        }
    }
    
    public void processCode(String code, String sourceName) {
        try {
            CharStream input = CharStreams.fromString(code, sourceName);
            manbelLexer lexer = new manbelLexer(input);
            manbelParser parser = new manbelParser(new CommonTokenStream(lexer));
            
            parser.removeErrorListeners();
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                    int line, int charPositionInLine, String msg, RecognitionException e) {
                    consoleArea.append("Error en línea " + line + ":" + charPositionInLine + " - " + msg + "\n");
                }
            });
            
            manbelParser.ProgramaContext tree = parser.programa();
            new manbelCustomVisitor().visit(tree);
            
            consoleArea.append("\nEjecución completada exitosamente\n");
        } catch (Exception ex) {
            consoleArea.append("Error durante la ejecución:\n" + ex.getMessage() + "\n");
        } finally {
            // Restaurar salida estándar al cerrar
            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                System.setOut(originalOut);
                System.setErr(originalErr);
            }));
        }
    }
}