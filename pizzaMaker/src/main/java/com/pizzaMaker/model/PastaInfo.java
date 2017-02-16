/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzaMaker.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vmejia
 */
@XmlRootElement
public class PastaInfo implements Serializable{
    private int pastaOption;
    private int cheeseId;
    private int sauceId;

    public PastaInfo() {
    }

    public PastaInfo(int pastaOption, int cheeseId, int sauceId) {
        this.pastaOption = pastaOption;
        this.cheeseId = cheeseId;
        this.sauceId = sauceId;
    }

    public int getPastaOption() {
        return pastaOption;
    }

    public void setPastaOption(int pastaOption) {
        this.pastaOption = pastaOption;
    }

    public int getCheeseId() {
        return cheeseId;
    }

    public void setCheeseId(int cheeseId) {
        this.cheeseId = cheeseId;
    }

    public int getSauceId() {
        return sauceId;
    }

    public void setSauceId(int sauceId) {
        this.sauceId = sauceId;
    }
    
    
}
