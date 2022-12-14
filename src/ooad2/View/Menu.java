/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ooad2.View;

import java.awt.Toolkit;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;
import java.util.Vector;
import ooad2.Model.Discount;
import ooad2.Model.Item;

/**
 *
 * @author alahm
 */
public class Menu extends javax.swing.JFrame {

    Discount d = new Discount("");
    private Vector<Item> items = new Vector<>();
    private Vector<Item> orderItems = new Vector<>();
    private double discout;
    private double net;

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    public Menu(Vector<Item> i) {

        setIcon();
        this.items.addAll(i);
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

        holdjPanel = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jPanelHoldMeal = new javax.swing.JPanel();
        qItem1 = new javax.swing.JSpinner();
        qItem2 = new javax.swing.JSpinner();
        qItem3 = new javax.swing.JSpinner();
        qItem4 = new javax.swing.JSpinner();
        pItem1 = new javax.swing.JTextField();
        pItem2 = new javax.swing.JTextField();
        pItem3 = new javax.swing.JTextField();
        pItem4 = new javax.swing.JTextField();
        nItem1 = new javax.swing.JTextField();
        nItem2 = new javax.swing.JTextField();
        nItem3 = new javax.swing.JTextField();
        nItem4 = new javax.swing.JTextField();
        mealsPic = new javax.swing.JLabel();
        jPanelHoldDrinks = new javax.swing.JPanel();
        qItem5 = new javax.swing.JSpinner();
        qItem6 = new javax.swing.JSpinner();
        qItem7 = new javax.swing.JSpinner();
        qItem8 = new javax.swing.JSpinner();
        pItem5 = new javax.swing.JTextField();
        pItem6 = new javax.swing.JTextField();
        pItem7 = new javax.swing.JTextField();
        pItem8 = new javax.swing.JTextField();
        nItem5 = new javax.swing.JTextField();
        nItem6 = new javax.swing.JTextField();
        nItem7 = new javax.swing.JTextField();
        nItem8 = new javax.swing.JTextField();
        drinkPic = new javax.swing.JLabel();
        disf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        billArea = new javax.swing.JTextArea();
        jLabelMainMenuMeal = new javax.swing.JLabel();
        jLabelMainMenuMeal1 = new javax.swing.JLabel();
        jLabelMainMenuMeal2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelMainMenuMeal3 = new javax.swing.JLabel();
        jLabelLgo = new javax.swing.JLabel();
        error = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome to Restaurant");
        setAlwaysOnTop(true);
        setResizable(false);

        holdjPanel.setBackground(new java.awt.Color(147, 137, 126));

        jLabelTitle.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabelTitle.setText("Welcome to Restaurant  ");

        jPanelHoldMeal.setToolTipText("");
        jPanelHoldMeal.setLayout(null);

        qItem1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        jPanelHoldMeal.add(qItem1);
        qItem1.setBounds(250, 30, 57, 28);

        qItem2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        jPanelHoldMeal.add(qItem2);
        qItem2.setBounds(250, 80, 57, 28);

        qItem3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        jPanelHoldMeal.add(qItem3);
        qItem3.setBounds(250, 130, 57, 28);

        qItem4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        jPanelHoldMeal.add(qItem4);
        qItem4.setBounds(250, 180, 57, 28);

        pItem1.setEditable(false);
        pItem1.setText(Double.toString(items.get(0).getPrice()));
        pItem1.setMinimumSize(new java.awt.Dimension(10, 20));
        pItem1.setPreferredSize(new java.awt.Dimension(40, 30));
        jPanelHoldMeal.add(pItem1);
        pItem1.setBounds(132, 30, 70, 30);

        pItem2.setEditable(false);
        pItem2.setText(Double.toString(items.get(1).getPrice()));
        pItem2.setMinimumSize(new java.awt.Dimension(10, 20));
        pItem2.setPreferredSize(new java.awt.Dimension(40, 30));
        jPanelHoldMeal.add(pItem2);
        pItem2.setBounds(130, 80, 70, 30);

        pItem3.setEditable(false);
        pItem3.setText(Double.toString(items.get(2).getPrice()));
        pItem3.setMinimumSize(new java.awt.Dimension(10, 20));
        pItem3.setPreferredSize(new java.awt.Dimension(40, 30));
        jPanelHoldMeal.add(pItem3);
        pItem3.setBounds(130, 130, 70, 28);

        pItem4.setEditable(false);
        pItem4.setText(Double.toString(items.get(3).getPrice()));
        pItem4.setMinimumSize(new java.awt.Dimension(10, 20));
        pItem4.setPreferredSize(new java.awt.Dimension(40, 30));
        jPanelHoldMeal.add(pItem4);
        pItem4.setBounds(130, 180, 70, 30);

        nItem1.setEditable(false);
        nItem1.setText(items.get(0).getItemName());
        nItem1.setMinimumSize(new java.awt.Dimension(15, 30));
        nItem1.setPreferredSize(new java.awt.Dimension(40, 30));
        jPanelHoldMeal.add(nItem1);
        nItem1.setBounds(10, 30, 90, 30);

        nItem2.setEditable(false);
        nItem2.setText(items.get(1).getItemName());
        nItem2.setMinimumSize(new java.awt.Dimension(15, 30));
        nItem2.setPreferredSize(new java.awt.Dimension(40, 30));
        jPanelHoldMeal.add(nItem2);
        nItem2.setBounds(10, 80, 90, 28);

        nItem3.setEditable(false);
        nItem3.setText(items.get(2).getItemName());
        nItem3.setMinimumSize(new java.awt.Dimension(15, 30));
        nItem3.setPreferredSize(new java.awt.Dimension(40, 30));
        nItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nItem3ActionPerformed(evt);
            }
        });
        jPanelHoldMeal.add(nItem3);
        nItem3.setBounds(10, 130, 90, 30);

        nItem4.setEditable(false);
        nItem4.setText(items.get(3).getItemName());
        nItem4.setMinimumSize(new java.awt.Dimension(15, 30));
        nItem4.setPreferredSize(new java.awt.Dimension(40, 30));
        nItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nItem4ActionPerformed(evt);
            }
        });
        jPanelHoldMeal.add(nItem4);
        nItem4.setBounds(10, 180, 90, 30);

        mealsPic.setBackground(new java.awt.Color(0, 0, 204));
        mealsPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ooad2/Assest/MainMeal.jpg"))); // NOI18N
        mealsPic.setText("jLabel11");
        jPanelHoldMeal.add(mealsPic);
        mealsPic.setBounds(0, 0, 330, 220);

        jPanelHoldDrinks.setLayout(null);

        qItem5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        jPanelHoldDrinks.add(qItem5);
        qItem5.setBounds(250, 30, 57, 28);

        qItem6.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        jPanelHoldDrinks.add(qItem6);
        qItem6.setBounds(250, 80, 57, 28);

        qItem7.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        jPanelHoldDrinks.add(qItem7);
        qItem7.setBounds(250, 130, 57, 28);

        qItem8.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        jPanelHoldDrinks.add(qItem8);
        qItem8.setBounds(250, 180, 57, 28);

        pItem5.setEditable(false);
        pItem5.setText(Double.toString(items.get(4).getPrice()));
        pItem5.setMinimumSize(new java.awt.Dimension(10, 20));
        pItem5.setPreferredSize(new java.awt.Dimension(40, 30));
        jPanelHoldDrinks.add(pItem5);
        pItem5.setBounds(132, 30, 70, 30);

        pItem6.setEditable(false);
        pItem6.setText(Double.toString(items.get(5).getPrice()));
        pItem6.setMinimumSize(new java.awt.Dimension(10, 20));
        pItem6.setPreferredSize(new java.awt.Dimension(40, 30));
        jPanelHoldDrinks.add(pItem6);
        pItem6.setBounds(130, 80, 70, 30);

        pItem7.setEditable(false);
        pItem7.setText(Double.toString(items.get(6).getPrice()));
        pItem7.setMinimumSize(new java.awt.Dimension(10, 20));
        pItem7.setPreferredSize(new java.awt.Dimension(40, 30));
        jPanelHoldDrinks.add(pItem7);
        pItem7.setBounds(130, 130, 70, 28);

        pItem8.setEditable(false);
        pItem8.setText(Double.toString(items.get(7).getPrice()));
        pItem8.setMinimumSize(new java.awt.Dimension(10, 20));
        pItem8.setPreferredSize(new java.awt.Dimension(40, 30));
        jPanelHoldDrinks.add(pItem8);
        pItem8.setBounds(130, 180, 70, 30);

        nItem5.setEditable(false);
        nItem5.setText(items.get(4).getItemName());
        nItem5.setMinimumSize(new java.awt.Dimension(15, 30));
        nItem5.setPreferredSize(new java.awt.Dimension(40, 30));
        jPanelHoldDrinks.add(nItem5);
        nItem5.setBounds(10, 30, 90, 30);

        nItem6.setEditable(false);
        nItem6.setText(items.get(5).getItemName());
        nItem6.setMinimumSize(new java.awt.Dimension(15, 30));
        nItem6.setPreferredSize(new java.awt.Dimension(40, 30));
        jPanelHoldDrinks.add(nItem6);
        nItem6.setBounds(10, 80, 90, 28);

        nItem7.setEditable(false);
        nItem7.setText(items.get(6).getItemName());
        nItem7.setMinimumSize(new java.awt.Dimension(15, 30));
        nItem7.setPreferredSize(new java.awt.Dimension(40, 30));
        jPanelHoldDrinks.add(nItem7);
        nItem7.setBounds(10, 130, 90, 30);

        nItem8.setEditable(false);
        nItem8.setText(items.get(7).getItemName());
        nItem8.setMinimumSize(new java.awt.Dimension(15, 30));
        nItem8.setPreferredSize(new java.awt.Dimension(40, 30));
        nItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nItem8ActionPerformed(evt);
            }
        });
        jPanelHoldDrinks.add(nItem8);
        nItem8.setBounds(10, 180, 90, 30);

        drinkPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ooad2/Assest/Drinks.jpg"))); // NOI18N
        jPanelHoldDrinks.add(drinkPic);
        drinkPic.setBounds(0, 0, 330, 230);

        disf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disfActionPerformed(evt);
            }
        });

        billArea.setEditable(false);
        billArea.setColumns(20);
        billArea.setRows(5);
        jScrollPane1.setViewportView(billArea);

        jLabelMainMenuMeal.setBackground(new java.awt.Color(0, 0, 204));
        jLabelMainMenuMeal.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabelMainMenuMeal.setText("Meals");

        jLabelMainMenuMeal1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabelMainMenuMeal1.setText("Drinks");

        jLabelMainMenuMeal2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabelMainMenuMeal2.setText("NAME");

        jLabel1.setText("PRICE");

        jLabel3.setText("QUANTITY ");

        jLabel4.setText("QUANTITY ");

        jLabel5.setText("PRICE");

        jLabelMainMenuMeal3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabelMainMenuMeal3.setText("NAME");

        jLabelLgo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ooad2/Assest/restaurantIcon.png"))); // NOI18N

        error.setText(" ");

        jButton1.setText("New Bill");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Get Discount");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Print");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout holdjPanelLayout = new javax.swing.GroupLayout(holdjPanel);
        holdjPanel.setLayout(holdjPanelLayout);
        holdjPanelLayout.setHorizontalGroup(
            holdjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(holdjPanelLayout.createSequentialGroup()
                .addGroup(holdjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(holdjPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, holdjPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(holdjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(holdjPanelLayout.createSequentialGroup()
                                .addGroup(holdjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanelHoldDrinks, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(holdjPanelLayout.createSequentialGroup()
                                        .addGroup(holdjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(holdjPanelLayout.createSequentialGroup()
                                                .addComponent(jLabelMainMenuMeal1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(holdjPanelLayout.createSequentialGroup()
                                                .addComponent(jLabelMainMenuMeal2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel1)
                                                .addGap(76, 76, 76)))
                                        .addComponent(jLabel3)
                                        .addGap(10, 10, 10))
                                    .addComponent(jPanelHoldMeal, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26))
                            .addGroup(holdjPanelLayout.createSequentialGroup()
                                .addGroup(holdjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelLgo)
                                    .addGroup(holdjPanelLayout.createSequentialGroup()
                                        .addGroup(holdjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabelMainMenuMeal)
                                            .addComponent(jLabelMainMenuMeal3))
                                        .addGap(99, 99, 99)
                                        .addComponent(jLabel5)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(38, 38, 38)))))
                .addGroup(holdjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(holdjPanelLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(31, 31, 31)
                        .addComponent(jButton2)
                        .addGap(36, 36, 36)
                        .addComponent(jButton3))
                    .addComponent(disf, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        holdjPanelLayout.setVerticalGroup(
            holdjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(holdjPanelLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(disf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(holdjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, holdjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelLgo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jLabelMainMenuMeal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(holdjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMainMenuMeal3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelHoldMeal, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMainMenuMeal1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(holdjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(holdjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelMainMenuMeal2)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelHoldDrinks, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(holdjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(holdjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void disfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_disfActionPerformed

    private void nItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nItem4ActionPerformed

    private void nItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nItem8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nItem8ActionPerformed

    private void nItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nItem3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        getOrderItem();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        doNewBill();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        d = new Discount(disf.getText());
        if (d.getError().equals("Invalid coupon")) {
            error.setText(d.getError());
        } else {
            error.setText("Accepted");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea billArea;
    private javax.swing.JTextField disf;
    private javax.swing.JLabel drinkPic;
    private javax.swing.JLabel error;
    private javax.swing.JPanel holdjPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelLgo;
    private javax.swing.JLabel jLabelMainMenuMeal;
    private javax.swing.JLabel jLabelMainMenuMeal1;
    private javax.swing.JLabel jLabelMainMenuMeal2;
    private javax.swing.JLabel jLabelMainMenuMeal3;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanelHoldDrinks;
    private javax.swing.JPanel jPanelHoldMeal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mealsPic;
    private javax.swing.JTextField nItem1;
    private javax.swing.JTextField nItem2;
    private javax.swing.JTextField nItem3;
    private javax.swing.JTextField nItem4;
    private javax.swing.JTextField nItem5;
    private javax.swing.JTextField nItem6;
    private javax.swing.JTextField nItem7;
    private javax.swing.JTextField nItem8;
    private javax.swing.JTextField pItem1;
    private javax.swing.JTextField pItem2;
    private javax.swing.JTextField pItem3;
    private javax.swing.JTextField pItem4;
    private javax.swing.JTextField pItem5;
    private javax.swing.JTextField pItem6;
    private javax.swing.JTextField pItem7;
    private javax.swing.JTextField pItem8;
    private javax.swing.JSpinner qItem1;
    private javax.swing.JSpinner qItem2;
    private javax.swing.JSpinner qItem3;
    private javax.swing.JSpinner qItem4;
    private javax.swing.JSpinner qItem5;
    private javax.swing.JSpinner qItem6;
    private javax.swing.JSpinner qItem7;
    private javax.swing.JSpinner qItem8;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/ooad2/Assest/restaurantIcon.png")));
    }

    private void getOrderItem() {
        orderItems.clear();
        billArea.setText("");
        if ((Integer) qItem1.getValue() > 0) {
            orderItems.add(new Item(items.get(0).getItemName(), items.get(0).getPrice(), (Integer) qItem1.getValue()));
        }
        if ((Integer) qItem2.getValue() > 0) {
            orderItems.add(new Item(items.get(1).getItemName(), items.get(1).getPrice(), (Integer) qItem2.getValue()));
        }
        if ((Integer) qItem3.getValue() > 0) {
            orderItems.add(new Item(items.get(2).getItemName(), items.get(2).getPrice(), (Integer) qItem3.getValue()));
        }
        if ((Integer) qItem4.getValue() > 0) {
            orderItems.add(new Item(items.get(3).getItemName(), items.get(3).getPrice(), (Integer) qItem4.getValue()));
        }
        if ((Integer) qItem5.getValue() > 0) {
            orderItems.add(new Item(items.get(4).getItemName(), items.get(4).getPrice(), (Integer) qItem5.getValue()));
        }
        if ((Integer) qItem6.getValue() > 0) {
            orderItems.add(new Item(items.get(5).getItemName(), items.get(5).getPrice(), (Integer) qItem6.getValue()));
        }
        if ((Integer) qItem7.getValue() > 0) {
            orderItems.add(new Item(items.get(6).getItemName(), items.get(6).getPrice(), (Integer) qItem7.getValue()));
        }
        if ((Integer) qItem8.getValue() > 0) {
            orderItems.add(new Item(items.get(7).getItemName(), items.get(7).getPrice(), (Integer) qItem8.getValue()));
        }

        if (!orderItems.isEmpty()) {
            getBill();
        }

    }

    private void doNewBill() {
        d = new Discount("");
        error.setText("");
        disf.setText("");
        discout = 0;
        net = 0;
        billArea.setText("");
        orderItems.clear();
        qItem1.setValue(0);
        qItem2.setValue(0);
        qItem3.setValue(0);
        qItem4.setValue(0);
        qItem5.setValue(0);
        qItem6.setValue(0);
        qItem7.setValue(0);
        qItem8.setValue(0);
    }

    private void getBill() {
        UUID uuid = UUID.randomUUID();
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("E,MMM dd yyyy HH:mm:ss");
        String dateTime = time.format(df);
        String text = "";
        double total = 0;
        text += "\t--------------------------------------------------------------\n\n";
        text += "\tWelcome\n";
        text += "\tID: " + uuid.toString() + "\n";
        text += "\tDate/ Time: " + dateTime;
        text += "\n\n\t--------------------------------------------------------------\n\n\n\n";

        text += "\tItem\tQuantity  \tPrice\t\n";

        for (int i = 0; i < orderItems.size(); i++) {

            text += "\t" + orderItems.get(i).getItemName() + "\t  " + orderItems.get(i).getQuantity() + "\t" + orderItems.get(i).getPrice() + " RM" + "\n";
            total += orderItems.get(i).getPrice() * orderItems.get(i).getQuantity();
        }
        text += "\n\n\n";
        text += "\tTotal Amount:\t" + total + " RM\n";
        if (d.getError().equals("ok")) {
            text += "\tDiscount:    \t" + d.getPriceAfterDiscount(total) + " RM\n";
        } else {
            text += "\tDiscount:    \t0\n";
        }
        if (d.getError().equals("ok")) {
            text += "\tNet Payable: \t" + (total - d.getPriceAfterDiscount(total)) + "\n";
        } else {
            text += "\tNet Payable: \t0\n";
        }

        billArea.setText(text);
    }
}
