package com.prueba.CAvsInterface;

/**
 * Todos sus metodos son abstractos
 */
public interface PruebaI {
    public void metodoAbstracto();

    default void metodoDefault(){
        System.out.println("Soy un método default");
    }
}
