/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzaMaker.model.pizza;

import com.pizzaMaker.model.ingredients.Cheese;
import com.pizzaMaker.model.ingredients.Crust;
import com.pizzaMaker.model.ingredients.Sauce;
import com.pizzaMaker.model.ingredients.Size;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
/**
 *
 * @author valeriamejia
 */
@XmlRootElement(name = "pizza") 
public abstract class AbstractPizza implements Serializable{
    protected Crust crust;
    protected Cheese cheese;
    protected Sauce sauce;
    protected Size size;
    
    @XmlElement
    public abstract String getDescription();
    @XmlElement
    public abstract double getBakingTime();
    @XmlElement
    public abstract int getPizzaSlice();


    public Crust getCrust() {
        return crust;
    }

    public void setCrust(Crust crust) {
        this.crust = crust;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }
    
    public Sauce getSauce() {
        return sauce;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    
    
    
    
}
