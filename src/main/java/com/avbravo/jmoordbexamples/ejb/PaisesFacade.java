/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.jmoordbexamples.ejb;


import com.avbravo.jmoordb.mongodb.facade.AbstractFacade;
import com.avbravo.jmoordbexamples.entity.Paises;
import com.avbravo.jmoordbexamples.provider.MongoClientProvider;
import com.mongodb.MongoClient;

/**
 *
 * @author avbravo
 */
public class PaisesFacade extends AbstractFacade<Paises>{
MongoClientProvider mongoclientProvider = new MongoClientProvider();
    public PaisesFacade( ){
        super(Paises.class, "fantasy", "paises");
    }

      @Override
    protected MongoClient getMongoClient() {
       return mongoclientProvider.getMongoClient();
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
