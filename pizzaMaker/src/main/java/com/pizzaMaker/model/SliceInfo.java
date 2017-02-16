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
 * @author valeriamejia
 */
@XmlRootElement
public class SliceInfo implements Serializable{
    private int slice;
    private int optionSize;

    
    
    public SliceInfo(int slice, int option) {
        this.slice = slice;
        this.optionSize = option;
    }

    public SliceInfo() {
    }

    public int getSlice() {
        return slice;
    }

    public void setSlice(int slice) {
        this.slice = slice;
    }

    public int getOptionSize() {
        return optionSize;
    }

    public void setOptionSize(int option) {
        this.optionSize = option;
    }
    
    
}
