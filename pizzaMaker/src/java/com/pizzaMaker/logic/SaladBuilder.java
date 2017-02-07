/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzaMaker.logic;

import com.pizzaMaker.model.salad.AbstractSalad;
import com.pizzaMaker.model.salad.Salad;

/**
 *
 * @author valeriamejia
 */
public abstract class SaladBuilder {
    protected AbstractSalad salad;
    
    public abstract AbstractSalad buildSalad();

    void createNewSalad() {
        this.salad = new Salad();
    }
}
