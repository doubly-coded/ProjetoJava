/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.victorjuly.cursosonline.view;

import com.victorjuly.cursosonline.controller.Controller;
import com.victorjuly.cursosonline.controller.CostumerController;
import com.victorjuly.cursosonline.controller.CourseController;
import com.victorjuly.cursosonline.exception.EmptyStringException;
import com.victorjuly.cursosonline.exception.NegativeNumberException;
import com.victorjuly.cursosonline.model.Costumer;
import com.victorjuly.cursosonline.model.Course;
import com.victorjuly.cursosonline.util.Util;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CourseRegisterView extends javax.swing.JFrame {

    private CourseController controller;
    private DefaultTableModel model;
    
    public CourseRegisterView() {
        initComponents();
        controller = Controller.get(CourseController.class);
        Arrays.stream(Course.Category.values()).map(Course.Category::toString).forEach(comboBoxCourseCategory::addItem);
        updateTable();
    }
    
    private void updateTable() {
        model = new DefaultTableModel();
        model.setRowCount(0);
        model.addColumn("ID");
        model.addColumn("Titulo");
        model.addColumn("Professor");
        model.addColumn("Preço");
        model.addColumn("Duração");
        model.addColumn("Descrição");
        model.addColumn("Categoria");
        
        DefaultTableModel dm = (DefaultTableModel)tblCursos.getModel();
        dm.getDataVector().removeAllElements();
        dm.fireTableDataChanged();
        
        controller.getContainer().forEach(c -> {
            model.addRow(new Object[]{
                c.getId(), 
                c.getTitle(), 
                c.getOwner(), 
                "R$ " + c.getPrice(),
                c.getDuration() + "min", 
                c.getDescription(), 
                c.getCategory().toString()});
        });
        
        tblCursos.setModel(model);
    }
   
    private boolean checkIntegrity() {
        return !txtCourseDescription.getText().equals("")
                && !txtCourseName.getText().equals("")
                && !txtCoursePrice.getText().equals("")
                && !txtCourseTeacher.getText().equals("")
                && !txtCourseTime.getText().equals("")
                && comboBoxCourseCategory.getSelectedIndex() != -1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCoursePrice = new javax.swing.JTextField();
        lblCourseTeacher = new javax.swing.JLabel();
        txtCourseTeacher = new javax.swing.JTextField();
        comboBoxCourseCategory = new javax.swing.JComboBox<>();
        lblCourseName = new javax.swing.JLabel();
        lblCourseCategory = new javax.swing.JLabel();
        lblCourseTime = new javax.swing.JLabel();
        lblCourseDescription = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        txtCourseDescription = new javax.swing.JTextField();
        txtCourseTime = new javax.swing.JTextField();
        btnCourseRegisterBack = new javax.swing.JButton();
        txtCourseName = new javax.swing.JTextField();
        lblCoursePrice = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCursos = new javax.swing.JTable();
        btnCostumerFinalRegister1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCourseTeacher.setText("Professor:");

        lblCourseName.setText("Nome:");

        lblCourseCategory.setText("Categoria:");

        lblCourseTime.setText("Duração:");

        lblCourseDescription.setText("Descrição:");

        btnExcluir.setLabel("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnCourseRegisterBack.setText("Voltar");
        btnCourseRegisterBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCourseRegisterBackActionPerformed(evt);
            }
        });

        lblCoursePrice.setText("Preço:");

        jScrollPane1.setViewportView(tblCursos);

        btnCostumerFinalRegister1.setText("Cadastrar");
        btnCostumerFinalRegister1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCostumerFinalRegister1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnCourseRegisterBack)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCourseTime)
                                .addGap(18, 18, 18)
                                .addComponent(txtCourseTime, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCourseCategory)
                                .addGap(18, 18, 18)
                                .addComponent(comboBoxCourseCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCourseTeacher)
                                .addGap(18, 18, 18)
                                .addComponent(txtCourseTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCourseName)
                                .addGap(18, 18, 18)
                                .addComponent(txtCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblCoursePrice)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtCoursePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblCourseDescription)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtCourseDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(147, 147, 147)
                    .addComponent(btnCostumerFinalRegister1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(633, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnCourseRegisterBack)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCourseName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCourseTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCourseTeacher))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCourseTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCourseTime))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBoxCourseCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCourseCategory))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCoursePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCoursePrice))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCourseDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCourseDescription))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluir))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(371, Short.MAX_VALUE)
                    .addComponent(btnCostumerFinalRegister1)
                    .addContainerGap()))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if(tblCursos.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um curso para excluir");
            return;
        }
        
        List<Course> possible = controller.find(Collections.singleton(x -> x.getId() == Integer.parseInt(tblCursos.getValueAt(tblCursos.getSelectedRow(), 0).toString())));
        if(possible.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum curso com esse id encontrado.");
            return;
        }
        
        Course deleted = possible.get(0);
        
        
        if(JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja deletar o curso " + deleted.getTitle() + "?") != 0) {
            return;
        }
        
        controller.delete(deleted.getId());
        JOptionPane.showMessageDialog(null, "Curso excluído com sucesso!");
        updateTable();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCourseRegisterBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCourseRegisterBackActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnCourseRegisterBackActionPerformed

    private void btnCostumerFinalRegister1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCostumerFinalRegister1ActionPerformed
        try {
            
            if(!checkIntegrity()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos");
                return;
            }
            
            String name = txtCourseName.getText();
            String teacher = txtCourseTeacher.getText();
            int time = 0;
            String category = (String) comboBoxCourseCategory.getSelectedItem();
            double price = Double.parseDouble(txtCoursePrice.getText());
            String description = txtCourseDescription.getText();

            if((time = Util.testAndGetNumericField(txtCourseTime, "duração")) == -1) {
                return;
            }
            
            if (time <= 0) {
                txtCourseTime.requestFocus();
                throw new NegativeNumberException("A duração deve ser maior ou igual a 0");
            }
            if (price < 0) {
                txtCoursePrice.requestFocus();
                throw new NegativeNumberException("Preço não pode ser negativo");
            }
            
            Course course = new Course(name, price, teacher, time, description, Course.Category.valueOf(category));

            Controller.get(CourseController.class).store(course);
            updateTable();
            JOptionPane.showMessageDialog(null, "Curso cadastrado com sucesso");
            txtCourseName.requestFocus();
            txtCourseName.setText("");
            txtCourseDescription.setText("");
            txtCoursePrice.setText("");
            txtCourseTeacher.setText("");
            txtCourseTime.setText("");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "A duração e o preço precisam ser números");
        } catch(RuntimeException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnCostumerFinalRegister1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCostumerFinalRegister1;
    private javax.swing.JButton btnCourseRegisterBack;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JComboBox<String> comboBoxCourseCategory;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCourseCategory;
    private javax.swing.JLabel lblCourseDescription;
    private javax.swing.JLabel lblCourseName;
    private javax.swing.JLabel lblCoursePrice;
    private javax.swing.JLabel lblCourseTeacher;
    private javax.swing.JLabel lblCourseTime;
    private javax.swing.JTable tblCursos;
    private javax.swing.JTextField txtCourseDescription;
    private javax.swing.JTextField txtCourseName;
    private javax.swing.JTextField txtCoursePrice;
    private javax.swing.JTextField txtCourseTeacher;
    private javax.swing.JTextField txtCourseTime;
    // End of variables declaration//GEN-END:variables
}
