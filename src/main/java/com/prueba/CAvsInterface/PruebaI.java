package com.prueba.CAvsInterface;

public interface PruebaI {
    public void metodoAbstracto();

    default void metodoDefault(){
        System.out.println("Soy un método default");
    }
}
