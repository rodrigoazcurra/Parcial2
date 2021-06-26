
package ar.edu.unlar.paradigmas3.parcial.ui;

import ar.edu.unlar.paradigmas3.parcial.objeto.Alumno;
import ar.edu.unlar.paradigmas3.parcial.objeto.Aula;
import ar.edu.unlar.paradigmas3.parcial.objeto.Curso;
import ar.edu.unlar.paradigmas3.parcial.objeto.Pantalla.PantallaAlumno;
import ar.edu.unlar.paradigmas3.parcial.objeto.Pantalla.PantallaAula;
import ar.edu.unlar.paradigmas3.parcial.objeto.Pantalla.PantallaCurso;
import ar.edu.unlar.paradigmas3.parcial.objeto.Pantalla.PantallaProfesor;
import ar.edu.unlar.paradigmas3.parcial.objeto.Profesor;
import java.util.ArrayList;

public class Principal extends javax.swing.JFrame {
       
    private ArrayList <Alumno> alumno;
    private ArrayList <Profesor> profesor;
    private ArrayList <Aula> aula;
    private ArrayList <Curso> curso;
    
    private void cargarDatos(){
        
//        alumno = new ArrayList<Alumno>();
//        alumno.add(new Alumno ("Matias Corzo","34567890","ELSI00"));
//       
//        profesor = new ArrayList <Profesor>();
//        profesor.add(new Profesor("Hugo Castro","23456789","EX33"));
//        
//        aula = new ArrayList <Aula>();
//        aula.add(new Aula("206","4"));
//        
//        curso = new ArrayList <Curso>();
//        curso.add(new Curso("2021-06-25","Redes y Comunicaciones2"));
        
    }
    
    
    public Principal() {
        cargarDatos();
        initComponents();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtable = new javax.swing.JTable();
        jbAgregarAl = new javax.swing.JButton();
        jbAgregarPr = new javax.swing.JButton();
        jbAgregarCu = new javax.swing.JButton();
        jbAgregarAu = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtable);

        jbAgregarAl.setText("Agregar Alumno:");
        jbAgregarAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarAlActionPerformed(evt);
            }
        });

        jbAgregarPr.setText("Agregar Profesor:");
        jbAgregarPr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarPrActionPerformed(evt);
            }
        });

        jbAgregarCu.setText("Agregar Curso:");
        jbAgregarCu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarCuActionPerformed(evt);
            }
        });

        jbAgregarAu.setText("Agregar Aula:");
        jbAgregarAu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarAuActionPerformed(evt);
            }
        });

        jbGuardar.setText("GUARDAR");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbAgregarPr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbAgregarAl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbAgregarAu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbAgregarCu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbGuardar)
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jbAgregarAl)
                .addGap(40, 40, 40)
                .addComponent(jbAgregarPr)
                .addGap(44, 44, 44)
                .addComponent(jbAgregarAu)
                .addGap(36, 36, 36)
                .addComponent(jbAgregarCu)
                .addGap(14, 14, 14)
                .addComponent(jbGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAgregarAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarAlActionPerformed
        // TODO add your handling code here:
        PantallaAlumno pAl = new PantallaAlumno();
        pAl.setVisible(true);     
        
    }//GEN-LAST:event_jbAgregarAlActionPerformed

    private void jbAgregarPrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarPrActionPerformed
        // TODO add your handling code here:
        PantallaProfesor pPr = new PantallaProfesor();
        pPr.setVisible(true);
    }//GEN-LAST:event_jbAgregarPrActionPerformed

    private void jbAgregarCuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarCuActionPerformed
        // TODO add your handling code here:
        PantallaCurso pCur = new PantallaCurso();
        pCur.setVisible(true);
    }//GEN-LAST:event_jbAgregarCuActionPerformed

    private void jbAgregarAuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarAuActionPerformed
        // TODO add your handling code here:
        PantallaAula pAu = new PantallaAula();
        pAu.setVisible(true);
    }//GEN-LAST:event_jbAgregarAuActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbGuardarActionPerformed


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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAgregarAl;
    private javax.swing.JButton jbAgregarAu;
    private javax.swing.JButton jbAgregarCu;
    private javax.swing.JButton jbAgregarPr;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JTable jtable;
    // End of variables declaration//GEN-END:variables
}
