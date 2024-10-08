/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package loginfinal;

import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class JFramePreLoader extends javax.swing.JFrame {

    /**
     * Creates new form JFramePreLoader
     */
    public JFramePreLoader() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        LblPorcentaje = new javax.swing.JLabel();
        LblTexto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(PanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jProgressBar1.setBackground(new java.awt.Color(153, 51, 0));
        jProgressBar1.setForeground(new java.awt.Color(255, 204, 0));
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 720, 30));

        LblPorcentaje.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        LblPorcentaje.setText("0%");
        getContentPane().add(LblPorcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 320, -1, -1));

        LblTexto.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        LblTexto.setText("Cargando....");
        getContentPane().add(LblTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/image-removebg-preview.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 530, 300));

        LblFondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\crist\\Documents\\NetBeansProjects\\LoginFinal\\src\\Imagenes\\222222222.png")); // NOI18N
        getContentPane().add(LblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(JFramePreLoader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePreLoader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePreLoader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePreLoader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        JFramePreLoader PantallaCarga = new JFramePreLoader();
        PantallaCarga.setVisible(true);
        try{
            for(int i = 0; i < 81;i++){
                Thread.sleep(100);
                PantallaCarga.LblPorcentaje.setText(i+"%");
                
                if(i == 20){PantallaCarga.LblTexto.setText("Activando Modulos...");}
                if(i == 70){PantallaCarga.LblTexto.setText("Conexión Exitosa...");}
                if(i == 80){PantallaCarga.LblTexto.setText("Aplicación Activa...");}
                PantallaCarga.jProgressBar1.setValue(i);
                
            }
        }catch(Exception a){
            JOptionPane.showMessageDialog(null, a);
            
        }
        JOptionPane.showMessageDialog(null, "BIENVENIDO AL SISTEMA");
        JFrameLogin pantallaLogin = new JFrameLogin();
        PantallaCarga.setVisible(false);
        pantallaLogin.setVisible(true);
        PantallaCarga.dispose();

        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblFondo;
    private javax.swing.JLabel LblPorcentaje;
    private javax.swing.JLabel LblTexto;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
