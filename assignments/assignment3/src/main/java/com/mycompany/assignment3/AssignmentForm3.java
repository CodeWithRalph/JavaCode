/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.assignment3;

import javax.swing.JLabel;

/**
 *
 * @author Ralph
 */
public class AssignmentForm3 extends javax.swing.JFrame {

    private int[] numberOfCharArray;
    private JLabel[] jLabelStats;

    /**
     * Creates new form AssignmentForm3
     */
    public AssignmentForm3() {
        initComponents();
        numberOfCharArray = new int[6];
        initJLabelStats();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabelPalindrome = new javax.swing.JLabel();
        jButtonAnalyse = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelAns1 = new javax.swing.JLabel();
        jLabelAns2 = new javax.swing.JLabel();
        jLabelAns3 = new javax.swing.JLabel();
        jLabelAns4 = new javax.swing.JLabel();
        jLabelAns5 = new javax.swing.JLabel();
        jLabelAns6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new java.awt.BorderLayout(0, 5));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setToolTipText("");
        getContentPane().add(jTextArea1, java.awt.BorderLayout.PAGE_START);

        jLabelPalindrome.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabelPalindrome.setText("Is it a palindrome?");

        jButtonAnalyse.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonAnalyse.setText("Check");
        jButtonAnalyse.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAnalyse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnalyseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabelPalindrome, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonAnalyse, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPalindrome)
                    .addComponent(jButtonAnalyse))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel1.setText("number of alphabetic characters :");

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel2.setText("number of numeric digits        :");

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel3.setText("number of control characters    :");

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel4.setText("number of lower case characters :");

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel5.setText("number of upper case characters :");

        jLabel6.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel6.setText("number of whitespace characters :");

        jLabelAns1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabelAns1.setText(" ");

        jLabelAns2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabelAns2.setText(" ");

        jLabelAns3.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabelAns3.setText(" ");

        jLabelAns4.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabelAns4.setText(" ");

        jLabelAns5.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabelAns5.setText(" ");

        jLabelAns6.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabelAns6.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabelAns5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelAns4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelAns3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelAns2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelAns1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelAns6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelAns1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabelAns2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabelAns3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabelAns4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabelAns5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabelAns6))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAnalyseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnalyseActionPerformed
        displayResult(isPalindrome(jTextArea1.getText()));
        numberOfCharArray = stringStats(jTextArea1.getText());
        displayStatistics(numberOfCharArray);
    }//GEN-LAST:event_jButtonAnalyseActionPerformed

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
            java.util.logging.Logger.getLogger(AssignmentForm3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AssignmentForm3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AssignmentForm3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssignmentForm3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AssignmentForm3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnalyse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelAns1;
    private javax.swing.JLabel jLabelAns2;
    private javax.swing.JLabel jLabelAns3;
    private javax.swing.JLabel jLabelAns4;
    private javax.swing.JLabel jLabelAns5;
    private javax.swing.JLabel jLabelAns6;
    private javax.swing.JLabel jLabelPalindrome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    private boolean isPalindrome(String text) {
        StringBuilder cleanText = new StringBuilder();
        char[] textArray = text.toCharArray();
        // Loop, clean(remove non alphabetic and non digits),
        // and convert all to upper case the entire string
        for (int index = 0; index < text.length(); index++) {
            char character = textArray[index];
            // check if alphabetic
            if (Character.isAlphabetic(character)) {
                if (Character.isLowerCase(character)) {
                    cleanText.append(Character.toUpperCase(character));
                } else {
                    cleanText.append(character);
                }
            } // check if numeric or digit
            else if (Character.isDigit(character)) {
                cleanText.append(character);
            }
        }
        // get the length of half of cleaned string text
        int halfLength = (int) cleanText.length() / 2;
        // get the first half of cleaned String text
        String firstHalf = cleanText.substring(0, halfLength);
        // get the reversed clean String text and get its first half
        // technically the second half
        String secondHalf = cleanText.reverse().substring(0, halfLength);
        
        // return if the first half is equal to second half
        return firstHalf.equals(secondHalf);
    }

    private int[] stringStats(String text) {
        int numOfalphabet = 0;
        int numOfNumeric = 0;
        int numOfControl = 0;
        int numOfLowerCase = 0;
        int numOfUpperCase = 0;
        int numOfWhitespace = 0;
        char[] textArray = text.toCharArray();
        // Loop and count the Character category for the entire string
        for (int index = 0; index < text.length(); index++) {
            char character = textArray[index];
            if (Character.isAlphabetic(character)) {
                numOfalphabet++;
                if (Character.isLowerCase(character)) {
                    numOfLowerCase++;
                } else {
                    numOfUpperCase++;
                }
            } else if (Character.isDigit(character)) {
                numOfNumeric++;
            } else if (Character.isISOControl(character)) {
                numOfControl++;
            } else if (Character.isWhitespace(character)) {
                numOfWhitespace++;
            }
        }
        int[] numberStat = {numOfalphabet, numOfNumeric, numOfControl,
            numOfLowerCase, numOfUpperCase, numOfWhitespace};
        return numberStat;
    }

    private void displayResult(boolean isiTPalindrome) {
        if (isiTPalindrome) {
            jLabelPalindrome.setText("true - is a palindrome");
        } else {
            jLabelPalindrome.setText("false - is NOT a palindrome");
        }
    }

    private void displayStatistics(int[] numberOfCharArray) {
        for (int index = 0; index < numberOfCharArray.length; index++) {
            jLabelStats[index].setText(Integer.toString(numberOfCharArray[index]));
        }
    }

    private void initJLabelStats() {
        jLabelStats = new JLabel[6];
        jLabelStats[0] = jLabelAns1;
        jLabelStats[1] = jLabelAns2;
        jLabelStats[2] = jLabelAns3;
        jLabelStats[3] = jLabelAns4;
        jLabelStats[4] = jLabelAns5;
        jLabelStats[5] = jLabelAns6;
    }
}
