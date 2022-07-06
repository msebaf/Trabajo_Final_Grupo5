/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t_final_inmobiliaria_g5;

import conexion.Conexion;
import inmo_data.ContratoAlquilerData;
import inmo_data.Propiedad_Inmueble_Data;
import java.sql.Connection;
import java.util.ArrayList;
import vistas.Menu;

/**
 *
 * @author mseba
 */
public class Inmobiliaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Conexion conexion = new Conexion();          
        Connection cn = conexion.getConexion();  
        
         Propiedad_Inmueble_Data pIm = new Propiedad_Inmueble_Data(conexion);
         ContratoAlquilerData cAd = new ContratoAlquilerData(conexion);
        //
      Propietario propie = new Propietario();
       propie.setDNI(1234);
        
        Propiedad_Inmueble prop = new Propiedad_Inmueble(propie, "Sur","Calle algo", 43.56, "V", 567.56);
        
     
        pIm.cargarInmueble(prop, 1234);

    
    /*   ArrayList<Propiedad_Inmueble> disponibles = new ArrayList<>();
               disponibles = pIm.buscarInmPorCaract("V", "SUR", "1", "800");
               
               for (Propiedad_Inmueble disponible : disponibles) {
                   System.out.println(disponible.getCodigo());
            
        }
    
    
    
     Propietario propie = new Propietario();
        propie.setDNI(1234);
        propie.setIdPropietario(5);
        
     Inquilino juan = new Inquilino();
     juan.setIdInquilino(3);
     
     Propiedad_Inmueble prop = new Propiedad_Inmueble( juan, propie, "Sur", "Algo", 23.5, "C", 345.5, true);  
     pIm.cargarInmueble(prop, 1234);
//     ContratoAlquiler cont = new ContratoAlquiler("pancho",prop, juan);
     ContratoAlquilerData contr = new ContratoAlquilerData(conexion);
   //  contr.firmarContrato(cont);
     contr.rescindirContrato("C08");
     
     //ArrayList<ContratoAlquiler> propr = contr.buscarContratosPorInmueble(41);
     //ArrayList<ContratoAlquiler> propr = contr.mostrarContratos();
     ArrayList<ContratoAlquiler> propr = contr.mostrarVigentes();
     
        for (ContratoAlquiler contratoAlquiler : propr) {
            System.out.println(contratoAlquiler.getCodContrato());
            
        }*/
       
       
    }
    
    
    
}
