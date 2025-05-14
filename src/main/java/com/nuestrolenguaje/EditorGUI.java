package com.nuestrolenguaje;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.io.File;
import java.nio.file.Files;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class EditorGUI extends JFrame {
    private JTextArea textArea;
    private JTextArea consoleArea;
    private JButton executeBtn;
    private JButton loadTestBtn;
    private JButton archivoPyBtn;
    private PrintStream originalOut;
    private PrintStream originalErr;
    private boolean darkMode = true;

    // Colores para los temas
    private final Color DARK_BG = new Color(30, 30, 30);
    private final Color DARK_FG = Color.WHITE;
    private final Color LIGHT_BG = Color.WHITE;
    private final Color LIGHT_FG = Color.BLACK;
    private final Color DARK_CONSOLE_BG = new Color(20, 20, 20);
    private final Color LIGHT_CONSOLE_BG = new Color(240, 240, 240);
    
     public EditorGUI() {
        setTitle("MB Editor");
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Configurar paneles
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        // Panel superior con botones
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        
        // Botones principales
        JButton openBtn = createStyledButton("Open", new Color(70, 130, 180));
        openBtn.addActionListener(this::loadManbelFile);
        
        JButton runBtn = createStyledButton("Run", new Color(34, 139, 34));
        runBtn.addActionListener(this::executeCode);
        
        JButton jsBtn = createStyledButton("JavaScript", new Color(255, 215, 0));
        jsBtn.addActionListener(this::translateToJs);
        
        JButton pyBtn = createStyledButton("Python", new Color(65, 105, 225));
        pyBtn.addActionListener(e -> consoleArea.append("Traducción a Python aún no implementada\n"));
        
        // Botón para cambiar tema
        JButton themeBtn = createStyledButton("Toggle Theme", new Color(128, 0, 128));
        themeBtn.addActionListener(e -> {
            darkMode = !darkMode;
            applyTheme();
        });
        
        topPanel.add(openBtn);
        topPanel.add(runBtn);
        topPanel.add(jsBtn);
        topPanel.add(pyBtn);
        topPanel.add(themeBtn);
        
        // Panel del editor
        JPanel editorPanel = new JPanel(new BorderLayout());
        textArea = new JTextArea();
        textArea.setFont(new Font("Consolas", Font.PLAIN, 14));
        
        JScrollPane editorScroll = new JScrollPane(textArea);
        editorScroll.setBorder(BorderFactory.createTitledBorder("Editor"));
        
        // Panel de la consola
        JPanel consolePanel = new JPanel(new BorderLayout());
        consoleArea = new JTextArea();
        consoleArea.setFont(new Font("Consolas", Font.PLAIN, 12));
        consoleArea.setEditable(false);
        
        JScrollPane consoleScroll = new JScrollPane(consoleArea);
        
        // Botones
        executeBtn = new JButton("Ejecutar Código");
        loadTestBtn = new JButton("Cargar test.manbel");
        archivoPyBtn = new JButton("Descargar archivo.py");
        
        executeBtn.addActionListener(this::executeCode);
        loadTestBtn.addActionListener(this::loadTestFile);
        archivoPyBtn.addActionListener(this::archivoPy);
        consoleScroll.setBorder(BorderFactory.createTitledBorder("Output"));
        consoleScroll.setPreferredSize(new Dimension(0, 200));
        
        // Configurar redirección de salida
        redirectSystemStreams();
        
        // Ensamblar interfaz
        buttonPanel.add(executeBtn);
        buttonPanel.add(loadTestBtn);
        buttonPanel.add(archivoPyBtn);
        
        editorPanel.add(new JLabel("Editor de Código"), BorderLayout.NORTH);
        // Añadir componentes al panel principal
        editorPanel.add(editorScroll, BorderLayout.CENTER);
        consolePanel.add(consoleScroll, BorderLayout.CENTER);
        
        JSplitPane splitPane = new JSplitPane(
            JSplitPane.VERTICAL_SPLIT, 
            editorPanel, 
            consolePanel
        );
        splitPane.setResizeWeight(0.8);
        splitPane.setDividerLocation(0.8);
        
        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(splitPane, BorderLayout.CENTER);
        
        add(mainPanel);
        
        // Establecer el look and feel del sistema
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

        private void applyTheme() {
        Color bgColor = darkMode ? DARK_BG : LIGHT_BG;
        Color fgColor = darkMode ? DARK_FG : LIGHT_FG;
        Color consoleBg = darkMode ? DARK_CONSOLE_BG : LIGHT_CONSOLE_BG;
        
        // Aplicar colores a los componentes
        getContentPane().setBackground(bgColor);
        
        textArea.setBackground(bgColor);
        textArea.setForeground(fgColor);
        textArea.setCaretColor(fgColor);
        
        consoleArea.setBackground(consoleBg);
        consoleArea.setForeground(fgColor);
        
        // Actualizar bordes con el tema
        BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(darkMode ? Color.DARK_GRAY : Color.LIGHT_GRAY),
            darkMode ? "Editor (Dark Mode)" : "Editor (Light Mode)"
        );
        
        BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(darkMode ? Color.DARK_GRAY : Color.LIGHT_GRAY),
            "Output"
        );
        
        // Forzar repintado
        SwingUtilities.updateComponentTreeUI(this);
    }
    
    private JButton createStyledButton(String text, Color bgColor) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.BOLD, 12));
        button.setBackground(bgColor);
        button.setForeground(Color.black);
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createEmptyBorder(8, 15, 8, 15));
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        return button;
    }
    
