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
    protected boolean sendPizza;
    protected String description = "";
    protected double bakingtime = 0;
    
  
    public abstract void putTopping();
    @XmlElement
    public abstract int getPizzaSlice();


    @XmlElement
    public  String getDescription(){
        return description;
    }
    @XmlElement
    public double getBakingTime(){
        return bakingtime;
    }
    
    
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

    public boolean isSendPizza() {
        return sendPizza;
    }

    public void setSendPizza(boolean sendPizza) {
        this.sendPizza = sendPizza;
    }

    
   
    
    
}
