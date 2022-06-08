/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.victorjuly.cursosonline.view;

import com.victorjuly.cursosonline.controller.Controller;
import com.victorjuly.cursosonline.model.Costumer;
import com.victorjuly.cursosonline.exception.InvalidDateException;
import static com.victorjuly.cursosonline.model.Costumer.Occupation;
import static com.victorjuly.cursosonline.model.Costumer.KnowledgeLevel;
import com.victorjuly.cursosonline.model.PaymentInfo;
import java.util.Arrays;
import javax.swing.JOptionPane;
import com.victorjuly.cursosonline.controller.CostumerController;
import com.victorjuly.cursosonline.exception.NumericFieldException;
import com.victorjuly.cursosonline.util.Util;
import java.awt.event.WindowEvent;
import java.util.Collections;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.util.List;


public class CostumerRegisterView extends javax.swing.JFrame {

    private DefaultTableModel model;
    private CostumerController controller;
    
    public CostumerRegisterView() {
        initComponents();
        controller = Controller.get(CostumerController.class);
        Arrays.stream(Costumer.Occupation.values()).map(Occupation::toString).forEach(comboBoxRegisterOcupation::addItem);
        Arrays.stream(Costumer.KnowledgeLevel.values()).map(KnowledgeLevel::toString).forEach(comboBoxRegisterLevel::addItem);
        Arrays.stream(PaymentInfo.Type.values()).map(PaymentInfo.Type::toString).forEach(comboBoxCostumerRegisterType::addItem);
        updateTable();
    }
    
    private void updateTable() {
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
        
        controller.getContainer().forEach(c -> {
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
   
    private boolean checkIntegrity() {
        return !txtCostumerRegisterAge.getText().equals("")
                && !txtCostumerRegisterName.getText().equals("")
                && !txtAgencia.getText().equals("")
                && !txtConta.getText().equals("")
                && !txtCvc.getText().equals("")
                && !txtValidade.getText().equals("")
                && comboBoxCostumerRegisterType.getSelectedIndex() != -1
                && comboBoxRegisterLevel.getSelectedIndex() != -1
                && comboBoxRegisterOcupation.getSelectedIndex() != -1;
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCostumerFinalRegister = new javax.swing.JButton();
        comboBoxRegisterLevel = new javax.swing.JComboBox<>();
        lblCostumerRegisterType = new javax.swing.JLabel();
        btnCostumerRegisterBack = new javax.swing.JButton();
        txtCostumerRegisterName = new javax.swing.JTextField();
        comboBoxCostumerRegisterType = new javax.swing.JComboBox<>();
        lblCostumerRegisterName = new javax.swing.JLabel();
        lblCostumerRegisterAge = new javax.swing.JLabel();
        txtCostumerRegisterAge = new javax.swing.JTextField();
        lblCostumerRegisterOcupation = new javax.swing.JLabel();
        lblCostumerRegisterLevel = new javax.swing.JLabel();
        comboBoxRegisterOcupation = new javax.swing.JComboBox<>();
        lblCostumerSearchType1 = new javax.swing.JLabel();
        txtAgencia = new javax.swing.JTextField();
        txtCvc = new javax.swing.JTextField();
        txtValidade = new javax.swing.JTextField();
        txtConta = new javax.swing.JTextField();
        lblCostumerSearchType2 = new javax.swing.JLabel();
        lblCostumerSearchType4 = new javax.swing.JLabel();
        lblCostumerSearchType3 = new javax.swing.JLabel();
        lblCostumerRegisterType1 = new javax.swing.JLabel();
        botaoCadastrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        botaoExcluir = new javax.swing.JButton();

        btnCostumerFinalRegister.setText("Cadastrar");
        btnCostumerFinalRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCostumerFinalRegisterActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCostumerRegisterType.setText("Tipo de pagamento:");

        btnCostumerRegisterBack.setText("Voltar");
        btnCostumerRegisterBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCostumerRegisterBackActionPerformed(evt);
            }
        });

        lblCostumerRegisterName.setText("Nome:");

        lblCostumerRegisterAge.setText("Idade:");

        lblCostumerRegisterOcupation.setText("Ocupação:");

        lblCostumerRegisterLevel.setText("Nível de conhecimento:");

        lblCostumerSearchType1.setText("Agencia:");

        lblCostumerSearchType2.setText("Conta:");

        lblCostumerSearchType4.setText("Validade:");

        lblCostumerSearchType3.setText("CVC");

        lblCostumerRegisterType1.setText("Pagamento:");

        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblClientes);

