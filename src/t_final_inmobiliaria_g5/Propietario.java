/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t_final_inmobiliaria_g5;

import java.util.ArrayList;

/**
 *
 * @author mseba
 */
public class Propietario {
   private int idPropietario;
   private long DNI;
   private long telefono;
   private String apellidoPropietario;
   private String nombrePropietario;
   private String domicilio;
   private boolean estado;
   public ArrayList<Propiedad_Inmueble> propiedades;

    public Propietario(int idPropietario, long DNI, long telefono, String apellidoPropietario, String nombrePropietario, String domicilio, boolean estado, ArrayList<Propiedad_Inmueble> propiedades) {
        this.idPropietario = idPropietario;
        this.DNI = DNI;
        this.telefono = telefono;
        this.apellidoPropietario = apellidoPropietario;
        this.nombrePropietario = nombrePropietario;
        this.domicilio = domicilio;
        this.estado = estado;
        this.propiedades = propiedades;
    }

    public Propietario(long DNI, long telefono, String apellidoPropietario, String nombrePropietario, String domicilio, boolean estado, ArrayList<Propiedad_Inmueble> propiedades) {
        this.DNI = DNI;
        this.telefono = telefono;
        this.apellidoPropietario = apellidoPropietario;
        this.nombrePropietario = nombrePropietario;
        this.domicilio = domicilio;
        this.estado = estado;
        this.propiedades = propiedades;
    }

    public Propietario(int idPropietario, long DNI, long telefono, String apellidoPropietario, String nombrePropietario, String domicilio, boolean estado) {
        this.idPropietario = idPropietario;
        this.DNI = DNI;
        this.telefono = telefono;
        this.apellidoPropietario = apellidoPropietario;
        this.nombrePropietario = nombrePropietario;
        this.domicilio = domicilio;
        this.estado = estado;
    }


    public Propietario() {
    }

    public int getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(int idPropietario) {
        this.idPropietario = idPropietario;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getApellidoPropietario() {
        return apellidoPropietario;
    }

    public void setApellidoPropietario(String apellidoPropietario) {
        this.apellidoPropietario = apellidoPropietario;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public ArrayList<Propiedad_Inmueble> getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(ArrayList<Propiedad_Inmueble> propiedades) {
        this.propiedades = propiedades;
    }

    

    @Override
    public String toString() {
        return  DNI + "," + apellidoPropietario + "," + nombrePropietario ;
    }

  
    
}
