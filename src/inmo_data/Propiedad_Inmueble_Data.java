/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmo_data;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import t_final_inmobiliaria_g5.Propiedad_Inmueble;
import vistas.Vista_FormPropiedad;

/**
 *
 * @author mseba
 */
public class Propiedad_Inmueble_Data {
    
    private Connection con = null;
    
    
    
    
    public Propiedad_Inmueble_Data(Conexion conexion){
        con = conexion.getConexion();
    }
    
    public void cargarInmueble(Propiedad_Inmueble propiedad, int dniPropietario){
        boolean existePropietario=false;
        String sql;
        int idProp=0;
        String generadorCodigo = propiedad.getTipo();
         
          
           
        try{
            sql = "SELECT * FROM propietario WHERE dni = " + dniPropietario;
          PreparedStatement ps = con.prepareStatement(sql);
          ResultSet re = ps.executeQuery();
          if (re.next()){
              idProp = re.getInt("idPropietario");
          existePropietario= true;
          }else{
             
               JOptionPane.showMessageDialog(null, "El propietario no se encuentra en la base de datos. Debe Cargar el propietario");
          }
        }catch(SQLException ex){
              JOptionPane.showMessageDialog(null, "error");
        }
        
        if(existePropietario){
       sql = "INSERT INTO propiedad_inmueble (direccion, zona, tipo, superficie, precio, idPropietario )  VALUES (?, ?, ?, ?,?,?)";
        try {
          
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, propiedad.getDireccion());
            ps.setString(2, propiedad.getZona());
            ps.setString(3, propiedad.getTipo());
            ps.setDouble(4, propiedad.getSuperficie());
            ps.setDouble(5, propiedad.getPrecio());
            ps.setInt(6, idProp);
          
           ps.executeUpdate();
           ResultSet rs = ps.getGeneratedKeys();
           if(rs.next()){
               int id= rs.getInt("idPropiedad");
              generadorCodigo += id;
              propiedad.setIdPropiedad(id); //para pruebas de escritorio
           sql ="UPDATE `propiedad_inmueble` SET `codigo`='" +generadorCodigo +"' WHERE `idPropiedad`="+id ;
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
           }
           JOptionPane.showMessageDialog(null, "Propiedad cargada con exito con el codigo : "+ generadorCodigo);
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Propiedad_Inmueble_Data.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        }
        
    }
      /*  
        public ArrayList<Propiedad_Inmueble> buscarInmDisponibles(){
            ArrayList<Propiedad_Inmueble> disponibles = new ArrayList<>();
            
             String sql = "SELECT * FROM propiedad_inmueble WHERE disponible = true  " ;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Propiedad_Inmueble prop = new Propiedad_Inmueble();
                prop.setDireccion(rs.getString("direccion"));
              
                prop.setIdPropiedad(rs.getInt("idPropiedad"));
                prop.setPrecio(rs.getDouble("precio"));
               // prop.setPropietario(buscarPropietarioPorID(rs.getInt("idPropietario")));
                prop.setSuperficie(rs.getDouble("superficie"));
                prop.setTipo(rs.getString("tipo"));
                prop.setZona(rs.getString("zona"));
                prop.setCodigo(rs.getString("codigo"));
                disponibles.add(prop);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(Propiedad_Inmueble_Data.class.getName()).log(Level.SEVERE, null, ex);
        }
             
            
            
            return disponibles;
        }*/
        
        public ArrayList<Propiedad_Inmueble> buscarInmPorCaract(String uso, String zona, String supMinima, String precioMaximo){
            ArrayList<Propiedad_Inmueble> disponibles = new ArrayList<>();
            try {
                Double.parseDouble(supMinima);
            } catch (NumberFormatException ex ) {
                supMinima ="0";
            }
            try {
                Double.parseDouble(precioMaximo);
            } catch (NumberFormatException ex ) {
                precioMaximo ="999999999999999999999999999";
            }
            
             String sql = "SELECT * FROM propiedad_inmueble WHERE zona = \""+zona+"\" AND tipo = \""+uso+"\" AND superficie > "+supMinima+ " AND precio < "+ precioMaximo ;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Propiedad_Inmueble prop = new Propiedad_Inmueble();
                prop.setDireccion(rs.getString("direccion"));
               
                prop.setIdPropiedad(rs.getInt("idPropiedad"));
                prop.setPrecio(rs.getDouble("precio"));
               // prop.setPropietario(buscarPropietarioPorID(rs.getInt("idPropietario")));
                prop.setSuperficie(rs.getDouble("superficie"));
                prop.setTipo(rs.getString("tipo"));
                prop.setZona(rs.getString("zona"));
                prop.setCodigo(rs.getString("codigo"));
          
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(Propiedad_Inmueble_Data.class.getName()).log(Level.SEVERE, null, ex);
        }
             
            
            
            return disponibles;
        }
        
        public Propiedad_Inmueble buscarInmPorId(int id){
            Propiedad_Inmueble inm = new Propiedad_Inmueble();
            
             String sql = "SELECT * FROM propiedad_inmueble WHERE idPropiedad = "+id; ;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
               
                inm.setDireccion(rs.getString("direccion"));
                
                inm.setIdPropiedad(rs.getInt("idPropiedad"));
                inm.setPrecio(rs.getDouble("precio"));
               // inm.setPropietario(buscarPropietarioPorID(rs.getInt("idPropietario")));
                inm.setSuperficie(rs.getDouble("superficie"));
                inm.setTipo(rs.getString("tipo"));
                inm.setZona(rs.getString("zona"));
                inm.setCodigo(rs.getString("codigo"));
                
            }
            
            ps.close();
           
        } catch (SQLException ex) {
            Logger.getLogger(Propiedad_Inmueble_Data.class.getName()).log(Level.SEVERE, null, ex);
        }
             
            
             return inm;
           
        }
    }

