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
public class MantenimientoSecciones extends javax.swing.JInternalFrame {

    /**
     * Creates new form MantenimientoSecciones
     */
    public MantenimientoSecciones() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtestatus = new javax.swing.JTextField();
        BTNREGISTRAR = new javax.swing.JButton();
        BTNMODIFICAR = new javax.swing.JButton();
        BTNELIMINAR = new javax.swing.JButton();
        BTNBUSCAR = new javax.swing.JButton();
        Label_status = new javax.swing.JLabel();

        jLabel1.setText("Codigo Seccion");

        jLabel2.setText("Nombre Seccion ");

        jLabel3.setText("Estatus Seccion ");

        BTNREGISTRAR.setText("Registrar");
        BTNREGISTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNREGISTRARActionPerformed(evt);
            }
        });

        BTNMODIFICAR.setText("Modificar");
        BTNMODIFICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNMODIFICARActionPerformed(evt);
            }
        });

        BTNELIMINAR.setText("Eliminar");
        BTNELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNELIMINARActionPerformed(evt);
            }
        });

        BTNBUSCAR.setText("BUSCAR");
        BTNBUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBUSCARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtestatus))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtnombre))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTNREGISTRAR)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(BTNBUSCAR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTNELIMINAR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTNMODIFICAR, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Label_status, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtestatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BTNREGISTRAR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTNMODIFICAR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTNELIMINAR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTNBUSCAR)))
                .addGap(8, 8, 8)
                .addComponent(Label_status)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNREGISTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNREGISTRARActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection conectar = java.sql.DriverManager.getConnection("jdbc:mysql://localhost/siup1","root","");

            java.sql.Connection cn= java.sql.DriverManager.getConnection("jdbc:mysql://localhost/siup1","root","");
            java.sql.PreparedStatement pst = cn.prepareStatement("insert into secciones values(?,?,?,?)");

            pst.setString(1, "0");
            pst.setString(2, txtcodigo.getText().trim());
            pst.setString(3, txtnombre.getText().trim());
            pst.setString(4, txtestatus.getText().trim());

            pst.executeUpdate();

            txtcodigo.setText("");
            txtnombre.setText("");
            txtestatus.setText("");
            

            Label_status.setText("Registro exitoso");

        } catch (Exception e) {

        }
    }//GEN-LAST:event_BTNREGISTRARActionPerformed

    private void BTNMODIFICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNMODIFICARActionPerformed
        // TODO add your handling code here:
        try {
            String ID = txtcodigo.getText().trim();

            java.sql.Connection cn = java.sql.DriverManager.getConnection("jdbc:mysql://localhost/siup1", "root", "");
            PreparedStatement pst = cn.prepareStatement("update secciones set codigo_seccion = ?, nombre_seccion = ?, estatus_seccion = ? where ID = " + txtcodigo);

            pst.setString(1, txtcodigo.getText().trim());
            pst.setString(2, txtnombre.getText().trim());
            pst.setString(3, txtestatus.getText().trim());
            
            
            pst.executeUpdate();

            Label_status.setText("Modificación exitosa.");

        } catch (Exception e) {
        }
    }//GEN-LAST:event_BTNMODIFICARActionPerformed

    private void BTNELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNELIMINARActionPerformed
        // TODO add your handling code here:
        try {
            java.sql.Connection cn = java.sql.DriverManager.getConnection("jdbc:mysql://localhost/siup1", "root", "");
            PreparedStatement pst = cn.prepareStatement("delete from secciones where ID = ?");

            pst.setString(1, txtcodigo.getText().trim());
            pst.executeUpdate();

            txtcodigo.setText("");
            txtnombre.setText("");
            txtestatus.setText("");
         

            Label_status.setText("Registro eliminado.");

        } catch (Exception e) {
        }
    }//GEN-LAST:event_BTNELIMINARActionPerformed

    private void BTNBUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBUSCARActionPerformed
        // TODO add your handling code here:
        try{
            java.sql.Connection cn = java.sql.DriverManager.getConnection("jdbc:mysql://localhost/siup1", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from secciones where ID = ?");
            pst.setString(1, txtcodigo.getText().trim());

            ResultSet rs = pst.executeQuery();

            if(rs.next()){
                txtcodigo.setText(rs.getString("codigo_seccion"));
                txtnombre.setText(rs.getString("nombre_seccion"));
                txtestatus.setText(rs.getString("estatus_seccion"));
                

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
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtestatus;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
