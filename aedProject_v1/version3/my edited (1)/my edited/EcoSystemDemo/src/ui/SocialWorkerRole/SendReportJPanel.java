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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Akanksha
 */
public class SendReportJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SendReportJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
private HospitalCaseDirectory hdir;
private LawCaseDirectory ldir;
    public SendReportJPanel(JPanel userProcessContainer, EcoSystem business, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.userAccount = userAccount;
        hdir=business.getHospitalCaseDirectory();
        ldir=business.getLcaseDir();
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblReport.getModel();
        model.setRowCount(0);
        for (Case c : business.getCaseDir().getCaseList()) {
            if (!c.getSocialStatus().equals("Not Assigned")) {
                Object[] row = new Object[4];
                row[0] = c;
                  row[1] = c.getVictimName();
                row[2] = c.getSocialObservations();
                row[3] = c.getStatus();
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

        lblHeading = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReport = new javax.swing.JTable();
        btnHospital = new javax.swing.JButton();
        btnLawfirm = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        lblHeading.setText("List of Reports");

        tblReport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Case ID", "Victim Name", "Observations", "Status"
            }
        ));
        jScrollPane1.setViewportView(tblReport);

        btnHospital.setText("Send Report to Hospital");
        btnHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalActionPerformed(evt);
            }
        });

        btnLawfirm.setText("Send Report to Lawfirm");
        btnLawfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLawfirmActionPerformed(evt);
            }
        });

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(btnHospital)
                        .addGap(230, 230, 230)
                        .addComponent(btnLawfirm))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 986, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backJButton)
                                .addGap(70, 70, 70)
                                .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(281, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backJButton)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLawfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(345, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitalActionPerformed
        int selectedRow = tblReport.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a case", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Case ca = (Case) tblReport.getValueAt(selectedRow, 0);
       
      
        ca.setTherapist("Not Assigned");
          ca.setDoctor("Not Assigned");
          ca.setDstatus("Fresh");
        ca.setTstatus("Fresh");
          ca.setHstatus("Fresh");
          ca.setStatus("ReportSent");
        hdir.AddCase(ca);
        
        JOptionPane.showMessageDialog(null, "Report sent to Hospital");
         populateTable();
    }//GEN-LAST:event_btnHospitalActionPerformed

    private void btnLawfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLawfirmActionPerformed
        int selectedRow = tblReport.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a case", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Case ca = (Case) tblReport.getValueAt(selectedRow, 0);
       
          ca.setLawyerStatus("Not Assigned");
          ca.setLStatus("Fresh");
          ca.setCstatus("Fresh");
          
          
        ldir.AddCase(ca);
        
        JOptionPane.showMessageDialog(null, "Report sent to Law Firm");
         ca.setStatus("ReportSent");
    }//GEN-LAST:event_btnLawfirmActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnHospital;
    private javax.swing.JButton btnLawfirm;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JTable tblReport;
    // End of variables declaration//GEN-END:variables
}
