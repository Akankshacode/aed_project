/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SocialWorkerRole;

import Business.Case.Case;
import Business.Case.CaseDirectory;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import com.github.javafaker.Faker;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Akanksha
 */
public class ManageCasesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCasesJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private CaseDirectory cd;
    public ManageCasesJPanel(JPanel userProcessContainer,EcoSystem business,UserAccount userAccount) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.business=business;
        this.userAccount=userAccount;
        tblCases.getTableHeader().setForeground(Color.blue);
        tblCases.getTableHeader().setDefaultRenderer(new HeaderColor());
        populateTable();
         cd=business.getCaseDir();
        
    }
      public class HeaderColor extends DefaultTableCellRenderer {

        public HeaderColor() {
            setOpaque(true);
        }

        public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {
            super.getTableCellRendererComponent(table, value, selected, focused, row, column);
           
           setBackground(new java.awt.Color(51, 255, 153));
//you can change the color that u want 
            return this;
        }

    }
    
    public void populateTable(){
         DefaultTableModel model = (DefaultTableModel) tblCases.getModel();
        model.setRowCount(0);
        Faker faker = new Faker();
        Random rnd = new Random();
        for (Case c : business.getCaseDir().getCaseList()) {
            if(!c.getStatus().equals("Case sent"))
            {
            Object [] row = new Object[5];
                row[0] = c;
                row[1] = c.getVictimName();
                 row[2] = c.getIssue();
                 row[3]=c.getSocialWorker();
                 row[4] = c.getStatus(); 
                model.addRow(row);
            }
        }
        for(int i=1; i<6; i++){
            Object row[] = new Object[5];
            
            int caseid = rnd.nextInt(1050-1011)+1011;
    
            row[0] = caseid;
            row[1] = faker.name().fullName() ;
            row[2] = "Sexual Assault";
            row[3] = faker.name().fullName();
            row[4] = "Incomplete";
            model.addRow(row);
        }
        for(int i=1; i<6; i++){
            Object row[] = new Object[5];
            
            int caseid = rnd.nextInt(1050-1016)+1016;
    
            row[0] = caseid;
            row[1] = faker.name().fullName() ;
            row[2] = "Verbal Abuse";
            row[3] = faker.name().fullName();
            row[4] = "Complete";
            model.addRow(row);
        }
        for(int i=1; i<10; i++){
            Object row[] = new Object[5];
            
            int caseid = rnd.nextInt(1050-1021)+1021;
    
            row[0] = caseid;
            row[1] = faker.name().fullName() ;
            row[2] = "Non-Verbal Abuse";
            row[3] = faker.name().fullName();
            row[4] = "Complete";
            model.addRow(row);
        }
        for(int i=1; i<6; i++){
            Object row[] = new Object[5];
            
            int caseid = rnd.nextInt(1050-1011)+1011;
    
            row[0] = caseid;
            row[1] = faker.name().fullName() ;
            row[2] = "Sexual Assault";
            row[3] = faker.name().fullName();
            row[4] = "Incomplete";
            model.addRow(row);
        }
        for(int i=1; i<3; i++){
            Object row[] = new Object[5];
            
            int caseid = rnd.nextInt(1050-1016)+1016;
    
            row[0] = caseid;
            row[1] = faker.name().fullName() ;
            row[2] = "Verbal Abuse";
            row[3] = faker.name().fullName();
            row[4] = "Complete";
            model.addRow(row);
        }
        for(int i=1; i<6; i++){
            Object row[] = new Object[5];
            
            int caseid = rnd.nextInt(1050-1021)+1021;
    
            row[0] = caseid;
            row[1] = faker.name().fullName() ;
            row[2] = "Non-Verbal Abuse";
            row[3] = faker.name().fullName();
            row[4] = "Incomplete";
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCases = new javax.swing.JTable();
        btnGenerateReport = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));

        tblCases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CaseID", "VictimName", "Issue", "Social Worker", "Status"
            }
        ));
        tblCases.setSelectionBackground(new java.awt.Color(0, 51, 255));
        jScrollPane1.setViewportView(tblCases);

        btnGenerateReport.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGenerateReport.setText("Generate Report");
        btnGenerateReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateReportActionPerformed(evt);
            }
        });

        backJButton.setBackground(new java.awt.Color(255, 255, 255));
        backJButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Remove");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(154, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGenerateReport)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(110, 110, 110))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGenerateReport)
                    .addComponent(jButton1))
                .addContainerGap(611, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerateReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateReportActionPerformed
        int selectedRow = tblCases.getSelectedRow();
        try { 
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a case", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Case ca = (Case) tblCases.getValueAt(selectedRow, 0);
      if(!ca.getStatus().equals("Case InProgress"))
          {
            JOptionPane.showMessageDialog(null,"Report has already been generated", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
            
         CreateReportJPanel createReport = new CreateReportJPanel(userProcessContainer,business,userAccount,ca);
        userProcessContainer.add("CreateReportJPanel",createReport);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
        catch(Exception e){
                System.out.print("");
                }
    }//GEN-LAST:event_btnGenerateReportActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         int selectedRow = tblCases.getSelectedRow();
          
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a case", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Case ca = (Case) tblCases.getValueAt(selectedRow, 0);
        cd.deleteCase(ca);
        populateTable();
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnGenerateReport;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCases;
    // End of variables declaration//GEN-END:variables
}
