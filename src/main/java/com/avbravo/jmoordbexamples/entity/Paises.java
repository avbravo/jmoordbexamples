/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.jmoordbexamples.entity;

import com.avbravo.jmoordb.anotations.Entity;
import com.avbravo.jmoordb.anotations.Id;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author avbravo
 */
@Getter
 @Setter
@Entity(document = "pais") 
public class Paises {
    @Id
    private String siglas;
    private String pais;
    private Date fecha;

//    public String getSiglas() {
//        return siglas;
//    }
//
//    public void setSiglas(String siglas) {
//        this.siglas = siglas;
//    }
//
//    public String getPais() {
//        return pais;
//    }
//
//    public void setPais(String pais) {
//        this.pais = pais;
//    }
//    
    
}
