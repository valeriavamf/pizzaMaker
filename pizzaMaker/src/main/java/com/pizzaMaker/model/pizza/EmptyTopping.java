/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzaMaker.model.pizza;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author valeriamejia
 */
@XmlRootElement(name = "pizza") 
public class EmptyTopping extends Topping{

    public EmptyTopping() {
    }
    
    public EmptyTopping(AbstractPizza pizza) {
        super(pizza);
    }
    
    @Override
    public void putTopping() {
        pizza.putTopping();
        description = pizza.getDescription();
        bakingtime = pizza.getBakingTime();
    }

    @Override
    public int getPizzaSlice() {
        return super.getPizzaSlice();
    }
   
}