/////////////////////////////////////////////////////////
/// Traducción a JavaScript ////////////////////////////
/////////////////////////////////////////////////////////
        private void translateToJs(ActionEvent e) {
        String code = textArea.getText();
        if (code.isEmpty()) {
            consoleArea.append("No hay código para traducir\n");
            return;
        }
        
        try {
            // Parsear el código Manbel
            CharStream input = CharStreams.fromString(code, "Editor");
            manbelLexer lexer = new manbelLexer(input);
            manbelParser parser = new manbelParser(new CommonTokenStream(lexer));
            
            parser.removeErrorListeners();
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                    int line, int charPositionInLine, String msg, RecognitionException e) {
                    consoleArea.append("Error de sintaxis en línea " + line + ":" + charPositionInLine + " - " + msg + "\n");
                }
            });
            
            manbelParser.ProgramaContext tree = parser.programa();
            
            // Traducir a JavaScript
            String jsCode = new TraductorJsVisitor().visit(tree);
            
            // Mostrar el código JS en la consola
            consoleArea.append("\nCódigo JavaScript generado:\n");
            consoleArea.append(jsCode + "\n");
            
            // Guardar en archivo
            saveJsFile(jsCode);
            
        } catch (Exception ex) {
            consoleArea.append("Error durante la traducción:\n" + ex.getMessage() + "\n");
        }
    }
    
    private void saveJsFile(String jsCode) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar como JavaScript");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos JavaScript (*.js)", "js"));
        fileChooser.setSelectedFile(new File("output.js"));
        
        int userSelection = fileChooser.showSaveDialog(this);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            try (FileWriter writer = new FileWriter(fileToSave)) {
                writer.write(jsCode);
                consoleArea.append("Archivo guardado exitosamente: " + fileToSave.getAbsolutePath() + "\n");
            } catch (Exception ex) {
                consoleArea.append("Error al guardar el archivo: " + ex.getMessage() + "\n");
            }
        }
    }

    /////////////////////////////////////////
    //////////////////////////////////////////////
    
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
    
private void loadManbelFile(ActionEvent e) {
    JFileChooser fileChooser = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter(
        "Archivos Manbel (*.manbel)", "manbel");
    fileChooser.setFileFilter(filter);
    fileChooser.setCurrentDirectory(new File(Main.DIRBASE));
    
    int result = fileChooser.showOpenDialog(this);
    
    if (result == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();
        try {
            CharStream input = CharStreams.fromFileName(selectedFile.getAbsolutePath());
            String fileContent = input.toString();
            textArea.setText(fileContent);
            consoleArea.setText(""); // Limpiar consola
            consoleArea.append("Archivo cargado: " + selectedFile.getName() + "\n");
        } catch (IOException ex) {
            consoleArea.append("Error al cargar el archivo:\n" + ex.getMessage() + "\n");
        }
    }
}

    private void archivoPy(ActionEvent e) {
        String inputCode = textArea.getText();
        
        try {
            TraductorPyVisitor translator = new TraductorPyVisitor();
            String pythonCode = translator.translate(inputCode); // Usamos translate() en lugar de visitCode()
            
            // Resto del código para guardar el archivo...
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Guardar código Python");
            fileChooser.setSelectedFile(new File("codigo.py"));
            
            if (fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                if (!file.getName().toLowerCase().endsWith(".py")) {
                    file = new File(file.getAbsolutePath() + ".py");
                }
                Files.write(file.toPath(), pythonCode.getBytes());
                JOptionPane.showMessageDialog(null, "Archivo guardado exitosamente!");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, 
                "Error de traducción:\n" + ex.getMessage(),
                "Error", 
                JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void processCode(String code, String sourceName) {
        consoleArea.append("=== Procesando: " + sourceName + " ===\n");
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