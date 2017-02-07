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
public class PersonalSize extends Size{

    public PersonalSize() {
        this.size = 2;
    }
    

    @Override
    public String getDescription() {
       return "personal size, cut pizza in "+getPizzaSlices();
    }

    @Override
    public double getBakingTime() {
       return 4;
    }
    
}