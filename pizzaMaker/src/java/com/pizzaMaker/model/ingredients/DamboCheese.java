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
public class DamboCheese extends Cheese{

    @Override
    public String getDescription() {
        return "dambo cheese";
    }

    @Override
    public double getBakingTime() {
       return 3;
    }
    
}
