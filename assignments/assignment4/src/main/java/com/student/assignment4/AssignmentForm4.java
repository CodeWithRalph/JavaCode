/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.student.assignment4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author s0542191
 */
public class AssignmentForm4 extends javax.swing.JFrame {

    private String inputFileName = "";
    private String outputFileName = "";
    private File inputFile;
    private File outputFile;
    private int numberOfField = 0;
    private int numberOfPrecision = 0;
    private int numberOfColumns = 0;
    private List<BigDecimal> numberListInput = new ArrayList<>();
    private boolean isUserInputOK;
    int maxValue = 0;

    /**
     * Creates new form assignmentForm4
     */
    public AssignmentForm4() {
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

        jTextFieldInputFile = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldOutputFile = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButtonProcess = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldNumberField = new javax.swing.JTextField();
        jLabelNumberOfPrecision = new javax.swing.JLabel();
        jTextFieldNumberOfPrecision = new javax.swing.JTextField();
        jTextFieldNumberOfColumns = new javax.swing.JTextField();
        jLabelNumberOfField = new javax.swing.JLabel();
        jLabelNumberOfColumns = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTextFieldInputFile.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Input File");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Output File");

        jTextFieldOutputFile.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Settings:");

        jButtonProcess.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButtonProcess.setText("Process");
        jButtonProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProcessActionPerformed(evt);
            }
        });

        jTextFieldNumberField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabelNumberOfPrecision.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelNumberOfPrecision.setText("Number of Precision (0-15)");

        jTextFieldNumberOfPrecision.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTextFieldNumberOfColumns.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabelNumberOfField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelNumberOfField.setText("Number of Field Width (0-15)");

        jLabelNumberOfColumns.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelNumberOfColumns.setText("Number of Columns (1-5)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelNumberOfColumns, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNumberOfColumns, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelNumberOfPrecision, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNumberOfPrecision, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelNumberOfField, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumberOfField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNumberOfPrecision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNumberOfPrecision, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumberOfColumns, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNumberOfColumns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30)
                        .addComponent(jTextFieldInputFile))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldOutputFile))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldInputFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldOutputFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonProcess)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProcessActionPerformed
        isUserInputOK = true;
        numberListInput.clear();

        // get input field and check input file
        getInputFileName();
        checkInputFile();
        
        // get output field and check output file
        getOutputFileName();
        checkOutputFile();
        
        // check field value
        getNumberOfField();
        getNumberOfPrecision();
        getNumberOfColumns();

        // check the input and output files
        // read and write output files only if all user inputs are accepted
        if (isUserInputOK) {
            readInputFile();
            writeOutputFile();
        }
    }//GEN-LAST:event_jButtonProcessActionPerformed

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
            java.util.logging.Logger.getLogger(AssignmentForm4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AssignmentForm4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AssignmentForm4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssignmentForm4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AssignmentForm4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonProcess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelNumberOfColumns;
    private javax.swing.JLabel jLabelNumberOfField;
    private javax.swing.JLabel jLabelNumberOfPrecision;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldInputFile;
    private javax.swing.JTextField jTextFieldNumberField;
    private javax.swing.JTextField jTextFieldNumberOfColumns;
    private javax.swing.JTextField jTextFieldNumberOfPrecision;
    private javax.swing.JTextField jTextFieldOutputFile;
    // End of variables declaration//GEN-END:variables

    private void getInputFileName() {
        inputFileName = jTextFieldInputFile.getText();
        if (inputFileName.isBlank()) {
            isUserInputOK = false;
            JOptionPane.showMessageDialog(this, "Input file is blank!");
        }
    }

    private void getOutputFileName() {
        outputFileName = jTextFieldOutputFile.getText();
        if (isUserInputOK && outputFileName.isBlank()) {
            isUserInputOK = false;
            JOptionPane.showMessageDialog(this, "Output file is blank!");
        }
    }

    private void getNumberOfField() {
        if (isUserInputOK) {
            String errorMessage = "Invalid Number of Field value";
            boolean isFieldBlank = jTextFieldNumberField.getText().isBlank();
            if (isFieldBlank) {
                JOptionPane.showMessageDialog(this, errorMessage);
                isUserInputOK = false;
            } else {
                numberOfField = Integer.decode(jTextFieldNumberField.getText());
                if (numberOfField < 0 || numberOfField > 15) {
                    JOptionPane.showMessageDialog(this, errorMessage);
                    isUserInputOK = false;
                }
            }
        }
    }

    private void getNumberOfPrecision() {
        if (isUserInputOK) {
            String errorMessage = "Invalid Number of Precision value";
            boolean isFieldBlank = jTextFieldNumberOfPrecision.getText().isBlank();
            if (isFieldBlank) {
                JOptionPane.showMessageDialog(this, errorMessage);
                isUserInputOK = false;
            } else {
                numberOfPrecision = Integer.decode(jTextFieldNumberOfPrecision.getText());
                if (numberOfPrecision < 0 || numberOfPrecision > 15) {
                    JOptionPane.showMessageDialog(this, errorMessage);
                    isUserInputOK = false;
                }
            }
        }
    }

    private void getNumberOfColumns() {
        if (isUserInputOK) {
            String errorMessage = "Invalid Number of Columns value";
            boolean isFieldBlank = jTextFieldNumberOfColumns.getText().isBlank();
            if (isFieldBlank) {
                JOptionPane.showMessageDialog(this, errorMessage);
                isUserInputOK = false;
            } else {
                numberOfColumns = Integer.decode(jTextFieldNumberOfColumns.getText());
                if (numberOfColumns < 1 || numberOfColumns > 5) {
                    JOptionPane.showMessageDialog(this, errorMessage);
                    isUserInputOK = false;
                }
            }
        }
    }

    private void checkInputFile() {
        if (isUserInputOK) {
            inputFile = new File(inputFileName);
            if (!inputFile.isFile() && isUserInputOK) {
                JOptionPane.showMessageDialog(this, "Input file not found! "
                        + inputFile.getAbsolutePath());
                isUserInputOK = false;
            }
        }
    }

    private void checkOutputFile() {
        if (isUserInputOK) {
            outputFile = new File(outputFileName);
            if (outputFile.isFile() && isUserInputOK) {
                JOptionPane.showMessageDialog(this, "Output file exists! "
                        + outputFile.getAbsolutePath());
                isUserInputOK = false;
            }
        }
    }

    private void readInputFile() {
        try {
            Scanner scInput = new Scanner(new BufferedReader(new FileReader(inputFile)));
            while (scInput.hasNext()) {
                BigDecimal number = scInput.nextBigDecimal();
                numberListInput.add(number);
                maxValue = Math.max(number.intValue(), number.intValue());
            }
            scInput.close();
        } catch (FileNotFoundException error) {
            JOptionPane.showMessageDialog(this, error.getMessage());
        }
    }

    private void writeOutputFile() {
        try {
            BufferedWriter bufFileOutput = new BufferedWriter(new FileWriter(outputFile));
            String outputText = "";
            int colNum = 1;
            int maxValueLength = String.valueOf(maxValue).length();
            String stringFormat = "%." + Integer.toString(numberOfField) + "f";
            for (BigDecimal number : numberListInput) {
                // round the float to precision value and convert to String
                String numberString = String.format(stringFormat,
                        number.setScale(numberOfPrecision, RoundingMode.HALF_UP));
                // Insert a space before the float value as String
                int space = numberString.split("\\.")[0].length();
                for (; space < maxValueLength; space++) {
                    numberString = " " + numberString;
                }
                // add the number as String to the final output String
                outputText += numberString;
                // add a space between columns
                if (colNum < numberOfColumns) {
                    outputText += "   ";
                }
                colNum++;
                // set column back to 1 when greater then number of columns
                if (colNum > numberOfColumns) {
                    outputText += String.format("%n", "");
                    colNum = 1;
                }
            }
            bufFileOutput.write(outputText);
            bufFileOutput.close();
            JOptionPane.showMessageDialog(this,
                    "Program successfully completed. Please open "
                    + outputFileName + " file.");
        } catch (IOException error) {
            JOptionPane.showMessageDialog(this, error.getMessage());
        }
    }
}
