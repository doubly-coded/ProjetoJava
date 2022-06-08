/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.victorjuly.cursosonline.view;

/**
 *
 * @author aluno
 */
public class HomeView extends javax.swing.JFrame {

    public HomeView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCostumerRegister = new javax.swing.JButton();
        btnCourseRegister = new javax.swing.JButton();
        btnCourseSearch = new javax.swing.JButton();
        btnCostumerSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCostumerRegister.setText("Gerenciar Clientes");
        btnCostumerRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCostumerRegisterActionPerformed(evt);
            }
        });

        btnCourseRegister.setText("Gerenciar Cursos");
        btnCourseRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCourseRegisterActionPerformed(evt);
            }
        });

        btnCourseSearch.setText("Pesquisar Cursos");
        btnCourseSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCourseSearchActionPerformed(evt);
            }
        });

        btnCostumerSearch.setText("Pesquisar Clientes");
        btnCostumerSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCostumerSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCostumerRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCostumerSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCourseRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCourseSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnCostumerRegister)
                .addGap(18, 18, 18)
                .addComponent(btnCostumerSearch)
                .addGap(18, 18, 18)
                .addComponent(btnCourseRegister)
                .addGap(18, 18, 18)
                .addComponent(btnCourseSearch)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCostumerRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCostumerRegisterActionPerformed
        new CostumerRegisterView().setVisible(true);
    }//GEN-LAST:event_btnCostumerRegisterActionPerformed

    private void btnCourseRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCourseRegisterActionPerformed
        new CourseRegisterView().setVisible(true);
    }//GEN-LAST:event_btnCourseRegisterActionPerformed

    private void btnCourseSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCourseSearchActionPerformed
        new CourseSearchView().setVisible(true);
    }//GEN-LAST:event_btnCourseSearchActionPerformed

    private void btnCostumerSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCostumerSearchActionPerformed
        new CostumerSearchView().setVisible(true);
    }//GEN-LAST:event_btnCostumerSearchActionPerformed

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
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCostumerRegister;
    private javax.swing.JButton btnCostumerSearch;
    private javax.swing.JButton btnCourseRegister;
    private javax.swing.JButton btnCourseSearch;
    // End of variables declaration//GEN-END:variables
}
