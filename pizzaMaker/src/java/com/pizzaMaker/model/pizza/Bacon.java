/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzaMaker.model.pizza;

/**
 *
 * @author valeriamejia
 */
public class Bacon extends Topping{

    public Bacon() {
    }
    
    public Bacon(AbstractPizza pizza) {
        super(pizza);
    }
    
    @Override
    public String getDescription() {
        return super.getDescription() + ", bacon";
    }

    @Override
    public double getBakingTime() {
        return super.getBakingTime() + 2;
    }
    
    @Override
    public int getPizzaSlice() {
        return super.getPizzaSlice();
    }
    
}