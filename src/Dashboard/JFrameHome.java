/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Dashboard;

import java.util.ArrayList;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableModel;
import loginfinal.JFrameLogin;

/**
 *
 * @author crist
 */
public class JFrameHome extends javax.swing.JFrame {

    /**
     * Creates new form JFrameHome
     */
    public JFrameHome() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("SISTEMA VENTAS");
        
        ArrayList <JRadioButton> botones = new ArrayList<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BgEntradas = new javax.swing.ButtonGroup();
        BgBebidas = new javax.swing.ButtonGroup();
        BgSegundos = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablePedidos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Btn12 = new javax.swing.JRadioButton();
        Btn13 = new javax.swing.JRadioButton();
        Btn14 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Btn3 = new javax.swing.JRadioButton();
        Btn1 = new javax.swing.JRadioButton();
        Btn2 = new javax.swing.JRadioButton();
        Btn9 = new javax.swing.JRadioButton();
        Btn7 = new javax.swing.JRadioButton();
        Btn5 = new javax.swing.JRadioButton();
        Btn6 = new javax.swing.JRadioButton();
        Btn4 = new javax.swing.JRadioButton();
        Btn11 = new javax.swing.JRadioButton();
        Btn8 = new javax.swing.JRadioButton();
        Btn10 = new javax.swing.JRadioButton();
        LblPP2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        BtnIngreso = new javax.swing.JButton();
        LblPP1 = new javax.swing.JLabel();
        LblPP4 = new javax.swing.JLabel();
        LblPP6 = new javax.swing.JLabel();
        LblPP5 = new javax.swing.JLabel();
        LblPP3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(890, 600));
        setMinimumSize(new java.awt.Dimension(890, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(890, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(890, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(890, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(96, 57, 19));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 10, 480));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(96, 57, 19));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 10, 240));

        TablePedidos.setBackground(new java.awt.Color(255, 204, 204));
        TablePedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Entrada", "Segundo", "Bebida"
            }
        ));
        jScrollPane1.setViewportView(TablePedidos);
        if (TablePedidos.getColumnModel().getColumnCount() > 0) {
            TablePedidos.getColumnModel().getColumn(0).setPreferredWidth(5);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 420, 300));

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(96, 57, 19));
        jLabel1.setText("Bebidas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        Btn12.setBackground(new java.awt.Color(255, 204, 204));
        BgEntradas.add(Btn12);
        Btn12.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        Btn12.setForeground(new java.awt.Color(96, 57, 19));
        Btn12.setText("Papa rellena");
        Btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn12ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, -1, -1));

        Btn13.setBackground(new java.awt.Color(255, 204, 204));
        BgEntradas.add(Btn13);
        Btn13.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        Btn13.setForeground(new java.awt.Color(96, 57, 19));
        Btn13.setText("Ensalada");
        Btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn13ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, -1, -1));

        Btn14.setBackground(new java.awt.Color(255, 204, 204));
        BgEntradas.add(Btn14);
        Btn14.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        Btn14.setForeground(new java.awt.Color(96, 57, 19));
        Btn14.setText("Sopa");
        Btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn14ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Fax", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(96, 57, 19));
        jLabel2.setText("Entradas");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Fax", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(96, 57, 19));
        jLabel3.setText("Segundos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        Btn3.setBackground(new java.awt.Color(255, 204, 204));
        BgSegundos.add(Btn3);
        Btn3.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        Btn3.setForeground(new java.awt.Color(96, 57, 19));
        Btn3.setText("Arroz con pollo");
        Btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        Btn1.setBackground(new java.awt.Color(255, 204, 204));
        BgSegundos.add(Btn1);
        Btn1.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        Btn1.setForeground(new java.awt.Color(96, 57, 19));
        Btn1.setText("Tallarin con pollo");
        Btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        Btn2.setBackground(new java.awt.Color(255, 204, 204));
        BgSegundos.add(Btn2);
        Btn2.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        Btn2.setForeground(new java.awt.Color(96, 57, 19));
        Btn2.setText("Chuleta de cerdo");
        Btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        Btn9.setBackground(new java.awt.Color(255, 204, 204));
        BgBebidas.add(Btn9);
        Btn9.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        Btn9.setForeground(new java.awt.Color(96, 57, 19));
        Btn9.setText("Maracuya");
        Btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn9ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        Btn7.setBackground(new java.awt.Color(255, 204, 204));
        BgBebidas.add(Btn7);
        Btn7.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        Btn7.setForeground(new java.awt.Color(96, 57, 19));
        Btn7.setText("Chicha Morada");
        Btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn7ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        Btn5.setBackground(new java.awt.Color(255, 204, 204));
        BgSegundos.add(Btn5);
        Btn5.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        Btn5.setForeground(new java.awt.Color(96, 57, 19));
        Btn5.setText("Pollo frito");
        Btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn5ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        Btn6.setBackground(new java.awt.Color(255, 204, 204));
        BgSegundos.add(Btn6);
        Btn6.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        Btn6.setForeground(new java.awt.Color(96, 57, 19));
        Btn6.setText("Estofado");
        Btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn6ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        Btn4.setBackground(new java.awt.Color(255, 204, 204));
        BgSegundos.add(Btn4);
        Btn4.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        Btn4.setForeground(new java.awt.Color(96, 57, 19));
        Btn4.setText("Pachamanca");
        Btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        Btn11.setBackground(new java.awt.Color(255, 204, 204));
        BgBebidas.add(Btn11);
        Btn11.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        Btn11.setForeground(new java.awt.Color(96, 57, 19));
        Btn11.setText("Cebada");
        Btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn11ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, -1, -1));

        Btn8.setBackground(new java.awt.Color(255, 204, 204));
        BgBebidas.add(Btn8);
        Btn8.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        Btn8.setForeground(new java.awt.Color(96, 57, 19));
        Btn8.setText("Camu Camu");
        Btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn8ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        Btn10.setBackground(new java.awt.Color(255, 204, 204));
        BgBebidas.add(Btn10);
        Btn10.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        Btn10.setForeground(new java.awt.Color(96, 57, 19));
        Btn10.setText("Aguajina");
        Btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn10ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, -1, -1));

        LblPP2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LblPP2.setForeground(new java.awt.Color(96, 57, 19));
        LblPP2.setText("S/. 12.00");
        jPanel1.add(LblPP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(96, 57, 19));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 313, 400, 10));

        jButton4.setBackground(new java.awt.Color(255, 204, 204));
        jButton4.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(96, 57, 19));
        jButton4.setText("Confirmar Pedido");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 540, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 204, 204));
        jButton3.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(96, 57, 19));
        jButton3.setText("Cerrar Sesión");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 540, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 204, 204));
        jButton2.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(96, 57, 19));
        jButton2.setText("Limpiar Tabla");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, -1, -1));

        BtnIngreso.setBackground(new java.awt.Color(255, 204, 204));
        BtnIngreso.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        BtnIngreso.setForeground(new java.awt.Color(96, 57, 19));
        BtnIngreso.setText("Ingresa Pedido");
        BtnIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngresoActionPerformed(evt);
            }
        });
        jPanel1.add(BtnIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, -1, -1));

        LblPP1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LblPP1.setForeground(new java.awt.Color(96, 57, 19));
        LblPP1.setText("S/. 12.00");
        jPanel1.add(LblPP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, -1));

        LblPP4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LblPP4.setForeground(new java.awt.Color(96, 57, 19));
        LblPP4.setText("S/. 12.00");
        jPanel1.add(LblPP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

        LblPP6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LblPP6.setForeground(new java.awt.Color(96, 57, 19));
        LblPP6.setText("S/. 12.00");
        jPanel1.add(LblPP6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, -1, -1));

        LblPP5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LblPP5.setForeground(new java.awt.Color(96, 57, 19));
        LblPP5.setText("S/. 12.00");
        jPanel1.add(LblPP5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, -1, -1));

        LblPP3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LblPP3.setForeground(new java.awt.Color(96, 57, 19));
        LblPP3.setText("S/. 12.00");
        jPanel1.add(LblPP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, -1));

        jLabel15.setFont(new java.awt.Font("Lucida Fax", 3, 52)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(96, 57, 19));
        jLabel15.setText("Restaurant Menú ");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/222222222.png"))); // NOI18N
        jLabel16.setText("jLabel16");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 590));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn3ActionPerformed

    private void Btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn5ActionPerformed

    private void Btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn8ActionPerformed

    private void Btn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn14ActionPerformed

    private void Btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        JFrameLogin Login = new JFrameLogin();
        Login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BtnIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngresoActionPerformed
        // TODO add your handling code here:
        
        String entrada = null; 
        String segundos = null;
        String bebidas = null;
        
        for (AbstractButton button : new JRadioButton[]{Btn1,Btn2,Btn3,Btn4,Btn5,Btn6}) {
                    if (button.getModel().isSelected()) {
                        entrada = button.getText();
                    }
        }
        for (AbstractButton buttons : new JRadioButton[]{Btn7,Btn8,Btn9,Btn10,Btn11}) {
                    if (buttons.getModel().isSelected()) {
                        segundos = buttons.getText();
                    }
        }
        for (AbstractButton buttonss : new JRadioButton[]{Btn12,Btn13,Btn14}) {
                    if (buttonss.getModel().isSelected()) {
                        bebidas = buttonss.getText();
                    }
        }
        DefaultTableModel model = (DefaultTableModel) TablePedidos.getModel();
        model.addRow(new Object []{"#",entrada,segundos,bebidas});
    }//GEN-LAST:event_BtnIngresoActionPerformed
        
    private void Btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn1ActionPerformed

    private void Btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn2ActionPerformed

    private void Btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn4ActionPerformed

    private void Btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn7ActionPerformed

    private void Btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn9ActionPerformed

    private void Btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn10ActionPerformed

    private void Btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn11ActionPerformed

    private void Btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn12ActionPerformed

    private void Btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn13ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int fila = TablePedidos.getSelectedRowCount();
        if(fila<0){
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }else{
        DefaultTableModel model = (DefaultTableModel) TablePedidos.getModel();
        model.removeRow(fila);
        }
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);//ocultar esta ventana
                JFrameDetalleVenta pantalla3 = new JFrameDetalleVenta();
                pantalla3.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed



    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BgBebidas;
    private javax.swing.ButtonGroup BgEntradas;
    private javax.swing.ButtonGroup BgSegundos;
    private javax.swing.JRadioButton Btn1;
    private javax.swing.JRadioButton Btn10;
    private javax.swing.JRadioButton Btn11;
    private javax.swing.JRadioButton Btn12;
    private javax.swing.JRadioButton Btn13;
    private javax.swing.JRadioButton Btn14;
    private javax.swing.JRadioButton Btn2;
    private javax.swing.JRadioButton Btn3;
    private javax.swing.JRadioButton Btn4;
    private javax.swing.JRadioButton Btn5;
    private javax.swing.JRadioButton Btn6;
    private javax.swing.JRadioButton Btn7;
    private javax.swing.JRadioButton Btn8;
    private javax.swing.JRadioButton Btn9;
    private javax.swing.JButton BtnIngreso;
    private javax.swing.JLabel LblPP1;
    private javax.swing.JLabel LblPP2;
    private javax.swing.JLabel LblPP3;
    private javax.swing.JLabel LblPP4;
    private javax.swing.JLabel LblPP5;
    private javax.swing.JLabel LblPP6;
    private javax.swing.JTable TablePedidos;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
