/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmo_data;

/**
 *
 * @author mseba
 */
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import t_final_inmobiliaria_g5.Inquilino;
import t_final_inmobiliaria_g5.Propiedad_Inmueble;


/**
 *
 * @author mseba
 */
public class InquilinoData {
    
    private Connection cn = null;

    public InquilinoData(Conexion conexion) {
        cn = conexion.getConexion();
    }
    
    
 public boolean agregarInquilino(Inquilino inquilino){
     boolean agregar = true;
     
     String sql = "INSERT INTO inquilino(dni, apellido, nombre, cuit, telefono, trabajo,apellidoGarante,nombreGarante,dniGarante,activo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                   
     try {
         PreparedStatement pstm = cn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
         pstm.setLong(1,inquilino.getDni());
         pstm.setString(2,inquilino.getApellido());
         pstm.setString(3,inquilino.getNombre());
         pstm.setLong(4,inquilino.getCuit());
         pstm.setLong(5,inquilino.getTelefono());
         pstm.setString(6,inquilino.getTrabajo());
         pstm.setString(7,inquilino.getApellidoGarante());
         pstm.setString(8,inquilino.getNombreGarante());
         pstm.setLong(9,inquilino.getDniGarante()); 
         pstm.setBoolean(10,inquilino.isEstado());            
         pstm.executeUpdate();
         ResultSet rs = pstm.getGeneratedKeys();
         
         JOptionPane.showMessageDialog(null,"Se cargaron Exitosamente los Datos");
         if(rs.next()){
          inquilino.setIdInquilino(rs.getInt(1));
         }else{
          JOptionPane.showMessageDialog(null,"Error al cargar los Datos"); 
          agregar = false;
         }
         pstm.close();
         
     } catch (SQLException e) {
         agregar = false;
         if(e instanceof java.sql.SQLIntegrityConstraintViolationException){
          JOptionPane.showMessageDialog(null, "Ya existe un paersona con ese dni " );
         }else{
            JOptionPane.showMessageDialog(null, "Error de sintaxis "+e);
         }
     }
     return agregar;     
 }
    
 public boolean bajaInquilino(int idInquilino){
     boolean borrado = false;
     
     String sql = "UPDATE inquilino SET activo = 0 WHERE idInquilino = ?"; // se podria borrar por DNI tambien
     
     try {
         PreparedStatement pstm = cn.prepareStatement(sql);
         pstm.setInt(1,idInquilino);
         
         if(pstm.executeUpdate() != 0){
             borrado= true;
             JOptionPane.showMessageDialog(null,"Cliente Eliminado");
         }
         pstm.close();
         
     } catch (SQLException e) {
         JOptionPane.showMessageDialog(null, "Error revise sintaxis ");
     }
     
     return borrado;
 }
    
   public Inquilino buscarInquilino(long dni){//puede ser que reciba el objto inquilino
    Inquilino inquilino = null; 
    
       try {
           String sql = "SELECT* FROM inquilino WHERE dni =? AND activo = 1";
           PreparedStatement pstm = cn.prepareStatement(sql);
           pstm.setLong(1,dni);
           ResultSet res = pstm.executeQuery();
           
           while(res.next()){
            inquilino = new Inquilino();
            inquilino.setIdInquilino(res.getInt("idInquilino"));
            inquilino.setDni(res.getLong("dni"));
            inquilino.setApellido(res.getString("apellido"));
            inquilino.setNombre(res.getString("nombre"));
            inquilino.setCuit(res.getLong("cuit"));
            inquilino.setTelefono(res.getLong("telefono"));
            inquilino.setTrabajo(res.getString("trabajo"));            
            inquilino.setApellidoGarante(res.getString("apellidoGarante"));
            inquilino.setNombreGarante(res.getString("nombreGarante"));
            inquilino.setDniGarante(res.getLong("dniGarante"));
            inquilino.setEstado(res.getBoolean("activo"));
            
            
            //ver los demas atributos
           }
           pstm.close();
           
       } catch (SQLException e) {
          JOptionPane.showMessageDialog(null,"Error al obtener los datos del cliente");  
       }
    
     return inquilino;
   } 
    
