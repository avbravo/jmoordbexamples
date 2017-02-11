/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.jmoordbexamples.start;

import com.avbravo.jmoordbexamples.ejb.AutoincrementableFacade;
import com.avbravo.jmoordbexamples.ejb.ContinentesFacade;
import com.avbravo.jmoordbexamples.ejb.FacturasFacade;
import com.avbravo.jmoordbexamples.ejb.PaisesFacade;
import com.avbravo.jmoordbexamples.ejb.PlanetasFacade;
import com.avbravo.jmoordbexamples.entity.Autoincrementable;
import com.avbravo.jmoordbexamples.entity.Continentes;
import com.avbravo.jmoordbexamples.entity.Facturas;
import com.avbravo.jmoordbexamples.entity.Paises;
import com.avbravo.jmoordbexamples.entity.Planetas;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.TimeZone;
import org.bson.Document;

/**
 *
 * @author avbravo
 */
public class TestJmoordb {

    ContinentesFacade continentesFacade = new ContinentesFacade();
    PlanetasFacade planetasFacade = new PlanetasFacade();
    PaisesFacade paisesFacade = new PaisesFacade();
    AutoincrementableFacade autoincrementableFacade = new AutoincrementableFacade();
    FacturasFacade facturasFacade = new FacturasFacade();
    Continentes continentes = new Continentes();
    Planetas planetas = new Planetas();
    Paises paises = new Paises();

    public void ejecutar() {
        try {
         findAllContinentes();
//savePlanetasInteger();
//saveContinentes();
          //  buscar();
            //    update();
//            delete();
            // eliminarColeccion();
            //  createColeccion();
//            verificarSiexisteColeccion();
//verlistaColecciones();
//iniciarAutoicrementable();
//    guardarFactura();
//saveContinentes();
            // buscarContinentesEmbebidos();
//contarEmbebidos();
//List<Planetas> list = planetasFacade.findAll();
//for(Planetas p:list){
//    System.out.println(" "+p.toString());
//}
//List<Paises> l = paisesFacade.findBy("siglas","in");
            //FECHSA
            // helpers();
//List<Paises> l = paisesFacade.findlike("pais", "Ale");
//
//            System.out.println("paso 1");
//            System.out.println("size() "+l.size());
//for(Paises p:l){
//    System.out.println(" "+l.toString());
//}
        } catch (Exception e) {
            System.out.println("main() " + e.getLocalizedMessage());
        }
    }
    
    public void findAllContinentes(){
        try {
            List<Continentes> list = continentesFacade.findAll();
            if(!list.isEmpty()){
                for(Continentes c:list){
                    System.out.println(" "+c.toString());
                }
            }
        } catch (Exception e) {
            System.out.println("findAllContientes() "+e.getLocalizedMessage());
        }
    }

    public void buscar() {

        //Entity
        planetas = new Planetas();
        planetas.setIdplaneta("tierra");
        Optional<Planetas> p1 = planetasFacade.find("idplaneta", "tierra");

        if (!p1.isPresent()) {
            System.out.println("no hay planetas");
        } else {
            planetas = p1.get();
            System.out.println("el planeta es " + planetas.toString());
        }

        //Por documento
        Document doc = new Document("idplaneta", "tierra");
        Optional<Planetas> p2 = planetasFacade.find(doc);

        if (!p2.isPresent()) {
            System.out.println("no hay planetas");
        } else {
            planetas = p2.get();
            System.out.println("el planeta es " + p2.toString());
        }
    }

    public void buscarID() {

        //Entity
        planetas = new Planetas();
        planetas.setIdplaneta("tierra");
        Optional<Planetas> p1 = planetasFacade.findById(planetas);

        if (!p1.isPresent()) {
            System.out.println("no hay planetas");
        } else {
            planetas = p1.get();
            System.out.println("el planeta es " + planetas.toString());
        }

        //Por documento
        Document doc = new Document("idplaneta", "tierra");
        Optional<Planetas> p2 = planetasFacade.findById(doc);

        if (!p2.isPresent()) {
            System.out.println("no hay planetas");
        } else {
            planetas = p2.get();
            System.out.println("el planeta es " + planetas.toString());
        }
    }

