/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzaMaker.factory;

import com.pizzaMaker.model.ingredients.BasicSauce;
import com.pizzaMaker.model.ingredients.EmptySauce;
import com.pizzaMaker.model.ingredients.HotSauce;
import com.pizzaMaker.model.ingredients.ItalianSauce;
import com.pizzaMaker.model.ingredients.Sauce;
import com.pizzaMaker.model.ingredients.SweetSauce;

/**
 *
 * @author vmejia
 */
public class SauceFactory {
    
    public static Sauce createSauce(int id){
        Sauce result = null;
        switch(id){
            case 1: 
                result = new BasicSauce();
                break;
            case 2: 
                result = new HotSauce();
                break;
            case 3: 
                result = new ItalianSauce();
                break;    
            case 4: 
                result = new SweetSauce();
                break;
            default:
                result = new EmptySauce();
          
        }
        
        return result;
    }
    
}
