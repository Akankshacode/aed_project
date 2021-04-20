/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.TherapistRole;

import Business.Case.Case;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;

import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author markynsailamar
 */
public class TherapistReportJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TherapistReportJPanel
     */
     private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
  
    private Enterprise enterprise;
    private  EcoSystem system;
    
    public TherapistReportJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.system=system;
        populateTable();
    }

    
     public void populateTable() {
         DefaultTableModel model = (DefaultTableModel) tabAppointment.getModel();
        model.setRowCount(0);
        for (Case c : system.getHospitalCaseDirectory().getCaseList()) {
            if(c.getTstatus().equals("AppointmentWIthTherapist")||c.getTstatus().equals("Completed")||c.getTstatus().equals("ReportSent"))
            {
            Object [] row = new Object[4];
                row[0] = c;
                row[1] = c.getVictimName();
                 row[2] = c.getDocAppointment();
                 row[3] = c.getTstatus();
                
                
                model.addRow(row);
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabAppointment = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        txtProblem = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSymtom = new javax.swing.JLabel();
        txtTherapy = new javax.swing.JLabel();

        jButton1.setText("Appointment Completed");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Create Report");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("View Report");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("DESCRIPTION OF PROBLEM");

        jLabel2.setText("SYMPTOM AS A RESULT");

        tabAppointment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Case Number", "Victim Name", "Appointment date", "Status"
            }
        ));
        jScrollPane1.setViewportView(tabAppointment);

        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        txtProblem.setText("<html> </html>");

        jLabel3.setText("RECOMMENDED THERAPY");

        txtSymtom.setText("<html> </html");

        txtTherapy.setText("<html></html>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 988, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jButton3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProblem, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSymtom, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTherapy, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(77, 77, 77)
                .addComponent(jButton3)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtProblem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSymtom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTherapy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         int selectedRow = tabAppointment.getSelectedRow();
          
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a case", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Case casse=(Case) tabAppointment.getValueAt(selectedRow, 0);
        
     
       if(! casse.getTstatus().equals("Completed"))
       {
           JOptionPane.showMessageDialog(null,"Appointment is not completed", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
       }
        
        
        
        ReportJPanel reportJPanel = new ReportJPanel(userProcessContainer,userAccount,casse);
        userProcessContainer.add("reportJPanel", reportJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        
       /*ReportJPanel  reportJPanel= new ReportJPanel(userProcessContainer,userAccount,organization,enterprise);
        userProcessContainer.add("reportJPanel", reportJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);*/
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
     userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
       CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
         
    
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
           
        int selectedRow = tabAppointment.getSelectedRow();
          
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a case", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Case c=(Case) tabAppointment.getValueAt(selectedRow, 0);
        
            if(!c.getTstatus().equals("AppointmentWIthTherapist")) {
            JOptionPane.showMessageDialog(null,"Appointment is already done", "Warining",JOptionPane.WARNING_MESSAGE);
            return;
        }
     
        c.setTstatus("Completed");
         populateTable();
                userAccount.getEmployee().setFlag(true);
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
            
        int selectedRow = tabAppointment.getSelectedRow();
          
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a case", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Case c=(Case) tabAppointment.getValueAt(selectedRow, 0);
         
       if(! c.getTstatus().equals("ReportSent"))
       {
           JOptionPane.showMessageDialog(null,"Report Needs to be made", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
       }
       txtProblem.setText(c.getTherapistDescription());
      txtSymtom.setText(c.getTherapistSymptom());
      txtTherapy.setText(c.getTherapistTherapy());
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabAppointment;
    private javax.swing.JLabel txtProblem;
    private javax.swing.JLabel txtSymtom;
    private javax.swing.JLabel txtTherapy;
    // End of variables declaration//GEN-END:variables
}
