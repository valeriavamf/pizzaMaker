/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzaMaker.model;

/**
 *
 * @author valeriamejia
 */
public class SliceInfo {
    private int slice;
    private int option;

    public SliceInfo(int slice, int option) {
        this.slice = slice;
        this.option = option;
    }

    public SliceInfo() {
    }

    public int getSlice() {
        return slice;
    }

    public void setSlice(int slice) {
        this.slice = slice;
    }

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }
    
    
}
