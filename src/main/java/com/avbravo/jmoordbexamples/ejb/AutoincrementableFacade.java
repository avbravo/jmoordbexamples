/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.jmoordbexamples.ejb;

import com.avbravo.jmoordb.facade.AbstractFacade;
import com.avbravo.jmoordbexamples.entity.Autoincrementable;
import com.avbravo.jmoordbexamples.provider.MongoClientProvider;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import java.util.Arrays;

/**
 *
 * @author avbravo
 */
public class AutoincrementableFacade extends AbstractFacade<Autoincrementable> {

    MongoClientProvider mongoclientProvider = new MongoClientProvider();

    public AutoincrementableFacade() {
        super(Autoincrementable.class, "fantasy", "autoincrementable");
    }

    @Override
    protected MongoClient getMongoClient() {
        return mongoclientProvider.getMongoClient();
    }

  

    @Override
    public Object findById(String key, String value) {
        return find(key, value);
    }

    @Override
    public Object findById(String key, Integer value) {
        return find(key, value);
    }
}
