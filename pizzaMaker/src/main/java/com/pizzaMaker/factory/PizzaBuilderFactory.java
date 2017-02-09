/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzaMaker.factory;

import com.pizzaMaker.builders.BrazilianPizza;
import com.pizzaMaker.builders.EmptyPizzaBuilder;
import com.pizzaMaker.builders.HawaiianPizza;
import com.pizzaMaker.builders.PizzaBuilder;
import com.pizzaMaker.builders.VeggiePizza;

/**
 *
 * @author vmejia
 */
public class PizzaBuilderFactory {
    
    public static PizzaBuilder createBuilder(int id){
        PizzaBuilder result = null;
        switch(id){
            case 1: 
                result = new BrazilianPizza();
                break;
            case 2: 
                result = new HawaiianPizza();
                break;
            case 3: 
                result = new VeggiePizza();
                break; 
            default:
                result = new EmptyPizzaBuilder();
          
        }        
        return result;
    }
    
}