    public void saveDocumento() {
        Document doc = new Document("idplaneta", 3)
                .append("planeta", "Jupiter")
                .append("fecha", new Date());

        if (planetasFacade.save(doc, false)) {
            System.out.println("guardado ");
        } else {
            System.out.println("no se guardo " + planetasFacade.getException());
        }
    }
/**
 * 
 */
    public void update() {
        Optional<Paises> p = paisesFacade.find("siglas", "al");
        if (p.isPresent()) {

            paises = p.get();
            paises.setPais("Alemania X");
            if (paisesFacade.update(paises)) {
                System.out.println("Actualizado");

            } else {
                System.out.println(" no actualizado");
            }
        }

    }

    public void delete() {
        paisesFacade.delete("siglas", "in");
    }

    /**
     *
     */
    public void helpers() {
        try {

            ///
            List<Continentes> l = continentesFacade.helpers("eq", "planetas.idplaneta", 1);

            System.out.println("size() " + l.size());
            for (Continentes p : l) {
                System.out.println(" " + l.toString());
            }
        } catch (Exception e) {
            System.out.println("helpers() " + e.getLocalizedMessage());
        }
    }

    public void like() {
        List<Paises> l = paisesFacade.findlike("pais", "Ale");

        System.out.println("paso 1");
        System.out.println("size() " + l.size());
        for (Paises p : l) {
            System.out.println(" " + l.toString());
        }
    }

    public void fechas() {
        try {

            Date date = new Date(1480582463992L);
            DateFormat df = new SimpleDateFormat("2017-01-16'T'03:45:17.209'Z'");

            //FECHSA
            df.setTimeZone(TimeZone.getTimeZone("UTC"));
            String isoString = df.format(date);//2016-12-01T08:54:23.992Z
            System.out.println("paso 0" + isoString);
            List<Paises> l = paisesFacade.findBy("fecha", isoString);
            System.out.println("paso 1");
            System.out.println("size() " + l.size());
            for (Paises p : l) {
                System.out.println(" " + l.toString());
            }
        } catch (Exception e) {
            System.out.println("main() " + e.getLocalizedMessage());
        }
    }

    public void eliminarColeccion() {

        if (facturasFacade.drop("facturas")) {
            System.out.println("se elimino facturas");
        } else {
            System.out.println("no se elimino la coleccion facturas " + facturasFacade.getException());

        }
//          if(facturasFacade.drop()){
//              System.out.println("se elimino facturas");
//          }else{
//              System.out.println("no se elimino la coleccion facturas "+facturasFacade.getException());
//             
//          }
    }

    public void createColeccion() {

        if (facturasFacade.createCollection("facturas")) {
            System.out.println("se creo la coleccion");
        } else {
            System.out.println("no se pudo crear la coleccion " + facturasFacade.getException());
        }
    }

    public void verificarSiexisteColeccion() {

        if (facturasFacade.existsCollection("continentes")) {
            System.out.println("Existe la coleccion");
        } else {
            System.out.println("no existe la coleccion");
        }
    }

    public void verlistaColecciones() {
        try {
            List<String> list = facturasFacade.listCollecctions();
            if (list.isEmpty()) {
                System.out.println("No hay colecciones en la base de datos");
            } else {
                list.forEach((s) -> {
                    System.out.println("coleccion: " + s);
                });
            }
        } catch (Exception e) {
            System.out.println("verlistaColecciones() " + e.getLocalizedMessage());
        }
    }

    public void guardarFactura() {
        try {
            Autoincrementable autoincrementable = new Autoincrementable();
            autoincrementable = autoincrementableFacade.findOneAndUpdate("documento", "facturas", "contador");
            Integer id = 0;
            if (autoincrementable == null) {
                System.out.println("No existe el autoincrementable para facturas");
            } else {
                id = autoincrementable.getContador();
            }

            Facturas facturas = new Facturas();
            facturas.setIdfactura(id);
            facturas.setVentas(5085.23);
            if (facturasFacade.save(facturas)) {
                System.out.println("guardado");
            } else {
                System.out.println("No se guardo " + facturasFacade.getException());
            }

        } catch (Exception e) {
            System.out.println("guardarFactura() " + e.getLocalizedMessage());
        }
    }

    public void iniciarAutoicrementable() {
        try {
            Autoincrementable autoincrementable = new Autoincrementable("facturas", 0);
            if (autoincrementableFacade.save(autoincrementable)) {
                System.out.println("guardado ");
            } else {
                System.out.println("no se guardo " + autoincrementableFacade.getException());
            }

        } catch (Exception e) {
            System.out.println("iniciarAutoincrementable() " + e.getLocalizedMessage());

        }
    }

    public void contarEmbebidos() {
        Integer n = continentesFacade.count(new Document("planetas.idplaneta", "marte"));
//      
        System.out.println("n " + n);
    }

