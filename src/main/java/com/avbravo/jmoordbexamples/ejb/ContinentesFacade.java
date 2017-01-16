/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.jmoordbexamples.ejb;


import com.avbravo.jmoordb.persistence.AbstractFacade;
import com.avbravo.jmoordbexamples.entity.Continentes;
import com.mongodb.MongoClient;

/**
 *
 * @author avbravo
 */
public class ContinentesFacade extends AbstractFacade<Continentes>{

    public ContinentesFacade( ){
        super(Continentes.class, "fantasy", "continentes");
    }

    @Override
    protected MongoClient getMongoClient() {
         MongoClient mongoClient = new MongoClient();
         return mongoClient;
    }

}