   public boolean modificarInquilino(Inquilino inquilino){
        
    boolean modificado = false;   
       
     String sql = "UPDATE inquilino SET dni= ?, apellido= ? ,nombre= ? ,cuit= ? ,telefono= ? ,trabajo= ?, apellidoGarante= ?, nombreGarante= ?, dniGarante= ?, activo = ? WHERE idInquilino= ?" ;
                 
       try {
           PreparedStatement pstm = cn.prepareStatement(sql);
           
           pstm.setLong(1, inquilino.getDni());
           pstm.setString(2, inquilino.getApellido());
           pstm.setString(3, inquilino.getNombre());
           pstm.setLong(4, inquilino.getCuit());
           pstm.setLong(5, inquilino.getTelefono());
           pstm.setString(6, inquilino.getTrabajo());
           pstm.setString(7, inquilino.getApellidoGarante());
           pstm.setString(8, inquilino.getNombreGarante());
           pstm.setLong(9, inquilino.getDniGarante());
           pstm.setBoolean(10,inquilino.isEstado());  
           pstm.setInt(11, inquilino.getIdInquilino());
           
           if(pstm.executeUpdate()!=0){
               modificado = true;
           }
           pstm.close();           
           
       } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error de sintaxis ");   
       }
      
       return modificado;
   }
   
  public List<Propiedad_Inmueble> obtenerInmuebles(Inquilino inquilino) {
         int idInq = inquilino.getIdInquilino();
         
        ArrayList<Propiedad_Inmueble> pInmuebles = new ArrayList<Propiedad_Inmueble>();

        try {
          
            //String sql = "SELECT * FROM contratoalquiler WHERE idInquilino = ?";
            String sql="SELECT* FROM contratoalquiler, propiedad_inmueble WHERE (contratoalquiler.idPropiedad=propiedad_inmueble.idPropiedad) AND (contratoalquiler.idInquilino ="+idInq+")";
            PreparedStatement pstm = cn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            Propiedad_Inmueble propiedad;
            while(rs.next()){
                propiedad = new Propiedad_Inmueble(); 
                propiedad.setCodigo(rs.getInt("codContrato")+"");
                propiedad.setIdPropiedad(rs.getInt("idPropiedad"));
                propiedad.setDireccion(rs.getString("direccion"));
                 propiedad.setDireccion(rs.getString("tipo"));
            }
          
      } catch (SQLException e) {
       JOptionPane.showMessageDialog(null,"Error al obtenr Inmuebles");
      }
   
   return pInmuebles;
  }
  
  public List listaTodosInquilinos(){
  List<Inquilino> datos = new ArrayList<>();
  String sql = "SELECT * FROM inquilino WHERE activo =1 ";
      try {
         PreparedStatement ps = cn.prepareStatement(sql);
         ResultSet rs = ps.executeQuery();
         while(rs.next()){
            Inquilino inq = new Inquilino(); 
            inq.setIdInquilino(rs.getInt("idInquilino"));//puede ser el numer de la columna
            inq.setDni(rs.getLong("dni"));
            inq.setApellido(rs.getString("apellido"));
            inq.setNombre(rs.getString("nombre"));
            inq.setCuit(rs.getLong("cuit"));
            inq.setTelefono(rs.getLong("telefono"));
            inq.setTrabajo(rs.getString("trabajo"));
            inq.setApellidoGarante(rs.getString("apellidoGarante"));
            inq.setNombreGarante(rs.getString("nombreGarante"));
            inq.setDniGarante(rs.getLong("dniGarante"));
            inq.setEstado(rs.getBoolean("activo"));
            datos.add(inq);
         }
         
      } catch (Exception e) {
      }
  
    return datos; 
  }
  
    public Inquilino obtenerInquilinoXid(int idInq){
     Inquilino inquilino = null;
     String sql = "SELECT * FROM inquilino WHERE idInquilino = ?";
       try {
            
           PreparedStatement pstm = cn.prepareStatement(sql);
           pstm.setInt(1, idInq);
           ResultSet res = pstm.executeQuery();  
           
           while(res.next()){
               
           inquilino = new Inquilino();    
           inquilino.setIdInquilino(res.getInt("idInquilino"));
           inquilino.setDni(res.getLong("dni"));
           inquilino.setApellido(res.getString("apellido"));
           inquilino.setApellido(res.getString("nombre"));
           inquilino.setCuit(res.getLong("cuit"));
           inquilino.setTelefono(res.getLong("telefono"));
           inquilino.setTrabajo(res.getString("trabajo"));            
           inquilino.setApellidoGarante(res.getString("apellidoGarante"));
           inquilino.setNombreGarante(res.getString("nombreGarante"));
           inquilino.setDniGarante(res.getLong("dniGarante"));
           inquilino.setEstado(res.getBoolean("activo"));
       }
           pstm.close();
          
      } catch (Exception e) {
          JOptionPane.showMessageDialog(null,"Error al obtener cliente");
      }
     return inquilino;  
  }
}

