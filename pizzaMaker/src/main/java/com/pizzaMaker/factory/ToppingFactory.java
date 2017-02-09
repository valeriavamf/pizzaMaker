/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzaMaker.factory;

import com.pizzaMaker.model.pizza.AbstractPizza;
import com.pizzaMaker.model.pizza.Asparagus;
import com.pizzaMaker.model.pizza.Bacon;
import com.pizzaMaker.model.pizza.Corn;
import com.pizzaMaker.model.pizza.EmptyTopping;
import com.pizzaMaker.model.pizza.Pineapple;
import com.pizzaMaker.model.pizza.Topping;

/**
 *
 * @author vmejia
 */
public class ToppingFactory {
    
    public static Topping createTopping(int id,AbstractPizza pizza){
        Topping result = null;
        switch(id){
            case 1: 
                result = new Asparagus(pizza);
                break;
            case 2: 
                result = new Bacon(pizza);
                break;
            case 3: 
                result = new Corn(pizza);
                break;    
            case 4: 
                result = new Pineapple(pizza);
                break;
            default:
                result = new EmptyTopping(pizza);
          
        }
        
        return result;
    }
    
}
