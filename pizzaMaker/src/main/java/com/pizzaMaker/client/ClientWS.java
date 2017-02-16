/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzaMaker.client;

import com.pizzaMaker.model.PastaInfo;
import com.pizzaMaker.model.PizzaInfo;
import com.pizzaMaker.model.PizzaOrder;
import com.pizzaMaker.model.SliceInfo;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

/**
 *
 * @author vmejia
 */
public class ClientWS {
    public static void main(String[] args) {

        PizzaInfo pizzainfo = new PizzaInfo(1, 3, 4, 1);
        SliceInfo sliceInfo = new SliceInfo(7, 4);
        List<Integer> topping = new ArrayList<>();
        topping.add(2);
        topping.add(2);
        PizzaOrder order = new PizzaOrder(pizzainfo, sliceInfo, topping);
        
        Client client = ClientBuilder.newClient();
        String result = client.target(getPizzaURI()).request(MediaType.APPLICATION_XML).post(Entity.xml(order), String.class);
        System.out.println(result);
        
        PastaInfo pasta = new PastaInfo(2, 1, 1);
        result = client.target(getPastaURI()).request(MediaType.APPLICATION_XML).post(Entity.xml(pasta), String.class);
        System.out.println(result);
        
        result = client.target(getSaladURI()).path("1").request().accept(MediaType.APPLICATION_XML).get(String.class);
        System.out.println(result);

    }
    
    private static URI getPizzaURI() {
                return UriBuilder.fromUri("http://localhost:8080/pizzaMaker/rest/PizzaService/orderPizza").build();
        }
    
    private static URI getPastaURI() {
                return UriBuilder.fromUri("http://localhost:8080/pizzaMaker/rest/PizzaService/orderPasta").build();
        }
    
    private static URI getSaladURI() {
                return UriBuilder.fromUri("http://localhost:8080/pizzaMaker/rest/PizzaService/orderSalad").build();
        }
}
