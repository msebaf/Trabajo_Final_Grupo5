/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t_final_inmobiliaria_g5;

import java.util.ArrayList;

/**
 *
 * @author saimon
 */
public class Inquilino {
    
    private int idInquilino;   
    private long dni;
    private String apellido;
    private String nombre;
    private long cuit;
    private long telefono;  
    private String trabajo;
    private String apellidoGarante;
    private String nombreGarante;
    private long dniGarante; 
    private boolean estado;
    public ArrayList<Propiedad_Inmueble> inmuebles;

    public Inquilino() {
    }

    public Inquilino(int idInquilino, long dni, String apellido, String nombre, long cuit, long telefono, String trabajo, String apellidoGarante, String nombreGarante, long dniGarante, boolean estado) {
        this.idInquilino = idInquilino;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.cuit = cuit;
        this.telefono = telefono;
        this.trabajo = trabajo;
        this.apellidoGarante = apellidoGarante;
        this.nombreGarante = nombreGarante;
        this.dniGarante = dniGarante;
        this.estado = estado;
    }

    public Inquilino(long dni, String apellido, String nombre, long cuit, long telefono, String trabajo, String apellidoGarante, String nombreGarante, long dniGarante, boolean estado) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.cuit = cuit;
        this.telefono = telefono;
        this.trabajo = trabajo;
        this.apellidoGarante = apellidoGarante;
        this.nombreGarante = nombreGarante;
        this.dniGarante = dniGarante;
        this.estado = estado;
    }

    public Inquilino(int idInquilino, long dni, String apellido, String nombre, long cuit, long telefono, String trabajo, String apellidoGarante, String nombreGarante, long dniGarante, boolean estado, ArrayList<Propiedad_Inmueble> inmuebles) {
        this.idInquilino = idInquilino;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.cuit = cuit;
        this.telefono = telefono;
        this.trabajo = trabajo;
        this.apellidoGarante = apellidoGarante;
        this.nombreGarante = nombreGarante;
        this.dniGarante = dniGarante;
        this.estado = estado;
        this.inmuebles = inmuebles;
    }

    public int getIdInquilino() {
        return idInquilino;
    }

    public void setIdInquilino(int idInquilino) {
        this.idInquilino = idInquilino;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public String getApellidoGarante() {
        return apellidoGarante;
    }

    public void setApellidoGarante(String apellidoGarante) {
        this.apellidoGarante = apellidoGarante;
    }

    public String getNombreGarante() {
        return nombreGarante;
    }

    public void setNombreGarante(String nombreGarante) {
        this.nombreGarante = nombreGarante;
    }

    public long getDniGarante() {
        return dniGarante;
    }

    public void setDniGarante(long dniGarante) {
        this.dniGarante = dniGarante;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public ArrayList<Propiedad_Inmueble> getInmuebles() {
        return inmuebles;
    }

    public void setInmuebles(ArrayList<Propiedad_Inmueble> inmuebles) {
        this.inmuebles = inmuebles;
    }

   
    

  
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.idInquilino;
        hash = 17 * hash + (int) (this.dni ^ (this.dni >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Inquilino other = (Inquilino) obj;
        if (this.idInquilino != other.idInquilino) {
            return false;
        }
        if (this.dni != other.dni) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return idInquilino + "," + dni + "," + apellido + "," + nombre;
    }

      
   
   
    
    
    
}
