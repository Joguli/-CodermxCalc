
package com.mycompany.codemx;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Calculadora extends javax.swing.JFrame {

  
    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine se = sem.getEngineByName("JavaScript");
    
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
        btn4 = new javax.swing.JButton();
        btn_exp = new javax.swing.JButton();
        btn_percent = new javax.swing.JButton();
        btn_division = new javax.swing.JButton();
        btn_Multiplication = new javax.swing.JButton();
        btn_equal = new javax.swing.JButton();
        btn_subtraction = new javax.swing.JButton();
        btn_Sum = new javax.swing.JButton();
        btn_C = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_dot = new javax.swing.JButton();

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
        jPanel1.add(txtOperaciom, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 38));

        txtResultado.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(55, 62, 71));
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtResultado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 300, 52));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 120));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btn4.setForeground(new java.awt.Color(55, 62, 71));
        btn4.setIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn3.png")); // NOI18N
        btn4.setText("4");
        btn4.setFocusPainted(false);
        btn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn4.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn1.png")); // NOI18N
        btn4.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn2.png")); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 50, 50));

        btn_exp.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn_exp.setForeground(new java.awt.Color(55, 62, 71));
        btn_exp.setIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn1.png")); // NOI18N
        btn_exp.setText("^");
        btn_exp.setFocusPainted(false);
        btn_exp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_exp.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn1.png")); // NOI18N
        btn_exp.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn2.png")); // NOI18N
        btn_exp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_expActionPerformed(evt);
            }
        });
        jPanel2.add(btn_exp, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 50, 50));

        btn_percent.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn_percent.setForeground(new java.awt.Color(55, 62, 71));
        btn_percent.setIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn1.png")); // NOI18N
        btn_percent.setText("%");
        btn_percent.setFocusPainted(false);
        btn_percent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_percent.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn1.png")); // NOI18N
        btn_percent.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn2.png")); // NOI18N
        btn_percent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_percentActionPerformed(evt);
            }
        });
        jPanel2.add(btn_percent, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 50, 50));

        btn_division.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn_division.setForeground(new java.awt.Color(55, 62, 71));
        btn_division.setIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn1.png")); // NOI18N
        btn_division.setText("/");
        btn_division.setFocusPainted(false);
        btn_division.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_division.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn1.png")); // NOI18N
        btn_division.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn2.png")); // NOI18N
        btn_division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divisionActionPerformed(evt);
            }
        });
        jPanel2.add(btn_division, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 50, 50));

        btn_Multiplication.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn_Multiplication.setForeground(new java.awt.Color(55, 62, 71));
        btn_Multiplication.setIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn1.png")); // NOI18N
        btn_Multiplication.setText("x");
        btn_Multiplication.setFocusPainted(false);
        btn_Multiplication.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Multiplication.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn1.png")); // NOI18N
        btn_Multiplication.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn2.png")); // NOI18N
        btn_Multiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MultiplicationActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Multiplication, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 50, 50));

        btn_equal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_equal.setForeground(new java.awt.Color(255, 255, 255));
        btn_equal.setIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn5.png")); // NOI18N
        btn_equal.setText("=");
        btn_equal.setFocusPainted(false);
        btn_equal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_equal.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn1.png")); // NOI18N
        btn_equal.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn2.png")); // NOI18N
        btn_equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_equalActionPerformed(evt);
            }
        });
        jPanel2.add(btn_equal, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 50, 50));

        btn_subtraction.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn_subtraction.setForeground(new java.awt.Color(55, 62, 71));
        btn_subtraction.setIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn1.png")); // NOI18N
        btn_subtraction.setText("-");
        btn_subtraction.setFocusPainted(false);
        btn_subtraction.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_subtraction.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn1.png")); // NOI18N
        btn_subtraction.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn2.png")); // NOI18N
        btn_subtraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_subtractionActionPerformed(evt);
            }
        });
        jPanel2.add(btn_subtraction, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 50, 50));

        btn_Sum.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn_Sum.setForeground(new java.awt.Color(55, 62, 71));
        btn_Sum.setIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn1.png")); // NOI18N
        btn_Sum.setText("+");
        btn_Sum.setFocusPainted(false);
        btn_Sum.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Sum.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn1.png")); // NOI18N
        btn_Sum.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn2.png")); // NOI18N
        btn_Sum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SumActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Sum, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 50, 50));

        btn_C.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn_C.setForeground(new java.awt.Color(55, 62, 71));
        btn_C.setIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn1.png")); // NOI18N
        btn_C.setText("C");
        btn_C.setFocusPainted(false);
        btn_C.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_C.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn1.png")); // NOI18N
        btn_C.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn2.png")); // NOI18N
        btn_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CActionPerformed(evt);
            }
        });
        jPanel2.add(btn_C, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        btn7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btn7.setForeground(new java.awt.Color(55, 62, 71));
        btn7.setIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn3.png")); // NOI18N
        btn7.setText("7");
        btn7.setFocusPainted(false);
        btn7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn7.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn1.png")); // NOI18N
        btn7.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn2.png")); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 50, 50));

        btn8.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btn8.setForeground(new java.awt.Color(55, 62, 71));
        btn8.setIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn3.png")); // NOI18N
        btn8.setText("8");
        btn8.setFocusPainted(false);
        btn8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn8.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn1.png")); // NOI18N
        btn8.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn2.png")); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 50, 50));

        btn9.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btn9.setForeground(new java.awt.Color(55, 62, 71));
        btn9.setIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn3.png")); // NOI18N
        btn9.setText("9");
        btn9.setFocusPainted(false);
        btn9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn9.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn1.png")); // NOI18N
        btn9.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn2.png")); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 50, 50));

        btn5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btn5.setForeground(new java.awt.Color(55, 62, 71));
        btn5.setIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn3.png")); // NOI18N
        btn5.setText("5");
        btn5.setFocusPainted(false);
        btn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn5.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn1.png")); // NOI18N
        btn5.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn2.png")); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 50, 50));

        btn6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btn6.setForeground(new java.awt.Color(55, 62, 71));
        btn6.setIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn3.png")); // NOI18N
        btn6.setText("6");
        btn6.setFocusPainted(false);
        btn6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn6.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn1.png")); // NOI18N
        btn6.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn2.png")); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 50, 50));

        btn3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btn3.setForeground(new java.awt.Color(55, 62, 71));
        btn3.setIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn3.png")); // NOI18N
        btn3.setText("3");
        btn3.setFocusPainted(false);
        btn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn3.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn1.png")); // NOI18N
        btn3.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn2.png")); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 50, 50));

        btn2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btn2.setForeground(new java.awt.Color(55, 62, 71));
        btn2.setIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn3.png")); // NOI18N
        btn2.setText("2");
        btn2.setFocusPainted(false);
        btn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn2.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn1.png")); // NOI18N
        btn2.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn2.png")); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 50, 50));

        btn1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btn1.setForeground(new java.awt.Color(55, 62, 71));
        btn1.setIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn3.png")); // NOI18N
        btn1.setText("1");
        btn1.setFocusPainted(false);
        btn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn1.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn1.png")); // NOI18N
        btn1.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn2.png")); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 50, 50));

        btn_0.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btn_0.setForeground(new java.awt.Color(55, 62, 71));
        btn_0.setIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn3.png")); // NOI18N
        btn_0.setText("0");
        btn_0.setFocusPainted(false);
        btn_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_0.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn1.png")); // NOI18N
        btn_0.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn2.png")); // NOI18N
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 50, 50));

        btn_dot.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btn_dot.setForeground(new java.awt.Color(55, 62, 71));
        btn_dot.setIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn3.png")); // NOI18N
        btn_dot.setText(".");
        btn_dot.setFocusPainted(false);
        btn_dot.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_dot.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn1.png")); // NOI18N
        btn_dot.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\jogul\\OneDrive\\Documentos\\NetBeansProjects\\Codemx\\src\\main\\java\\com\\mycompany\\codemx\\btn2.png")); // NOI18N
        btn_dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dotActionPerformed(evt);
            }
        });
        jPanel2.add(btn_dot, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 350, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CActionPerformed
          txtOperaciom.setText("");
          txtResultado.setText("");
    }//GEN-LAST:event_btn_CActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        addNumber("8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        addNumber("9");
        
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        addNumber("4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        addNumber("5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        addNumber("6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn_subtractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_subtractionActionPerformed
        addNumber("-");
    }//GEN-LAST:event_btn_subtractionActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        addNumber("1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        addNumber("2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        addNumber("3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn_SumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SumActionPerformed
        addNumber("+");
    }//GEN-LAST:event_btn_SumActionPerformed

    private void btn_equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_equalActionPerformed
        try {
            String resultado = se.eval(txtOperaciom.getText()).toString();
            txtResultado.setText(resultado);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btn_equalActionPerformed

    private void btn_dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dotActionPerformed
        addNumber(".");
    }//GEN-LAST:event_btn_dotActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        addNumber("0");
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_MultiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MultiplicationActionPerformed
        addNumber("x");
    }//GEN-LAST:event_btn_MultiplicationActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        addNumber("7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn_expActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_expActionPerformed
        addNumber("^");
    }//GEN-LAST:event_btn_expActionPerformed

    private void btn_percentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_percentActionPerformed
        addNumber("%");
    }//GEN-LAST:event_btn_percentActionPerformed

    private void btn_divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divisionActionPerformed
        addNumber("/");
    }//GEN-LAST:event_btn_divisionActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        System.out.println("Aqui.");
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
    public void addNumber(String digito){
        txtOperaciom.setText(txtOperaciom.getText() + digito);
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_C;
    private javax.swing.JButton btn_Multiplication;
    private javax.swing.JButton btn_Sum;
    private javax.swing.JButton btn_division;
    private javax.swing.JButton btn_dot;
    private javax.swing.JButton btn_equal;
    private javax.swing.JButton btn_exp;
    private javax.swing.JButton btn_percent;
    private javax.swing.JButton btn_subtraction;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel txtOperaciom;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
   
        
}