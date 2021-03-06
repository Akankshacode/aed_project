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
import java.awt.Color;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
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
        tabAppointment.getTableHeader().setForeground(Color.blue);
        tabAppointment.getTableHeader().setDefaultRenderer(new HeaderColor());
        populateTable();
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

    
     public void populateTable() {
         DefaultTableModel model = (DefaultTableModel) tabAppointment.getModel();
        model.setRowCount(0);
        for (Case c : system.getHospitalCaseDirectory().getCaseList()) {
            if(c.getTstatus().equals("AppointmentWIthTherapist")||c.getTstatus().equals("Completed")||c.getTstatus().equals("ReportSent"))
            {
            Object [] row = new Object[4];
                row[0] = c;
                row[1] = c.getVictimName();
                 row[2] = c.getTherapistAppointement();
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

        setBackground(new java.awt.Color(204, 255, 204));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jButton1.setText("Appointment Completed");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jButton2.setText("Create Report");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton3.setText("View Report");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("DESCRIPTION OF PROBLEM");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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
        tabAppointment.setSelectionBackground(new java.awt.Color(0, 51, 255));
        jScrollPane1.setViewportView(tabAppointment);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        txtProblem.setText("<html> </html>");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("RECOMMENDED THERAPY");

        txtSymtom.setText("<html> </html");

        txtTherapy.setText("<html></html>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton3)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 988, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(13, 13, 13)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel1))
                                    .addGap(47, 47, 47)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtProblem, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtSymtom, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTherapy, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(0, 332, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(76, 76, 76)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtProblem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSymtom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(84, 84, 84)
                                .addComponent(txtTherapy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jLabel1))
                .addContainerGap(347, Short.MAX_VALUE))
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
