/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AdministrativeRole;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author abdulla
 */
public class NGOReportsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NGOReportsJPanel
     */
    private JPanel userProcessContainer;
    public NGOReportsJPanel(JPanel userProcessContainer) {
        this.userProcessContainer= userProcessContainer;
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

        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnvictim = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSocialWorker = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnOpen = new javax.swing.JButton();
        btncompleted = new javax.swing.JButton();

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NGO Reports");

        btnvictim.setText("View");
        btnvictim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvictimActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Registered Victims reports :");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Social Workers cases reports :");

        btnSocialWorker.setText("View");
        btnSocialWorker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSocialWorkerActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Successful Completion reports :");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Open cases reports :");

        btnOpen.setText("View");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });

        btncompleted.setText("View");
        btncompleted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncompletedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(btnOpen))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(btncompleted))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(btnSocialWorker))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(btnvictim)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backJButton))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, jLabel5});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(backJButton)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnvictim)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSocialWorker)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncompleted)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOpen)
                    .addComponent(jLabel5))
                .addContainerGap(270, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnvictimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvictimActionPerformed
        // TODO add your handling code here:
         DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        dataset.setValue(510,"CASES", "2015");
        dataset.setValue(740,"CASES", "2016");
        dataset.setValue(820,"CASES", "2017");
        dataset.setValue(410,"CASES", "2018");
        dataset.setValue(980,"CASES", "2019");
        dataset.setValue(607,"CASES", "2020");
        
        JFreeChart bar = ChartFactory.createBarChart3D("Victim Cases 2015 - 2020", "YEARS", "CASES", dataset,PlotOrientation.VERTICAL, true,true,false);
        CategoryPlot p = bar.getCategoryPlot();
        p.setRangeGridlinePaint(Color.BLUE);
        ChartFrame frame = new ChartFrame("Victim Cases Report",bar);
        frame.setVisible(true);
        frame.setSize(600,500);
    }//GEN-LAST:event_btnvictimActionPerformed

    private void btnSocialWorkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSocialWorkerActionPerformed
        // TODO add your handling code here:
        //add combobox with 2018-2020 for each socail worker
         DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        dataset.setValue(60,"CASES", "Aaron P");
        dataset.setValue(70,"CASES", "Maria L");
        dataset.setValue(75,"CASES", "Jack C");
        dataset.setValue(80,"CASES", "Nicole H");
        dataset.setValue(88,"CASES", "John S");
        dataset.setValue(97,"CASES", "Ann M");
        
        JFreeChart bar = ChartFactory.createBarChart3D("Social worker cases", "Social Workers", "CASES", dataset,PlotOrientation.VERTICAL, true,true,false);
        CategoryPlot p = bar.getCategoryPlot();
        p.setRangeGridlinePaint(Color.BLUE);
        ChartFrame frame = new ChartFrame("Social Worker cases report",bar);
        frame.setVisible(true);
        frame.setSize(600,500);
    }//GEN-LAST:event_btnSocialWorkerActionPerformed

    private void btncompletedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncompletedActionPerformed
        // TODO add your handling code here:
        //calculate based on above data
         DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        dataset.setValue(60,"CASES", "2015");
        dataset.setValue(70,"CASES", "2016");
        dataset.setValue(75,"CASES", "2017");
        dataset.setValue(80,"CASES", "2018");
        dataset.setValue(88,"CASES", "2019");
        dataset.setValue(97,"CASES", "2020");
        
        JFreeChart bar = ChartFactory.createBarChart3D("Completed Victim Cases 2015 - 2020", "YEARS", "CASES", dataset,PlotOrientation.VERTICAL, true,true,false);
        CategoryPlot p = bar.getCategoryPlot();
        p.setRangeGridlinePaint(Color.BLUE);
        ChartFrame frame = new ChartFrame("Completed Victim Cases Report",bar);
        frame.setVisible(true);
        frame.setSize(600,500);
    }//GEN-LAST:event_btncompletedActionPerformed

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        // TODO add your handling code here:
         DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        dataset.setValue(0,"CASES", "2015");
        dataset.setValue(0,"CASES", "2016");
        dataset.setValue(0,"CASES", "2017");
        dataset.setValue(20,"CASES", "2018");
        dataset.setValue(30,"CASES", "2019");
        dataset.setValue(50,"CASES", "2020");
        
        JFreeChart bar = ChartFactory.createBarChart3D("Open Victim Cases 2015 - 2020", "YEARS", "CASES", dataset,PlotOrientation.VERTICAL, true,true,false);
        CategoryPlot p = bar.getCategoryPlot();
        p.setRangeGridlinePaint(Color.BLUE);
        ChartFrame frame = new ChartFrame("Open Victim Cases Report",bar);
        frame.setVisible(true);
        frame.setSize(600,500);
    }//GEN-LAST:event_btnOpenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnSocialWorker;
    private javax.swing.JButton btncompleted;
    private javax.swing.JButton btnvictim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
