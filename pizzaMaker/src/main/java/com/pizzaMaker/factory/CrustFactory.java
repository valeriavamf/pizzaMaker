/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzaMaker.factory;


import com.pizzaMaker.model.ingredients.CheeseCrust;
import com.pizzaMaker.model.ingredients.Crust;
import com.pizzaMaker.model.ingredients.EmptyCrust;
import com.pizzaMaker.model.ingredients.ThickCrust;
import com.pizzaMaker.model.ingredients.ThinCrust;

/**
 *
 * @author vmejia
 */
public class CrustFactory {
    
    public static Crust createCrust(int id){
        Crust result = null;
        switch(id){
            case 1: 
                result = new CheeseCrust();
                break;
            case 2: 
                result = new ThickCrust();
                break;
            case 3: 
                result = new ThinCrust();
                break; 
            default:
                result = new EmptyCrust();
          
        }
        
        return result;
    }
    
}
