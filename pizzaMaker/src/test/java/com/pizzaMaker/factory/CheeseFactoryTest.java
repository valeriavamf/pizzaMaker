/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzaMaker.factory;

import com.pizzaMaker.model.ingredients.Cheese;
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
public class CheeseFactoryTest {
    
    public CheeseFactoryTest() {
    }
    
    /**
     * Test of createCheese method, of class CheeseFactory.
     */
    @Test
    public void testCreateCheese() {
        System.out.println("createCheese");
        int id = 0;
        Cheese expResult = null;
        Cheese result = CheeseFactory.createCheese(id);
        assertNotNull(result);
    }
    
}
