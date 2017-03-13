/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.jmoordbexamples.ejb;

import com.avbravo.jmoordb.mongodb.facade.AbstractFacade;
import com.avbravo.jmoordbexamples.entity.Bahia;
import com.avbravo.jmoordbexamples.provider.MongoClientProvider;
import com.mongodb.MongoClient;


/**
 *
 * @author avbravo
 */

public class BahiaFacade extends AbstractFacade<Bahia> {

MongoClientProvider mongoclientProvider = new MongoClientProvider();
    public BahiaFacade() {
        super(Bahia.class, "tallerjsd", "bahia");
    }

    @Override
    protected MongoClient getMongoClient() {
       return mongoclientProvider.getMongoClient();
    }

   @Override
    public Object findById(String key, String value) {
       return search(key,value);
    }

    @Override
    public Object findById(String key, Integer value) {
        return search(key,value);
    }

}
