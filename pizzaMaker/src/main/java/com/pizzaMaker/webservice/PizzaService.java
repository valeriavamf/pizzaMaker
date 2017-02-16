/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzaMaker.webservice;

import com.pizzaMaker.logic.Kitchen;
import com.pizzaMaker.model.PastaInfo;
import com.pizzaMaker.model.PizzaInfo;
import com.pizzaMaker.model.PizzaOrder;
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
import javax.ws.rs.POST;
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


    @POST
    @Path("/orderPizza")
    @Produces(MediaType.APPLICATION_XML)
    public AbstractPizza orderPizza(PizzaOrder order) {
        Kitchen kitchen = new Kitchen();
        AbstractPizza pizza = kitchen.makePizza(order.getPizza(), order.getSlice(), order.getTopping());
        return pizza;
    }

    @POST
    @Path("/orderPasta")
    @Produces(MediaType.APPLICATION_XML)
    public AbstractPasta orderPasta(PastaInfo pastaOrder) {
        Kitchen kitchen = new Kitchen();
        AbstractPasta pasta = kitchen.makePasta(pastaOrder.getPastaOption(),
                pastaOrder.getCheeseId(), pastaOrder.getSauceId());
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
