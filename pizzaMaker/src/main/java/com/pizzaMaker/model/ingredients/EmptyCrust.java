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
public class EmptyCrust extends Crust{

    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public double getBakingTime() {
       return 0;
    }
    
}