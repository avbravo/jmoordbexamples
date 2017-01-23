/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.jmoordbexamples.start;

import com.avbravo.jmoordbexamples.ejb.ProvinciasFacade;
import com.avbravo.jmoordbexamples.entity.Paises;
import com.avbravo.jmoordbexamples.entity.Provincias;
import java.util.Date;

/**
 *
 * @author avbravo
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{


            TestJmoordb testJmoordb = new TestJmoordb();
            testJmoordb.ejecutar();
        }catch(Exception ex){
            System.out.println("main() "+ex.getLocalizedMessage());
        }
        
    }
    
}
