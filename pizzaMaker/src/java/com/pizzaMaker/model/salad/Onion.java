/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzaMaker.model.salad;

/**
 *
 * @author valeriamejia
 */
public class Onion extends ToppingVeggie{
    
    public Onion() {
    }
    
    public Onion(AbstractSalad salad) {
        super(salad);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", onion";
    }
    
}