    public void buscarContinentesEmbebidos() {
        try {
            // List<Continentes> list = new ArrayList<>();
            Continentes continentes = new Continentes();
            Optional<Continentes> c = continentesFacade.find(new Document("planetas.idplaneta", "marte"));
            if (c.isPresent()) {
                System.out.println("no existe");
            } else {
                continentes = c.get();
                System.out.println("" + continentes.toString());
            }
        } catch (Exception e) {
            System.out.println("buscarContinentesEmbebidos() " + e.getLocalizedMessage());
        }
    }

    private void recursivo() {
        try {
            System.out.println("-----------------------------------------------");
            Class cls = Class.forName("com.avbravo.jmoordbexamples.ejb.PlanetasFacade");
            Object obj = cls.newInstance();
            System.out.println("paso 2");
            Method method;
            Class[] paramString = new Class[2];
            paramString[0] = String.class;
            paramString[1] = String.class;
            method = cls.getDeclaredMethod("find2", paramString);
            //                  
            String[] param = {"idplaneta", "tierra"};

            Planetas v = (Planetas) method.invoke(obj, param);
            System.out.println("V " + v.toString());
        } catch (Exception e) {
            System.out.println("Recursivo " + e.getMessage());
        }
    }

    private void buscarPaises() {
        Optional<Planetas> p1 = planetasFacade.find("idplaneta", "tierra");
        if (!p1.isPresent()) {
            System.out.println("No hay un planeta con ese codigo");
        } else {
            planetas = p1.get();
            System.out.println("" + paises.toString());
        }

    }

    private void buscarContinentes() {

//        Continentes c = continentesFacade.find("idcontinente", "oc");
        Optional<Continentes> c = continentesFacade.find(new Document("idcontinente", "oc"));
        if (!c.isPresent()) {
            System.out.println("No hay un continente con ese codigo");
        } else {
            continentes = c.get();
            System.out.println("" + continentes.toString());
//                for(Planetas p:c.getPlanetas()){
//                    System.out.println("<-**El planeta es ** -> "+p.getPlaneta());
//                }
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

    private Planetas savePlanetasInteger() {

        try {
            planetas = new Planetas("1", "Tierra", new Date());
            if (planetasFacade.save(planetas)) {
                System.out.println("guardado planeta");
            } else {
                System.out.println("no se guardo el planeta " + planetasFacade.getException());
            }
planetas = new Planetas("2", "Marte", new Date());
if (planetasFacade.save(planetas)) {
                System.out.println("guardado planeta");
            } else {
                System.out.println("no se guardo el planeta " + planetasFacade.getException());
            }
            //   System.out.println("--->toString() "+ paisesFacade.getDocument(paises).toString());
        } catch (Exception e) {
            System.out.println("savePlanetas() " + e.getLocalizedMessage());
        }
        return planetas;
    }
//    private Planetas savePlanetasInteger() {
//
//        try {
//            planetas = new Planetas(1, "Saturno", new Date());
//
//            if (planetasFacade.save(planetas)) {
//
//                System.out.println("guardado planeta");
//
//            } else {
//                System.out.println("no se guardo");
//            }
//            planetas = new Planetas(2, "Jupiter", new Date());
//
//            if (planetasFacade.save(planetas)) {
//
//                System.out.println("guardado planeta");
//
//            } else {
//                System.out.println("no se guardo");
//            }
//
//            //   System.out.println("--->toString() "+ paisesFacade.getDocument(paises).toString());
//        } catch (Exception e) {
//            System.out.println("savePlanetas() " + e.getLocalizedMessage());
//        }
//        return planetas;
//    }

    private Boolean saveContinentes() {
        try {

            continentes.setIdcontinente("am");
            continentes.setContinente("America");
            Optional<Planetas> p1 = planetasFacade.find("idplaneta", "tierra");
            Optional<Planetas> p2 = planetasFacade.find("idplaneta", "marte");
//continentes.setPlanetas(p1);
            //Planetas p2 = planetasFacade.find("idplaneta", "tierra");
            List<Planetas> l = new ArrayList<>();
            if (p1.isPresent()) {
                l.add(p1.get());
            }
            if (p2.isPresent()) {
                l.add(p2.get());
            }

            // l.add(p2);
        //    continentes.setPlanetas(l);

//
//            List<String> list = new ArrayList<>();
//
//            list.add("Panama");
//
//            list.add("Los Santos");
//            continentes.setCiudades(list);
//        
      //continentes.setPlanetas(p1.get());
          continentes.setPlanetas(l);
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
