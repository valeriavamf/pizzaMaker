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
public abstract class Size {
    protected int size;

    public abstract String getDescription();
    public abstract double getBakingTime();
    

    public int getPizzaSlices() {
        return size;
    }

    public void setPizzaSlices(int size) {
        this.size = size;
    }

   
    
}
