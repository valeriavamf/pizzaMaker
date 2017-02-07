/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzaMaker.logic;

import com.pizzaMaker.model.pizza.AbstractPizza;
import com.pizzaMaker.model.pizza.Bacon;
import com.pizzaMaker.model.pizza.Corn;

/**
 *
 * @author valeriamejia
 */
public class BrazilianPizza extends PizzaBuilder{

    public BrazilianPizza() {
        
    }

    @Override
    public AbstractPizza buildPizza() {
        Bacon baconPizza = new Bacon(pizza);
        Corn cornPizza = new Corn(baconPizza);
        return cornPizza;
    }

    
}