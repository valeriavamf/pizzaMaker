/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzaMaker.webservice;

import com.pizzaMaker.model.ingredients.CheeseCrust;
import com.pizzaMaker.model.ingredients.DamboCheese;
import com.pizzaMaker.model.ingredients.ItalianSauce;
import com.pizzaMaker.model.ingredients.LargeSize;
import com.pizzaMaker.model.ingredients.ThickCrust;
import com.pizzaMaker.model.pizza.AbstractPizza;
import com.pizzaMaker.model.pizza.Pizza;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author vmejia
 */
@Path("/PizzaService") 
public class PizzaService {
    
    @GET 
   @Path("/pizza") 
   @Produces(MediaType.APPLICATION_XML) 
   public List<AbstractPizza> getUsers(){ 
       List<AbstractPizza> a = new ArrayList<>();
       Pizza pizza = new Pizza();
       pizza.setCheese(new DamboCheese());
       pizza.setCrust(new CheeseCrust());
       pizza.setSauce(new ItalianSauce());
       pizza.setSize(new LargeSize());
       a.add(pizza);
      return a; 
   } 
    
}
