/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.jmoordbexamples.ejb;

import com.avbravo.jmoordb.facade.AbstractFacade;
import com.avbravo.jmoordbexamples.entity.Autoincrementable;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import java.util.Arrays;

/**
 *
 * @author avbravo
 */
public class AutoincrementableFacade extends AbstractFacade<Autoincrementable> {

    public AutoincrementableFacade() {
        super(Autoincrementable.class, "fantasy", "autoincrementable");
    }

    @Override
    protected MongoClient getMongoClient() {
        MongoClient mongoClient = new MongoClient();
        return mongoClient;
    }

    protected MongoClient getMongoClient(String database, String username, String password) {
        char[] charArray = password.toCharArray();
        MongoCredential credential = MongoCredential.createCredential(username, database, charArray);
        MongoClient mongoClient = new MongoClient(new ServerAddress("localhost",27017), Arrays.asList(credential));
        return mongoClient;
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
