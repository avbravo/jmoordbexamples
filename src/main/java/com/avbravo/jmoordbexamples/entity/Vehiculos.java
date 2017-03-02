/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.jmoordbexamples.entity;

import com.avbravo.jmoordb.anotations.Embedded;
import com.avbravo.jmoordb.anotations.Id;
import com.avbravo.jmoordb.anotations.Referenced;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author avbravo
 */
@Getter
@Setter
public class Vehiculos {

    @Id
    private String placa;

    private String marca;
//    private String modelo;
//    private String motor;
//    private String chasis;
//    private String anio;
//    private String color;
//    private String capacidad;
//    private String combustible;
//    private String uso;
//    private String aseguradora;
//    private String poliza;
//    private String descripcion;
//    private Date fechacompra;
//    private String tiempogarantia;
//    private Integer kmgarantia;
////    @Embedded
////    private Clientes clientes;
//    private Integer kmrecorrido;
//
//    private Date fechaultimomantenimiento;
//
//    private Integer kmproximomantenimiento;
//
//    private Date fechaproximomantenimiento;
    
    @Referenced(documment = "Tipovehiculo", 
           field = "idtipovehiculo", javatype = "String", lazy = false,
            facade = "com.avbravo.jmoordbexamples.ejb.TipovehiculoFacade")
   private Tipovehiculo tipovehiculo;

    public Vehiculos() {
    }

//    @Override
//    public String toString() {
//        return "Vehiculos{" + "placa=" + placa + ", tipovehiculo=" + tipovehiculo + ", marca=" + marca + ", modelo=" + modelo + ", motor=" + motor + ", chasis=" + chasis + ", anio=" + anio + ", color=" + color + ", capacidad=" + capacidad + ", combustible=" + combustible + ", uso=" + uso + ", aseguradora=" + aseguradora + ", poliza=" + poliza + ", descripcion=" + descripcion + ", fechacompra=" + fechacompra + ", tiempogarantia=" + tiempogarantia + ", kmgarantia=" + kmgarantia + ", clientes=" + clientes + ", kmrecorrido=" + kmrecorrido + ", fechaultimomantenimiento=" + fechaultimomantenimiento + ", kmproximomantenimiento=" + kmproximomantenimiento + ", fechaproximomantenimiento=" + fechaproximomantenimiento + '}';
//    }

//    @Override
//    public String toString() {
//        return "Vehiculos{" + "placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", motor=" + motor + ", chasis=" + chasis + ", anio=" + anio + ", color=" + color + ", capacidad=" + capacidad + ", combustible=" + combustible + ", uso=" + uso + ", aseguradora=" + aseguradora + ", poliza=" + poliza + ", descripcion=" + descripcion + ", fechacompra=" + fechacompra + ", tiempogarantia=" + tiempogarantia + ", kmgarantia=" + kmgarantia + ", kmrecorrido=" + kmrecorrido + ", fechaultimomantenimiento=" + fechaultimomantenimiento + ", kmproximomantenimiento=" + kmproximomantenimiento + ", fechaproximomantenimiento=" + fechaproximomantenimiento + ", tipovehiculo=" + tipovehiculo + '}';
//    }

//    @Override
//    public String toString() {
//        return "Vehiculos{" + "placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", motor=" + motor + ", chasis=" + chasis + ", anio=" + anio + ", color=" + color + ", capacidad=" + capacidad + ", combustible=" + combustible + ", uso=" + uso + ", aseguradora=" + aseguradora + ", poliza=" + poliza + ", descripcion=" + descripcion + ", fechacompra=" + fechacompra + ", tiempogarantia=" + tiempogarantia + ", kmgarantia=" + kmgarantia + ", kmrecorrido=" + kmrecorrido + ", fechaultimomantenimiento=" + fechaultimomantenimiento + ", kmproximomantenimiento=" + kmproximomantenimiento + ", fechaproximomantenimiento=" + fechaproximomantenimiento + '}';
//    }

//    @Override
//    public String toString() {
//        return "Vehiculos{" + "placa=" + placa + ", marca=" + marca + '}';
//    }

    @Override
    public String toString() {
        return "Vehiculos{" + "placa=" + placa + ", marca=" + marca + ", tipovehiculo=" + tipovehiculo + '}';
    }

    
    
    
}
