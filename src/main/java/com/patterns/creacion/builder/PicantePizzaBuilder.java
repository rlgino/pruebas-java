package com.patterns.creacion.builder;

public class PicantePizzaBuilder extends PizzaBuilder {

    public PicantePizzaBuilder(){super.pizza = new Pizza();}

    public void buildMasa()   { pizza.setMasa("cocido"); }
    public void buildSalsa()   { pizza.setSalsa("picante"); }
    public void buildRelleno() { pizza.setRelleno("pimienta+salchichón"); }
}
