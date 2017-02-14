/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzaMaker.logic;

import com.pizzaMaker.model.PizzaInfo;
import com.pizzaMaker.model.SliceInfo;
import com.pizzaMaker.model.pasta.AbstractPasta;
import com.pizzaMaker.model.pizza.AbstractPizza;
import com.pizzaMaker.model.salad.AbstractSalad;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author valeriamejia
 */
public class KitchenTest {
    
    public KitchenTest() {
    }

    /**
     * Test of makePizza method, of class Kitchen.
     */
    @Test
    public void testMakePizza() {
        System.out.println("makePizza");
        PizzaInfo pizzainfo = null;
        SliceInfo sliceInfo = null;
        List<Integer> toppings = null;
        Kitchen instance = new Kitchen();
        AbstractPizza expResult = null;
        AbstractPizza result = instance.makePizza(pizzainfo, sliceInfo, toppings);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makePasta method, of class Kitchen.
     */
    @Test
    public void testMakePasta() {
        System.out.println("makePasta");
        int option = 0;
        int cheese = 0;
        int sauce = 0;
        Kitchen instance = new Kitchen();
        AbstractPasta expResult = null;
        AbstractPasta result = instance.makePasta(option, cheese, sauce);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makeSalad method, of class Kitchen.
     */
    @Test
    public void testMakeSalad() {
        System.out.println("makeSalad");
        int option = 0;
        Kitchen instance = new Kitchen();
        AbstractSalad expResult = null;
        AbstractSalad result = instance.makeSalad(option);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
