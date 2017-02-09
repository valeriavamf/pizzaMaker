/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzaMaker.model.pasta;

import javax.xml.bind.annotation.XmlRootElement;


/**
 *
 * @author valeriamejia
 */
@XmlRootElement(name = "pasta") 
public  class ToppingPasta extends AbstractPasta {
    private AbstractPasta pasta;
    
    public ToppingPasta() {
    }
    
    public ToppingPasta(AbstractPasta salad) {
        this.pasta = salad;
    }
    
    @Override
    public  String getDescription(){
        return pasta.getDescription();
    }
}
