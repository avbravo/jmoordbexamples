/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.jmoordbexamples.entity;

import com.avbravo.jmoordb.anotations.Id;
import com.avbravo.jmoordb.anotations.Referenced;

/**
 *
 * @author avbravo
 */
public class Continentes {
@Id
    private String idcontinente;
    private String continente;
  @Referenced(documment = "Planetas",field = "idplaneta")
    //@Embedded
   Planetas planetas;
  
    public String getIdcontinente() {
        return idcontinente;
    }

    public void setIdcontinente(String idcontinente) {
        this.idcontinente = idcontinente;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public Planetas getPlanetas() {
        return planetas;
    }

    public void setPlanetas(Planetas planetas) {
        this.planetas = planetas;
    }

    
    
}
