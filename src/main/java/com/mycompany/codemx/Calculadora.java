
package com.mycompany.codemx;

public class Calculadora extends javax.swing.JFrame {

  
    public Calculadora() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtOperaciom = new javax.swing.JLabel();
        txtResultado = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(340, 490));
        setPreferredSize(new java.awt.Dimension(340, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(244, 253, 251));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtOperaciom.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtOperaciom.setForeground(new java.awt.Color(55, 62, 71));
        txtOperaciom.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtOperaciom.setText("5*6+2");
        jPanel1.add(txtOperaciom, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 320, 38));

        txtResultado.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(55, 62, 71));
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtResultado.setText("583");
        txtResultado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 67, 320, 52));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(55, 62, 71));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn3.png"))); // NOI18N
        jButton2.setText("4");
        jButton2.setFocusPainted(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn1.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn2.png"))); // NOI18N
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 50, 50));

        jButton4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(55, 62, 71));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn1.png"))); // NOI18N
        jButton4.setText("^");
        jButton4.setFocusPainted(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn1.png"))); // NOI18N
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn2.png"))); // NOI18N
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 50, 50));

        jButton5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(55, 62, 71));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn1.png"))); // NOI18N
        jButton5.setText("%");
        jButton5.setFocusPainted(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn1.png"))); // NOI18N
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn2.png"))); // NOI18N
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 50, 50));

        jButton6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(55, 62, 71));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn1.png"))); // NOI18N
        jButton6.setText("/");
        jButton6.setFocusPainted(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn1.png"))); // NOI18N
        jButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn2.png"))); // NOI18N
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 50, 50));

        jButton7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(55, 62, 71));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn1.png"))); // NOI18N
        jButton7.setText("x");
        jButton7.setFocusPainted(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn1.png"))); // NOI18N
        jButton7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn2.png"))); // NOI18N
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 50, 50));

        jButton8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn5.png"))); // NOI18N
        jButton8.setText("=");
        jButton8.setFocusPainted(false);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn1.png"))); // NOI18N
        jButton8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn2.png"))); // NOI18N
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 50, 50));

        jButton9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton9.setForeground(new java.awt.Color(55, 62, 71));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn1.png"))); // NOI18N
        jButton9.setText("-");
        jButton9.setFocusPainted(false);
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn1.png"))); // NOI18N
        jButton9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn2.png"))); // NOI18N
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 50, 50));

        jButton10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton10.setForeground(new java.awt.Color(55, 62, 71));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn1.png"))); // NOI18N
        jButton10.setText("+");
        jButton10.setFocusPainted(false);
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton10.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn1.png"))); // NOI18N
        jButton10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn2.png"))); // NOI18N
        jPanel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 50, 50));

        jButton3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(55, 62, 71));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn1.png"))); // NOI18N
        jButton3.setText("C");
        jButton3.setFocusPainted(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn1.png"))); // NOI18N
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn2.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        jButton12.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton12.setForeground(new java.awt.Color(55, 62, 71));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn3.png"))); // NOI18N
        jButton12.setText("7");
        jButton12.setFocusPainted(false);
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton12.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn1.png"))); // NOI18N
        jButton12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn2.png"))); // NOI18N
        jPanel2.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 50, 50));

        jButton13.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton13.setForeground(new java.awt.Color(55, 62, 71));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn3.png"))); // NOI18N
        jButton13.setText("8");
        jButton13.setFocusPainted(false);
        jButton13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton13.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn1.png"))); // NOI18N
        jButton13.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn2.png"))); // NOI18N
        jPanel2.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 50, 50));

        jButton14.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton14.setForeground(new java.awt.Color(55, 62, 71));
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn3.png"))); // NOI18N
        jButton14.setText("9");
        jButton14.setFocusPainted(false);
        jButton14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton14.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn1.png"))); // NOI18N
        jButton14.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn2.png"))); // NOI18N
        jPanel2.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 50, 50));

        jButton15.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton15.setForeground(new java.awt.Color(55, 62, 71));
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn3.png"))); // NOI18N
        jButton15.setText("5");
        jButton15.setFocusPainted(false);
        jButton15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton15.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn1.png"))); // NOI18N
        jButton15.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn2.png"))); // NOI18N
        jPanel2.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 50, 50));

        jButton16.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton16.setForeground(new java.awt.Color(55, 62, 71));
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn3.png"))); // NOI18N
        jButton16.setText("6");
        jButton16.setFocusPainted(false);
        jButton16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton16.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn1.png"))); // NOI18N
        jButton16.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn2.png"))); // NOI18N
        jPanel2.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 50, 50));

        jButton17.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton17.setForeground(new java.awt.Color(55, 62, 71));
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn3.png"))); // NOI18N
        jButton17.setText("3");
        jButton17.setFocusPainted(false);
        jButton17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton17.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn1.png"))); // NOI18N
        jButton17.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn2.png"))); // NOI18N
        jPanel2.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 50, 50));

        jButton18.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton18.setForeground(new java.awt.Color(55, 62, 71));
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn3.png"))); // NOI18N
        jButton18.setText("2");
        jButton18.setFocusPainted(false);
        jButton18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton18.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn1.png"))); // NOI18N
        jButton18.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn2.png"))); // NOI18N
        jPanel2.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 50, 50));

        jButton19.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton19.setForeground(new java.awt.Color(55, 62, 71));
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn3.png"))); // NOI18N
        jButton19.setText("1");
        jButton19.setFocusPainted(false);
        jButton19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton19.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn1.png"))); // NOI18N
        jButton19.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn2.png"))); // NOI18N
        jPanel2.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 50, 50));

        jButton20.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton20.setForeground(new java.awt.Color(55, 62, 71));
        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn3.png"))); // NOI18N
        jButton20.setText("0");
        jButton20.setFocusPainted(false);
        jButton20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton20.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn1.png"))); // NOI18N
        jButton20.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn2.png"))); // NOI18N
        jPanel2.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 50, 50));

        jButton21.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton21.setForeground(new java.awt.Color(55, 62, 71));
        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn3.png"))); // NOI18N
        jButton21.setText(".");
        jButton21.setFocusPainted(false);
        jButton21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton21.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn1.png"))); // NOI18N
        jButton21.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/codemx/btn2.png"))); // NOI18N
        jPanel2.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 350, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel txtOperaciom;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}
