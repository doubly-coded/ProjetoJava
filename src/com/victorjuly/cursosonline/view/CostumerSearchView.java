/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.victorjuly.cursosonline.view;

import com.victorjuly.cursosonline.controller.Controller;
import com.victorjuly.cursosonline.controller.CostumerController;
import com.victorjuly.cursosonline.model.Costumer;
import com.victorjuly.cursosonline.model.PaymentInfo;
import com.victorjuly.cursosonline.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CostumerSearchView extends javax.swing.JFrame {
    
    private CostumerController controller;
    private DefaultTableModel model;
    
    public CostumerSearchView() {
        initComponents();
        controller = Controller.get(CostumerController.class);
        comboBoxCostumerSearchType.addItem("");
        comboBoxSearchOcupation.addItem("");
        comboBoxSearchLevel.addItem("");
        Arrays.stream(Costumer.KnowledgeLevel.values()).map(Costumer.KnowledgeLevel::toString).forEach(comboBoxSearchLevel::addItem);
        Arrays.stream(Costumer.Occupation.values()).map(Costumer.Occupation::toString).forEach(comboBoxSearchOcupation::addItem);
        Arrays.stream(PaymentInfo.Type.values()).map(PaymentInfo.Type::toString).forEach(comboBoxCostumerSearchType::addItem);
        updateTable(controller.getContainer());
    }
    
     private void updateTable(Collection<Costumer> costumers) {
        model = new DefaultTableModel();
        model.setRowCount(0);
        model.addColumn("ID");
        model.addColumn("Nome");
        model.addColumn("Idade");
        model.addColumn("Ocupação");
        model.addColumn("Nível de conhecimento");
        model.addColumn("Tipo de pagamento");
        
        DefaultTableModel dm = (DefaultTableModel)tblClientes.getModel();
        dm.getDataVector().removeAllElements();
        dm.fireTableDataChanged();
        
        tblClientes.setModel(model);
        
        costumers.forEach(c -> {
            model.addRow(new Object[]{
                c.getId(), 
                c.getName(), 
                c.getAge(), 
                c.getOccupation().getLabel(), 
                c.getLevel().getLabel(), 
                c.getPaymentInfo().getType().toString()});
        });
        
        tblClientes.setModel(model);
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCostumerSearchAge = new javax.swing.JTextField();
        btnCostumerSearchOlder = new javax.swing.JButton();
        btnCostumerSearchBack = new javax.swing.JButton();
        btnCostumerSearchYounger = new javax.swing.JButton();
        lblCostumerSearchOcupation = new javax.swing.JLabel();
        btnCostumerSearchHigh = new javax.swing.JButton();
        lblCostumerSearchLevel = new javax.swing.JLabel();
        btnCostumerSearchLess = new javax.swing.JButton();
        comboBoxCostumerSearchType = new javax.swing.JComboBox<>();
        btnCostumerSearchMedia = new javax.swing.JButton();
        comboBoxSearchOcupation = new javax.swing.JComboBox<>();
        comboBoxSearchLevel = new javax.swing.JComboBox<>();
        lblCostumerSearchType = new javax.swing.JLabel();
        lblCostumerSearchName = new javax.swing.JLabel();
        txtCostumerSearchName = new javax.swing.JTextField();
        lblCostumerSearchAge = new javax.swing.JLabel();
        btnCostumerSearch = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCostumerSearchOlder.setText("Cliente mais velho ");
        btnCostumerSearchOlder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCostumerSearchOlderActionPerformed(evt);
            }
        });

        btnCostumerSearchBack.setText("Voltar");
        btnCostumerSearchBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCostumerSearchBackActionPerformed(evt);
            }
        });

        btnCostumerSearchYounger.setText("Cliente mais novo");
        btnCostumerSearchYounger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCostumerSearchYoungerActionPerformed(evt);
            }
        });

        lblCostumerSearchOcupation.setText("Ocupação:");

        btnCostumerSearchHigh.setText("Cliente maiores de 60 anos");
        btnCostumerSearchHigh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCostumerSearchHighActionPerformed(evt);
            }
        });

        lblCostumerSearchLevel.setText("Nível de conhecimento:");

        btnCostumerSearchLess.setText("Cliente menores de 18 anos");
        btnCostumerSearchLess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCostumerSearchLessActionPerformed(evt);
            }
        });

        btnCostumerSearchMedia.setText("Média das idades");
        btnCostumerSearchMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCostumerSearchMediaActionPerformed(evt);
            }
        });

        lblCostumerSearchType.setText("Tipo de pagamento:");

        lblCostumerSearchName.setText("Nome:");

        lblCostumerSearchAge.setText("Idade:");

        btnCostumerSearch.setText("Pesquisar");
        btnCostumerSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCostumerSearchActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(tblClientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCostumerSearchBack)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCostumerSearchOcupation)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboBoxSearchOcupation, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCostumerSearchAge)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCostumerSearchAge, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCostumerSearchName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCostumerSearchName, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCostumerSearchLevel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboBoxSearchLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCostumerSearchType)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCostumerSearchHigh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCostumerSearchLess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(btnCostumerSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnCostumerSearchOlder, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnCostumerSearchYounger, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                            .addComponent(btnCostumerSearchMedia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(comboBoxCostumerSearchType, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnCostumerSearchBack)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCostumerSearchName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCostumerSearchName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCostumerSearchAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCostumerSearchAge))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCostumerSearchOcupation)
                            .addComponent(comboBoxSearchOcupation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBoxSearchLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCostumerSearchLevel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBoxCostumerSearchType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCostumerSearchType))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCostumerSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnCostumerSearchOlder)
                                    .addComponent(btnCostumerSearchYounger)))
                            .addComponent(btnCostumerSearchMedia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCostumerSearchHigh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCostumerSearchLess)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCostumerSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCostumerSearchActionPerformed
        Collection<Predicate<Costumer>> predicates = new ArrayList<>();
        if(!txtCostumerSearchAge.getText().equalsIgnoreCase("")) {
            int age;
            if((age = Util.testAndGetNumericField(txtCostumerSearchAge, "idade")) == -1) {
                return;
            }
            predicates.add((c) -> c.getAge() == age);
        }
        
        if(!txtCostumerSearchName.getText().equalsIgnoreCase("")) {
            predicates.add((c) -> c.getName().toLowerCase().startsWith(txtCostumerSearchName.getText().toLowerCase()));
        }
        
        if(!comboBoxSearchOcupation.getSelectedItem().toString().equals("")){
            predicates.add((c) -> c.getOccupation().equals(Costumer.Occupation.valueOf(comboBoxSearchOcupation.getSelectedItem().toString())));
        }
        
        if(!comboBoxCostumerSearchType.getSelectedItem().toString().equals("")){
            predicates.add((c) -> c.getPaymentInfo().getType().equals(PaymentInfo.Type.valueOf(comboBoxCostumerSearchType.getSelectedItem().toString())));
        }
        
        if(!comboBoxSearchLevel.getSelectedItem().toString().equals("")){
            predicates.add((c) -> c.getLevel().equals(Costumer.KnowledgeLevel.valueOf(comboBoxSearchLevel.getSelectedItem().toString())));
        }
        Collection<Costumer> result = Controller.get(CostumerController.class).find(predicates);
        if(result.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum cliente encontrado");
        }
        updateTable(result);
    }//GEN-LAST:event_btnCostumerSearchActionPerformed

    private void btnCostumerSearchLessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCostumerSearchLessActionPerformed
        Collection<Costumer> result = controller.find(Collections.singleton((x) -> x.getAge() < 18));
        if(result.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum cliente encontrado");
        }else {
            JOptionPane.showMessageDialog(null, "Clientes maiores de 18 anos: " + result.size());
        }
        updateTable(result);
    }//GEN-LAST:event_btnCostumerSearchLessActionPerformed

    private void btnCostumerSearchHighActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCostumerSearchHighActionPerformed
        Collection<Costumer> result = controller.find(Collections.singleton((x) -> x.getAge() > 60));
        if(result.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum cliente encontrado");
        } else {
            JOptionPane.showMessageDialog(null, "Clientes com mais de 60 anos: " + result.size());
        }
        updateTable(result);
    }//GEN-LAST:event_btnCostumerSearchHighActionPerformed

    private void btnCostumerSearchOlderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCostumerSearchOlderActionPerformed
        if(controller.getContainer().iterator().hasNext()) {
            Costumer older = controller.getContainer().iterator().next();
            for(Costumer costumer : controller.getContainer()) {
                if(costumer.getAge() > older.getAge()) {
                    older = costumer;
                }
            }
            updateTable(Collections.singleton(older));
            return;
        }
        JOptionPane.showMessageDialog(null, "Nenhum cliente cadastrado");
    }//GEN-LAST:event_btnCostumerSearchOlderActionPerformed

    private void btnCostumerSearchYoungerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCostumerSearchYoungerActionPerformed
        if(controller.getContainer().iterator().hasNext()) {
            Costumer younger = controller.getContainer().iterator().next();
            for(Costumer costumer : controller.getContainer()) {
                if(costumer.getAge() < younger.getAge()) {
                    younger = costumer;
                }
            }
            updateTable(Collections.singleton(younger));
            return;
        }
        JOptionPane.showMessageDialog(null, "Nenhum cliente cadastrado");
    }//GEN-LAST:event_btnCostumerSearchYoungerActionPerformed

    private void btnCostumerSearchMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCostumerSearchMediaActionPerformed
        if(controller.getContainer().size() <= 0) {
            JOptionPane.showMessageDialog(null, "Nenhum cliente cadastrado");
            return;
        }
        int average = controller.getContainer().stream().map(Costumer::getAge).reduce(0, Integer::sum)/controller.getContainer().size();
        JOptionPane.showMessageDialog(null, "Média das idades: " + average);
    }//GEN-LAST:event_btnCostumerSearchMediaActionPerformed

    private void btnCostumerSearchBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCostumerSearchBackActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnCostumerSearchBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCostumerSearch;
    private javax.swing.JButton btnCostumerSearchBack;
    private javax.swing.JButton btnCostumerSearchHigh;
    private javax.swing.JButton btnCostumerSearchLess;
    private javax.swing.JButton btnCostumerSearchMedia;
    private javax.swing.JButton btnCostumerSearchOlder;
    private javax.swing.JButton btnCostumerSearchYounger;
    private javax.swing.JComboBox<String> comboBoxCostumerSearchType;
    private javax.swing.JComboBox<String> comboBoxSearchLevel;
    private javax.swing.JComboBox<String> comboBoxSearchOcupation;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCostumerSearchAge;
    private javax.swing.JLabel lblCostumerSearchLevel;
    private javax.swing.JLabel lblCostumerSearchName;
    private javax.swing.JLabel lblCostumerSearchOcupation;
    private javax.swing.JLabel lblCostumerSearchType;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtCostumerSearchAge;
    private javax.swing.JTextField txtCostumerSearchName;
    // End of variables declaration//GEN-END:variables
}
