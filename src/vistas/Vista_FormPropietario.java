/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import conexion.Conexion;

import inmo_data.PropietarioData;

import t_final_inmobiliaria_g5.Propietario;

import javax.swing.JOptionPane;
/**
 *
 * @author mseba
 */
public class Vista_FormPropietario extends javax.swing.JInternalFrame {

    Conexion conexion;
    
    
    
    public Vista_FormPropietario(Conexion conexion) {
        initComponents();
        this.conexion = conexion;
    }

    
    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        JTdni = new javax.swing.JTextField();
        jLbDni4 = new javax.swing.JLabel();
        JTapellido = new javax.swing.JTextField();
        jLbApellido4 = new javax.swing.JLabel();
        JTnombre = new javax.swing.JTextField();
        jLbNombre4 = new javax.swing.JLabel();
        JTtelefono = new javax.swing.JTextField();
        jLbTelefono4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        JTdomicilio = new javax.swing.JTextField();
        jLbDomicilio = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jB_buscar = new javax.swing.JButton();
        JTapellido1 = new javax.swing.JTextField();
        JTtelefono1 = new javax.swing.JTextField();
        jLbTelefono5 = new javax.swing.JLabel();
        jLbApellido5 = new javax.swing.JLabel();
        JTnombre2 = new javax.swing.JTextField();
        jLbNombre5 = new javax.swing.JLabel();
        jLbDomicilio1 = new javax.swing.JLabel();
        JTnombre3 = new javax.swing.JTextField();
        JTdni1 = new javax.swing.JTextField();
        jLbDni5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tAlumno = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(680, 620));

        JTdni.setBackground(new java.awt.Color(204, 204, 204));
        JTdni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTdni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTdniFocusLost(evt);
            }
        });
        JTdni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTdniActionPerformed(evt);
            }
        });

        jLbDni4.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLbDni4.setText("DNI:");

        JTapellido.setBackground(new java.awt.Color(204, 204, 204));
        JTapellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLbApellido4.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLbApellido4.setText("Apellido: ");

        JTnombre.setBackground(new java.awt.Color(204, 204, 204));
        JTnombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLbNombre4.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLbNombre4.setText("Nombre:");

        JTtelefono.setBackground(new java.awt.Color(204, 204, 204));
        JTtelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTtelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTtelefonoFocusLost(evt);
            }
        });

        jLbTelefono4.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLbTelefono4.setText("Telefono:");

        jButton1.setText("GUARDAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("SALIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        JTdomicilio.setBackground(new java.awt.Color(204, 204, 204));
        JTdomicilio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTdomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTdomicilioActionPerformed(evt);
            }
        });

        jLbDomicilio.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLbDomicilio.setText("Domicilio:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLbApellido4)
                            .addComponent(jLbNombre4)
                            .addComponent(jLbTelefono4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLbDni4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLbDomicilio))
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTdomicilio, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                            .addComponent(JTtelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                            .addComponent(JTapellido)
                            .addComponent(JTnombre)
                            .addComponent(JTdni, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 105, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbDni4)
                    .addComponent(JTdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbTelefono4)
                    .addComponent(JTtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbApellido4)
                    .addComponent(JTapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbNombre4)
                    .addComponent(JTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbDomicilio)
                    .addComponent(JTdomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTabbedPane1.addTab("Cargar Propietario", jPanel1);

        jB_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_buscarActionPerformed(evt);
            }
        });

        JTapellido1.setBackground(new java.awt.Color(204, 204, 204));
        JTapellido1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        JTtelefono1.setBackground(new java.awt.Color(204, 204, 204));
        JTtelefono1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTtelefono1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTtelefono1FocusLost(evt);
            }
        });

        jLbTelefono5.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLbTelefono5.setText("Telefono:");

        jLbApellido5.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLbApellido5.setText("Apellido: ");

        JTnombre2.setBackground(new java.awt.Color(204, 204, 204));
        JTnombre2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLbNombre5.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLbNombre5.setText("Nombre:");

        jLbDomicilio1.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLbDomicilio1.setText("Domicilio:");

        JTnombre3.setBackground(new java.awt.Color(204, 204, 204));
        JTnombre3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        JTdni1.setBackground(new java.awt.Color(204, 204, 204));
        JTdni1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTdni1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTdni1FocusLost(evt);
            }
        });
        JTdni1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTdni1ActionPerformed(evt);
            }
        });

        jLbDni5.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLbDni5.setText("DNI:");

        tAlumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "codPropiedad", "dirección", "zona", "tipo", "superficie", "precio"
            }
        ));
        jScrollPane1.setViewportView(tAlumno);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLbApellido5)
                            .addComponent(jLbNombre5)
                            .addComponent(jLbTelefono5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLbDomicilio1)
                            .addComponent(jLbDni5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTnombre3)
                            .addComponent(JTtelefono1)
                            .addComponent(JTapellido1)
                            .addComponent(JTnombre2, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                            .addComponent(JTdni1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jB_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jB_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLbDni5)
                            .addComponent(JTdni1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbTelefono5)
                    .addComponent(JTtelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbApellido5)
                    .addComponent(JTapellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbNombre5)
                    .addComponent(JTnombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbDomicilio1)
                    .addComponent(JTnombre3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        jTabbedPane1.addTab("Buscar Propietario", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 659, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 555, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Modificar Propietario", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 659, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 555, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Borrar Prop", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    private void JTdniFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTdniFocusLost
        if(JTdni.getText().length()==0){
            JOptionPane.showMessageDialog(this, "DNI no puede quedar vacio");
            JTdni.requestFocus();
        }
        else{
            try {
                int prueba = Integer.parseInt(JTdni.getText());
                JTdni.setText(""+prueba);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "DNI debe ser un numero");
                JTdni.requestFocus();
            }
        }
    }//GEN-LAST:event_JTdniFocusLost

    private void JTdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTdniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTdniActionPerformed

    private void JTtelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTtelefonoFocusLost
        if(JTdni.getText().length()==0){
            JOptionPane.showMessageDialog(this, "Debe ingresar un telefono de contacto");
            JTdni.requestFocus();
        }
        else{
            try {
                int prueba = Integer.parseInt(JTdni.getText());

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "telefono debe ser un numero");
                JTdni.requestFocus();
            }
        }// TODO add your handling code here:
    }//GEN-LAST:event_JTtelefonoFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Propietario prop = new Propietario();
        prop.setApellidoPropietario(JTapellido.getText());
        prop.setDomicilio(JTdomicilio.getText());
        prop.setDNI(Integer.parseInt(JTdni.getText()));
        prop.setNombrePropietario(JTnombre.getText());
        prop.setTelefono(Integer.parseInt(JTtelefono.getText()));
 

        PropietarioData propietarioData = new PropietarioData(conexion);
        propietarioData.cargarPropietario(prop);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jB_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_buscarActionPerformed
        // TODO add your handling code here:              // falta agregar un try para evitar buscar "" vacios
        int leg=-1;
      
    }//GEN-LAST:event_jB_buscarActionPerformed

    private void JTtelefono1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTtelefono1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_JTtelefono1FocusLost

    private void JTdni1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTdni1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_JTdni1FocusLost

    private void JTdni1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTdni1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTdni1ActionPerformed

    private void JTdomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTdomicilioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTdomicilioActionPerformed

    
    

    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTapellido;
    private javax.swing.JTextField JTapellido1;
    private javax.swing.JTextField JTdni;
    private javax.swing.JTextField JTdni1;
    private javax.swing.JTextField JTdomicilio;
    private javax.swing.JTextField JTnombre;
    private javax.swing.JTextField JTnombre2;
    private javax.swing.JTextField JTnombre3;
    private javax.swing.JTextField JTtelefono;
    private javax.swing.JTextField JTtelefono1;
    private javax.swing.JButton jB_buscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLbApellido4;
    private javax.swing.JLabel jLbApellido5;
    private javax.swing.JLabel jLbDni4;
    private javax.swing.JLabel jLbDni5;
    private javax.swing.JLabel jLbDomicilio;
    private javax.swing.JLabel jLbDomicilio1;
    private javax.swing.JLabel jLbNombre4;
    private javax.swing.JLabel jLbNombre5;
    private javax.swing.JLabel jLbTelefono4;
    private javax.swing.JLabel jLbTelefono5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tAlumno;
    // End of variables declaration//GEN-END:variables
}
