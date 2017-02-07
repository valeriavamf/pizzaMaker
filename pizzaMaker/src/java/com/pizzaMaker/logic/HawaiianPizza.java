/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzaMaker.logic;

import com.pizzaMaker.model.pizza.AbstractPizza;
import com.pizzaMaker.model.pizza.Pineapple;

/**
 *
 * @author valeriamejia
 */
public class HawaiianPizza extends PizzaBuilder{

    public HawaiianPizza() {
        
    }

    @Override
    public AbstractPizza buildPizza() {
        Pineapple pineapplePizza = new Pineapple(pizza);
        return pineapplePizza;
    }


    
}
