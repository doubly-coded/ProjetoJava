package com.victorjuly.cursosonline.view;

import com.victorjuly.cursosonline.controller.CourseController;
import com.victorjuly.cursosonline.model.Course;
import com.victorjuly.cursosonline.controller.Controller;
import com.victorjuly.cursosonline.controller.CostumerController;
import com.victorjuly.cursosonline.model.Costumer;
import com.victorjuly.cursosonline.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Predicate;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CourseSearchView extends javax.swing.JFrame {

    private CourseController controller;
    private DefaultTableModel model;
    
    public CourseSearchView() {
        initComponents();
        controller = Controller.get(CourseController.class);
        comboBoxCourseSearchType.addItem("");
        updateTable(controller.getContainer());
        Arrays.stream(Course.Category.values()).map(Course.Category::toString).forEach(comboBoxCourseSearchType::addItem);
    }
    
    private void updateTable(Collection<Course> course) {
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
        
        course.forEach(c -> {
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCourseSearchDescription = new javax.swing.JTextField();
        btnCourseSearchBack = new javax.swing.JButton();
        lblCourseSearchName = new javax.swing.JLabel();
        txtCourseSearchName = new javax.swing.JTextField();
        lblCourseSearchDescription = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCursos = new javax.swing.JTable();
        btnCourseSearch = new javax.swing.JButton();
        txtCourseSearchPrice = new javax.swing.JTextField();
        lblCourseSearchPrice = new javax.swing.JLabel();
        txtCourseSearchTeacher = new javax.swing.JTextField();
        lblCourseSearchTeacher = new javax.swing.JLabel();
        btnCourseSearchHigh = new javax.swing.JButton();
        btnCourseSearchLess = new javax.swing.JButton();
        btnCourseSearchMedia = new javax.swing.JButton();
        btnCourseSearchUp = new javax.swing.JButton();
        lblCourseSearchType = new javax.swing.JLabel();
        comboBoxCourseSearchType = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCourseSearchBack.setText("Voltar");
        btnCourseSearchBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCourseSearchBackActionPerformed(evt);
            }
        });

        lblCourseSearchName.setText("Nome:");

        lblCourseSearchDescription.setText("Descrição:");

        jScrollPane1.setViewportView(tblCursos);

        btnCourseSearch.setText("Pesquisar");
        btnCourseSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCourseSearchActionPerformed(evt);
            }
        });

        lblCourseSearchPrice.setText("Preço:");

        lblCourseSearchTeacher.setText("Professor:");

        btnCourseSearchHigh.setText("Maior preço");
        btnCourseSearchHigh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCourseSearchHighActionPerformed(evt);
            }
        });

        btnCourseSearchLess.setText("Menor preço");
        btnCourseSearchLess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCourseSearchLessActionPerformed(evt);
            }
        });

        btnCourseSearchMedia.setText("Média dos preços");
        btnCourseSearchMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCourseSearchMediaActionPerformed(evt);
            }
        });

        btnCourseSearchUp.setText("Acima da média dos preços");
        btnCourseSearchUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCourseSearchUpActionPerformed(evt);
            }
        });

        lblCourseSearchType.setText("Tipo de curso:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnCourseSearchBack)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(87, 87, 87)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblCourseSearchDescription)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtCourseSearchDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblCourseSearchName)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtCourseSearchName, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCourseSearchTeacher)
                        .addGap(18, 18, 18)
                        .addComponent(txtCourseSearchTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCourseSearchType)
                            .addComponent(lblCourseSearchPrice))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCourseSearchPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                            .addComponent(comboBoxCourseSearchType, 0, 284, Short.MAX_VALUE)
                            .addComponent(btnCourseSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCourseSearchHigh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCourseSearchLess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCourseSearchMedia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCourseSearchUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnCourseSearchBack)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCourseSearchName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCourseSearchName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCourseSearchDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCourseSearchDescription))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCourseSearchTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCourseSearchTeacher))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCourseSearchPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCourseSearchPrice))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCourseSearchType)
                            .addComponent(comboBoxCourseSearchType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnCourseSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCourseSearchHigh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCourseSearchLess)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCourseSearchMedia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCourseSearchUp))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCourseSearchBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCourseSearchBackActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnCourseSearchBackActionPerformed

    private void btnCourseSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCourseSearchActionPerformed
        Collection<Predicate<Course>> predicates = new ArrayList<>();
        
        if(!txtCourseSearchDescription.getText().equals("")) {
            predicates.add((c) -> c.getDescription().contains(txtCourseSearchDescription.getText()));
        }
        
        if(!txtCourseSearchName.getText().equals("")) {
            predicates.add((c) -> c.getTitle().startsWith(txtCourseSearchName.getText()));
        }
        
        if(!txtCourseSearchPrice.getText().equals("")) {
            double price;
            if((price = Util.testAndGetDoubleField(txtCourseSearchPrice, "preço")) == -1) {
                return;
            }
            predicates.add((c) -> c.getPrice()== price);
        }
        
        if(!txtCourseSearchTeacher.getText().equals("")) {
            predicates.add((c) -> c.getOwner().startsWith(txtCourseSearchTeacher.getText()));
        }
        
        if(!comboBoxCourseSearchType.getSelectedItem().toString().equals("")) {
            predicates.add((c) -> c.getCategory().equals(Course.Category.valueOf(comboBoxCourseSearchType.getSelectedItem().toString())));
        }
        
        
        Collection<Course> result = controller.find(predicates);
        if(result.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum curso encontrado");
        }
        updateTable(result);
    }//GEN-LAST:event_btnCourseSearchActionPerformed

    private void btnCourseSearchHighActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCourseSearchHighActionPerformed
        if(controller.getContainer().iterator().hasNext()) {
            Course maisCaro = controller.getContainer().iterator().next();
            for(Course course : controller.getContainer()) {
                if(course.getPrice() > maisCaro.getPrice()) {
                    maisCaro = course;
                }
            }
            updateTable(Collections.singleton(maisCaro));
            return;
        }
        JOptionPane.showMessageDialog(null, "Nenhum curso cadastrado");
    }//GEN-LAST:event_btnCourseSearchHighActionPerformed

    private void btnCourseSearchUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCourseSearchUpActionPerformed
        Collection<Course> result = controller.find(Collections.singleton((x) -> x.getPrice() > controller.getPriceAverage()));
        if(result.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum curso encontrado");
        } else {
            JOptionPane.showMessageDialog(null, "Cursos com preço acima da média: " + result.size());
        }
        updateTable(result);
    }//GEN-LAST:event_btnCourseSearchUpActionPerformed

    private void btnCourseSearchLessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCourseSearchLessActionPerformed
        if(controller.getContainer().iterator().hasNext()) {
            Course maisBarato = controller.getContainer().iterator().next();
            for(Course course : controller.getContainer()) {
                if(course.getPrice() < maisBarato.getPrice()) {
                    maisBarato = course;
                }
            }
            updateTable(Collections.singleton(maisBarato));
            return;
        }
        JOptionPane.showMessageDialog(null, "Nenhum curso cadastrado");
    }//GEN-LAST:event_btnCourseSearchLessActionPerformed

    private void btnCourseSearchMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCourseSearchMediaActionPerformed
        if(controller.getContainer().isEmpty()) {
           JOptionPane.showMessageDialog(null, "Nenhum curso cadastrado"); 
        }
        JOptionPane.showMessageDialog(null, "Média dos preços: R$ " + controller.getPriceAverage());
    }//GEN-LAST:event_btnCourseSearchMediaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCourseSearch;
    private javax.swing.JButton btnCourseSearchBack;
    private javax.swing.JButton btnCourseSearchHigh;
    private javax.swing.JButton btnCourseSearchLess;
    private javax.swing.JButton btnCourseSearchMedia;
    private javax.swing.JButton btnCourseSearchUp;
    private javax.swing.JComboBox<String> comboBoxCourseSearchType;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCourseSearchDescription;
    private javax.swing.JLabel lblCourseSearchName;
    private javax.swing.JLabel lblCourseSearchPrice;
    private javax.swing.JLabel lblCourseSearchTeacher;
    private javax.swing.JLabel lblCourseSearchType;
    private javax.swing.JTable tblCursos;
    private javax.swing.JTextField txtCourseSearchDescription;
    private javax.swing.JTextField txtCourseSearchName;
    private javax.swing.JTextField txtCourseSearchPrice;
    private javax.swing.JTextField txtCourseSearchTeacher;
    // End of variables declaration//GEN-END:variables
}
