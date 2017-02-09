/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzaMaker.model.salad;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author valeriamejia
 */
@XmlRootElement(name = "salad")
public  class ToppingVeggie extends AbstractSalad {
    private AbstractSalad salad;
    
    public ToppingVeggie() {
    }
    
    public ToppingVeggie(AbstractSalad salad) {
        this.salad = salad;
    }
    
    @Override
    public  String getDescription(){
        return salad.getDescription();
    }
}
