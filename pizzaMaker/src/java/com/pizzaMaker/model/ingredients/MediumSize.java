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
public class MediumSize extends Size{

    public MediumSize() {
      this.size = 8;
    }
    
    

    @Override
    public String getDescription() {
       return "medium size, cut pizza in "+getPizzaSlices();
    }

    @Override
    public double getBakingTime() {
       return 8;
    }
    
}