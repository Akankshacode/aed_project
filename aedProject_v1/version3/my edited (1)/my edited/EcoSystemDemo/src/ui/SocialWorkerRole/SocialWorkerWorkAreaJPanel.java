/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SocialWorkerRole;

import Business.EcoSystem;

import Business.Organization.Organization;
import Business.Organization.SocialWorkerOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Akanksha
 */
public class SocialWorkerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SocialWorkerWorkAreaJPanel
     */
     private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private SocialWorkerOrganization socialWorkerOrganization;
    public SocialWorkerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.socialWorkerOrganization = (SocialWorkerOrganization)organization;
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
        btnManageCases = new javax.swing.JButton();
        btnSendReports = new javax.swing.JButton();
        btnReportStatus = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Social Worker");

        btnManageCases.setBackground(new java.awt.Color(255, 255, 255));
        btnManageCases.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnManageCases.setText("Manage Cases");
        btnManageCases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCasesActionPerformed(evt);
            }
        });

        btnSendReports.setBackground(new java.awt.Color(255, 255, 255));
        btnSendReports.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnSendReports.setText("Send reports");
        btnSendReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendReportsActionPerformed(evt);
            }
        });

        btnReportStatus.setBackground(new java.awt.Color(255, 255, 255));
        btnReportStatus.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnReportStatus.setText("Check Report Status");
        btnReportStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(btnManageCases)
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSendReports)
                        .addGap(89, 89, 89)
                        .addComponent(btnReportStatus)))
                .addContainerGap(247, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSendReports, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReportStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageCases, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(471, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageCasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCasesActionPerformed
        ManageCasesJPanel manageCases = new ManageCasesJPanel(userProcessContainer,business,userAccount);
        userProcessContainer.add("ManageCasesJPanel",manageCases);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageCasesActionPerformed

    private void btnSendReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendReportsActionPerformed
        SendReportJPanel sendReport = new SendReportJPanel(userProcessContainer,business,userAccount);
        userProcessContainer.add("SendReportJPanel",sendReport);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSendReportsActionPerformed

    private void btnReportStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportStatusActionPerformed
        ReportStatusJPanel reportStatus = new ReportStatusJPanel(userProcessContainer,business,userAccount);
        userProcessContainer.add("ReportStatusJPanel",reportStatus);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnReportStatusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageCases;
    private javax.swing.JButton btnReportStatus;
    private javax.swing.JButton btnSendReports;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
