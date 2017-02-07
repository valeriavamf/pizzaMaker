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
import com.pizzaMaker.model.pizza.Pizza;
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
    private static final Map<Integer, Cheese> cheese = new HashMap<Integer, Cheese>();
    private static final Map<Integer, Crust> crust = new HashMap<Integer, Crust>();
    private static final Map<Integer, Sauce> sauce = new HashMap<Integer, Sauce>();
    private static final Map<Integer, Size> size = new HashMap<Integer, Size>();
    private static final Map<Integer, Topping> topping = new HashMap<Integer, Topping>();
    static{
      cheese.put(1, new BlueCheese());
      cheese.put(2, new DamboCheese());
      cheese.put(3, new MozzarellaCheese());
        
      crust.put(1, new CheeseCrust());
      crust.put(2, new ThickCrust());
      crust.put(3, new ThinCrust());  
      
      sauce.put(1, new BasicSauce());
      sauce.put(2, new HotSauce());
      sauce.put(3, new ItalianSauce()); 
      sauce.put(4, new SweetSauce()); 
      
      size.put(1, new PersonalSize());
      size.put(2, new SmallSize());
      size.put(3, new MediumSize()); 
      size.put(4, new LargeSize()); 
      
      topping.put(1, new Asparagus());
      topping.put(2, new Bacon());
      topping.put(3, new Corn()); 
      topping.put(4, new Pineapple()); 
    }
    
    public static void main(String[] args) {
        Kitchen s = new Kitchen();
        List<Integer> toppings = new ArrayList<>();
        toppings.add(3);
        s.makePizza(1, 3, 4, new SliceInfo(5, 1), toppings);
    }
    
    
    public void makePizza(int cheeseId, int crustId, int sauceId, 
            SliceInfo sliceInfo, List<Integer> toppings){
        
        Size optionSize = size.get(sliceInfo.getOption());
        if(sliceInfo.getSlice() > 0){
            optionSize.setPizzaSlices(sliceInfo.getSlice());
        }
        PizzaBuilder builder = new BrazilianPizza();
        builder.createNewPizza(cheese.get(cheeseId),crust.get(crustId),sauce.get(sauceId),optionSize);
        
        
        AbstractPizza basicPizza = builder.buildPizza();
        
     
        for(int toppingOption : toppings){
            Topping to = topping.get(toppingOption);
            to.setPizza(basicPizza);
            basicPizza = to;
        }
        
        System.err.println("Making: "+basicPizza.getDescription());
        System.err.println("Baking time: "+basicPizza.getBakingTime());
        System.err.println("Cut into: "+basicPizza.getPizzaSlice());
    }
    
}
