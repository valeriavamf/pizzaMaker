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
public class ItalianSauce extends Sauce{

    @Override
    public String getDescription() {
        return "italian sauce";
    }

    @Override
    public double getBakingTime() {
       return 5;
    }
    
}

