/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.jmoordbexamples.ejb;

import com.avbravo.jmoordb.facade.AbstractFacade;
import com.avbravo.jmoordbexamples.entity.Planetas;
import com.avbravo.jmoordbexamples.provider.MongoClientProvider;
import com.mongodb.MongoClient;

/**
 *
 * @author avbravo
 */
public class PlanetasFacade extends AbstractFacade<Planetas> {
 MongoClientProvider mongoclientProvider = new MongoClientProvider();
    public PlanetasFacade() {
        super(Planetas.class, "fantasy", "planetas");
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
