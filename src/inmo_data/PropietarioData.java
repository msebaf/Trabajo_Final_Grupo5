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
import java.util.List;
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
   
        
    
    
    
    
    
    
        
        

     public Propietario buscarPropietario(long dni){
        Propietario prop = new Propietario();
        String sql = "SELECT * FROM propietario WHERE dni = "+ dni ;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                
                prop.setDNI(rs.getInt("DNI"));
               
                prop.setIdPropietario(rs.getInt("idPropietario"));
                prop.setDomicilio(rs.getString("domicilio"));
               
                prop.setApellidoPropietario(rs.getString("apellidoPropietario"));
                prop.setNombrePropietario(rs.getString("nombrePropietario"));
                prop.setTelefono(rs.getInt("telefono"));
                
             
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(Propiedad_Inmueble_Data.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return prop;
    }
    
        
      public Propietario buscarPropietarioPorID(int id){
        Propietario prop = new Propietario();
        String sql = "SELECT * FROM propietario WHERE idPropietario = "+ id ;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                
                prop.setDNI(rs.getInt("DNI"));
               
                prop.setIdPropietario(rs.getInt("idPropietario"));
                prop.setDomicilio(rs.getString("domicilio"));
               
                prop.setApellidoPropietario(rs.getString("apellidoPropietario"));
                prop.setNombrePropietario(rs.getString("nombrePropietario"));
                prop.setTelefono(rs.getInt("telefono"));
                
             
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(Propiedad_Inmueble_Data.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return prop;
    }
        
         
     public ArrayList<Propiedad_Inmueble> listarPropiedadesDePropietarioPorDni(long DNI){

             ArrayList<Propiedad_Inmueble> propie= new ArrayList<>();
            Conexion conexion = new Conexion();
            PropietarioData propd = new PropietarioData(conexion);
            int idProp = propd.buscarPropietario(DNI).getIdPropietario();          
            String sql = "SELECT * FROM propiedad_inmueble WHERE idPropietario = " + idProp;
                        
            try {
                
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();

                while(rs.next()){
                    Propiedad_Inmueble prop = new Propiedad_Inmueble();
                    prop.setIdPropiedad(rs.getInt("idPropiedad"));
                    prop.setDireccion(rs.getString("direccion"));
                    prop.setPrecio(rs.getDouble("precio"));
                    prop.setSuperficie(rs.getDouble("superficie"));
                    prop.setTipo(rs.getString("tipo"));
                    prop.setZona(rs.getString("zona"));
                    prop.setCodigo(rs.getString("codigo"));
                    propie.add(prop);
                }
                ps.close();

            } catch (SQLException ex) {

                Logger.getLogger(Propiedad_Inmueble_Data.class.getName()).log(Level.SEVERE, null, ex);
            }
             
            
            
            return propie;

    		}
          
        
        

         
public List listaTodosPropietarios(){
  List<Propietario> datos = new ArrayList<>();
  String sql = "SELECT * FROM propietario";
      try {
         PreparedStatement ps = con.prepareStatement(sql);
         ResultSet rs = ps.executeQuery();
         while(rs.next()){
            Propietario pro = new Propietario();             
            pro.setIdPropietario(rs.getInt("idPropietario"));
            pro.setDNI(rs.getInt("DNI"));
            pro.setApellidoPropietario(rs.getString("apellidoPropietario"));
            pro.setNombrePropietario(rs.getString("nombrePropietario"));
            pro.setDomicilio(rs.getString("domicilio"));
            datos.add(pro);
         }
         
      } catch (Exception e) {
      }
  
    return datos; 
  }
      
      
      
       /*
      
 // MODIFICAR     
    public void modificarPropietario(Propietario propietario){
        
    }
        
        
    
    
    
    
    
    
        
// BORRAR  // NO HACER ESTE METODOD
    public void borrarPropietario(Propietario propietario){
        
    }        
        
        
        
        
        
        
        
        
        
        
        // NI ESTE
public void borrarPropiedad(Propietario propietario){
        
    }            
        
        
        
        
        
        
        
        
        
        
        */
        
        
    
    
            
} // final clase propietarioData()
