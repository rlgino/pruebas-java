package com.patterns.creacion.builder;

public class HawaiiPizzaBuilder extends PizzaBuilder {

    public HawaiiPizzaBuilder(){super.pizza = new Pizza();}

    @Override
    public void buildMasa() {
        pizza.setMasa("Suave");
    }

    @Override
    public void buildSalsa() {
        pizza.setSalsa("Tomate");
    }

    @Override
    public void buildRelleno() {
        pizza.setRelleno("Anana");
    }
}
