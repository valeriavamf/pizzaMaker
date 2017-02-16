/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzaMaker.logic;

import com.pizzaMaker.model.PizzaInfo;
import com.pizzaMaker.model.SliceInfo;
import com.pizzaMaker.model.pizza.AbstractPizza;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vmejia
 */
public class KitchenTest {

    private final int blueCheeseId = 1;
    private final int thinCrustId = 3;
    private final int sweetSauceId = 4;
    private final int brazilianPizzaId = 1;
    private final int largeSizeId = 4;
    private final int slice = 7;
    private final int bacon = 2;
    private final int corn = 3;

    public KitchenTest() {
    }
    

    
    @Test
    public void testMakePizza_CheckCorrectPizzaIsMake() {
        System.out.println("testMakePizza_CheckCorrectPizzaIsMake");
        
        PizzaInfo pizzainfo = new PizzaInfo(blueCheeseId, thinCrustId, sweetSauceId, brazilianPizzaId);
        SliceInfo sliceInfo = new SliceInfo(slice,largeSizeId);
        List<Integer> toppings = new ArrayList<>();
        toppings.add(bacon);
        toppings.add(corn);
        Kitchen instance = new Kitchen();
        AbstractPizza result = instance.makePizza(pizzainfo, sliceInfo, toppings);
        String expectedDescription = "pizza thin crust, blue cheese, sweet sauce, bacon, corn, bacon, corn";
        int bakingTime = 28;
        assertEquals(result.getDescription(), expectedDescription);
        assertTrue(result.getBakingTime() == bakingTime);
        assertTrue(result.getPizzaSlice() == slice);
    }
    
    @Test
    public void testMakePizza_CheckResultWhenIncorrectToppingIsSend() {
        System.out.println("testMakePizza_CheckResultWhenIncorrectToppingIsSend");   
        PizzaInfo pizzainfo = new PizzaInfo(blueCheeseId, thinCrustId, sweetSauceId, brazilianPizzaId);
        SliceInfo sliceInfo = new SliceInfo(slice,largeSizeId);
        List<Integer> toppings = new ArrayList<>();
        toppings.add(bacon);
        toppings.add(85);
        Kitchen instance = new Kitchen();
        AbstractPizza result = instance.makePizza(pizzainfo, sliceInfo, toppings);
        String expectedDescription = "pizza thin crust, blue cheese, sweet sauce, bacon, corn, bacon";
        int bakingTime = 26;
        assertEquals(result.getDescription(), expectedDescription);
        assertTrue(result.getBakingTime() == bakingTime);
        assertTrue(result.getPizzaSlice() == slice);
    }
    
    
    @Test
    public void testMakePizza_CheckIncorrectBuilderIdReturnBasicPizza() {
        System.out.println("testMakePizza_CheckIncorrectBuilderIdReturnBasicPizza");
        
        PizzaInfo pizzainfo = new PizzaInfo(blueCheeseId, thinCrustId, sweetSauceId, 55);
        SliceInfo sliceInfo = new SliceInfo(slice,largeSizeId);
        List<Integer> toppings = new ArrayList<>();
        toppings.add(bacon);
        toppings.add(corn);
        Kitchen instance = new Kitchen();
        AbstractPizza result = instance.makePizza(pizzainfo, sliceInfo, toppings);
        String expectedDescription = "pizza thin crust, blue cheese, sweet sauce, bacon, corn";
        int bakingTime = 23;
        assertEquals(result.getDescription(), expectedDescription);
        assertTrue(result.getBakingTime() == bakingTime);
        assertTrue(result.getPizzaSlice() == slice);
    }

}
