/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.jmoordbexamples.start;

import com.avbravo.jmoordbexamples.ejb.ContinentesFacade;
import com.avbravo.jmoordbexamples.ejb.PaisesFacade;
import com.avbravo.jmoordbexamples.ejb.PlanetasFacade;
import com.avbravo.jmoordbexamples.entity.Continentes;
import com.avbravo.jmoordbexamples.entity.Paises;
import com.avbravo.jmoordbexamples.entity.Planetas;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author avbravo
 */
public class TestJmoordb {

    ContinentesFacade continentesFacade = new ContinentesFacade();
    PlanetasFacade planetasFacade = new PlanetasFacade();
    PaisesFacade paisesFacade = new PaisesFacade();

    Continentes continentes = new Continentes();
    Planetas planetas = new Planetas();
    Paises paises = new Paises();

    public void ejecutar() {
        try {
            savePlanetas();
            saveContinentes();
         //   savePaises();

            //System.out.println("--->toString() "+ paisesFacade.getDocument(paises).toString());
        } catch (Exception e) {
            System.out.println("main() Error() " + e.getLocalizedMessage());
        }
    }

    private Boolean savePaises() {
        try {

            paises.setSiglas("fr");
            paises.setPais("Francia");
            paises.setFecha(new Date());
            if (paisesFacade.save(paises)) {
                System.out.println("########################################");
                System.out.println("guardado el pais");
                System.out.println("########################################");
            } else {
                System.out.println("no se guardo");
            }

           // System.out.println("--->toString() " + paisesFacade.getDocument(paises).toString());
        } catch (Exception e) {
            System.out.println("main() Error() " + e.getLocalizedMessage());
        }
        return false;
    }

    private Planetas savePlanetas() {

        try {

            planetas.setIdplaneta("tierra");
            planetas.setPlaneta("Tierra");
            planetas.setFecha(new Date());
//            if (planetasFacade.save(planetas)) {
//                System.out.println("########################################");
//                System.out.println("guardado planeta");
//                System.out.println("########################################");
//            } else {
//                System.out.println("no se guardo");
//            }

            //   System.out.println("--->toString() "+ paisesFacade.getDocument(paises).toString());
        } catch (Exception e) {
            System.out.println("main() Error() " + e.getLocalizedMessage());
        }
        return planetas;
    }

    private Boolean saveContinentes() {
        try {

            continentes.setIdcontinente("am");
            continentes.setContinente("America");
            
            Planetas p1 = new Planetas("tr", "Tierra",   new Date());
            Planetas p2 = new Planetas("mr", "Marte",   new Date());
            Planetas p3= new Planetas("jp", "Jupiter",   new Date());
            List<Planetas> l = new ArrayList<>();
            l.add(p1);
            l.add(p2);
            l.add(p3);
            
            
            List<String> l1 = new ArrayList<>();
            l1.add("Uno");
            l1.add("Dos");
            l1.add("Tres");
//          continentes.setGente(l1);
//            continentes.setPlanetas(p1);
            continentes.setPlanetas(l);
            if (continentesFacade.save(continentes)) {
              
                System.out.println("guardado continente");
                System.out.println("########################################");
            } else {
                System.out.println("no se guardo");
            }
            //   System.out.println("--->toString() "+ paisesFacade.getDocument(paises).toString());
        } catch (Exception e) {
            System.out.println("main() Error() " + e.getLocalizedMessage());
        }
        return false;
    }
}
