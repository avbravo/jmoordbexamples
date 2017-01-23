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
public class Facturas {

    @Id
    private Integer idfactura;
    private Double ventas;

    public Facturas() {
    }

    public Facturas(Integer idfactura, Double ventas) {
        this.idfactura = idfactura;
        this.ventas = ventas;
    }

    @Override
    public String toString() {
        return "Facturas{" + "idfactura=" + idfactura + ", ventas=" + ventas + '}';
    }

}
