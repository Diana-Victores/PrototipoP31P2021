/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Diana
 */
public class AsignacionCursoAlumno extends javax.swing.JInternalFrame {

    /**
     * Creates new form AsignacionCursoAlumno
     */
    public AsignacionCursoAlumno() {
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

        jLabel1 = new javax.swing.JLabel();
        txtcodigocurso = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BTNREGISTRAR = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        BTNMODIFICAR = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        BTNELIMINAR = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        BTNBUSCAR = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtcodigocarrera = new javax.swing.JTextField();
        txtcodigosede = new javax.swing.JTextField();
        txtcodigojornada = new javax.swing.JTextField();
        txtcodigoseccion = new javax.swing.JTextField();
        txtcodigoaula = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtcarnet = new javax.swing.JTextField();
        txtNotaAlumno = new javax.swing.JTextField();
        Label_status = new javax.swing.JLabel();

        jLabel1.setText("Codigo Carrera");

        jLabel2.setText("Codigo Sede");

        BTNREGISTRAR.setText("Registrar");
        BTNREGISTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNREGISTRARActionPerformed(evt);
            }
        });

        jLabel3.setText("Codigo Jornada");

        BTNMODIFICAR.setText("Modificar");
        BTNMODIFICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNMODIFICARActionPerformed(evt);
            }
        });

        jLabel4.setText("Codigo Seccion");

        BTNELIMINAR.setText("Eliminar");
        BTNELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNELIMINARActionPerformed(evt);
            }
        });

        jLabel5.setText("Codigo Aula");

        BTNBUSCAR.setText("BUSCAR");
        BTNBUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBUSCARActionPerformed(evt);
            }
        });

        jLabel6.setText("Codigo Curso");

        jLabel7.setText("Carnet Alumno ");

        jLabel8.setText("Nota Alumno");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtcodigocarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(20, 20, 20))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtcodigojornada, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(txtcodigoaula)
                            .addComponent(txtcarnet))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel8)
                        .addComponent(jLabel6))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcodigosede, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(txtcodigocurso, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(txtcodigoseccion)
                    .addComponent(txtNotaAlumno))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTNREGISTRAR)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(BTNBUSCAR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BTNELIMINAR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BTNMODIFICAR, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Label_status)
                        .addGap(57, 57, 57))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtcodigocarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txtcodigosede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BTNREGISTRAR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTNMODIFICAR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTNELIMINAR)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(txtcodigoseccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcodigojornada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTNBUSCAR)))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtcodigoaula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcodigocurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(txtcarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNotaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(Label_status)))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNREGISTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNREGISTRARActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection conectar = java.sql.DriverManager.getConnection("jdbc:mysql://localhost/siup1","root","");

            java.sql.Connection cn= java.sql.DriverManager.getConnection("jdbc:mysql://localhost/siup1","root","");
            java.sql.PreparedStatement pst = cn.prepareStatement("insert into asignacioncursosalumnos values(?,?,?,?,?,?,?,?,?)");

            pst.setString(1, "0");
            pst.setString(2, txtcodigocarrera.getText().trim());
            pst.setString(3, txtcodigosede.getText().trim());
            pst.setString(4, txtcodigojornada.getText().trim());
            pst.setString(5, txtcodigoseccion.getText().trim());
            pst.setString(6, txtcodigoaula.getText().trim());
            pst.setString(7, txtcodigocurso.getText().trim());
            pst.setString(8, txtcarnet.getText().trim());
            pst.setString(9, txtNotaAlumno.getText().trim());
            pst.executeUpdate();

            txtcodigocarrera.setText("");
            txtcodigosede.setText("");
            txtcodigojornada.setText("");
            txtcodigoseccion.setText("");
            txtcodigoaula.setText("");
            txtcodigocurso.setText("");
            txtcarnet.setText("");
            txtNotaAlumno.setText("");
            
            Label_status.setText("Registro exitoso");

        } catch (Exception e) {

        }
    }//GEN-LAST:event_BTNREGISTRARActionPerformed

    private void BTNMODIFICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNMODIFICARActionPerformed
        // TODO add your handling code here:
        try {
            String ID = txtcodigocarrera.getText().trim();

            java.sql.Connection cn = java.sql.DriverManager.getConnection("jdbc:mysql://localhost/siup1", "root", "");
            PreparedStatement pst = cn.prepareStatement("update asignacioncursosalumnos set codigo_carrera = ?, codigo_sede = ?, codigo_jornada = ?, codigo_seccion = ?, codigo_aula = ?, codigo_curso = ?, carnet_alumno = ?, nota_asignacioncursoalumnos = ?   where ID = " + txtcodigocarrera);

            pst.setString(1, txtcodigocarrera.getText().trim());
            pst.setString(2, txtcodigosede.getText().trim());
            pst.setString(3, txtcodigojornada.getText().trim());
            pst.setString(4, txtcodigoseccion.getText().trim());
            pst.setString(5, txtcodigoaula.getText().trim());
            pst.setString(6, txtcodigocurso.getText().trim());
             pst.setString(7, txtcarnet.getText().trim());
            pst.setString(8, txtNotaAlumno.getText().trim());
            pst.executeUpdate();

            Label_status.setText("Modificación exitosa.");

        } catch (Exception e) {
        }
    }//GEN-LAST:event_BTNMODIFICARActionPerformed

    private void BTNELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNELIMINARActionPerformed
        // TODO add your handling code here:
        try {
            java.sql.Connection cn = java.sql.DriverManager.getConnection("jdbc:mysql://localhost/siup1", "root", "");
            PreparedStatement pst = cn.prepareStatement("delete from asignacioncursosalumnos where ID = ?");

            pst.setString(1, txtcodigocarrera.getText().trim());
            pst.executeUpdate();

           txtcodigocarrera.setText("");
            txtcodigosede.setText("");
            txtcodigojornada.setText("");
            txtcodigoseccion.setText("");
            txtcodigoaula.setText("");
            txtcodigocurso.setText("");
            txtcarnet.setText("");
            txtNotaAlumno.setText("");

            Label_status.setText("Registro eliminado.");

        } catch (Exception e) {
        }
    }//GEN-LAST:event_BTNELIMINARActionPerformed

    private void BTNBUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBUSCARActionPerformed
        // TODO add your handling code here:
        try{
            java.sql.Connection cn = java.sql.DriverManager.getConnection("jdbc:mysql://localhost/siup1", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from asignacioncursosalumnos where ID = ?");
            pst.setString(1, txtcodigocarrera.getText().trim());

            ResultSet rs = pst.executeQuery();

            if(rs.next()){
                txtcodigocarrera.setText(rs.getString("codigo_carrera"));
                txtcodigosede.setText(rs.getString("codigo_sede"));
                txtcodigojornada.setText(rs.getString("codigo_jornada"));
                txtcodigoseccion.setText(rs.getString("codigo_seccion"));
                txtcodigoaula.setText(rs.getString("codigo_aula"));
                txtcodigocurso.setText(rs.getString("codigo_curso"));
                txtcarnet.setText(rs.getString("carnet_alumno"));
                 txtcarnet.setText(rs.getString("nota_asignacioncursoalumnos"));
            } else {
                JOptionPane.showMessageDialog(null, "Persona no registrada.");
            }

        }catch (Exception e){

        }
    }//GEN-LAST:event_BTNBUSCARActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNBUSCAR;
    private javax.swing.JButton BTNELIMINAR;
    private javax.swing.JButton BTNMODIFICAR;
    private javax.swing.JButton BTNREGISTRAR;
    private javax.swing.JLabel Label_status;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtNotaAlumno;
    private javax.swing.JTextField txtcarnet;
    private javax.swing.JTextField txtcodigoaula;
    private javax.swing.JTextField txtcodigocarrera;
    private javax.swing.JTextField txtcodigocurso;
    private javax.swing.JTextField txtcodigojornada;
    private javax.swing.JTextField txtcodigoseccion;
    private javax.swing.JTextField txtcodigosede;
    // End of variables declaration//GEN-END:variables
}