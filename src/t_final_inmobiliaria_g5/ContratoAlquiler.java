/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t_final_inmobiliaria_g5;

import java.time.LocalDate;

/**
 *
 * @author mseba
 */
public class ContratoAlquiler {
    private int idContrato;
    private String codContrato;
    private String vendedor;
    public Propiedad_Inmueble propiedad;
    public Inquilino inquilino;
    private LocalDate fecha_Inicio;
    private LocalDate fecha_Final;
        
    
    public ContratoAlquiler(String codContrato, String vendedor, Propiedad_Inmueble propiedad, Inquilino inquilino, LocalDate fecha_Inicio, LocalDate fecha_Final) {
        this.codContrato = codContrato;
        this.vendedor = vendedor;
        this.propiedad = propiedad;
        this.inquilino = inquilino;
        this.fecha_Inicio = fecha_Inicio;
       this.fecha_Final = fecha_Final;
      
    }

    public ContratoAlquiler(String vendedor, Propiedad_Inmueble propiedad, Inquilino inquilino, LocalDate fecha_Inicio, LocalDate fecha_Final) {
        this.vendedor = vendedor;
        this.propiedad = propiedad;
        this.inquilino = inquilino;
        this.fecha_Inicio = fecha_Inicio;
        this.fecha_Final = fecha_Final;
    
    }

    public ContratoAlquiler() {
    }

    public String getCodContrato() {
        return codContrato;
    }

    public void setCodContrato(String codContrato) {
        this.codContrato = codContrato;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

   public Propiedad_Inmueble getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(Propiedad_Inmueble propiedad) {
        this.propiedad = propiedad;
    }

    public Inquilino getInquilino() {
        return inquilino;
    }

    public void setInquilino(Inquilino inquilino) {
        this.inquilino = inquilino;
    }

    public LocalDate getFecha_Inicio() {
        return fecha_Inicio;
    }

    public void setFecha_Inicio(LocalDate fecha_Inicio) {
        this.fecha_Inicio = fecha_Inicio;
    }

    public LocalDate getFecha_Final() {
        return fecha_Final;
    }

    public void setFecha_Final(LocalDate fecha_Final) {
        this.fecha_Final = fecha_Final;
    }

    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

   
   
    
    
}
