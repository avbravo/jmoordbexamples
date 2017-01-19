/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.jmoordbexamples.entity;

import com.avbravo.jmoordb.anotations.DatePattern;
import com.avbravo.jmoordb.anotations.Entity;
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
public class Continentes {

    @Id
    private String idcontinente;
    @DatePattern()
    private String continente;
    @Referenced(documment = "Planetas",field = "idplaneta",lazy=true,facade = "com.avbravo.jmoordbexamples.ejb.PlanetasFacade")
    private Planetas planetas;

    @Override
    public String toString() {
        return "Continentes{" + "idcontinente=" + idcontinente + ", continente=" + continente + ", planetas=" + planetas + '}';
    }

}
