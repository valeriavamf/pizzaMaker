/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzaMaker.logic;

import com.pizzaMaker.model.salad.AbstractSalad;
import com.pizzaMaker.model.salad.Onion;
import com.pizzaMaker.model.salad.Tommato;

/**
 *
 * @author valeriamejia
 */
public class BasicSalad extends SaladBuilder{

    @Override
    public AbstractSalad buildSalad() {
        Tommato tommatoSalad = new Tommato(salad);
        Onion onionSalad = new Onion(tommatoSalad);
        
        return onionSalad;
    }
    
}
