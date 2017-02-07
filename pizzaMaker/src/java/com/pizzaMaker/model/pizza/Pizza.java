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
public class Pizza extends AbstractPizza {
    private final StringBuilder description = new StringBuilder("pizza toppings are: ");
    @Override
    public String getDescription() {
       
        description.append(crust.getDescription())
        .append(", ").append(cheese.getDescription())
        .append(", ").append(sauce.getDescription())
        .append(", ").append(size.getDescription());
        
        return description.toString();
    }

    @Override
    public double getBakingTime() {
        return crust.getBakingTime()+cheese.getBakingTime()+sauce.getBakingTime()+size.getBakingTime();
    }
    
    @Override
    public int getPizzaSlice() {
        return size.getPizzaSlices();
    }
    
}
