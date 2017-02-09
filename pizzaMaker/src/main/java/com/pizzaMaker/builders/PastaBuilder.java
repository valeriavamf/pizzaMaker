/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzaMaker.builders;

import com.pizzaMaker.model.ingredients.Cheese;
import com.pizzaMaker.model.ingredients.Sauce;
import com.pizzaMaker.model.pasta.AbstractPasta;
import com.pizzaMaker.model.pasta.Pasta;

/**
 *
 * @author valeriamejia
 */
public abstract class PastaBuilder {
    protected AbstractPasta pasta;
    
    public abstract AbstractPasta buildPasta();

    public void createNewPasta(Cheese cheese, Sauce sauce) {
        this.pasta = new Pasta();
        pasta.setCheese(cheese);
        pasta.setSauce(sauce);
    }
}
