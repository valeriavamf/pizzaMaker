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
public class Asparagus extends Topping{

    public Asparagus() {
    }
    
    public Asparagus(AbstractPizza pizza) {
        super(pizza);
    }
    
    @Override
    public String getDescription() {
        return super.getDescription() + ", asparagus";
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
