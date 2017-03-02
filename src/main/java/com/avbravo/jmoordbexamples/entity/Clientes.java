/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.jmoordbexamples.entity;

import com.avbravo.jmoordb.anotations.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author avbravo
 */
@Getter
@Setter
public class Clientes {

    @Id
    private String cedula;
    private String nombre;
    private String telefono;
    private String celular;
    private String email;
    private String direccion;
    private String provincia;
    private String municipio;
    private String corregimiento;

    public Clientes() {
    }

    public Clientes(String cedula, String nombre, String telefono, String celular, String email, String direccion, String provincia, String municipio, String corregimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.celular = celular;
        this.email = email;
        this.direccion = direccion;
        this.provincia = provincia;
        this.municipio = municipio;
        this.corregimiento = corregimiento;
    }

    @Override
    public String toString() {
        return "Clientes{" + "cedula=" + cedula + ", nombre=" + nombre + ", telefono=" + telefono + ", celular=" + celular + ", email=" + email + ", direccion=" + direccion + ", provincia=" + provincia + ", municipio=" + municipio + ", corregimiento=" + corregimiento + '}';
    }
  
  


}
