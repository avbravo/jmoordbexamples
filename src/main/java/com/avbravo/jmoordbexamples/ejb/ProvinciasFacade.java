/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.jmoordbexamples.ejb;


import com.avbravo.jmoordb.facade.AbstractFacade;
import com.avbravo.jmoordbexamples.entity.Provincias;
import com.mongodb.MongoClient;

/**
 *
 * @author avbravo
 */
public class ProvinciasFacade extends AbstractFacade<Provincias>{

    public ProvinciasFacade( ){
        super(Provincias.class, "fantasy", "provincias");
    }

    @Override
    protected MongoClient getMongoClient() {
         MongoClient mongoClient = new MongoClient();
         return mongoClient;
    }
 @Override
    public Object findById(String key, String value) {
       return find(key,value);
    }

    @Override
    public Object findById(String key, Integer value) {
        return find(key,value);
    }
}
