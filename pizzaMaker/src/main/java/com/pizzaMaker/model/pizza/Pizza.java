/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzaMaker.model.pizza;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author valeriamejia
 */
@XmlRootElement(name = "pizza")
public class Pizza extends AbstractPizza {
    private final StringBuilder desc = new StringBuilder("pizza ");

    @Override
    public void putTopping() {

        desc.append(crust.getDescription())
                .append(", ").append(cheese.getDescription())
                .append(", ").append(sauce.getDescription());
        description = desc.toString();
        bakingtime = crust.getBakingTime() + cheese.getBakingTime() + sauce.getBakingTime() + size.getBakingTime();
    }
    
    
    @Override
    public int getPizzaSlice() {
        return size.getPizzaSlices();
    }

}
