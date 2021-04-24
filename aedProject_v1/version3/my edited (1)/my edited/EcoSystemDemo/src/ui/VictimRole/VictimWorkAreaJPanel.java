/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.VictimRole;

import Business.Case.CaseDirectory;
import Business.EcoSystem;
import Business.Organization.Organization;
import Business.Organization.VictimOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Akanksha
 */
public class VictimWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VictimWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private VictimOrganization victimOrganization;

    public VictimWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.victimOrganization = (VictimOrganization)organization;
        System.out.println("WELCOME"+account.getEmployee().getName());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeading = new javax.swing.JLabel();
        btnFileComplaint = new javax.swing.JButton();
        btnViewComplaint = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));
        setPreferredSize(new java.awt.Dimension(1680, 1050));

        lblHeading.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeading.setText("YOUR SAFETY IS OUR CONCERN");

        btnFileComplaint.setBackground(new java.awt.Color(54, 33, 89));
        btnFileComplaint.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnFileComplaint.setForeground(new java.awt.Color(255, 255, 255));
        btnFileComplaint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/file.png"))); // NOI18N
        btnFileComplaint.setText("File Complaint");
        btnFileComplaint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFileComplaintActionPerformed(evt);
            }
        });

        btnViewComplaint.setBackground(new java.awt.Color(54, 33, 89));
        btnViewComplaint.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnViewComplaint.setForeground(new java.awt.Color(255, 255, 255));
        btnViewComplaint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/file_preview.png"))); // NOI18N
        btnViewComplaint.setText("View Complaint Status");
        btnViewComplaint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewComplaintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(324, 324, 324)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnFileComplaint, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(btnViewComplaint)))
                .addContainerGap(688, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewComplaint, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFileComplaint, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(803, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnFileComplaintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFileComplaintActionPerformed
        CreateJPanel createComplaint = new CreateJPanel(userProcessContainer, business,userAccount);
        userProcessContainer.add("CreateJPanel",createComplaint);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnFileComplaintActionPerformed

    private void btnViewComplaintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewComplaintActionPerformed
        ViewComplaintJPanel viewComplaint = new ViewComplaintJPanel(userProcessContainer, business,userAccount);
        userProcessContainer.add("ViewComplaintJPanel",viewComplaint);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewComplaintActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFileComplaint;
    private javax.swing.JButton btnViewComplaint;
    private javax.swing.JLabel lblHeading;
    // End of variables declaration//GEN-END:variables
}
