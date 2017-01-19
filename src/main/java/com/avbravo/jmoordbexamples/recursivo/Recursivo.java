/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.jmoordbexamples.recursivo;

import com.avbravo.jmoordbexamples.entity.Planetas;
import java.lang.reflect.Method;

/**
 *
 * @author avbravo
 */
public class Recursivo {
    public void ejecutar(){
        try {
            
       System.out.println("-----------------------------------------------");
                        Class cls = Class.forName("com.avbravo.jmoordbexamples.ejb.PlanetasFacade");
                        Object obj = cls.newInstance();
                        System.out.println("paso 2");
                        Method method;
                       Class[] paramString = new Class[2];
                        paramString[0] = String.class;
                        paramString[1] = String.class;
                       method = cls.getDeclaredMethod("find2",  paramString);
   //                  
                        String[] param = {"idplaneta", "tierra"};
                       
                     Planetas  v= (Planetas)  method.invoke(obj, param);
                        System.out.println("V "+v.toString());
       } catch (Exception e) {
            System.out.println("Error()");
        }
    }
}
