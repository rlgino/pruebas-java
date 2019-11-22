package com.patterns.creacion.builder;

/** Un cliente pidiendo una pizza. */
public class Main {
    public static void main(String[] args){
        Cocina cocina = new Cocina();
        HawaiiPizzaBuilder hawaiiPizzaBuilder = new HawaiiPizzaBuilder();
        PicantePizzaBuilder picantePizzaBuilder = new PicantePizzaBuilder();

        cocina.setPizzaBuilder(hawaiiPizzaBuilder);
        cocina.buildPizza();

        Pizza pizza = cocina.getPizza();
        System.out.println(pizza.toString());
    }
}
