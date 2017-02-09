/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzaMaker.builders;

import com.pizzaMaker.model.salad.AbstractSalad;
import com.pizzaMaker.model.salad.Salad;

/**
 *
 * @author valeriamejia
 */
public class EmptySalad extends SaladBuilder{

    @Override
    public AbstractSalad buildSalad() {
        
        return new Salad();
    }
    
}
