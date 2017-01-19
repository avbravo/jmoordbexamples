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
import java.lang.reflect.Method;
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
            
           // recursivo();
      // savePlanetas();
           // saveContinentes();
            //   savePaises();
// saveContinentes();
buscarContinentes();
        
//           buscarPaises();
            //System.out.println("--->toString() "+ paisesFacade.getDocument(paises).toString());
        } catch (Exception e) {
            System.out.println("main() " + e.getLocalizedMessage());
        }
    }

    
    private void recursivo(){
        try {
              System.out.println("-----------------------------------------------");
                        Class cls = Class.forName("com.avbravo.jmoordbexamples.ejb.PlanetasFacade");
                        Object obj = cls.newInstance();
                        System.out.println("paso 2");
                        Method method;
                       Class[] paramString = new Class[2];
                        paramString[0] = String.class;
                        paramString[1] = String.class;
                       method = cls.getDeclaredMethod("find2",  paramString);
   //                  
                        String[] param = {"idplaneta", "tierra"};
                       
                     Planetas  v= (Planetas)  method.invoke(obj, param);
                        System.out.println("V "+v.toString());
        } catch (Exception e) {
            System.out.println("Recursivo "+e.getMessage());
        }
    }
    private void buscarPaises(){
         Planetas p1 = planetasFacade.find("idplaneta", "tierra");
            if(p1 == null){
                System.out.println("No hay un planeta con ese codigo");
            }else
            {
                System.out.println(""+p1.toString());
            }
            
    }
    private void buscarContinentes(){
         Continentes c = continentesFacade.find("idcontinente", "eu");
            if(c == null){
                System.out.println("No hay un continente con ese codigo");
            }else
            {
                System.out.println(""+c.toString());
                for(Planetas p:c.getPlanetas()){
                    System.out.println("<-**El planeta es ** -> "+p.getPlaneta());
                }
              //  System.out.println("Planeta: " +c.getPlanetas().getPlaneta());
            }
            
    }
    private Boolean savePaises() {
        try {

            paises.setSiglas("fr");
            paises.setPais("Francia");
            paises.setFecha(new Date());
            if (paisesFacade.save(paises)) {
               
                System.out.println("guardado el pais");
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
planetas = new Planetas("saturno", "Saturno",new Date());

            if (planetasFacade.save(planetas)) {
             
                System.out.println("guardado planeta");
             
            } else {
                System.out.println("no se guardo");
            }

            //   System.out.println("--->toString() "+ paisesFacade.getDocument(paises).toString());
        } catch (Exception e) {
            System.out.println("savePlanetas() " + e.getLocalizedMessage());
        }
        return planetas;
    }

    private Boolean saveContinentes() {
        try {

            continentes.setIdcontinente("oc");
            continentes.setContinente("Oceania");
//Planetas p1 = planetasFacade.find("idplaneta", "tierra");
//Planetas p2 = planetasFacade.find("idplaneta", "marte");

            //Planetas p1 = new Planetas("tr", "Tierra", new Date());
//            Planetas p2 = new Planetas("mr", "Marte", new Date());
//            Planetas p3 = new Planetas("jp", "Jupiter", new Date());
//            List<Planetas> l = new ArrayList<>();
//           l.add(p1);
//           l.add(p2);
//            l.add(p3);
//
            List<String> list = new ArrayList<>();

            list.add("Panama");

            list.add("Los Santos");

//            continentes.setCiudades(list);
//          continentes.setGente(l1);
//        continentes.setPlanetas(planetas);
//            continentes.setPlanetas(l);
            if (continentesFacade.save(continentes)) {

                System.out.println("guardado continente");

            } else {
                System.out.println("no se guardo");
            }
            //   System.out.println("--->toString() "+ paisesFacade.getDocument(paises).toString());
        } catch (Exception e) {
            System.out.println("Error() " + e.getLocalizedMessage());
        }
        return false;
    }
}
