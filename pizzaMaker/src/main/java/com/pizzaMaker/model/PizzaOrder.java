/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzaMaker.model;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vmejia
 */
@XmlRootElement
public class PizzaOrder implements Serializable{
    private PizzaInfo pizza;
    private SliceInfo slice;
    private List<Integer> topping;

    public PizzaOrder() {
    }

    public PizzaOrder(PizzaInfo pizza, SliceInfo slice, List<Integer> topping) {
        this.pizza = pizza;
        this.slice = slice;
        this.topping = topping;
    }

    public PizzaInfo getPizza() {
        return pizza;
    }

    public void setPizza(PizzaInfo pizza) {
        this.pizza = pizza;
    }

    public SliceInfo getSlice() {
        return slice;
    }

    public void setSlice(SliceInfo slice) {
        this.slice = slice;
    }

    public List<Integer> getTopping() {
        return topping;
    }

    public void setTopping(List<Integer> topping) {
        this.topping = topping;
    }
    
    
    
}
