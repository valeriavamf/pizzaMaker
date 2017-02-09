/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzaMaker.logic;

import com.pizzaMaker.model.ingredients.Cheese;
import com.pizzaMaker.model.ingredients.Crust;
import com.pizzaMaker.model.ingredients.Sauce;
import com.pizzaMaker.model.ingredients.Size;
import com.pizzaMaker.model.pizza.AbstractPizza;
import com.pizzaMaker.model.pizza.Pizza;

/**
 *
 * @author valeriamejia
 */
public abstract class PizzaBuilder {
    protected AbstractPizza pizza;
    
    
    public PizzaBuilder() {
    }
    
    public abstract AbstractPizza buildPizza();

    void createNewPizza(Cheese cheese, Crust crust, Sauce sauce, Size size) {
        this.pizza = new Pizza();
        pizza.setCheese(cheese);
        pizza.setCrust(crust);
        pizza.setSauce(sauce);
        pizza.setSize(size);
    }
}