        botaoExcluir.setText("Excluir");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCostumerRegisterBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCostumerRegisterType)
                                .addGap(68, 68, 68)
                                .addComponent(comboBoxCostumerRegisterType, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCostumerSearchType3)
                                    .addComponent(lblCostumerSearchType2)
                                    .addComponent(lblCostumerSearchType4)
                                    .addComponent(lblCostumerSearchType1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtConta, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                                    .addComponent(txtAgencia)
                                    .addComponent(txtCvc)
                                    .addComponent(txtValidade))))
                        .addGap(1, 1, 1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botaoExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblCostumerRegisterOcupation)
                                .addComponent(lblCostumerRegisterAge)
                                .addComponent(lblCostumerRegisterName)
                                .addComponent(lblCostumerRegisterLevel)
                                .addComponent(lblCostumerRegisterType1))
                            .addGap(68, 68, 68)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(comboBoxRegisterOcupation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCostumerRegisterAge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCostumerRegisterName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboBoxRegisterLevel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCostumerRegisterBack)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCostumerRegisterName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCostumerRegisterName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCostumerRegisterAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCostumerRegisterAge))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBoxRegisterOcupation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCostumerRegisterOcupation))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBoxRegisterLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCostumerRegisterLevel))
                        .addGap(46, 46, 46)
                        .addComponent(lblCostumerRegisterType1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBoxCostumerRegisterType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCostumerRegisterType))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCostumerSearchType1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCvc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCostumerSearchType3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCostumerSearchType2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCostumerSearchType4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoCadastrar)
                            .addComponent(botaoExcluir)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCostumerFinalRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCostumerFinalRegisterActionPerformed
    }//GEN-LAST:event_btnCostumerFinalRegisterActionPerformed

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        if(!checkIntegrity()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
            return;
        }

        try {
            String nome = txtCostumerRegisterName.getText();
            
            int idade;
            
            if((idade = Util.testAndGetNumericField(txtCostumerRegisterAge, "idade")) == -1) {
                return;
            }
            
            if(idade <= 0) {
                JOptionPane.showMessageDialog(null, "A idade deve ser maior que 0!");
                return;
            }
            
            Occupation occupation = Occupation.valueOf(comboBoxRegisterOcupation.getSelectedItem().toString());
            KnowledgeLevel knowledgeLevel = KnowledgeLevel.valueOf(comboBoxRegisterLevel.getSelectedItem().toString());
            PaymentInfo.Type paymentType = PaymentInfo.Type.valueOf(comboBoxCostumerRegisterType.getSelectedItem().toString());
            
            int agencia, conta, cvc;
            
            if((agencia = Util.testAndGetNumericField(txtCostumerRegisterAge, "agencia")) == -1) {
                return;
            }
            if((conta = Util.testAndGetNumericField(txtConta, "conta")) == -1) {
                return;
            }
            if((cvc = Util.testAndGetNumericField(txtCostumerRegisterAge, "cvc")) == -1) {
                return;
            }

            String validade = txtValidade.getText();
            
            validateExpirationDate(validade);
            
            Costumer costumer = new Costumer(nome, idade, knowledgeLevel, occupation, new PaymentInfo(paymentType, agencia+"", conta+"", cvc+"", validade));
            controller.store(costumer);
            
            comboBoxCostumerRegisterType.setSelectedIndex(-1);
            comboBoxRegisterLevel.setSelectedIndex(-1);
            comboBoxRegisterOcupation.setSelectedIndex(-1);
            txtAgencia.setText("");
            txtConta.setText("");
            txtCostumerRegisterName.setText("");
            txtValidade.setText("");
            txtCvc.setText("");
            txtCostumerRegisterAge.setText("");
            updateTable();
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
        } catch (NumericFieldException ex) {
            ex.getField().requestFocus();
            JOptionPane.showMessageDialog(null, "O campo " + ex.getMessage() + "só aceita valores numéricos");
        } catch (InvalidDateException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void btnCostumerRegisterBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCostumerRegisterBackActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnCostumerRegisterBackActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        if(tblClientes.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um cliente para excluir");
            return;
        }
        
        List<Costumer> possible = controller.find(Collections.singleton(x -> x.getId() == Integer.parseInt(tblClientes.getValueAt(tblClientes.getSelectedRow(), 0).toString())));
        if(possible.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum cliente com esse id encontrado.");
            return;
        }
        
        Costumer deleted = possible.get(0);
        
        
        if(JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja deletar o cliente " + deleted.getName() + "?") != 0) {
            return;
        }
        
        controller.delete(deleted.getId());
        JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso!");
        updateTable();
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void validateExpirationDate(String expire) throws InvalidDateException {
        if(expire.split("/").length != 2) {
            throw new InvalidDateException();
        }
        
        int month, year;
        String monthString = expire.split("/")[0];
        String yearString = expire.split("/")[1];
        
        try {
            month = Integer.parseInt(monthString);
            System.out.println(month);
            year = Integer.parseInt(yearString);
            System.out.println(year);
        } catch (NumberFormatException ex) {
            throw new InvalidDateException();
        }
        
        if(!((month > 0 && month <= 12) && (year >= 2022 && year <= 3000))) {
            throw new InvalidDateException();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton btnCostumerFinalRegister;
    private javax.swing.JButton btnCostumerRegisterBack;
    private javax.swing.JComboBox<String> comboBoxCostumerRegisterType;
    private javax.swing.JComboBox<String> comboBoxRegisterLevel;
    private javax.swing.JComboBox<String> comboBoxRegisterOcupation;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCostumerRegisterAge;
    private javax.swing.JLabel lblCostumerRegisterLevel;
    private javax.swing.JLabel lblCostumerRegisterName;
    private javax.swing.JLabel lblCostumerRegisterOcupation;
    private javax.swing.JLabel lblCostumerRegisterType;
    private javax.swing.JLabel lblCostumerRegisterType1;
    private javax.swing.JLabel lblCostumerSearchType1;
    private javax.swing.JLabel lblCostumerSearchType2;
    private javax.swing.JLabel lblCostumerSearchType3;
    private javax.swing.JLabel lblCostumerSearchType4;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtAgencia;
    private javax.swing.JTextField txtConta;
    private javax.swing.JTextField txtCostumerRegisterAge;
    private javax.swing.JTextField txtCostumerRegisterName;
    private javax.swing.JTextField txtCvc;
    private javax.swing.JTextField txtValidade;
    // End of variables declaration//GEN-END:variables
}
