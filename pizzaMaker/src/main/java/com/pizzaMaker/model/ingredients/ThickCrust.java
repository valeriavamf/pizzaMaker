/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzaMaker.model.ingredients;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author valeriamejia
 */
@XmlRootElement(name = "pizza") 
public class ThickCrust extends Crust{

    @XmlElement
    @Override
    public String getDescription() {
        return "thick crust";
    }

    @XmlElement
    @Override
    public double getBakingTime() {
       return 7;
    }
    
}