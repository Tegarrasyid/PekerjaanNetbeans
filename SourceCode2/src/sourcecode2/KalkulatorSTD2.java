/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sourcecode2;

/**
 *
 * @author TEGAR RASYID
 */
public class KalkulatorSTD2 extends javax.swing.JFrame {

    /**
     * Creates new form KalkulatorSTD2
     */
    double num, ans;
    int calculation;
    
    public KalkulatorSTD2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbl2 = new javax.swing.JButton();
        tbl7 = new javax.swing.JButton();
        tbl3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JLabel();
        tbl8 = new javax.swing.JButton();
        tbl9 = new javax.swing.JButton();
        tblkrg = new javax.swing.JButton();
        tblbg = new javax.swing.JButton();
        tblhps = new javax.swing.JButton();
        tbl4 = new javax.swing.JButton();
        tbl0 = new javax.swing.JButton();
        tbl5 = new javax.swing.JButton();
        tblhsl = new javax.swing.JButton();
        tbl6 = new javax.swing.JButton();
        tbljml = new javax.swing.JButton();
        tblkl = new javax.swing.JButton();
        tbl1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl2.setText("2");
        tbl2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbl2ActionPerformed(evt);
            }
        });

        tbl7.setText("7");
        tbl7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbl7ActionPerformed(evt);
            }
        });

        tbl3.setText("3");
        tbl3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbl3ActionPerformed(evt);
            }
        });

        jTextField1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        tbl8.setText("8");
        tbl8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbl8ActionPerformed(evt);
            }
        });

        tbl9.setText("9");
        tbl9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbl9ActionPerformed(evt);
            }
        });

        tblkrg.setText("-");
        tblkrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblkrgActionPerformed(evt);
            }
        });

        tblbg.setText("÷");
        tblbg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblbgActionPerformed(evt);
            }
        });

        tblhps.setText("←");
        tblhps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblhpsActionPerformed(evt);
            }
        });

        tbl4.setText("4");
        tbl4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbl4ActionPerformed(evt);
            }
        });

        tbl0.setText("0");
        tbl0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbl0ActionPerformed(evt);
            }
        });

        tbl5.setText("5");
        tbl5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbl5ActionPerformed(evt);
            }
        });

        tblhsl.setText("=");
        tblhsl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblhslActionPerformed(evt);
            }
        });

        tbl6.setText("6");
        tbl6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbl6ActionPerformed(evt);
            }
        });

        tbljml.setText("+");
        tbljml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbljmlActionPerformed(evt);
            }
        });

        tblkl.setText("x");
        tblkl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblklActionPerformed(evt);
            }
        });

        tbl1.setText("1");
        tbl1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbl1ActionPerformed(evt);
            }
        });

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tblhps, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(tbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tbl4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tbl7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tbl8, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(tbl5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tbl0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tbl9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tbl6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tbl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tblhsl, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tblbg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tblkl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tblkrg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tbljml, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addComponent(jTextField2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tbl7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tbl8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tbl9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tblbg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tbl4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tbl5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tbl6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tblkl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tbl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tblkrg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tblhps, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tbl0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tblhsl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tbljml, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbl2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbl2ActionPerformed
        // TODO add your handling code here:
        tbl7.setText("2");
        jTextField1.setText(jTextField1.getText() + "2");
    }//GEN-LAST:event_tbl2ActionPerformed

    private void tbl7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbl7ActionPerformed
        // TODO add your handling code here:
        tbl7.setText("7");
        jTextField1.setText(jTextField1.getText() + "7");
    }//GEN-LAST:event_tbl7ActionPerformed

    private void tbl3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbl3ActionPerformed
        // TODO add your handling code here:
        tbl7.setText("3");
        jTextField1.setText(jTextField1.getText() + "3");
    }//GEN-LAST:event_tbl3ActionPerformed

    private void tbl8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbl8ActionPerformed
        // TODO add your handling code here:
        tbl7.setText("8");
        jTextField1.setText(jTextField1.getText() + "8");
    }//GEN-LAST:event_tbl8ActionPerformed

    private void tbl9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbl9ActionPerformed
        // TODO add your handling code here:
        tbl7.setText("9");
        jTextField1.setText(jTextField1.getText() + "9");
    }//GEN-LAST:event_tbl9ActionPerformed

    private void tblkrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblkrgActionPerformed
        // TODO add your handling code here:

        tblkrg.setText("-");
        {
            num = Double.parseDouble(jTextField1.getText());
            calculation = 2; // Pengurangan
            jTextField1.setText(jTextField1.getText() + " - ");
        };
    }//GEN-LAST:event_tblkrgActionPerformed

    private void tblbgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblbgActionPerformed
        // TODO add your handling code here:

        tblbg.setText("÷");
        {
            num = Double.parseDouble(jTextField1.getText());
            calculation = 4; // Pembagian
            jTextField1.setText(jTextField1.getText() + " ÷ ");
        };
    }//GEN-LAST:event_tblbgActionPerformed

    private void tblhpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblhpsActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
    }//GEN-LAST:event_tblhpsActionPerformed

    private void tbl4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbl4ActionPerformed
        // TODO add your handling code here:
        tbl7.setText("4");
        jTextField1.setText(jTextField1.getText() + "4");
    }//GEN-LAST:event_tbl4ActionPerformed

    private void tbl0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbl0ActionPerformed
        // TODO add your handling code here:
        tbl7.setText("0");
        jTextField1.setText(jTextField1.getText() + "0");
    }//GEN-LAST:event_tbl0ActionPerformed

    private void tbl5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbl5ActionPerformed
        // TODO add your handling code here:
        tbl7.setText("5");
        jTextField1.setText(jTextField1.getText() + "5");

    }//GEN-LAST:event_tbl5ActionPerformed

    private void tblhslActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblhslActionPerformed
        // TODO add your handling code here:
        String[] parts = jTextField1.getText().split(" ");
        double secondNum = Double.parseDouble(parts[2]); // Mengambil angka kedua
        switch (calculation) {
            case 1:
            ans = num + secondNum;
            break;
            case 2:
            ans = num - secondNum;
            break;
            case 3:
            ans = num * secondNum;
            break;
            case 4:
            ans = num / secondNum;
            break;
        }
        jTextField1.setText(Double.toString(ans)); // Tampilkan hasil

    }//GEN-LAST:event_tblhslActionPerformed

    private void tbl6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbl6ActionPerformed
        // TODO add your handling code here:
        tbl7.setText("6");
        jTextField1.setText(jTextField1.getText() + "6");
    }//GEN-LAST:event_tbl6ActionPerformed

    private void tbljmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbljmlActionPerformed
        // TODO add your handling code here:

        tbljml.setText("+");
        {
            num = Double.parseDouble(jTextField1.getText());
            calculation = 1; // Penjumlahan
            jTextField1.setText(jTextField1.getText() + " + ");
        };
    }//GEN-LAST:event_tbljmlActionPerformed

    private void tblklActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblklActionPerformed
        // TODO add your handling code here:

        tblkl.setText("x");
        {
            num = Double.parseDouble(jTextField1.getText());
            calculation = 3; // Perkalian
            jTextField1.setText(jTextField1.getText() + " x ");
        };
    }//GEN-LAST:event_tblklActionPerformed

    private void tbl1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbl1ActionPerformed
        // TODO add your handling code here:
        tbl7.setText("1");
        jTextField1.setText(jTextField1.getText() + "1");
    }//GEN-LAST:event_tbl1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(KalkulatorSTD2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KalkulatorSTD2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KalkulatorSTD2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KalkulatorSTD2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KalkulatorSTD2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton tbl0;
    private javax.swing.JButton tbl1;
    private javax.swing.JButton tbl2;
    private javax.swing.JButton tbl3;
    private javax.swing.JButton tbl4;
    private javax.swing.JButton tbl5;
    private javax.swing.JButton tbl6;
    private javax.swing.JButton tbl7;
    private javax.swing.JButton tbl8;
    private javax.swing.JButton tbl9;
    private javax.swing.JButton tblbg;
    private javax.swing.JButton tblhps;
    private javax.swing.JButton tblhsl;
    private javax.swing.JButton tbljml;
    private javax.swing.JButton tblkl;
    private javax.swing.JButton tblkrg;
    // End of variables declaration//GEN-END:variables
}
