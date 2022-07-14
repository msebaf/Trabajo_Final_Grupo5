/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import conexion.Conexion;
import inmo_data.Propiedad_Inmueble_Data;
import inmo_data.PropietarioData;
import java.awt.Color;
import java.awt.Font;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import t_final_inmobiliaria_g5.Propietario;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import t_final_inmobiliaria_g5.ContratoAlquiler;
import t_final_inmobiliaria_g5.Inquilino;
import t_final_inmobiliaria_g5.Propiedad_Inmueble;
/**
 *
 * @author mseba
 */
public class Vista_FormPropietario extends javax.swing.JInternalFrame {
     private DefaultTableModel modelo; 
     
    Conexion conexion;
    private PropietarioData propietarioData= null;
    private ArrayList<Propietario> listaPropietarios;
     private ArrayList<Propiedad_Inmueble> listaDePropiedades;
    private Propiedad_Inmueble_Data propiedadesData;
   
  
   
    
    public Vista_FormPropietario(Conexion conexion) {
        initComponents();
        modelo = new DefaultTableModel();
        this.conexion = conexion;
        
        this.propietarioData = new PropietarioData(conexion);
        listaPropietarios = (ArrayList)propietarioData.listaTodosPropietarios();
         
        propiedadesData = new Propiedad_Inmueble_Data(conexion);        
        listaDePropiedades = (ArrayList)propiedadesData.mostrarInmuebles();
        
        cargarPropietarios();
        armarCabecera();
        cargaDatos();
       
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
        jBGuardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        JTdomicilio = new javax.swing.JTextField();
        jLbDomicilio = new javax.swing.JLabel();
        jChBActivo = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLbDni6 = new javax.swing.JLabel();
        JTdniModificar = new javax.swing.JTextField();
        JTtelefonoModificar = new javax.swing.JTextField();
        JTapellidoModificar = new javax.swing.JTextField();
        JTnombreModificar = new javax.swing.JTextField();
        JTdomicilioModificar = new javax.swing.JTextField();
        jLbDomicilio2 = new javax.swing.JLabel();
        jLbNombre6 = new javax.swing.JLabel();
        jLbApellido6 = new javax.swing.JLabel();
        jLbTelefono6 = new javax.swing.JLabel();
        jB_buscarModificarP = new javax.swing.JButton();
        jBorrarModicar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTIdModificar = new javax.swing.JTextField();
        jActualizarModicar1 = new javax.swing.JButton();
        jChBActivoMod = new javax.swing.JCheckBox();
        jbLimpiarModificar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jCPropietarios = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablaPropP = new javax.swing.JTable();
        jBSalirLista = new javax.swing.JButton();
        jBImprimir1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
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

        jBGuardar.setText("GUARDAR");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
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

        jChBActivo.setSelected(true);
        jChBActivo.setText("Activo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLbTelefono4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbApellido4)
                    .addComponent(jLbNombre4)
                    .addComponent(jLbDomicilio)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLbDni4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jChBActivo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JTdomicilio)
                            .addComponent(JTnombre)
                            .addComponent(JTdni)
                            .addComponent(JTtelefono)
                            .addComponent(JTapellido))
                        .addGap(213, 213, 213))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLbDomicilio)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLbDni4)
                            .addComponent(JTdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLbTelefono4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(JTtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLbApellido4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(JTapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLbNombre4))
                        .addGap(18, 18, 18)
                        .addComponent(JTdomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(jChBActivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );

        jTabbedPane1.addTab("Cargar Propietario", jPanel1);

        jLbDni6.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLbDni6.setText("DNI:");

        JTdniModificar.setBackground(new java.awt.Color(204, 204, 204));
        JTdniModificar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTdniModificar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTdniModificarFocusLost(evt);
            }
        });

        JTtelefonoModificar.setBackground(new java.awt.Color(204, 204, 204));
        JTtelefonoModificar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTtelefonoModificar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTtelefonoModificarFocusLost(evt);
            }
        });

        JTapellidoModificar.setBackground(new java.awt.Color(204, 204, 204));
        JTapellidoModificar.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        JTnombreModificar.setBackground(new java.awt.Color(204, 204, 204));
        JTnombreModificar.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        JTdomicilioModificar.setBackground(new java.awt.Color(204, 204, 204));
        JTdomicilioModificar.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLbDomicilio2.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLbDomicilio2.setText("Domicilio:");

        jLbNombre6.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLbNombre6.setText("Nombre:");

        jLbApellido6.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLbApellido6.setText("Apellido: ");

        jLbTelefono6.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLbTelefono6.setText("Telefono:");

        jB_buscarModificarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search_find_lupa_21889.png"))); // NOI18N
        jB_buscarModificarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_buscarModificarPActionPerformed(evt);
            }
        });

        jBorrarModicar.setText("BORRAR");
        jBorrarModicar.setEnabled(false);
        jBorrarModicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBorrarModicarActionPerformed(evt);
            }
        });

        jButton4.setText("SALIR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTIdModificar.setToolTipText("Cód Int");

        jActualizarModicar1.setText("ACTUALIZAR");
        jActualizarModicar1.setEnabled(false);
        jActualizarModicar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jActualizarModicar1ActionPerformed(evt);
            }
        });

        jChBActivoMod.setSelected(true);
        jChBActivoMod.setText("Activo");

        jbLimpiarModificar.setText("LIMPIAR CAMPOS");
        jbLimpiarModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jActualizarModicar1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jbLimpiarModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBorrarModicar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLbTelefono6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbDni6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbApellido6)
                    .addComponent(jLbNombre6)
                    .addComponent(jLbDomicilio2))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jChBActivoMod)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTdomicilioModificar)
                            .addComponent(JTtelefonoModificar)
                            .addComponent(JTapellidoModificar)
                            .addComponent(JTnombreModificar)
                            .addComponent(JTdniModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jB_buscarModificarP, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTIdModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLbDni6)
                        .addComponent(JTdniModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jB_buscarModificarP, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbTelefono6)
                    .addComponent(JTtelefonoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbApellido6)
                    .addComponent(JTapellidoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbNombre6)
                    .addComponent(JTnombreModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLbDomicilio2)
                        .addComponent(jTIdModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JTdomicilioModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jChBActivoMod)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBorrarModicar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jActualizarModicar1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLimpiarModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        jTabbedPane1.addTab("Modificar Propietario", jPanel3);

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jLabel1.setText("Propietario");

        jCPropietarios.setToolTipText("");
        jCPropietarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCPropietariosActionPerformed(evt);
            }
        });

        jTablaPropP.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTablaPropP);

        jBSalirLista.setText("SALIR");
        jBSalirLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirListaActionPerformed(evt);
            }
        });

        jBImprimir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Quickprinting_printing_6313.png"))); // NOI18N
        jBImprimir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBImprimir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCPropietarios, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBImprimir1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jBSalirLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCPropietarios, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jBImprimir1)
                        .addGap(94, 94, 94)
                        .addComponent(jBSalirLista, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Lista de Propiedades", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
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
                long prueba = Long.parseLong(JTdni.getText());
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
        if(JTtelefono.getText().length()==0){
            JOptionPane.showMessageDialog(this, "Debe ingresar un telefono de contacto");
            JTtelefono.requestFocus();
        }
        else{
            try {
                long prueba = Long.parseLong(JTtelefono.getText());

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "telefono debe ser un numero");
                JTtelefono.requestFocus();
            }
        }// TODO add your handling code here:
    }//GEN-LAST:event_JTtelefonoFocusLost

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        int validacion =0;
        Propietario prop = new Propietario();
        prop.setDNI(Long.parseLong(JTdni.getText()));
        prop.setTelefono(Long.parseLong(JTtelefono.getText()));
        prop.setApellidoPropietario(JTapellido.getText());
        prop.setNombrePropietario(JTnombre.getText());
        prop.setDomicilio(JTdomicilio.getText());      
        
        prop.setEstado(jChBActivo.isSelected());
        
          if (JTdni.getText().equals("")) {
            JTdni.setBackground(Color.red);
            validacion++;
        } 
            if (JTtelefono.getText().equals("")) {
            JTtelefono.setBackground(Color.red);
            validacion++;
        }  
            
          if (JTapellido.getText().equals("")) {
            JTapellido.setBackground(Color.red);
            validacion++;
        }    
        
         if (JTnombre.getText().equals("")) {
            JTnombre.setBackground(Color.red);
            validacion++;
        }
        
           if (JTdomicilio.getText().equals("")) {
            JTdomicilio.setBackground(Color.red);
            validacion++;
        }
        
         if(validacion == 0 ){
       
        PropietarioData propietarioData = new PropietarioData(conexion);
        propietarioData.cargarPropietario(prop);
        limpiarCamposGuardar();
        
         JTnombre.setBackground(Color.LIGHT_GRAY);
         JTapellido.setBackground(Color.LIGHT_GRAY);
         JTtelefono.setBackground(Color.LIGHT_GRAY);
         JTdomicilio.setBackground(Color.LIGHT_GRAY);
         JTdni.setBackground(Color.LIGHT_GRAY);
        
        }else{
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void JTdomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTdomicilioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTdomicilioActionPerformed

    private void jBSalirListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirListaActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBSalirListaActionPerformed

    private void jCPropietariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCPropietariosActionPerformed
        // TODO add your handling code here:
      cargaDatos();
    }//GEN-LAST:event_jCPropietariosActionPerformed

    private void JTdniModificarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTdniModificarFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_JTdniModificarFocusLost

    private void JTtelefonoModificarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTtelefonoModificarFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_JTtelefonoModificarFocusLost

    private void jB_buscarModificarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_buscarModificarPActionPerformed
        // TODO add your handling code here:
        
        int dniP=-1;
        try {
            dniP = Integer.parseInt(JTdniModificar.getText());
            PropietarioData proM = new PropietarioData(conexion);
            
            Propietario propietarioM = proM.buscarPropietario(dniP);
            if(propietarioM != null){
             jTIdModificar.setText(propietarioM.getIdPropietario()+"");
             JTdniModificar.setText(propietarioM.getDNI()+"");   
             JTtelefonoModificar.setText(propietarioM.getTelefono()+"");
             JTapellidoModificar.setText(propietarioM.getApellidoPropietario());
             JTnombreModificar.setText(propietarioM.getNombrePropietario());
             JTdomicilioModificar.setText(propietarioM.getDomicilio());
             jChBActivoMod.setSelected(propietarioM.isEstado());
             jActualizarModicar1.setEnabled(true);
             jBorrarModicar.setEnabled(true);
             
            }else{
            JOptionPane.showMessageDialog(this,"No existe un Propietario con ese DNI");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"DNI Inválido ");
        }
        
        
        
    }//GEN-LAST:event_jB_buscarModificarPActionPerformed

    private void jBorrarModicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBorrarModicarActionPerformed
        // TODO add your handling code here:
    int id = -1;

            try {
            id = Integer.parseInt(jTIdModificar.getText());
            PropietarioData prodata = new PropietarioData(conexion);
            prodata.borrarPropietario(id);
            limpiarCamposModificar();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Error al borrar");
        }
        
    
        
    }//GEN-LAST:event_jBorrarModicarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jBImprimir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImprimir1ActionPerformed
        // TODO add your handling code here:
        Propietario prop =(Propietario)jCPropietarios.getSelectedItem();
        Document documento = new Document();
        
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/" + prop.getNombrePropietario().trim()+".pdf"));
            
            com.itextpdf.text.Image header = com.itextpdf.text.Image.getInstance("src/image/BannerPDF.jpg");
           header.scaleToFit(650,1000);
           header.setAlignment(Chunk.ALIGN_CENTER);
           
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("información Del Propietario. \n \n");
            parrafo.setFont(FontFactory.getFont("Tahoma", 14, Font.BOLD, BaseColor.DARK_GRAY));
            
            documento.open();
            documento.add(header);
            documento.add(parrafo);
            
            PdfPTable tablaPropietario = new PdfPTable(4);
            tablaPropietario.addCell("CodigoInterno");
            tablaPropietario.addCell("Nombre");
            tablaPropietario.addCell("Apellido");
            tablaPropietario.addCell("Dni"); 
            
            tablaPropietario.addCell(prop.getIdPropietario()+"");
            tablaPropietario.addCell(prop.getNombrePropietario());
            tablaPropietario.addCell(prop.getApellidoPropietario());
            tablaPropietario.addCell(prop.getDNI()+"");            
            documento.add(tablaPropietario);
            
            Paragraph parrafo2 = new Paragraph();
            parrafo2.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo2.add("\n \n Propiedades Inmueble \n\n");
            parrafo2.setFont(FontFactory.getFont("Tahoma",14,Font.BOLD, BaseColor.DARK_GRAY));
            
            documento.add(parrafo2);  
            
            PdfPTable tablaPropiedades = new PdfPTable(4);
            tablaPropiedades.addCell("cod");
            tablaPropiedades.addCell("idPropiedad");           
            tablaPropiedades.addCell("Caracteristica");
            tablaPropiedades.addCell("Dirección");   
            
            
            for(Propiedad_Inmueble p : listaDePropiedades){        

           if(p.getPropietario().getIdPropietario() == prop.getIdPropietario()){
            
            tablaPropiedades.addCell(p.getCodigo());
            tablaPropiedades.addCell(p.getIdPropiedad()+"");
            tablaPropiedades.addCell(p.getTipo());
            tablaPropiedades.addCell(p.getDireccion());            
           }   
          }
            
          documento.add(tablaPropiedades);
          JOptionPane.showMessageDialog(this,"El documento se encuentra en Escritorio");
          documento.close();              
        } catch (Exception e) {
             JOptionPane.showMessageDialog(this,"Error al imprimir el documeto");
        }
        
        
        
        
        
        
    }//GEN-LAST:event_jBImprimir1ActionPerformed

    private void jActualizarModicar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jActualizarModicar1ActionPerformed
        // TODO add your handling code here:
       long dni=-1,tel=-1;
    int idP=-1;
    dni =Integer.parseInt(JTdniModificar.getText().trim());
    tel =Integer.parseInt(JTtelefonoModificar.getText().trim());
    String ape = JTapellidoModificar.getText().trim();
    String nomb = JTnombreModificar.getText().trim();
    String dom = JTdomicilioModificar.getText().trim();
    idP = Integer.parseInt(jTIdModificar.getText().trim());
    boolean activo = jChBActivoMod.isSelected();
    
    Propietario propietario = new Propietario(idP,dni, tel, ape, nomb, dom,activo);
    
    if(propietarioData.modificarPropietario(propietario)){
        JOptionPane.showMessageDialog(this,"Cliente Modifcado Exitosamente");
        limpiarCamposModificar(); 
    }     
        
    }//GEN-LAST:event_jActualizarModicar1ActionPerformed

    private void jbLimpiarModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarModificarActionPerformed
        // TODO add your handling code here:
        limpiarCamposModificar();
        jActualizarModicar1.setEnabled(false);
        jBorrarModicar.setEnabled(false);
    }//GEN-LAST:event_jbLimpiarModificarActionPerformed

        private void armarCabecera() {                
        
        ArrayList<Object> columnas = new ArrayList<Object>();
        columnas.add("codPropiedad");
        columnas.add("idPropiedad");       
        columnas.add("Caracteristica"); 
        columnas.add("Dirección"); 
       columnas.add("zona");
        
        for(Object it : columnas) {
        modelo.addColumn(it);        
        }
        jTablaPropP.setModel(modelo);
        
    }
         private void borraFilasTabla(){
   if(modelo!=null){
       int a =modelo.getRowCount()-1;
           for(int i=a;i>=0;i--){   
                modelo.removeRow(i );
           }
   }
}

