/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.prog_poe_part_2;

import javax.swing.JOptionPane;
import static com.mycompany.prog_poe_part_2.Prog_POE_PART_2.TaskName;
import static com.mycompany.prog_poe_part_2.Prog_POE_PART_2.TaskDescription;
import static com.mycompany.prog_poe_part_2.Prog_POE_PART_2.TaskDuration;
import static com.mycompany.prog_poe_part_2.Prog_POE_PART_2.statusOptions;
import static com.mycompany.prog_poe_part_2.Prog_POE_PART_2.Developerdetails;
import static com.mycompany.prog_poe_part_2.Prog_POE_PART_2.TaskId;
import static com.mycompany.prog_poe_part_2.Prog_POE_PART_2.TaskNumber;
import static com.mycompany.prog_poe_part_2.Prog_POE_PART_2.FirstName;
import static com.mycompany.prog_poe_part_2.Prog_POE_PART_2.LastName;

/**
 *
 * @author RC_Student_lab
 */
public class Developer_page extends javax.swing.JFrame {

    /**
     * Creates new form Developer_page
     */
    public Developer_page() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Developerdetails = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TaskName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TaskId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TaskNumber = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TaskDuration = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TaskDescription = new javax.swing.JTextField();
        Submit = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Welcome to Easy Kanban.");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Developers Page.");

        jLabel3.setText("developer details :");

        jLabel4.setText("Task Name :");

        jLabel5.setText("Task ID :");

        jLabel6.setText("Task Number :");

        jLabel7.setText("Task Duration :");

        jLabel8.setText("Task description :");

        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        jButton2.setText("Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Quit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(Developerdetails, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Submit)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TaskName, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                                            .addComponent(TaskId)
                                            .addComponent(TaskNumber)
                                            .addComponent(TaskDuration)
                                            .addComponent(TaskDescription)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addComponent(jButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                                        .addComponent(jButton3))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel2)))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Developerdetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TaskName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TaskId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TaskNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(TaskDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(TaskDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Submit)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         new Home_page().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
         TaskName = JOptionPane.showInputDialog(null, "Please enter your task name.");

    TaskDescription = JOptionPane.showInputDialog(null, "Please describe your task.");
    if (TaskDescription.length() <= 50) {
        JOptionPane.showMessageDialog(null, "Task description successfully captured.");
    } else {
        JOptionPane.showMessageDialog(null, "Please enter a description of 50 characters or less.");
        return;
    }

    String inputTaskDuration = JOptionPane.showInputDialog(null, "Please enter the task duration in hours.");
    try {
        TaskDuration = Integer.parseInt(inputTaskDuration); // Convert input to integer
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Invalid input! Please enter a valid number for task duration.");
        return; // Exit if invalid input
    }

    // Select the task status
    int selectedOption = JOptionPane.showOptionDialog(null,
            "Select the task status:",
            "Task Status",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.INFORMATION_MESSAGE,
            null,
            statusOptions,
            statusOptions[0]);
    
    String taskStatus;
    if (selectedOption != -1) {
        taskStatus = statusOptions[selectedOption];
        JOptionPane.showMessageDialog(null, "Task status selected: " + taskStatus);
    } else {
        JOptionPane.showMessageDialog(null, "No status selected.");
        return; // Exit if no status is selected
    }

    TaskNumber++; // Increment task number for each task
    TaskId = generateTaskID(FirstName, LastName, TaskName, TaskNumber);

    Developerdetails = FirstName + " " + LastName;

    JOptionPane.showMessageDialog(null, 
        "Task Summary:\n" +
        "Task Name: " + TaskName + "\n" +
        "Task ID: " + TaskId + "\n" +
        "Task Description: " + TaskDescription + "\n" +
        "Task Duration: " + TaskDuration + " hours\n" +
        "Task Status: " + taskStatus + "\n" +
        "Task Number: " + TaskNumber + "\n" +
        "Developer Details: " + Developerdetails);
}

public static String generateTaskID(String firstName, String lastName, String taskName, int taskNumber) {
    // Example TaskID format: First letter of first name + last name + task name + task number
    return firstName.substring(0, 1).toUpperCase() + 
           lastName.substring(0, 1).toUpperCase() + 
           "-" + taskName.toUpperCase() + "-" + taskNumber;
}

    private static void displayReport() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    }//GEN-LAST:event_SubmitActionPerformed

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
            java.util.logging.Logger.getLogger(Developer_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Developer_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Developer_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Developer_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Developer_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Developerdetails;
    private javax.swing.JButton Submit;
    private javax.swing.JTextField TaskDescription;
    private javax.swing.JTextField TaskDuration;
    private javax.swing.JTextField TaskId;
    private javax.swing.JTextField TaskName;
    private javax.swing.JTextField TaskNumber;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}