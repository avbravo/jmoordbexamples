/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.jmoordbexamples.start;

import com.avbravo.jmoordbexamples.ejb.PaisesFacade;
import com.avbravo.jmoordbexamples.entity.Paises;
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
        try {
            PaisesFacade paisesFacade = new PaisesFacade();
            Paises paises = new Paises();
            paises.setSiglas("al");
            paises.setPais("Alemania");
            paises.setFecha(new Date());
             if(paisesFacade.save(paises)){
                System.out.println("guardado");
            }else{
                System.out.println("no se guardo");
            }
       
             System.out.println("--->toString() "+ paisesFacade.getDocument(paises).toString());
        } catch (Exception e) {
            System.out.println("main() Error() "+e.getLocalizedMessage());
        }
        
    }
    
}
