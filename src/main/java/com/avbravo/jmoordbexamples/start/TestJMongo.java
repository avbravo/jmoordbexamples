/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.jmoordbexamples.start;

import com.avbravo.jmoordb.JMongo;
import com.avbravo.jmoordbexamples.entity.Continentes;
import com.avbravo.jmoordbexamples.entity.Paises;
import com.avbravo.jmoordbexamples.entity.Planetas;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import java.util.Date;

/**
 *
 * @author avbravo
 */
public class TestJMongo {
    public void ejecutar(){
        try{
        DB db;
        MongoClient m = new MongoClient("localhost", 27017);
		db = m.getDB("fantasy");
		db.dropDatabase();
	
        JMongo jMongo = new JMongo();
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                System.out.println("            planetas");
                System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        
        Planetas planetas = new Planetas();
        planetas.setIdplaneta("tierra");
        planetas.setPlaneta("Tierra");
        planetas.setFecha(new Date());
        DBObject dbObjectp = jMongo.toDBObject(planetas);
        
		DBCollection collectionp = db.getCollection("planetas");
		collectionp.save(dbObjectp);
                
                System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                System.out.println("            continentes");
                System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        
        Continentes continentes = new Continentes();
        continentes.setIdcontinente("eu");
        continentes.setContinente("Europa");
        continentes.setPlanetas(planetas);
        DBObject dbObjectc = jMongo.toDBObject(continentes);
        
		DBCollection collectionc = db.getCollection("continentes");
		collectionc.save(dbObjectc);
        
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                System.out.println("            paises");
                System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        
        Paises paises = new Paises();
        paises.setSiglas("es");
        paises.setPais("España");
        paises.setContinentes(continentes);
DBObject dbObject = jMongo.toDBObject(paises);
		DBCollection collection = db.getCollection("paises");
		collection.save(dbObject);
                dbObject = collection.findOne();
                System.out.println(" guardado");
                
        }catch(Exception ex){
            System.out.println("Ejecutar() "+ex.getLocalizedMessage());
        }
    }
}
