/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SocialWorkerRole;

import Business.Case.Case;
import Business.Case.HospitalCaseDirectory;
import Business.Case.LawCaseDirectory;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author Akanksha
 */
public class ViewLawStatsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewLawStatsJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
     private LawCaseDirectory lcd;
       private Case ca;

    public ViewLawStatsJPanel(JPanel userProcessContainer, EcoSystem business, UserAccount userAccount,String caseId) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.userAccount = userAccount;
        lcd= business.getLcaseDir();
       
        ca=lcd.findById(caseId);
        System.out.println(ca.getCaseID()+"HERE IT IS");
        populateData();
        
    }

     private void populateData()
    {
        
            lblActionPlan.setText(ca.getActionPlan());
            lblEvidencePresented.setText(ca.getEvidence_Present());
            lblJudgement.setText(ca.getJudgement());
            lblJuryDecision.setText(ca.getDecision());
            lblLawEnforced.setText(ca.getLawEnforcedRequired());
            lblLawInvoked.setText(ca.getLawInvoked());
            lblPersonalComments.setText(ca.getPersonalComments());
            lblEvidencePresented.setText(ca.getEvidence_Present());
            lblSentence.setText(ca.getSentence());
            lblPossibilityOfParole.setText(ca.getParole());
            lblRestrainingOrder.setText(ca.getRestrainingOrder());
        
      
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
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblLawInvoked = new javax.swing.JLabel();
        lblActionPlan = new javax.swing.JLabel();
        lblLawEnforced = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        lblHeading1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblPersonalComments = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblJuryDecision = new javax.swing.JLabel();
        lblEvidencePresented = new javax.swing.JLabel();
        lblJudgement = new javax.swing.JLabel();
        lblSentence = new javax.swing.JLabel();
        lblPossibilityOfParole = new javax.swing.JLabel();
        lblRestrainingOrder = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));

        lblHeading.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblHeading.setText("Lawyer Report");

        jLabel4.setText("Action Plan :");

        jLabel6.setText("Law enforcement Required :");

        lblLawInvoked.setText("-");

        lblActionPlan.setText("-");

        lblLawEnforced.setText("-");

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        lblHeading1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblHeading1.setText("Court Report");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Law invoked:");

        jLabel8.setText("Personal Comments :");

        lblPersonalComments.setText("-");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Jury Decision :");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Evidence Presented :");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Judgement :");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Sentence :");

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Possibility of Parole:");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Restraining Order :");

        lblJuryDecision.setText("-");

        lblEvidencePresented.setText("-");

        lblJudgement.setText("-");

        lblSentence.setText("-");

        lblPossibilityOfParole.setText("-");

        lblRestrainingOrder.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backJButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLawInvoked, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblActionPlan, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblLawEnforced, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPersonalComments, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblEvidencePresented)
                                    .addComponent(lblJuryDecision)
                                    .addComponent(lblJudgement)
                                    .addComponent(lblSentence)
                                    .addComponent(lblPossibilityOfParole)
                                    .addComponent(lblRestrainingOrder))
                                .addGap(82, 82, 82))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(lblHeading1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(546, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backJButton)
                .addGap(5, 5, 5)
                .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLawInvoked)
                    .addComponent(jLabel7))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblActionPlan))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLawEnforced)
                    .addComponent(jLabel6))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblPersonalComments))
                .addGap(39, 39, 39)
                .addComponent(lblHeading1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lblJuryDecision))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lblEvidencePresented))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lblJudgement))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(lblSentence))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(lblPossibilityOfParole))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(lblRestrainingOrder))
                .addContainerGap(79, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblActionPlan;
    private javax.swing.JLabel lblEvidencePresented;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblHeading1;
    private javax.swing.JLabel lblJudgement;
    private javax.swing.JLabel lblJuryDecision;
    private javax.swing.JLabel lblLawEnforced;
    private javax.swing.JLabel lblLawInvoked;
    private javax.swing.JLabel lblPersonalComments;
    private javax.swing.JLabel lblPossibilityOfParole;
    private javax.swing.JLabel lblRestrainingOrder;
    private javax.swing.JLabel lblSentence;
    // End of variables declaration//GEN-END:variables
}
