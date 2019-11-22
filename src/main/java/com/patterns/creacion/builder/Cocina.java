package com.patterns.creacion.builder;

public class Cocina {
    private PizzaBuilder builder;

    public void setPizzaBuilder(PizzaBuilder pb){
        this.builder = pb;
    }

    public void buildPizza(){
        builder.buildMasa();
        builder.buildSalsa();
         builder.buildRelleno();
    }

    public Pizza getPizza() {
        return builder.getPizza();
    }
}
