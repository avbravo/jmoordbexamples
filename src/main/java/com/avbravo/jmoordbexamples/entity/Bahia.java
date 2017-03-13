/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.jmoordbexamples.entity;


import com.avbravo.jmoordb.anotations.Id;
import com.avbravo.jmoordb.anotations.Referenced;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author avbravo
 */
@Getter
@Setter
public class Bahia  {
    @Id
    private String idbahia;
      @Referenced(documment = "Tipovehiculo", 
           field = "idtipovehiculo", javatype = "String", lazy = false,
            facade = "com.avbravo.jmoordbexamples.ejb.TipovehiculoFacade")
   private Tipovehiculo tipovehiculo;
    private String bahia;
    private String activo;

    public Bahia() {
    }

    public Bahia(String idbahia, String bahia, String activo) {
        this.idbahia = idbahia;
        this.bahia = bahia;
        this.activo = activo;
    }

//    @Override
//    public String toString() {
//        return "Bahia{" + "idbahia=" + idbahia + ", bahia=" + bahia + ", activo=" + activo + '}';
//    }

    @Override
    public String toString() {
        return "Bahia{" + "idbahia=" + idbahia + ", bahia=" + bahia + ", activo=" + activo + ", tipovehiculo=" + tipovehiculo + '}';
    }
  
   

   
}
