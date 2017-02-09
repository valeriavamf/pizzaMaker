/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzaMaker.webservice;

import com.pizzaMaker.logic.Kitchen;
import com.pizzaMaker.model.PizzaInfo;
import com.pizzaMaker.model.SliceInfo;
import com.pizzaMaker.model.ingredients.CheeseCrust;
import com.pizzaMaker.model.ingredients.DamboCheese;
import com.pizzaMaker.model.ingredients.ItalianSauce;
import com.pizzaMaker.model.ingredients.LargeSize;
import com.pizzaMaker.model.pasta.AbstractPasta;
import com.pizzaMaker.model.pizza.AbstractPizza;
import com.pizzaMaker.model.pizza.Pizza;
import com.pizzaMaker.model.salad.AbstractSalad;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author vmejia
 */
@Path("/PizzaService")
public class PizzaService {


    @GET
    @Path("/orderPizza/{cheeseId}/{crustId}/{sauceId}/{slice}/{option}/{builder}/{topping}")
    @Produces(MediaType.APPLICATION_XML)
    public AbstractPizza orderPizza(@PathParam("cheeseId") int cheeseId,
            @PathParam("crustId") int crustId, @PathParam("sauceId") int sauceId,
            @PathParam("slice") int slice, @PathParam("option") int option,
            @PathParam("builder") int builder,
            @PathParam("topping") String topping) {
        Kitchen kitchen = new Kitchen();
        List<Integer> toppings = new ArrayList<>();

        for (String id : topping.split(",")) {
            toppings.add(Integer.parseInt(id));
        }
        SliceInfo sliceInfo = new SliceInfo(slice, option);
        PizzaInfo pizzainfo = new PizzaInfo(cheeseId, crustId, sauceId, builder);
        AbstractPizza pizza = kitchen.makePizza(pizzainfo, sliceInfo, toppings);
        return pizza;
    }

    @GET
    @Path("/orderPasta/{option}/{cheeseId}/{sauceId}")
    @Produces(MediaType.APPLICATION_XML)
    public AbstractPasta orderPasta(@PathParam("option") int option, @PathParam("cheeseId") int cheeseId,
            @PathParam("sauceId") int sauceId) {
        Kitchen kitchen = new Kitchen();

        AbstractPasta pasta = kitchen.makePasta(option, cheeseId, sauceId);
        return pasta;
    }

    @GET
    @Path("/orderSalad/{option}")
    @Produces(MediaType.APPLICATION_XML)
    public AbstractSalad orderPasta(@PathParam("option") int option) {
        Kitchen kitchen = new Kitchen();

        AbstractSalad salad = kitchen.makeSalad(option);
        return salad;
    }
}
