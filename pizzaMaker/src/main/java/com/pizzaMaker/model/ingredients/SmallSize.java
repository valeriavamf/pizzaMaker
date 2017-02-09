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
public class SmallSize extends Size{

    public SmallSize() {
      this.size = 4;
    }

    

    @Override
    public String getDescription() {
       return "small size, cut pizza in "+getPizzaSlices();
    }

    @Override
    public double getBakingTime() {
       return 6;
    }
    
}