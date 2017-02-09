/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzaMaker.logic;

import com.pizzaMaker.model.SliceInfo;
import com.pizzaMaker.model.ingredients.BasicSauce;
import com.pizzaMaker.model.ingredients.BlueCheese;
import com.pizzaMaker.model.ingredients.Cheese;
import com.pizzaMaker.model.ingredients.CheeseCrust;
import com.pizzaMaker.model.ingredients.Crust;
import com.pizzaMaker.model.ingredients.DamboCheese;
import com.pizzaMaker.model.ingredients.HotSauce;
import com.pizzaMaker.model.ingredients.ItalianSauce;
import com.pizzaMaker.model.ingredients.LargeSize;
import com.pizzaMaker.model.ingredients.MediumSize;
import com.pizzaMaker.model.ingredients.MozzarellaCheese;
import com.pizzaMaker.model.ingredients.PersonalSize;
import com.pizzaMaker.model.ingredients.Sauce;
import com.pizzaMaker.model.ingredients.Size;
import com.pizzaMaker.model.ingredients.SmallSize;
import com.pizzaMaker.model.ingredients.SweetSauce;
import com.pizzaMaker.model.ingredients.ThickCrust;
import com.pizzaMaker.model.ingredients.ThinCrust;
import com.pizzaMaker.model.pizza.AbstractPizza;
import com.pizzaMaker.model.pizza.Asparagus;
import com.pizzaMaker.model.pizza.Bacon;
import com.pizzaMaker.model.pizza.Corn;
import com.pizzaMaker.model.pizza.Pineapple;
import com.pizzaMaker.model.pizza.Topping;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author valeriamejia
 */
public class Kitchen {
    private static final Map<Integer, Cheese> CHEESE = new HashMap<Integer, Cheese>();
    private static final Map<Integer, Crust> CRUST = new HashMap<Integer, Crust>();
    private static final Map<Integer, Sauce> SAUCE = new HashMap<Integer, Sauce>();
    private static final Map<Integer, Size> SIZE = new HashMap<Integer, Size>();
    private static final Map<Integer, Topping> TOPPING = new HashMap<Integer, Topping>();
    static{
      CHEESE.put(1, new BlueCheese());
      CHEESE.put(2, new DamboCheese());
      CHEESE.put(3, new MozzarellaCheese());
        
      CRUST.put(1, new CheeseCrust());
      CRUST.put(2, new ThickCrust());
      CRUST.put(3, new ThinCrust());  
      
      SAUCE.put(1, new BasicSauce());
      SAUCE.put(2, new HotSauce());
      SAUCE.put(3, new ItalianSauce()); 
      SAUCE.put(4, new SweetSauce()); 
      
      SIZE.put(1, new PersonalSize());
      SIZE.put(2, new SmallSize());
      SIZE.put(3, new MediumSize()); 
      SIZE.put(4, new LargeSize()); 
      
      TOPPING.put(1, new Asparagus());
      TOPPING.put(2, new Bacon());
      TOPPING.put(3, new Corn()); 
      TOPPING.put(4, new Pineapple()); 
    }
    
    public static void main(String[] args) {
        Kitchen s = new Kitchen();
        List<Integer> toppings = new ArrayList<>();
        toppings.add(3);
        s.makePizza(1, 3, 4, new SliceInfo(5, 1), toppings);
    }
    
    
    public void makePizza(int cheeseId, int crustId, int sauceId, 
            SliceInfo sliceInfo, List<Integer> toppings){
        
        Size optionSize = SIZE.get(sliceInfo.getOption());
        if(sliceInfo.getSlice() > 0){
            optionSize.setPizzaSlices(sliceInfo.getSlice());
        }
        PizzaBuilder builder = new BrazilianPizza();
        builder.createNewPizza(CHEESE.get(cheeseId),CRUST.get(crustId),SAUCE.get(sauceId),optionSize);
        
        
        AbstractPizza basicPizza = builder.buildPizza();
        
     
        for(int toppingOption : toppings){
            Topping to = TOPPING.get(toppingOption);
            to.setPizza(basicPizza);
            basicPizza = to;
        }
        
        System.err.println("Cooking: "+basicPizza.getDescription());
        System.err.println("Baking time: "+basicPizza.getBakingTime());
        System.err.println("Cut into: "+basicPizza.getPizzaSlice());
    }
    
}
