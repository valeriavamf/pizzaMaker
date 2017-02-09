/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzaMaker.model.pasta;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vmejia
 */
@XmlRootElement(name = "pasta") 
public class Pasta extends AbstractPasta{
   
    @Override
    public String getDescription() {
        return "pasta "+ cheese.getDescription()+", "+sauce.getDescription();
    } 
}