private void cargaDatos(){
   borraFilasTabla();
   
   Propietario pro =(Propietario)jCPropietarios.getSelectedItem();
   
  
   for(Propiedad_Inmueble p : listaDePropiedades){    
       
    //System.out.println("ver propietario"+p.toString()); 
   if(p.getPropietario().getIdPropietario() == pro.getIdPropietario()){
      
     modelo.addRow(new Object[]{p.getCodigo(),p.getIdPropiedad(),p.getTipo(),p.getDireccion(),p.getZona()});   
   }
   
   }
   }   

   public void cargarPropietarios(){
   Collections.sort(listaPropietarios, new Comparator<Propietario>() {
       @Override
       public int compare(Propietario o1, Propietario o2) {
          return o1.getApellidoPropietario().compareTo(o2.getApellidoPropietario());
       }
   });
   for(Propietario item: listaPropietarios){
       jCPropietarios.addItem(item);
   }
   
   }
   
        public void limpiarCamposModificar(){
        JTdniModificar.setText("");
        JTtelefonoModificar.setText(""); 
        JTnombreModificar.setText("");
        JTapellidoModificar.setText("");          
        JTdomicilioModificar.setText("");
        jTIdModificar.setText("");
        jChBActivoMod.setSelected(true);
        jActualizarModicar1.setEnabled(false);
        jBorrarModicar.setEnabled(false);
     }
        
         public void limpiarCamposGuardar(){
        JTdni.setText("");
        JTtelefono.setText(""); 
        JTnombre.setText("");
        JTapellido.setText("");          
        JTdomicilio.setText("");
        jTIdModificar.setText("");
        jChBActivo.setSelected(true);      
     }   
     
        
  
   

     
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTapellido;
    private javax.swing.JTextField JTapellidoModificar;
    private javax.swing.JTextField JTdni;
    private javax.swing.JTextField JTdniModificar;
    private javax.swing.JTextField JTdomicilio;
    private javax.swing.JTextField JTdomicilioModificar;
    private javax.swing.JTextField JTnombre;
    private javax.swing.JTextField JTnombreModificar;
    private javax.swing.JTextField JTtelefono;
    private javax.swing.JTextField JTtelefonoModificar;
    private javax.swing.JButton jActualizarModicar1;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBImprimir1;
    private javax.swing.JButton jBSalirLista;
    private javax.swing.JButton jB_buscarModificarP;
    private javax.swing.JButton jBorrarModicar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<Propietario> jCPropietarios;
    private javax.swing.JCheckBox jChBActivo;
    private javax.swing.JCheckBox jChBActivoMod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLbApellido4;
    private javax.swing.JLabel jLbApellido6;
    private javax.swing.JLabel jLbDni4;
    private javax.swing.JLabel jLbDni6;
    private javax.swing.JLabel jLbDomicilio;
    private javax.swing.JLabel jLbDomicilio2;
    private javax.swing.JLabel jLbNombre4;
    private javax.swing.JLabel jLbNombre6;
    private javax.swing.JLabel jLbTelefono4;
    private javax.swing.JLabel jLbTelefono6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTIdModificar;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTablaPropP;
    private javax.swing.JButton jbLimpiarModificar;
    // End of variables declaration//GEN-END:variables
}
