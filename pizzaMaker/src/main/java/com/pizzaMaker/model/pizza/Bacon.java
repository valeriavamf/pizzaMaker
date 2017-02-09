/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzaMaker.model.pizza;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author valeriamejia
 */
@XmlRootElement(name = "pizza") 
public class Bacon extends Topping{

    public Bacon() {
    }
    
    public Bacon(AbstractPizza pizza) {
        super(pizza);
    }
    
    @Override
    public void putTopping() {
       
        pizza.putTopping();
        description = pizza.getDescription() +", bacon";
        bakingtime = pizza.getBakingTime() + 3;
    }
    
    @Override
    @XmlElement
    public int getPizzaSlice() {
        return super.getPizzaSlice();
    }
    
}