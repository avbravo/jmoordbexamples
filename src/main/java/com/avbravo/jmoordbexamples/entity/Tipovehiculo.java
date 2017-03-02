/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.jmoordbexamples.entity;


import com.avbravo.jmoordb.anotations.Id;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author avbravo
 */
//@Getter
//@Setter
public class Tipovehiculo {
    @Id
    private String idtipovehiculo;
    private String tipo;
    private Date fecha;

    public Tipovehiculo() {
    }

    public Tipovehiculo(String idtipovehiculo, String tipo, Date fecha) {
        this.idtipovehiculo = idtipovehiculo;
        this.tipo = tipo;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Tipovehiculo{" + "idtipovehiculo=" + idtipovehiculo + ", tipo=" + tipo + ", fecha=" + fecha + '}';
    }

    public String getIdtipovehiculo() {
        return idtipovehiculo;
    }

    public void setIdtipovehiculo(String idtipovehiculo) {
        this.idtipovehiculo = idtipovehiculo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
   
}
