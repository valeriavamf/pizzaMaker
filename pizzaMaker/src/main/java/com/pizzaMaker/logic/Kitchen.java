/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzaMaker.logic;

import com.pizzaMaker.builders.PastaBuilder;
import com.pizzaMaker.builders.PizzaBuilder;
import com.pizzaMaker.builders.SaladBuilder;
import com.pizzaMaker.factory.PizzaBuilderFactory;
import com.pizzaMaker.factory.CheeseFactory;
import com.pizzaMaker.factory.CrustFactory;
import com.pizzaMaker.factory.PastaBuilderFactory;
import com.pizzaMaker.factory.SaladBuilderFactory;
import com.pizzaMaker.factory.SauceFactory;
import com.pizzaMaker.factory.SizeFactory;
import com.pizzaMaker.factory.ToppingFactory;
import com.pizzaMaker.model.PizzaInfo;
import com.pizzaMaker.model.SliceInfo;
import com.pizzaMaker.model.pasta.AbstractPasta;
import com.pizzaMaker.model.pizza.AbstractPizza;
import com.pizzaMaker.model.salad.AbstractSalad;
import java.util.List;

/**
 *
 * @author valeriamejia
 */
public class Kitchen {

    public AbstractPizza makePizza(PizzaInfo pizzainfo,
            SliceInfo sliceInfo, List<Integer> toppings) {

        PizzaBuilder builder = PizzaBuilderFactory.createBuilder(pizzainfo.getBuilderId());
        builder.createNewPizza(CheeseFactory.createCheese(pizzainfo.getCheeseId()),
                CrustFactory.createCrust(pizzainfo.getCrustId()),
                SauceFactory.createSauce(pizzainfo.getSauceId()),
                SizeFactory.createSize(sliceInfo));

        AbstractPizza basicPizza = builder.buildPizza();

        for (int toppingOption : toppings) {
            AbstractPizza topping = ToppingFactory.createTopping(toppingOption, basicPizza);
            basicPizza = topping;
        }
        basicPizza.putTopping();
        System.out.println("Cooking: " + basicPizza.getDescription());
        System.out.println("Baking time: " + basicPizza.getBakingTime());
        System.out.println("Cut into: " + basicPizza.getPizzaSlice());
        basicPizza.setSendPizza(true);
        System.out.println("Send pizza");

        return basicPizza;
    }

    public AbstractPasta makePasta(int option, int cheese, int sauce) {

        PastaBuilder builder = PastaBuilderFactory.createBuilder(option);
        builder.createNewPasta(CheeseFactory.createCheese(cheese),
                SauceFactory.createSauce(sauce));

        AbstractPasta pasta = builder.buildPasta();
        System.out.println("Cooking: " + pasta.getDescription());

        return pasta;
    }

    public AbstractSalad makeSalad(int option) {

        SaladBuilder builder = SaladBuilderFactory.createBuilder(option);
        builder.createNewSalad();
        AbstractSalad salad = builder.buildSalad();
        System.out.println("Cooking: " + salad.getDescription());

        return salad;
    }

}
