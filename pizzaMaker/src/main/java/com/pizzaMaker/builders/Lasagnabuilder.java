/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzaMaker.builders;

import com.pizzaMaker.model.pasta.AbstractPasta;
import com.pizzaMaker.model.pasta.Lasagna;

/**
 *
 * @author valeriamejia
 */
public class Lasagnabuilder extends PastaBuilder{

    @Override
    public AbstractPasta buildPasta() {
         Lasagna lasagna = new Lasagna(pasta);
        return lasagna;
    }
    
}
