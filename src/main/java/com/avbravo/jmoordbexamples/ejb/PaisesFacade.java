/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.jmoordbexamples.ejb;


import com.avbravo.jmoordb.persistence.AbstractFacade;
import com.avbravo.jmoordbexamples.entity.Paises;
import com.mongodb.MongoClient;

/**
 *
 * @author avbravo
 */
public class PaisesFacade extends AbstractFacade<Paises>{

    public PaisesFacade( ){
        super(Paises.class, "fantasy", "paises");
    }

    @Override
    protected MongoClient getMongoClient() {
         MongoClient mongoClient = new MongoClient();
         return mongoClient;
    }
 @Override
    public Object findById(String key, String value) {
       return find(value, key);
    }
}
