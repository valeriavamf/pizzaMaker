/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzaMaker.factory;

import com.pizzaMaker.builders.EmptyPastaBuilder;
import com.pizzaMaker.builders.Lasagnabuilder;
import com.pizzaMaker.builders.PastaBuilder;
import com.pizzaMaker.builders.Spaghettibuilder;

/**
 *
 * @author vmejia
 */
public class PastaBuilderFactory {
    
    public static PastaBuilder createBuilder(int id){
        PastaBuilder result = null;
        switch(id){
            case 1: 
                result = new Lasagnabuilder();
                break;
            case 2: 
                result = new Spaghettibuilder();
                break;
            default:
                result = new  EmptyPastaBuilder();
          
        }        
        return result;
    }
    
}
