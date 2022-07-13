/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmo_data;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.Date;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
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
public class ContratoAlquilerData {
    
      private Connection con = null;

    public ContratoAlquilerData(Conexion conexion) {
        con = conexion.getConexion();
       
       
    }  
      
   public void firmarContrato(ContratoAlquiler contrato){
        String generadorCodigo ="";
        LocalDate date = contrato.getFecha_Inicio();
         LocalDate date2 = contrato.getFecha_Final();
       Date inicio =  Date.valueOf(date); 
       Date finContrato = Date.valueOf(date2);
       String sql = "INSERT INTO `contratoalquiler`(`vendedor`, `idPropiedad`, `idInquilino`, `fecha_Inicio`, `fecha_Final`) VALUES (?,?,?,?,?)";
          try {
              PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
              ps.setString(1, contrato.getVendedor());
              ps.setInt(2, contrato.getPropiedad().getIdPropiedad());
              ps.setInt(3, contrato.getInquilino().getIdInquilino());
              ps.setDate(4, inicio);
              ps.setDate(5, finContrato);
             
              ps.executeUpdate();
           ResultSet rs = ps.getGeneratedKeys();
           if(rs.next()){
               int id= rs.getInt("idContrato");
              generadorCodigo = contrato.getPropiedad().getCodigo() + id;
           sql ="UPDATE `Contratoalquiler` SET `codContrato`='" +generadorCodigo +"' WHERE `idContrato`="+id ;
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
           }
           JOptionPane.showMessageDialog(null, "Contrato cargado con exito con el codigo : "+ generadorCodigo);
            ps.close();
                      
                      } catch (SQLException ex) {
              Logger.getLogger(ContratoAlquilerData.class.getName()).log(Level.SEVERE, null, ex);
          }
       
   }
   
          public void rescindirContrato(ContratoAlquiler contrato){
            LocalDate date = LocalDate.now().minusDays(1);
           
           
            Date fFinal = Date.valueOf(date);
              System.out.println(fFinal.toString());
            
            String sql ="UPDATE `contratoalquiler` SET `fecha_Final` =  \""+ fFinal.toString() +"\" WHERE codContrato =\""+contrato.getCodContrato()+"\"";
            PreparedStatement ps;
          try {
              ps = con.prepareStatement(sql);
              ps.executeUpdate();
              JOptionPane.showMessageDialog(null, "El contrato "+ contrato.getCodContrato()+" se ha rescindido con exito");
          } catch (SQLException ex) {
              Logger.getLogger(ContratoAlquilerData.class.getName()).log(Level.SEVERE, null, ex);
          }
            
          }
          
