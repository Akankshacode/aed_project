/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.LAdministrativeRole;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
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
public class LawReportsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LawReportsJPanel
     */
    private JPanel userProcessContainer;
    
    public LawReportsJPanel( JPanel userProcessContainer) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnOpen = new javax.swing.JButton();
        btncompleted = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnClient = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCourt = new javax.swing.JButton();
        piePanel = new javax.swing.JPanel();
        barPanel = new javax.swing.JPanel();
        linePanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(204, 255, 204));
        setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setBackground(new java.awt.Color(51, 255, 204));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Successful Completion reports :");

        jLabel5.setBackground(new java.awt.Color(51, 255, 204));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Open cases reports :");

        btnOpen.setBackground(new java.awt.Color(255, 255, 255));
        btnOpen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnOpen.setText("View");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });

        btncompleted.setBackground(new java.awt.Color(255, 255, 255));
        btncompleted.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btncompleted.setText("View");
        btncompleted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncompletedActionPerformed(evt);
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

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Law Reports");

        btnClient.setBackground(new java.awt.Color(255, 255, 255));
        btnClient.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClient.setText("View");
        btnClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(51, 255, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Client Reports :");

        jLabel3.setBackground(new java.awt.Color(51, 255, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Court reports :");

        btnCourt.setBackground(new java.awt.Color(255, 255, 255));
        btnCourt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCourt.setText("View");
        btnCourt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCourtActionPerformed(evt);
            }
        });

        piePanel.setBackground(new java.awt.Color(153, 255, 204));
        piePanel.setLayout(new java.awt.BorderLayout());

        barPanel.setBackground(new java.awt.Color(153, 255, 153));
        barPanel.setLayout(new java.awt.BorderLayout());

        linePanel.setBackground(new java.awt.Color(0, 153, 153));
        linePanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(487, 487, 487)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnOpen))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(btncompleted))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCourt))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnClient)))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(piePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(linePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(barPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClient)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCourt)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncompleted)
                    .addComponent(jLabel4))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOpen)
                    .addComponent(jLabel5))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(linePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(piePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(barPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
      DefaultCategoryDataset bardataset = new DefaultCategoryDataset();

        bardataset.setValue(300,"CASES", "2015");
        bardataset.setValue(400,"CASES", "2016");
        bardataset.setValue(100,"CASES", "2017");
        bardataset.setValue(00,"CASES", "2018");
        bardataset.setValue(620,"CASES", "2019");
        bardataset.setValue(200,"CASES", "2020");

        JFreeChart bar = ChartFactory.createBarChart3D("Open Court Cases 2015 - 2020", "YEARS", "CASES", bardataset,PlotOrientation.VERTICAL, true,true,false);
        CategoryPlot p = (CategoryPlot)bar.getCategoryPlot();
        p.setRangeGridlinePaint(Color.BLUE);
        ChartPanel barPan = new ChartPanel(bar);
        barPanel.removeAll();
        barPanel.add(barPan,BorderLayout.CENTER);
        barPanel.validate();
        
        
        DefaultCategoryDataset linedataset = new DefaultCategoryDataset();

        linedataset.setValue(300,"CASES", "2015");
        linedataset.setValue(400,"CASES", "2016");
        linedataset.setValue(100,"CASES", "2017");
        linedataset.setValue(00,"CASES", "2018");
        linedataset.setValue(620,"CASES", "2019");
        linedataset.setValue(200,"CASES", "2020");

        JFreeChart line = ChartFactory.createLineChart("Open Court Cases 2015 - 2020", "YEARS", "CASES", linedataset,PlotOrientation.VERTICAL, true,true,false);
        CategoryPlot p1 = (CategoryPlot)line.getCategoryPlot();
        p1.setRangeGridlinePaint(Color.YELLOW);
        ChartPanel linePan = new ChartPanel(line);
        
        linePanel.removeAll();
        linePanel.add(linePan,BorderLayout.CENTER);
        linePanel.validate();
        
        
        DefaultPieDataset piedataset = new DefaultPieDataset();
        piedataset.setValue("2015", 300);
        piedataset.setValue("2016", 400);
        piedataset.setValue("2017", 100);
        piedataset.setValue("2018", 00);
        piedataset.setValue("2019", 620);
        piedataset.setValue("2020", 200);
        
        JFreeChart pieChart = ChartFactory.createPieChart3D("Open Court Cases 2015 - 2020", piedataset,true,true,true);
        
        PiePlot3D Pie = (PiePlot3D)pieChart.getPlot();
        
        ChartPanel piepan = new ChartPanel(pieChart);
        
        piePanel.removeAll();
        piePanel.add(piepan,BorderLayout.CENTER);
        piePanel.validate();
        
    }//GEN-LAST:event_btnOpenActionPerformed

    private void btncompletedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncompletedActionPerformed
        // TODO add your handling code here:
        //calculate based on above data
        DefaultCategoryDataset bardataset = new DefaultCategoryDataset();

        bardataset.setValue(600,"CASES", "2015");
        bardataset.setValue(400,"CASES", "2016");
        bardataset.setValue(500,"CASES", "2017");
        bardataset.setValue(400,"CASES", "2018");
        bardataset.setValue(100,"CASES", "2019");
        bardataset.setValue(380,"CASES", "2020");

        JFreeChart bar = ChartFactory.createBarChart3D("Completed Court Cases 2015 - 2020", "YEARS", "CASES", bardataset,PlotOrientation.VERTICAL, true,true,false);
        CategoryPlot p = (CategoryPlot)bar.getCategoryPlot();
        p.setRangeGridlinePaint(Color.BLUE);
        ChartPanel barPan = new ChartPanel(bar);
        barPanel.removeAll();
        barPanel.add(barPan,BorderLayout.CENTER);
        barPanel.validate();
        
        
        DefaultCategoryDataset linedataset = new DefaultCategoryDataset();

        linedataset.setValue(600,"CASES", "2015");
        linedataset.setValue(400,"CASES", "2016");
        linedataset.setValue(500,"CASES", "2017");
        linedataset.setValue(400,"CASES", "2018");
        linedataset.setValue(100,"CASES", "2019");
        linedataset.setValue(380,"CASES", "2020");

        JFreeChart line = ChartFactory.createLineChart("Completed Court Cases 2015 - 2020", "YEARS", "CASES", linedataset,PlotOrientation.VERTICAL, true,true,false);
        CategoryPlot p1 = (CategoryPlot)line.getCategoryPlot();
        p1.setRangeGridlinePaint(Color.YELLOW);
        ChartPanel linePan = new ChartPanel(line);
        
        linePanel.removeAll();
        linePanel.add(linePan,BorderLayout.CENTER);
        linePanel.validate();
        
        
        DefaultPieDataset piedataset = new DefaultPieDataset();
        piedataset.setValue("2015", 600);
        piedataset.setValue("2016", 400);
        piedataset.setValue("2017", 500);
        piedataset.setValue("2018", 400);
        piedataset.setValue("2019", 100);
        piedataset.setValue("2020", 380);
        
        JFreeChart pieChart = ChartFactory.createPieChart3D("Completed Court Cases 2015 - 2020", piedataset,true,true,true);
        
        PiePlot3D Pie = (PiePlot3D)pieChart.getPlot();
        
        ChartPanel piepan = new ChartPanel(pieChart);
        
        piePanel.removeAll();
        piePanel.add(piepan,BorderLayout.CENTER);
        piePanel.validate();
        
    }//GEN-LAST:event_btncompletedActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientActionPerformed
        // TODO add your handling code here:
        DefaultCategoryDataset bardataset = new DefaultCategoryDataset();

        bardataset.setValue(510,"CASES", "2015");
        bardataset.setValue(740,"CASES", "2016");
        bardataset.setValue(820,"CASES", "2017");
        bardataset.setValue(410,"CASES", "2018");
        bardataset.setValue(980,"CASES", "2019");
        bardataset.setValue(607,"CASES", "2020");

        JFreeChart bar = ChartFactory.createBarChart3D("Client Cases 2015 - 2020", "YEARS", "CASES", bardataset,PlotOrientation.VERTICAL, true,true,false);
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

        JFreeChart line = ChartFactory.createLineChart("Client Cases 2015 - 2020", "YEARS", "CASES", linedataset,PlotOrientation.VERTICAL, true,true,false);
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
        
        JFreeChart pieChart = ChartFactory.createPieChart3D("Client Cases 2015 - 2020", piedataset,true,true,true);
        
        PiePlot3D Pie = (PiePlot3D)pieChart.getPlot();
        
        ChartPanel piepan = new ChartPanel(pieChart);
        
        piePanel.removeAll();
        piePanel.add(piepan,BorderLayout.CENTER);
        piePanel.validate();
        
        
       
    }//GEN-LAST:event_btnClientActionPerformed
 
    private void btnCourtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCourtActionPerformed
        // TODO add your handling code here:
        //add combobox with 2018-2020 for each socail worker
 
        DefaultCategoryDataset bardataset = new DefaultCategoryDataset();

        bardataset.setValue(900,"CASES", "2015");
        bardataset.setValue(800,"CASES", "2016");
        bardataset.setValue(600,"CASES", "2017");
        bardataset.setValue(400,"CASES", "2018");
        bardataset.setValue(720,"CASES", "2019");
        bardataset.setValue(580,"CASES", "2020");

        JFreeChart bar = ChartFactory.createBarChart3D("Court Cases 2015 - 2020", "YEARS", "CASES", bardataset,PlotOrientation.VERTICAL, true,true,false);
        CategoryPlot p = (CategoryPlot)bar.getCategoryPlot();
        p.setRangeGridlinePaint(Color.BLUE);
        ChartPanel barPan = new ChartPanel(bar);
        barPanel.removeAll();
        barPanel.add(barPan,BorderLayout.CENTER);
        barPanel.validate();
        
        
        DefaultCategoryDataset linedataset = new DefaultCategoryDataset();

        linedataset.setValue(900,"CASES", "2015");
        linedataset.setValue(800,"CASES", "2016");
        linedataset.setValue(600,"CASES", "2017");
        linedataset.setValue(400,"CASES", "2018");
        linedataset.setValue(720,"CASES", "2019");
        linedataset.setValue(580,"CASES", "2020");

        JFreeChart line = ChartFactory.createLineChart("Court Cases 2015 - 2020", "YEARS", "CASES", linedataset,PlotOrientation.VERTICAL, true,true,false);
        CategoryPlot p1 = (CategoryPlot)line.getCategoryPlot();
        p1.setRangeGridlinePaint(Color.YELLOW);
        ChartPanel linePan = new ChartPanel(line);
        
        linePanel.removeAll();
        linePanel.add(linePan,BorderLayout.CENTER);
        linePanel.validate();
        
        
        DefaultPieDataset piedataset = new DefaultPieDataset();
        piedataset.setValue("2015", 900);
        piedataset.setValue("2016", 800);
        piedataset.setValue("2017", 600);
        piedataset.setValue("2018", 400);
        piedataset.setValue("2019", 720);
        piedataset.setValue("2020", 580);
        
        JFreeChart pieChart = ChartFactory.createPieChart3D("Court Cases 2015 - 2020", piedataset,true,true,true);
        
        PiePlot3D Pie = (PiePlot3D)pieChart.getPlot();
        
        ChartPanel piepan = new ChartPanel(pieChart);
        
        piePanel.removeAll();
        piePanel.add(piepan,BorderLayout.CENTER);
        piePanel.validate();
        
        
        
        
        
        
    }//GEN-LAST:event_btnCourtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JPanel barPanel;
    private javax.swing.JButton btnClient;
    private javax.swing.JButton btnCourt;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btncompleted;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel linePanel;
    private javax.swing.JPanel piePanel;
    // End of variables declaration//GEN-END:variables
}
