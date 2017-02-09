/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzaMaker.model.pasta;

import com.pizzaMaker.model.ingredients.Cheese;
import com.pizzaMaker.model.ingredients.Sauce;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author valeriamejia
 */
@XmlRootElement(name = "pasta") 
public abstract class AbstractPasta {
    protected Cheese cheese;
    protected Sauce sauce;
    
    @XmlElement
    public abstract String getDescription();

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
    
    
}