          public void renovarContrato(ContratoAlquiler contrato, LocalDate nuevoFinal){
              LocalDate fianlAnt = contrato.getFecha_Final();
              if(fianlAnt.isAfter(nuevoFinal) || fianlAnt.isEqual(nuevoFinal)){
                  JOptionPane.showMessageDialog(null, "La nueva fecha debe ser posterior a la fecha final vigente");
              }
              else{
              Date fFinal = Date.valueOf(nuevoFinal);
            
            String sql ="UPDATE `contratoalquiler` SET `fecha_Final` =  \""+ fFinal.toString() +"\" WHERE codContrato =\""+contrato.getCodContrato()+"\"";
            PreparedStatement ps;
          try {
              ps = con.prepareStatement(sql);
              ps.executeUpdate();
              JOptionPane.showMessageDialog(null, "El contrato "+ contrato.getCodContrato()+" se ha rescindido con exito");
          } catch (SQLException ex) {
              Logger.getLogger(ContratoAlquilerData.class.getName()).log(Level.SEVERE, null, ex);
          }
              }
          }
          public ContratoAlquiler buscarContrato(String codContrato){
              ContratoAlquiler contrato = new ContratoAlquiler();
               Conexion conexion = new Conexion();   
              Propiedad_Inmueble_Data cn = new Propiedad_Inmueble_Data(conexion);
              InquilinoData inq = new InquilinoData(conexion);
              String sql = "SELECT * FROM `contratoalquiler` WHERE codContrato = \""+codContrato.toUpperCase()+"\"";
              try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
          
                contrato.setCodContrato(rs.getString("codContrato"));
                contrato.setInquilino(inq.buscarInquilino(rs.getLong("idInquilino"))); 
                contrato.setPropiedad(cn.buscarInmPorId(rs.getInt("idPropiedad")));
                contrato.setVendedor(rs.getString("vendedor"));
                contrato.setFecha_Final(rs.getDate("fecha_Final").toLocalDate());
                 contrato.setFecha_Inicio(rs.getDate("fecha_Inicio").toLocalDate());
                 contrato.setIdContrato(rs.getInt("idContrato"));
              
                
            }
              } catch (SQLException ex) {
            Logger.getLogger(Propiedad_Inmueble_Data.class.getName()).log(Level.SEVERE, null, ex);
        }
              
              return contrato;
              
          }
           
          
          
           public ArrayList mostrarContratos(){
              ArrayList<ContratoAlquiler> contratos = new ArrayList<>();
              Propiedad_Inmueble prop;
              Inquilino inqui;
              Conexion conexion = new Conexion();   
              Propiedad_Inmueble_Data cn = new Propiedad_Inmueble_Data(conexion);
              InquilinoData cni = new InquilinoData(conexion);
              
              
              String sql = "SELECT * FROM `contratoalquiler` ";
              try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                ContratoAlquiler contrato = new ContratoAlquiler();
                contrato.setCodContrato(rs.getString("codContrato"));
                contrato.setInquilino(cni.obtenerInquilinoXid(rs.getInt("idInquilino"))); // completar despues con inquilino
                contrato.setPropiedad(prop= cn.buscarInmPorId(rs.getInt("idPropiedad")));
                contrato.setVendedor(rs.getString("vendedor"));
                contrato.setFecha_Final(rs.getDate("fecha_Final").toLocalDate());
                 contrato.setFecha_Inicio(rs.getDate("fecha_Inicio").toLocalDate());
                 contrato.setIdContrato(rs.getInt("idContrato"));
              
                 contratos.add(contrato);
            }
              } catch (SQLException ex) {
            Logger.getLogger(Propiedad_Inmueble_Data.class.getName()).log(Level.SEVERE, null, ex);
        }
              
              return contratos;
              
          }
           
         public ArrayList mostrarContratosPorPropietario(Propietario propi){
             ArrayList<Propiedad_Inmueble> propiedadeeDelPropietario;
              ArrayList<ContratoAlquiler> contratos = new ArrayList<>();
              ArrayList<ContratoAlquiler> contratosAux;
            
              Conexion conexion = new Conexion();   
              PropietarioData proData = new PropietarioData(conexion);
              propiedadeeDelPropietario = proData.listarPropiedadesDePropietarioPorDni(propi.getDNI());
            
              
              
              for (Propiedad_Inmueble propiedad : propiedadeeDelPropietario) {
                 
               contratosAux = buscarContratosPorInmueble(propiedad);
                 for (ContratoAlquiler contrato : contratosAux) {
                      contratos.add(contrato);
                      
                  }
           
              }
              return contratos;
              
          }
           
         
         
         public ArrayList mostrarContratosPorInquilino(Inquilino inqui){
              ArrayList<ContratoAlquiler> contratos = new ArrayList<>();
              Propiedad_Inmueble prop;
              Conexion conexion = new Conexion();   
              Propiedad_Inmueble_Data cn = new Propiedad_Inmueble_Data(conexion);
              
              
              
              String sql = "SELECT * FROM `contratoalquiler` WHERE idInquilino = " + inqui.getIdInquilino();
              try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                ContratoAlquiler contrato = new ContratoAlquiler();
                contrato.setCodContrato(rs.getString("codContrato"));
                contrato.setInquilino(inqui); 
                contrato.setPropiedad(prop= cn.buscarInmPorId(rs.getInt("idPropiedad")));
                contrato.setVendedor(rs.getString("vendedor"));
                contrato.setFecha_Final(rs.getDate("fecha_Final").toLocalDate());
                 contrato.setFecha_Inicio(rs.getDate("fecha_Inicio").toLocalDate());
                 contrato.setIdContrato(rs.getInt("idContrato"));
            
                 if(contrato.getInquilino().getIdInquilino()==inqui.getIdInquilino()){
                 contratos.add(contrato);
                 }
            }
              } catch (SQLException ex) {
            Logger.getLogger(Propiedad_Inmueble_Data.class.getName()).log(Level.SEVERE, null, ex);
        }
              
              return contratos;
              
          }
          
          public ArrayList buscarContratosPorInmueble(Propiedad_Inmueble prop){
              ArrayList<ContratoAlquiler> contratos = new ArrayList<>();
             
              Conexion conexion = new Conexion();   
              Propiedad_Inmueble_Data cn = new Propiedad_Inmueble_Data(conexion);
              InquilinoData iDAta = new InquilinoData(conexion);
              
              
              String sql = "SELECT * FROM `contratoalquiler` WHERE `idPropiedad` =" + prop.getIdPropiedad();
              try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                ContratoAlquiler contrato = new ContratoAlquiler();
                contrato.setCodContrato(rs.getString("codContrato"));
                contrato.setInquilino(iDAta.obtenerInquilinoXid(rs.getInt("idInquilino")));
                contrato.setPropiedad(prop);
                contrato.setVendedor(rs.getString("vendedor"));
                contrato.setFecha_Final(rs.getDate("fecha_Final").toLocalDate());
                 contrato.setFecha_Inicio(rs.getDate("fecha_Inicio").toLocalDate());
                 contrato.setIdContrato(rs.getInt("idContrato"));
                 
                 contratos.add(contrato);
            }
              } catch (SQLException ex) {
            Logger.getLogger(Propiedad_Inmueble_Data.class.getName()).log(Level.SEVERE, null, ex);
        }
              
              return contratos;
              
          }
          
          
          
          
    
    
          public ArrayList mostrarVigentes(){
              ArrayList<ContratoAlquiler> contratos = new ArrayList<>();
              Propiedad_Inmueble prop;
              Conexion conexion = new Conexion();   
              Propiedad_Inmueble_Data cn = new Propiedad_Inmueble_Data(conexion);
              InquilinoData iDAta = new InquilinoData(conexion);
              
              
              
              String sql = "SELECT * FROM `contratoalquiler` WHERE fecha_Final <  "+ Date.valueOf(LocalDate.now().plusDays(1));
              try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                ContratoAlquiler contrato = new ContratoAlquiler();
                contrato.setCodContrato(rs.getString("codContrato"));
                contrato.setInquilino(iDAta.obtenerInquilinoXid(rs.getInt("idInquilino")));
                contrato.setPropiedad(prop= cn.buscarInmPorId(rs.getInt("idPropiedad")));
                contrato.setVendedor(rs.getString("vendedor"));
                contrato.setFecha_Final(rs.getDate("fecha_Final").toLocalDate());
                 contrato.setFecha_Inicio(rs.getDate("fecha_Inicio").toLocalDate());
                 contrato.setIdContrato(rs.getInt("idContrato"));
               
                 contratos.add(contrato);
            }
              } catch (SQLException ex) {
            Logger.getLogger(Propiedad_Inmueble_Data.class.getName()).log(Level.SEVERE, null, ex);
        }
              
              return contratos;
              
          }
          
        public ArrayList mostrarVencidos(){
              ArrayList<ContratoAlquiler> contratos = new ArrayList<>();
              Propiedad_Inmueble prop;
              Conexion conexion = new Conexion();   
              Propiedad_Inmueble_Data cn = new Propiedad_Inmueble_Data(conexion);
              
              
              
              String sql = "SELECT * FROM `contratoalquiler` WHERE vigente = 0 ";
              try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                ContratoAlquiler contrato = new ContratoAlquiler();
                contrato.setCodContrato(rs.getString("codContrato"));
                contrato.setInquilino(new Inquilino()); // completar despues con inquilino
                contrato.setPropiedad(prop= cn.buscarInmPorId(rs.getInt("idPropiedad")));
                contrato.setVendedor(rs.getString("vendedor"));
                contrato.setFecha_Final(rs.getDate("fecha_Final").toLocalDate());
                 contrato.setFecha_Inicio(rs.getDate("fecha_Inicio").toLocalDate());
                 contrato.setIdContrato(rs.getInt("idContrato"));
                 
                 contratos.add(contrato);
            }
              } catch (SQLException ex) {
            Logger.getLogger(Propiedad_Inmueble_Data.class.getName()).log(Level.SEVERE, null, ex);
        }
              
              return contratos;
              
          }
    
}
