/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AdministrativeRole;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

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

        btnSocialWorker = new javax.swing.JButton();
        barPanel = new javax.swing.JPanel();
        piePanel = new javax.swing.JPanel();
        linePanel = new javax.swing.JPanel();
        backJButton = new javax.swing.JButton();
        btnvictim = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        btnSocialWorker.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnSocialWorker.setText("View");
        btnSocialWorker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSocialWorkerActionPerformed(evt);
            }
        });

        barPanel.setBackground(new java.awt.Color(153, 255, 153));
        barPanel.setLayout(new java.awt.BorderLayout());

        piePanel.setBackground(new java.awt.Color(153, 255, 204));
        piePanel.setLayout(new java.awt.BorderLayout());

        linePanel.setBackground(new java.awt.Color(0, 153, 153));
        linePanel.setLayout(new java.awt.BorderLayout());

        backJButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        btnvictim.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnvictim.setText("View");
        btnvictim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvictimActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Registered Victims reports :");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Social Workers cases reports :");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NGO Reports");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(119, 119, 119)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSocialWorker)
                    .addComponent(btnvictim))
                .addGap(499, 499, 499))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(barPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(piePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(linePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1148, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backJButton))
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnvictim)
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSocialWorker)
                            .addComponent(jLabel3))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(linePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(piePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(barPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2))
                .addContainerGap(34, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSocialWorkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSocialWorkerActionPerformed
        // TODO add your handling code here:
        //add combobox with 2018-2020 for each socail worker

        DefaultCategoryDataset bardataset = new DefaultCategoryDataset();

        bardataset.setValue(60,"CASES", "Aaron P");
        bardataset.setValue(70,"CASES", "Maria L");
        bardataset.setValue(75,"CASES", "Jack C");
        bardataset.setValue(80,"CASES", "Nicole H");
        bardataset.setValue(88,"CASES", "John S");
        bardataset.setValue(97,"CASES", "Ann M");

        JFreeChart bar = ChartFactory.createBarChart3D("Social worker Cases", "Social Workers", "CASES", bardataset,PlotOrientation.VERTICAL, true,true,false);
        CategoryPlot p = (CategoryPlot)bar.getCategoryPlot();
        p.setRangeGridlinePaint(Color.BLUE);
        ChartPanel barPan = new ChartPanel(bar);
        barPanel.removeAll();
        barPanel.add(barPan,BorderLayout.CENTER);
        barPanel.validate();

        DefaultCategoryDataset linedataset = new DefaultCategoryDataset();

        linedataset.setValue(60,"CASES", "Aaron P");
        linedataset.setValue(70,"CASES", "Maria L");
        linedataset.setValue(75,"CASES", "Jack C");
        linedataset.setValue(80,"CASES", "Nicole H");
        linedataset.setValue(88,"CASES", "John S");
        linedataset.setValue(97,"CASES", "Ann M");

        JFreeChart line = ChartFactory.createLineChart("Social worker Cases", "Social Workers", "CASES", linedataset,PlotOrientation.VERTICAL, true,true,false);
        CategoryPlot p1 = (CategoryPlot)line.getCategoryPlot();
        p1.setRangeGridlinePaint(Color.YELLOW);
        ChartPanel linePan = new ChartPanel(line);

        linePanel.removeAll();
        linePanel.add(linePan,BorderLayout.CENTER);
        linePanel.validate();

        DefaultPieDataset piedataset = new DefaultPieDataset();
        piedataset.setValue("Aaron P", 60);
        piedataset.setValue("Maria L", 70);
        piedataset.setValue("Jack C", 75);
        piedataset.setValue("Nicole H", 80);
        piedataset.setValue("John S", 88);
        piedataset.setValue("Ann S", 97);

        JFreeChart pieChart = ChartFactory.createPieChart3D("Social worker Cases", piedataset,true,true,true);

        PiePlot3D Pie = (PiePlot3D)pieChart.getPlot();

        ChartPanel piepan = new ChartPanel(pieChart);

        piePanel.removeAll();
        piePanel.add(piepan,BorderLayout.CENTER);
        piePanel.validate();
    }//GEN-LAST:event_btnSocialWorkerActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnvictimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvictimActionPerformed
        // TODO add your handling code here:

        DefaultCategoryDataset bardataset = new DefaultCategoryDataset();

        bardataset.setValue(510,"CASES", "2015");
        bardataset.setValue(740,"CASES", "2016");
        bardataset.setValue(820,"CASES", "2017");
        bardataset.setValue(410,"CASES", "2018");
        bardataset.setValue(980,"CASES", "2019");
        bardataset.setValue(607,"CASES", "2020");

        JFreeChart bar = ChartFactory.createBarChart3D("Victims Cases 2015 - 2020", "YEARS", "CASES", bardataset,PlotOrientation.VERTICAL, true,true,false);
        CategoryPlot p = (CategoryPlot)bar.getCategoryPlot();
        p.setRangeGridlinePaint(Color.BLUE);
        ChartPanel barPan = new ChartPanel(bar);
        barPanel.removeAll();
        barPanel.add(barPan,BorderLayout.CENTER);
        barPanel.validate();

        DefaultCategoryDataset linedataset = new DefaultCategoryDataset();

        linedataset.setValue(510,"CASES", "2015");
        linedataset.setValue(740,"CASES", "2016");
        linedataset.setValue(820,"CASES", "2017");
        linedataset.setValue(410,"CASES", "2018");
        linedataset.setValue(980,"CASES", "2019");
        linedataset.setValue(607,"CASES", "2020");

        JFreeChart line = ChartFactory.createLineChart("Victims Cases 2015 - 2020", "YEARS", "CASES", linedataset,PlotOrientation.VERTICAL, true,true,false);
        CategoryPlot p1 = (CategoryPlot)line.getCategoryPlot();
        p1.setRangeGridlinePaint(Color.YELLOW);
        ChartPanel linePan = new ChartPanel(line);

        linePanel.removeAll();
        linePanel.add(linePan,BorderLayout.CENTER);
        linePanel.validate();

        DefaultPieDataset piedataset = new DefaultPieDataset();
        piedataset.setValue("2015", 510);
        piedataset.setValue("2016", 740);
        piedataset.setValue("2017", 820);
        piedataset.setValue("2018", 410);
        piedataset.setValue("2019", 980);
        piedataset.setValue("2020", 607);

        JFreeChart pieChart = ChartFactory.createPieChart3D("Victims Cases 2015 - 2020", piedataset,true,true,true);

        PiePlot3D Pie = (PiePlot3D)pieChart.getPlot();

        ChartPanel piepan = new ChartPanel(pieChart);

        piePanel.removeAll();
        piePanel.add(piepan,BorderLayout.CENTER);
        piePanel.validate();
    }//GEN-LAST:event_btnvictimActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JPanel barPanel;
    private javax.swing.JButton btnSocialWorker;
    private javax.swing.JButton btnvictim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel linePanel;
    private javax.swing.JPanel piePanel;
    // End of variables declaration//GEN-END:variables
}
