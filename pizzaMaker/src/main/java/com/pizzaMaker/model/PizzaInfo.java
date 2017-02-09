/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzaMaker.model;

/**
 *
 * @author vmejia
 */
public class PizzaInfo {
    private int cheeseId;
    private int crustId;
    private int sauceId;
    private int builderId;

    public PizzaInfo(int cheeseId, int crustId, int sauceId, int builderId) {
        this.cheeseId = cheeseId;
        this.crustId = crustId;
        this.sauceId = sauceId;
        this.builderId = builderId;
    }

    public int getCheeseId() {
        return cheeseId;
    }

    public void setCheeseId(int cheeseId) {
        this.cheeseId = cheeseId;
    }

    public int getCrustId() {
        return crustId;
    }

    public void setCrustId(int crustId) {
        this.crustId = crustId;
    }

    public int getSauceId() {
        return sauceId;
    }

    public void setSauceId(int sauceId) {
        this.sauceId = sauceId;
    }

    public int getBuilderId() {
        return builderId;
    }

    public void setBuilderId(int builderId) {
        this.builderId = builderId;
    }
    
    
}
