/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzaMaker.logic;

import com.pizzaMaker.model.pizza.AbstractPizza;
import com.pizzaMaker.model.pizza.Asparagus;
import com.pizzaMaker.model.pizza.Corn;
import com.pizzaMaker.model.pizza.Topping;

/**
 *
 * @author valeriamejia
 */
public class VeggiePizza extends PizzaBuilder{

    public VeggiePizza() {
    }

    @Override
    public AbstractPizza buildPizza() {
        Asparagus veggiePizza = new Asparagus(pizza);
        Corn cornPizza = new Corn(veggiePizza);
        return cornPizza;
    }
    
}