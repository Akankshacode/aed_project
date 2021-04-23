/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.PrisonRole;

import Business.Case.Case;
import Business.Case.PoliceCaseDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.PrisonOrganization;
import Business.UserAccount.UserAccount;
import com.github.javafaker.Faker;
import java.awt.Color;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author markynsailamar
 */
public class PrisonWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PrisonWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private PrisonOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    PoliceCaseDirectory pcd;
    public PrisonWorkAreaJPanel(JPanel userProcessContainer,UserAccount account,PrisonOrganization organization,Enterprise enterprise,EcoSystem business) {
        
        initComponents();
          this.userProcessContainer=userProcessContainer;
        this.organization=organization;
        this.enterprise=enterprise;
        this.system=business;
                pcd=system.getPoliceCaseDirectory();
         
         PrisonTab.getTableHeader().setForeground(Color.blue);
        populateTable();
        
       
    }

    public void populateTable()
    {
         
      
       DefaultTableModel model = (DefaultTableModel) PrisonTab.getModel();
        model.setRowCount(0);
           
        if(pcd!=null)
           {
               
               for (Case c : pcd.getCaseList()) 
        {
            if(c.getPstatus().equals("InPrison"))
            { Object [] row = new Object[4];
                row[0] = c.getCulpritName();
                row[1] = c.getCCrimeComitted();
               
                   row[2] = c.getSentence();
                     row[3] = c.getParole();
                 
                
                
                model.addRow(row);
            }
        }}
        Faker faker = new Faker();
        Random rnd = new Random();
       
        for(int i=1; i<3; i++){
            Object row[] = new Object[4];
          
            row[0] = faker.name().fullName();
            row[1] = "Sexual Assault" ;
            
            row[2] = "20 Year(s)";
            row[3] = "No";
            model.addRow(row);
        }
        for(int i=1; i<5; i++){
            Object row[] = new Object[4];
          
    
            row[0] = faker.name().fullName();
            row[1] = "Verbal Abuse" ;
         
            row[2] = "1 Year(s)";
            row[3] = "Yes";
            model.addRow(row);
        }
        for(int i=1; i<1; i++){
            Object row[] = new Object[5];
          
            row[0] = faker.name().fullName();
            row[1] = "Sexual Assault" ;
            
            row[3] = "15 Year(s)";
            row[4] = "No";
            model.addRow(row);
        }
        for(int i=1; i<2; i++){
            Object row[] = new Object[4];
           
    
            row[0] = faker.name().fullName();
            row[1] = "Verbal Abuse" ;
       
            row[2] = "1 Year(s)";
            row[3] = "Yes";
            model.addRow(row);
        }
        for(int i=1; i<3; i++){
            Object row[] = new Object[4];
        
            row[0] = faker.name().fullName();
            row[1] = "Sexual Assault" ;
          
            row[2] = "7 Year(s)";
            row[3] = "Yes";
            model.addRow(row);
        }
        for(int i=1; i<10; i++){
            Object row[] = new Object[4];
          
    
            row[0] = faker.name().fullName();
            row[1] = "Verbal Abuse" ;
       
            row[2] = "1 Year(s)";
            row[3] = "Yes";
            model.addRow(row);
        }
        for(int i=1; i<7; i++){
            Object row[] = new Object[4];
         
            row[0] = faker.name().fullName();
            row[1] = "Sexual Assault" ;
            
            row[2] = "13 Year(s)";
            row[3] = "No";
            model.addRow(row);
        }
        for(int i=1; i<2; i++){
            Object row[] = new Object[4];
      
            row[0] = faker.name().fullName();
            row[1] = "Verbal Abuse" ;
         
            row[2] = "1 Year(s)";
            row[3] = "Yes";
            model.addRow(row);
        }
        for(int i=1; i<4; i++){
            Object row[] = new Object[4];
         
            row[0] = faker.name().fullName();
            row[1] = "Sexual Assault" ;
       
            row[2] = "9 Year(s)";
            row[3] = "No";
            model.addRow(row);
        }
        for(int i=1; i<5; i++){
            Object row[] = new Object[4];
           
    
            row[0] = faker.name().fullName();
            row[1] = "Verbal Abuse" ;
       
            row[2] = "1 Year(s)";
            row[3] = "Yes";
            model.addRow(row);
        }
        for(int i=1; i<8; i++){
            Object row[] = new Object[4];
     
            row[0] = faker.name().fullName();
            row[1] = "Sexual Assault" ;

            row[2] = "3 Year(s)";
            row[3] = "Yes";
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
        PrisonTab = new javax.swing.JTable();
        txtPrisoner = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblCrimeComitted = new javax.swing.JLabel();
        lblDateOfArrest = new javax.swing.JLabel();
        lblSentence = new javax.swing.JLabel();
        lblParole = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));

        PrisonTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Prisoner", "Crime comitted", "Date of Arrest", "Sentence", "Parole"
            }
        ));
        PrisonTab.setSelectionBackground(new java.awt.Color(153, 153, 255));
        PrisonTab.setSelectionForeground(new java.awt.Color(255, 0, 0));
        PrisonTab.setShowHorizontalLines(false);
        jScrollPane1.setViewportView(PrisonTab);

        txtPrisoner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrisonerActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Search for Prisoner");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Crime Comitted");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Date of Arrest");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Sentence");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Parole");

        lblName.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblName.setText("-");

        lblCrimeComitted.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblCrimeComitted.setText("-");

        lblDateOfArrest.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblDateOfArrest.setText("-");

        lblSentence.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblSentence.setText("-");

        lblParole.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblParole.setText("-");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Welcome to RedStone Prison DataBase");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblParole)
                                    .addComponent(lblSentence)
                                    .addComponent(lblDateOfArrest)
                                    .addComponent(lblCrimeComitted)
                                    .addComponent(lblName)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtPrisoner, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(47, 47, 47)
                                        .addComponent(jButton1))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1005, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(508, 508, 508)
                        .addComponent(jLabel7)))
                .addContainerGap(319, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel7)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPrisoner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblCrimeComitted, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblDateOfArrest, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblSentence, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblParole, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(270, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrisonerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrisonerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrisonerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String Name=txtPrisoner.getText();
       
       Case c= pcd.findCase(Name);
       if(c!=null)
       {
       lblCrimeComitted.setText(c.getCCrimeComitted());
       lblDateOfArrest.setText(c.getCDateOfCrime());
       lblName.setText(c.getCulpritName());
       lblParole.setText(c.getParole());
       lblSentence.setText(c.getSentence());
       }
           
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable PrisonTab;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCrimeComitted;
    private javax.swing.JLabel lblDateOfArrest;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblParole;
    private javax.swing.JLabel lblSentence;
    private javax.swing.JTextField txtPrisoner;
    // End of variables declaration//GEN-END:variables
}
