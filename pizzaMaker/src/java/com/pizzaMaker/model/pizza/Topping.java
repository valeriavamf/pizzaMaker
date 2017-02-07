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
public class Topping extends AbstractPizza{
    private AbstractPizza pizza;

    public Topping() {
    }
    
    public Topping(AbstractPizza pizza) {
        this.pizza = pizza;
    }
    

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public double getBakingTime() {
        return pizza.getBakingTime();
    }
    
    @Override
    public int getPizzaSlice() {
        return pizza.getPizzaSlice();
    }
    
    public void setPizza(AbstractPizza pizza){
        this.pizza = pizza;
    }

    
}
