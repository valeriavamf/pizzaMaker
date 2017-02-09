/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzaMaker.builders;

import com.pizzaMaker.model.pizza.AbstractPizza;

/**
 *
 * @author valeriamejia
 */
public class EmptyPizzaBuilder extends PizzaBuilder {

    public EmptyPizzaBuilder() {

    }

    @Override
    public AbstractPizza buildPizza() {
        return pizza;
    }
}
