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
public class BasicSauce  extends Sauce{

    @Override
    public String getDescription() {
        return "basic sauce";
    }

    @Override
    public double getBakingTime() {
       return 4;
    }
    
}