package com.nuestrolenguaje;
import java.awt.Image;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ideSimple extends javax.swing.JFrame {

    public ideSimple() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
                         
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblOpenFile = new javax.swing.JLabel();
        lblJava = new javax.swing.JLabel();
        lblPython = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTxtOutput = new javax.swing.JTextArea();
        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 540));
        setMinimumSize(new java.awt.Dimension(700, 540));
        //getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel4.setMaximumSize(new java.awt.Dimension(700, 40));
       // jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MB");
        //jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 2, 40, 30));

        lblOpenFile.setFont(new java.awt.Font("Baloo 2", 0, 12)); // NOI18N
        lblOpenFile.setIcon(new javax.swing.ImageIcon("C:\\Users\\Paulina\\Documents\\TECNM\\Automatas2\\iconos\\openFile.png")); // NOI18N
        lblOpenFile.setText("Open file");
        lblOpenFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOpenFileMouseClicked(evt);
            }
        });
        //jPanel4.add(lblOpenFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 80, 40));

        lblJava.setFont(new java.awt.Font("Baloo 2", 0, 12)); // NOI18N
        lblJava.setIcon(new javax.swing.ImageIcon("C:\\Users\\Paulina\\Documents\\TECNM\\Automatas2\\iconos\\descarga.png")); // NOI18N
        lblJava.setText("Java");
        //jPanel4.add(lblJava, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 60, 40));

        lblPython.setFont(new java.awt.Font("Baloo 2", 0, 12)); // NOI18N
        lblPython.setIcon(new javax.swing.ImageIcon("C:\\Users\\Paulina\\Documents\\TECNM\\Automatas2\\iconos\\descarga.png")); // NOI18N
        lblPython.setText("PY");
        //jPanel4.add(lblPython, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 60, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Paulina\\Documents\\TECNM\\Automatas2\\iconos\\run.png")); // NOI18N
        jLabel1.setText("Run");
        //jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 60, 40));

        //getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 40));

        jPanel5.setMaximumSize(new java.awt.Dimension(700, 140));
        jPanel5.setMinimumSize(new java.awt.Dimension(700, 140));
        //jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaTxtOutput.setEditable(false);
        areaTxtOutput.setBackground(new java.awt.Color(0, 0, 0));
        areaTxtOutput.setColumns(20);
        areaTxtOutput.setForeground(new java.awt.Color(255, 255, 255));
        areaTxtOutput.setRows(5);
        areaTxtOutput.setText("Output :)");
        jScrollPane1.setViewportView(areaTxtOutput);

       /* jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 140));
        jPanel5.add(jScrollBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, -1, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 710, 140));*/

        jPanel3.setMaximumSize(new java.awt.Dimension(720, 370));
        //jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        //jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 370));

        //getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 710, 370));

        pack();
    }// </editor-fold>                        

    
    private void lblOpenFileMouseClicked(java.awt.event.MouseEvent evt) {                                         
        abrirSelectorArchivos();
    }                                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ideSimple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ideSimple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ideSimple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ideSimple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ideSimple().setVisible(true);
            }
        });
    }
    
    public void abrirSelectorArchivos(){
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Seleccionar archivo o directorio");

        // Configurar para seleccionar archivos o directorios
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            System.out.println("Archivo seleccionado: " + selectedFile.getAbsolutePath());
        }
    }
                        
    private javax.swing.JTextArea areaTxtOutput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblJava;
    private javax.swing.JLabel lblOpenFile;
    private javax.swing.JLabel lblPython;                 
}
