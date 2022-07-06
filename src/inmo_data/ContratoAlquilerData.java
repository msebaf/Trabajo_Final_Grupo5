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
        LocalDate date = LocalDate.of(2018, 10, 30);
         LocalDate date2 = LocalDate.of(2020, 10, 30);
       Date inicio =  Date.valueOf(date); 
       Date finContrato = Date.valueOf(date2);
       String sql = "INSERT INTO `contratoalquiler`(`vendedor`, `idPropiedad;`, `idInquilino`, `fecha_Inicio`, `fecha_Final`, `vigente`) VALUES (?,?,?,?,?,?)";
          try {
              PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
              ps.setString(1, "Jhony");
              ps.setInt(2, contrato.getPropiedad().getIdPropiedad());
              ps.setInt(3, contrato.getInquilino().getIdInquilino());
              ps.setDate(4, inicio);
              ps.setDate(5, finContrato);
              ps.setBoolean(6, (finContrato.after(inicio) || finContrato.equals(inicio)));
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
   
          public void rescindirContrato(String codigoCont){
            LocalDate date = LocalDate.of(2000, 01, 01);
           
            Date fFinal = Date.valueOf(date);
            codigoCont.toUpperCase();
            String sql ="UPDATE `contratoalquiler` SET `fecha_Final` = '1955-01-01', `vigente` = '0' WHERE codContrato =\""+codigoCont+"\"";
            PreparedStatement ps;
          try {
              ps = con.prepareStatement(sql);
              ps.executeUpdate();
          } catch (SQLException ex) {
              Logger.getLogger(ContratoAlquilerData.class.getName()).log(Level.SEVERE, null, ex);
          }
            
          }
          
          
          
           public ArrayList mostrarContratos(){
              ArrayList<ContratoAlquiler> contratos = new ArrayList<>();
              Propiedad_Inmueble prop;
              Conexion conexion = new Conexion();   
              Propiedad_Inmueble_Data cn = new Propiedad_Inmueble_Data(conexion);
              
              
              
              String sql = "SELECT * FROM `contratoalquiler` ";
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
           
         public ArrayList mostrarContratosPorPropietario(int idPropietario){
              ArrayList<ContratoAlquiler> contratos = new ArrayList<>();
              Propiedad_Inmueble prop;
              Conexion conexion = new Conexion();   
              Propiedad_Inmueble_Data cn = new Propiedad_Inmueble_Data(conexion);
              
              
              
              String sql = "SELECT * FROM `contratoalquiler` ";
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
                
                 if(contrato.getPropiedad().getPropietario().getIdPropietario()==idPropietario){
                 contratos.add(contrato);
                 }
            }
              } catch (SQLException ex) {
            Logger.getLogger(Propiedad_Inmueble_Data.class.getName()).log(Level.SEVERE, null, ex);
        }
              
              return contratos;
              
          }
           
         
         
         public ArrayList mostrarContratosPorInquilino(int idInquilino){
              ArrayList<ContratoAlquiler> contratos = new ArrayList<>();
              Propiedad_Inmueble prop;
              Conexion conexion = new Conexion();   
              Propiedad_Inmueble_Data cn = new Propiedad_Inmueble_Data(conexion);
              
              
              
              String sql = "SELECT * FROM `contratoalquiler` ";
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
            
                 if(contrato.getInquilino().getIdInquilino()==idInquilino){
                 contratos.add(contrato);
                 }
            }
              } catch (SQLException ex) {
            Logger.getLogger(Propiedad_Inmueble_Data.class.getName()).log(Level.SEVERE, null, ex);
        }
              
              return contratos;
              
          }
          
          public ArrayList buscarContratosPorInmueble(int idPropiedad){
              ArrayList<ContratoAlquiler> contratos = new ArrayList<>();
              Propiedad_Inmueble prop;
              Conexion conexion = new Conexion();   
              Propiedad_Inmueble_Data cn = new Propiedad_Inmueble_Data(conexion);
              prop= cn.buscarInmPorId(idPropiedad);
              
              
              String sql = "SELECT * FROM `contratoalquiler` WHERE `idPropiedad` =" + idPropiedad;
              try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                ContratoAlquiler contrato = new ContratoAlquiler();
                contrato.setCodContrato(rs.getString("codContrato"));
                contrato.setInquilino(new Inquilino()); // completar despues con inquilino
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
              
              
              
              String sql = "SELECT * FROM `contratoalquiler` WHERE vigente = 1 ";
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
