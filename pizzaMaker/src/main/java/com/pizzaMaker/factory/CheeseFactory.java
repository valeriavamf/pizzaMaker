/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzaMaker.factory;

import com.pizzaMaker.model.ingredients.BlueCheese;
import com.pizzaMaker.model.ingredients.Cheese;
import com.pizzaMaker.model.ingredients.DamboCheese;
import com.pizzaMaker.model.ingredients.EmptyCheese;
import com.pizzaMaker.model.ingredients.MozzarellaCheese;

/**
 *
 * @author vmejia
 */
public class CheeseFactory {
    
    public static Cheese createCheese(int id){
        Cheese result = null;
        switch(id){
            case 1: 
                result = new BlueCheese();
                break;
            case 2: 
                result = new DamboCheese();
                break;
            case 3: 
                result = new MozzarellaCheese();
                break;
            default:
                result = new EmptyCheese();          
        }
        
        return result;
    }
    
}
