/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzaMaker.factory;

import com.pizzaMaker.builders.BasicSalad;
import com.pizzaMaker.builders.EmptySalad;
import com.pizzaMaker.builders.SaladBuilder;

/**
 *
 * @author vmejia
 */
public class SaladBuilderFactory {
    
    public static SaladBuilder createBuilder(int id){
        SaladBuilder result = null;
        switch(id){
            case 1: 
                result = new BasicSalad();
                break;
            default:
                result = new  EmptySalad();
          
        }        
        return result;
    }
    
}
