/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.victorjuly.cursosonline.view;

import com.victorjuly.cursosonline.model.Costumer;
import static com.victorjuly.cursosonline.model.Costumer.Occupation;
import static com.victorjuly.cursosonline.model.Costumer.KnowledgeLevel;
import com.victorjuly.cursosonline.model.PaymentInfo;
import java.util.Arrays;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class CostumerRegisterView extends javax.swing.JFrame {

    public CostumerRegisterView() {
        initComponents();
        Arrays.stream(Costumer.Occupation.values()).map(Costumer.Occupation::toString).forEach(comboBoxRegisterOcupation::addItem);
        Arrays.stream(Costumer.KnowledgeLevel.values()).map(Costumer.KnowledgeLevel::toString).forEach(comboBoxRegisterLevel::addItem);
        Arrays.stream(PaymentInfo.Type.values()).map(PaymentInfo.Type::toString).forEach(comboBoxCostumerRegisterType::addItem);
    }
    
     private boolean checkIntegrity() {
        return !txtCostumerRegisterAge.getText().equals("")
                && !txtCostumerRegisterName.getText().equals("")
                && comboBoxCostumerRegisterType.getSelectedIndex() != -1
                && comboBoxRegisterLevel.getSelectedIndex() != -1
                && comboBoxRegisterOcupation.getSelectedIndex() != -1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboBoxRegisterLevel = new javax.swing.JComboBox<>();
        lblCostumerRegisterType = new javax.swing.JLabel();
        btnCostumerFinalRegister = new javax.swing.JButton();
        btnCostumerRegisterBack = new javax.swing.JButton();
        txtCostumerRegisterName = new javax.swing.JTextField();
        comboBoxCostumerRegisterType = new javax.swing.JComboBox<>();
        lblCostumerRegisterName = new javax.swing.JLabel();
        lblCostumerRegisterAge = new javax.swing.JLabel();
        txtCostumerRegisterAge = new javax.swing.JTextField();
        lblCostumerRegisterOcupation = new javax.swing.JLabel();
        lblCostumerRegisterLevel = new javax.swing.JLabel();
        comboBoxRegisterOcupation = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        comboBoxRegisterLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblCostumerRegisterType.setText("Tipo de pagamento:");

        btnCostumerFinalRegister.setText("Cadastrar");
        btnCostumerFinalRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCostumerFinalRegisterActionPerformed(evt);
            }
        });

        btnCostumerRegisterBack.setText("Voltar");

        comboBoxCostumerRegisterType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblCostumerRegisterName.setText("Nome:");

        lblCostumerRegisterAge.setText("Idade:");

        lblCostumerRegisterOcupation.setText("Ocupação:");

        lblCostumerRegisterLevel.setText("Nível de conhecimento:");

        comboBoxRegisterOcupation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnCostumerRegisterBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCostumerRegisterLevel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboBoxRegisterLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCostumerRegisterType)
                                .addGap(18, 18, 18)
                                .addComponent(comboBoxCostumerRegisterType, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCostumerRegisterOcupation)
                                .addGap(18, 18, 18)
                                .addComponent(comboBoxRegisterOcupation, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCostumerRegisterAge)
                                .addGap(18, 18, 18)
                                .addComponent(txtCostumerRegisterAge, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCostumerRegisterName)
                                .addGap(18, 18, 18)
                                .addComponent(txtCostumerRegisterName, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCostumerFinalRegister)
                                .addGap(203, 203, 203)))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnCostumerRegisterBack)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCostumerRegisterName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCostumerRegisterName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCostumerRegisterAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCostumerRegisterAge))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCostumerRegisterOcupation)
                    .addComponent(comboBoxRegisterOcupation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxRegisterLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCostumerRegisterLevel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCostumerRegisterType)
                    .addComponent(comboBoxCostumerRegisterType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(btnCostumerFinalRegister)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCostumerFinalRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCostumerFinalRegisterActionPerformed
        if(!checkIntegrity()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
            return;
        }

        try {
            String nome = txtCostumerRegisterName.getText();
            int age = Integer.parseInt(txtCostumerRegisterAge.getText());
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_btnCostumerFinalRegisterActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CostumerRegisterView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCostumerFinalRegister;
    private javax.swing.JButton btnCostumerRegisterBack;
    private javax.swing.JComboBox<String> comboBoxCostumerRegisterType;
    private javax.swing.JComboBox<String> comboBoxRegisterLevel;
    private javax.swing.JComboBox<String> comboBoxRegisterOcupation;
    private javax.swing.JLabel lblCostumerRegisterAge;
    private javax.swing.JLabel lblCostumerRegisterLevel;
    private javax.swing.JLabel lblCostumerRegisterName;
    private javax.swing.JLabel lblCostumerRegisterOcupation;
    private javax.swing.JLabel lblCostumerRegisterType;
    private javax.swing.JTextField txtCostumerRegisterAge;
    private javax.swing.JTextField txtCostumerRegisterName;
    // End of variables declaration//GEN-END:variables
}