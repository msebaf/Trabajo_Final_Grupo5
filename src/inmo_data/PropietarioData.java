/*
 */

package inmo_data;

import conexion.Conexion;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import t_final_inmobiliaria_g5.ContratoAlquiler;
import t_final_inmobiliaria_g5.Inquilino;
import t_final_inmobiliaria_g5.Propiedad_Inmueble;
import t_final_inmobiliaria_g5.Propietario;










/**
 *
 * @author mseba
 */
public class PropietarioData {
    
    
    private Connection con = null;
    
    

    
    public PropietarioData(Conexion conexion) {
        
        con = conexion.getConexion();
       
    } 
    
    
    
    
    
    
// CREAR
    public boolean cargarPropietario(Propietario propietario){
        boolean agregar = true;
        String generadorCodigo ="";
        String sql = "INSERT INTO `propietario` (`DNI`, `telefono`, `apellidoPropietario`, `nombrePropietario`, `domicilio`) VALUES (?,?,?,?,?)";
        
        try {
              PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

              ps.setLong(1, propietario.getDNI());
              ps.setInt(2, propietario.getTelefono());
              ps.setString(3, propietario.getApellidoPropietario());
              ps.setString(4, propietario.getNombrePropietario());
              ps.setString(5, propietario.getDomicilio());
              
              ps.executeUpdate();
              ResultSet rs = ps.getGeneratedKeys();
              
           if(rs.next()){
               
                propietario.setIdPropietario(rs.getInt(1));
     
            
           }
           else{
                JOptionPane.showMessageDialog(null,"Error al cargar los datos"); 
                agregar = false;
               }
             ps.close();
           
           JOptionPane.showMessageDialog(null, "Propietario cargado con exito ");
           ps.close();
                      
          } catch (SQLException ex) {
              
                 agregar = false;
                 if(ex instanceof java.sql.SQLIntegrityConstraintViolationException){
                        JOptionPane.showMessageDialog(null, "Ya existe " );
                 }
                 else{
                   JOptionPane.showMessageDialog(null, "Error de sintaxis " + ex);
                }
            }
               
        
        return agregar;  
    }
    
    
    
    
    
    
  /*
    
        
        

    public void listarPropiedades(Propiedad_Inmueble propiedades){
        
    }
        
        
    
    
    
    
    
    
        
        
// LEER
      public Propietario buscarPropietario(){
        
    }
    
        
        
        
      
      
      
      
      
      
 // MODIFICAR     
    public void modificarPropietario(Propietario propietario){
        
    }
        
        
    
    
    
    
    
    
        
// BORRAR
    public void borrarPropietario(Propietario propietario){
        
    }        
        
        
        
        
        
        
        
        
        
        
        
public void borrarPropiedad(Propietario propietario){
        
    }            
        
        
        
        
        
        
        
        
        
        
        */
        
        
    
    
            
} // final clase propietarioData()
