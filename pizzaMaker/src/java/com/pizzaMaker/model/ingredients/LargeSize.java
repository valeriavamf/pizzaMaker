/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzaMaker.model.ingredients;

/**
 *
 * @author valeriamejia
 */
public class LargeSize extends Size{

    public LargeSize() {
        this.size = 16;
    }

    

    @Override
    public String getDescription() {
       return "large size, cut pizza in "+getPizzaSlices();
    }

    @Override
    public double getBakingTime() {
       return 10;
    }
}