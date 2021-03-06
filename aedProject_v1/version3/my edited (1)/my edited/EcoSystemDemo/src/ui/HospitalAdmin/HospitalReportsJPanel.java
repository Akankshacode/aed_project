/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.HospitalAdmin;

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
public class HospitalReportsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HospitalReportsJPanel
     */
    private JPanel userProcessContainer;
    public HospitalReportsJPanel( JPanel userProcessContainer) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        System.out.println("Inside GOING TO REPOPRT PAGE!!");
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
        btntherapy = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btninpatient = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btntotal = new javax.swing.JButton();
        barPanel = new javax.swing.JPanel();
        linePanel = new javax.swing.JPanel();
        piePanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(204, 255, 204));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Therapy Sessions :");

        btntherapy.setBackground(new java.awt.Color(255, 255, 255));
        btntherapy.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btntherapy.setText("View");
        btntherapy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntherapyActionPerformed(evt);
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

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hospital Reports");

        btninpatient.setBackground(new java.awt.Color(255, 255, 255));
        btninpatient.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btninpatient.setText("View");
        btninpatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninpatientActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("In-Patient Medical :");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Total Hospital Patient Intake :");

        btntotal.setBackground(new java.awt.Color(255, 255, 255));
        btntotal.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btntotal.setText("View");
        btntotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntotalActionPerformed(evt);
            }
        });

        barPanel.setBackground(new java.awt.Color(153, 255, 153));
        barPanel.setLayout(new java.awt.BorderLayout());

        linePanel.setBackground(new java.awt.Color(0, 153, 153));
        linePanel.setLayout(new java.awt.BorderLayout());

        piePanel.setBackground(new java.awt.Color(153, 255, 204));
        piePanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(btntherapy))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(btninpatient))
                                    .addComponent(barPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(btntotal)))
                        .addGap(606, 606, 606))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(688, 688, 688)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(linePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                            .addComponent(piePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 134, Short.MAX_VALUE)))
                .addGap(187, 187, 187))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btntotal)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btninpatient)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btntherapy)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(piePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(linePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(barPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btntherapyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntherapyActionPerformed
        
        DefaultCategoryDataset bardataset = new DefaultCategoryDataset();

        bardataset.setValue(250,"PATIENTS", "Dr. Wallis T");
        bardataset.setValue(330,"PATIENTS", "Dr. Stephanie P");
        bardataset.setValue(100,"PATIENTS", "Dr. Marshall M");
        bardataset.setValue(410,"PATIENTS", "Dr. Kate B");
        

        JFreeChart bar = ChartFactory.createBarChart3D("Therapy sessions for the year 2020", "THERAPISTS", "PATIENTS", bardataset,PlotOrientation.VERTICAL, true,true,false);
        CategoryPlot p = (CategoryPlot)bar.getCategoryPlot();
        p.setRangeGridlinePaint(Color.BLUE);
        ChartPanel barPan = new ChartPanel(bar);
        barPanel.removeAll();
        barPanel.add(barPan,BorderLayout.CENTER);
        barPanel.validate();
        
        
        DefaultCategoryDataset linedataset = new DefaultCategoryDataset();

        linedataset.setValue(250,"PATIENTS", "Dr. Wallis T");
        linedataset.setValue(330,"PATIENTS", "Dr. Stephanie P");
        linedataset.setValue(100,"PATIENTS", "Dr. Marshall M");
        linedataset.setValue(410,"PATIENTS", "Dr. Kate B");
        

        JFreeChart line = ChartFactory.createLineChart("Therapy sessions for the year 2020", "THERAPISTS", "PATIENTS", linedataset,PlotOrientation.VERTICAL, true,true,false);
        CategoryPlot p1 = (CategoryPlot)line.getCategoryPlot();
        p1.setRangeGridlinePaint(Color.YELLOW);
        ChartPanel linePan = new ChartPanel(line);
        
        linePanel.removeAll();
        linePanel.add(linePan,BorderLayout.CENTER);
        linePanel.validate();
        
        
        DefaultPieDataset piedataset = new DefaultPieDataset();
        piedataset.setValue("Dr. Wallis T", 250);
        piedataset.setValue("Dr. Stephanie P", 330);
        piedataset.setValue("Dr. Marshall M", 100);
        piedataset.setValue("Dr. Kate B", 410);
        
        
        JFreeChart pieChart = ChartFactory.createPieChart3D("Therapy sessions for the year 2020", piedataset,true,true,true);
        
        PiePlot3D Pie = (PiePlot3D)pieChart.getPlot();
        
        ChartPanel piepan = new ChartPanel(pieChart);
        
        piePanel.removeAll();
        piePanel.add(piepan,BorderLayout.CENTER);
        piePanel.validate();
    }//GEN-LAST:event_btntherapyActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btninpatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninpatientActionPerformed
        
        DefaultCategoryDataset bardataset = new DefaultCategoryDataset();

        bardataset.setValue(800,"IN-PATIENTS", "2017");
        bardataset.setValue(370,"IN-PATIENTS", "2018");
        bardataset.setValue(1400,"IN-PATIENTS", "2019");
        bardataset.setValue(1390,"IN-PATIENTS", "2020");
        

        JFreeChart bar = ChartFactory.createBarChart3D("In-Patient Appointments for 2017-2020", "YEARS", "PATIENTS", bardataset,PlotOrientation.VERTICAL, true,true,false);
        CategoryPlot p = (CategoryPlot)bar.getCategoryPlot();
        p.setRangeGridlinePaint(Color.BLUE);
        ChartPanel barPan = new ChartPanel(bar);
        barPanel.removeAll();
        barPanel.add(barPan,BorderLayout.CENTER);
        barPanel.validate();
        
        
        DefaultCategoryDataset linedataset = new DefaultCategoryDataset();

        linedataset.setValue(800,"IN-PATIENTS", "2017");
        linedataset.setValue(370,"IN-PATIENTS", "2018");
        linedataset.setValue(1400,"IN-PATIENTS", "2019");
        linedataset.setValue(1390,"IN-PATIENTS", "2020");
        

        JFreeChart line = ChartFactory.createLineChart("In-Patient Appointments for 2017-2020", "YEARS", "PATIENTS", linedataset,PlotOrientation.VERTICAL, true,true,false);
        CategoryPlot p1 = (CategoryPlot)line.getCategoryPlot();
        p1.setRangeGridlinePaint(Color.YELLOW);
        ChartPanel linePan = new ChartPanel(line);
        
        linePanel.removeAll();
        linePanel.add(linePan,BorderLayout.CENTER);
        linePanel.validate();
        
        
        DefaultPieDataset piedataset = new DefaultPieDataset();
        piedataset.setValue("2017", 800);
        piedataset.setValue("2018", 370);
        piedataset.setValue("2019", 1400);
        piedataset.setValue("2020", 1390);
        
        
        JFreeChart pieChart = ChartFactory.createPieChart3D("In-Patient Appointments for 2017-2020", piedataset,true,true,true);
        
        PiePlot3D Pie = (PiePlot3D)pieChart.getPlot();
        
        ChartPanel piepan = new ChartPanel(pieChart);
        
        piePanel.removeAll();
        piePanel.add(piepan,BorderLayout.CENTER);
        piePanel.validate();
    }//GEN-LAST:event_btninpatientActionPerformed

    private void btntotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntotalActionPerformed
        
        DefaultCategoryDataset bardataset = new DefaultCategoryDataset();

        bardataset.setValue(1050,"PATIENTS", "2017");
        bardataset.setValue(700,"PATIENTS", "2018");
        bardataset.setValue(1500,"PATIENTS", "2019");
        bardataset.setValue(1800,"PATIENTS", "2020");
       

        JFreeChart bar = ChartFactory.createBarChart3D("Total Patient Intake for 2017-2020", "YEARS", "PATIENTS", bardataset,PlotOrientation.VERTICAL, true,true,false);
        CategoryPlot p = (CategoryPlot)bar.getCategoryPlot();
        p.setRangeGridlinePaint(Color.BLUE);
        ChartPanel barPan = new ChartPanel(bar);
        barPanel.removeAll();
        barPanel.add(barPan,BorderLayout.CENTER);
        barPanel.validate();
        
        
        DefaultCategoryDataset linedataset = new DefaultCategoryDataset();

        linedataset.setValue(1050,"PATIENTS", "2017");
        linedataset.setValue(700,"PATIENTS", "2018");
        linedataset.setValue(1500,"PATIENTS", "2019");
        linedataset.setValue(1800,"PATIENTS", "2020");
        

        JFreeChart line = ChartFactory.createLineChart("Total Patient Intake for 2017-2020", "YEARS", "PATIENTS", linedataset,PlotOrientation.VERTICAL, true,true,false);
        CategoryPlot p1 = (CategoryPlot)line.getCategoryPlot();
        p1.setRangeGridlinePaint(Color.YELLOW);
        ChartPanel linePan = new ChartPanel(line);
        
        linePanel.removeAll();
        linePanel.add(linePan,BorderLayout.CENTER);
        linePanel.validate();
        
        
        DefaultPieDataset piedataset = new DefaultPieDataset();
        piedataset.setValue("2017", 1050);
        piedataset.setValue("2018", 700);
        piedataset.setValue("2019", 1500);
        piedataset.setValue("2020", 1800);
        
        
        JFreeChart pieChart = ChartFactory.createPieChart3D("Total Patient Intake for 2017-2020", piedataset,true,true,true);
        
        PiePlot3D Pie = (PiePlot3D)pieChart.getPlot();
        
        ChartPanel piepan = new ChartPanel(pieChart);
        
        piePanel.removeAll();
        piePanel.add(piepan,BorderLayout.CENTER);
        piePanel.validate();
    }//GEN-LAST:event_btntotalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JPanel barPanel;
    private javax.swing.JButton btninpatient;
    private javax.swing.JButton btntherapy;
    private javax.swing.JButton btntotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel linePanel;
    private javax.swing.JPanel piePanel;
    // End of variables declaration//GEN-END:variables
}
