/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza_ordering_system;

import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;
import java.util.Formatter;
import javax.swing.JTextField;

/**
 *
 * @author AMIRUL IRSYAD
 */
public class pizza_ordering extends javax.swing.JFrame {

    /**
     * Creates new form pizza_ordering
     */
    int count=0;
    
    public pizza_ordering() {
        initComponents();
    }
    
    DefaultTableModel model;
    String item;
    int price;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pHawaiian = new javax.swing.JRadioButton();
        pAloha = new javax.swing.JRadioButton();
        pDouble = new javax.swing.JRadioButton();
        pVeggie = new javax.swing.JRadioButton();
        pSeafood = new javax.swing.JRadioButton();
        pChicken = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        AddBtn = new javax.swing.JButton();
        calcBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtQty = new javax.swing.JSpinner();
        RemoveBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPay = new javax.swing.JTextField();
        txtBal = new javax.swing.JTextField();
        ResetBtn = new javax.swing.JButton();
        ReceiptBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtReceipt = new javax.swing.JTextArea();

        jButton1.setText("jButton1");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Veggie Delight 1.png"))); // NOI18N
        jLabel11.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(148, 202, 228));

        jPanel1.setBackground(new java.awt.Color(148, 202, 228));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PIZZO");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jLabel6.setText("jLabel6");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jLabel8.setText("jLabel6");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("I WILL HAVE ORDER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(360, 360, 360))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(349, 349, 349)))
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(55, 55, 55)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(949, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel2.setBackground(new java.awt.Color(148, 202, 228));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pHawaiian.setBackground(new java.awt.Color(148, 202, 228));
        pHawaiian.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pHawaiian.setText("Hawaiian Chicken");
        pHawaiian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pHawaiianActionPerformed(evt);
            }
        });

        pAloha.setBackground(new java.awt.Color(148, 202, 228));
        pAloha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pAloha.setText("Aloha Chicken");
        pAloha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pAlohaActionPerformed(evt);
            }
        });

        pDouble.setBackground(new java.awt.Color(148, 202, 228));
        pDouble.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pDouble.setText("Double Pepporoni");

        pVeggie.setBackground(new java.awt.Color(148, 202, 228));
        pVeggie.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pVeggie.setText("Veggie Delight");
        pVeggie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pVeggieActionPerformed(evt);
            }
        });

        pSeafood.setBackground(new java.awt.Color(148, 202, 228));
        pSeafood.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pSeafood.setText("Seafood Sensation");

        pChicken.setBackground(new java.awt.Color(148, 202, 228));
        pChicken.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pChicken.setText("Chicken & Pineapple");
        pChicken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pChickenActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aloha chicken.jpg"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Veggie Delight 1.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Hawaiian Chicken.jpg"))); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Double Pepporoni.jpg"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Chicken & Pineapple.jpg"))); // NOI18N

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Seafood  Sensation.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pAloha)
                            .addComponent(pVeggie)
                            .addComponent(pHawaiian)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pDouble)
                    .addComponent(pChicken)
                    .addComponent(pSeafood)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pAloha)
                    .addComponent(pChicken))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pVeggie)
                            .addComponent(pDouble))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pSeafood)
                    .addComponent(pHawaiian))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Price", "Qty", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        AddBtn.setBackground(new java.awt.Color(148, 202, 228));
        AddBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AddBtn.setText("Add");
        AddBtn.setBorder(null);
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        calcBtn.setBackground(new java.awt.Color(148, 202, 228));
        calcBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        calcBtn.setText("Calculate");
        calcBtn.setBorder(null);
        calcBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Qty");

        txtQty.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        RemoveBtn.setBackground(new java.awt.Color(148, 202, 228));
        RemoveBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RemoveBtn.setText("Remove");
        RemoveBtn.setBorder(null);
        RemoveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Total");

        txtTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Payment");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Balance");

        txtPay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPayActionPerformed(evt);
            }
        });

        txtBal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtBal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBalActionPerformed(evt);
            }
        });

        ResetBtn.setBackground(new java.awt.Color(148, 202, 228));
        ResetBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ResetBtn.setText("Reset");
        ResetBtn.setBorder(null);
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });

        ReceiptBtn.setBackground(new java.awt.Color(148, 202, 228));
        ReceiptBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ReceiptBtn.setText("Receipt");
        ReceiptBtn.setBorder(null);
        ReceiptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReceiptBtnActionPerformed(evt);
            }
        });

        txtReceipt.setColumns(20);
        txtReceipt.setRows(5);
        jScrollPane2.setViewportView(txtReceipt);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(RemoveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(calcBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtQty))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPay, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBal, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(ReceiptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(calcBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtPay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(RemoveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtBal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))))
                            .addComponent(ReceiptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pHawaiianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pHawaiianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pHawaiianActionPerformed

    private void pVeggieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pVeggieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pVeggieActionPerformed

    private void pChickenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pChickenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pChickenActionPerformed

    private void pAlohaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pAlohaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pAlohaActionPerformed

    private void txtBalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBalActionPerformed

    private void txtPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPayActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
        if(pHawaiian.isSelected()== true)
        {
            item = "Hawaiian Chicken            ";
            price = 15;
        }
        else if(pAloha.isSelected()== true)
        {
            item = "Aloha Chicken                   ";
            price = 14;
        }
        else if(pDouble.isSelected()== true)
        {
            item = "Double Pepporoni            ";
            price = 18;
        }
        else if(pVeggie.isSelected()== true)
        {
            item = "Veggie Delight                   ";
            price = 12;
        }
        else if(pSeafood.isSelected()== true)
        {
            item = "Seafood  Sensation          ";
            price = 20;
        }
        else if(pChicken.isSelected()== true)
        {
            item = "Chicken & Pineapple       ";
            price = 16;
        }
        
        int qty = Integer.parseInt(txtQty.getValue().toString());
        int tot = qty * price;
        
        model = (DefaultTableModel)jTable1.getModel();
        
        model.addRow(new Object[]
        {
            item,
            price,
            qty,
            tot
        });
        
        int sum = 0;
        
        for(int i=0;i<jTable1.getRowCount();i++)
        {
            sum = sum + Integer.parseInt(jTable1.getValueAt(i,3).toString());
            count++;
        }
        txtTotal.setText(Integer.toString(sum));
    }//GEN-LAST:event_AddBtnActionPerformed

    private void RemoveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveBtnActionPerformed
        // TODO add your handling code here:
        model.removeRow(jTable1.getSelectedRow());
        
        int sum = 0;
        
        for(int i=0;i<jTable1.getRowCount();i++)
        {
            sum = sum + Integer.parseInt(jTable1.getValueAt(i,3).toString());
            count--;
        }
        txtTotal.setText(Integer.toString(sum));
           
    }//GEN-LAST:event_RemoveBtnActionPerformed
    public void sales(){
        String productName = "";
        int price;
        int qty;
        int tot = 0;
        
        for(int i = 0;i<jTable1.getRowCount();i++)
        {
            productName = (String)jTable1.getValueAt(i,0);
            price = (int)jTable1.getValueAt(i,1);
            qty = (int)jTable1.getValueAt(i,2);
            tot = (int)jTable1.getValueAt(i,3);
        }
    }
    private void calcBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcBtnActionPerformed
        
        int tot = Integer.parseInt(txtTotal.getText());
        int pay = Integer.parseInt(txtPay.getText());
        
        int bal = pay - tot;
        
        txtBal.setText(String.valueOf(bal));
    }//GEN-LAST:event_calcBtnActionPerformed

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        // TODO add your handling code here:
        
        //remove row on table
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        
        //remove text
        txtReceipt.setText("");
        txtBal.setText("");
        txtPay.setText("");
        txtTotal.setText("");
        
        //remove qty
        txtQty.setValue(0);
    }//GEN-LAST:event_ResetBtnActionPerformed

    private void ReceiptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReceiptBtnActionPerformed
        // TODO add your handling code here:
        Calendar timer= Calendar.getInstance();
        timer.getTime();
        SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
        tTime.format(timer.getTime());
        SimpleDateFormat Tdate = new SimpleDateFormat("dd-MM-yyyy");
        Tdate.format(timer.getTime());
        Formatter fmt = new Formatter();
        
        
        int counter = jTable1.getRowCount();
        String[] productName = new String[counter] ;
        int[] price = new int[counter];
        int[] qty = new int[counter];
        int[] tot = new int[counter];
      
            txtReceipt.append("\n\t        PIZZO\n" + 
                          " \n\tI Will Have Order\n "
                              +
    //                      "\nReference:\t\t" + refs +
           "\n===================================\n"+
             fmt.format("%1s %40s %10s %8s\n","Item","Price","Qty","Total")+
                    "===================================\n");
            
            
        
            for(int i = 0;i<jTable1.getRowCount();i++)
            {
               /*txtReceipt.append("\n"+fmt.format("%1$-20s %2$-10s %3$-10s %4$-10s\n",jTable1.getValueAt(i,0)
               ,jTable1.getValueAt(i,1)
               ,jTable1.getValueAt(i,2)
               ,jTable1.getValueAt(i,3))); */
               
               /*txtReceipt.append("\n"+jTable1.getValueAt(i,0)+ " " +
               jTable1.getValueAt(i,1)+ " " +
               jTable1.getValueAt(i,2)+ " " +
               jTable1.getValueAt(i,3)+ "\n"); */
                
               /*String format = "%3$-20s %2$-10s %1$-10s %2$-10s\n";
               System.out.format(format,jTable1.getValueAt(i,0),
                       jTable1.getValueAt(i,1),
                       jTable1.getValueAt(i,2),
                       jTable1.getValueAt(i,3));*/
                productName[i] = (String)jTable1.getValueAt(i,0);
                price[i] = (int)jTable1.getValueAt(i,1);
                qty[i] = (int)jTable1.getValueAt(i,2);
                tot[i]= (int)jTable1.getValueAt(i,3);
                
            }
            for(int i = 0;i<jTable1.getRowCount();i++) 
            {
                fmt = new Formatter();
                    txtReceipt.append("\n"+fmt.format("%1$-20s %2$-13s %3$-10s %4$-10s\n"
                    ,productName[i]
                    ,price[i]
                    ,qty[i]
                    ,tot[i]));
                
                
            
            }
              
              
           txtReceipt.append("\n===================================\n" +
               
               "Total:\t\t      RM "+ txtTotal.getText()+ "\n\n" +
               "Pay:\t\t      RM "+ txtPay.getText()+ "\n\n" +
               "Bal:\t\t      RM "+ txtBal.getText()+ "\n" +
               
           "\n===================================\n\n" +
               
               "Date: "+Tdate.format(timer.getTime())+
               "\nTime: "+tTime.format(timer.getTime())+
               "\nThank You\n" );
        
        
    }//GEN-LAST:event_ReceiptBtnActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(pizza_ordering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pizza_ordering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pizza_ordering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pizza_ordering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pizza_ordering().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton ReceiptBtn;
    private javax.swing.JButton RemoveBtn;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JButton calcBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton pAloha;
    private javax.swing.JRadioButton pChicken;
    private javax.swing.JRadioButton pDouble;
    private javax.swing.JRadioButton pHawaiian;
    private javax.swing.JRadioButton pSeafood;
    private javax.swing.JRadioButton pVeggie;
    private javax.swing.JTextField txtBal;
    private javax.swing.JTextField txtPay;
    private javax.swing.JSpinner txtQty;
    private javax.swing.JTextArea txtReceipt;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
