/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzaMaker.factory;

import com.pizzaMaker.builders.EmptyPizzaBuilder;
import com.pizzaMaker.builders.HawaiianPizza;
import com.pizzaMaker.builders.PizzaBuilder;
import com.pizzaMaker.builders.VeggiePizza;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vmejia
 */
public class PizzaBuilderFactoryTest {
    
    public PizzaBuilderFactoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of createBuilder method, of class PizzaBuilderFactory.
     */
    @Test
    public void testCreateBuilder_CheckRetunrCorrectHawaiianBuilder() {
        System.out.println("testCreateBuilder_CheckRetunrCorrectHawaiianBuilder");
        int id = 2;
        PizzaBuilder result = PizzaBuilderFactory.createBuilder(id);
        assertTrue(result instanceof HawaiianPizza);
    }
    
    @Test
    public void testCreateBuilder_CheckRetunrCorrectVeggiePizzaBuilder() {
        System.out.println("testCreateBuilder_CheckRetunrCorrectVeggiePizzaBuilder");
        int id = 3;
        PizzaBuilder result = PizzaBuilderFactory.createBuilder(id);
        assertTrue(result instanceof VeggiePizza);
    }
    
    @Test
    public void testCreateBuilder_CheckRetunrEmptyBuilderwhenIdNotFound() {
        System.out.println("testCreateBuilder_CheckRetunrEmptyBuilderwhenIdNotFound");
        int id = 7;
        PizzaBuilder result = PizzaBuilderFactory.createBuilder(id);
        assertTrue(result instanceof EmptyPizzaBuilder);
    }
}
