package com.patterns.Comportamiento.observerLoader;

public class Observer1 implements Observable {
    @Override
    public void saludar() {
        System.out.println("Hola mundo");
    }

    @Override
    public void charlar() {
        System.out.println("Programando para el mundo");
    }

    @Override
    public void despedir() {
        System.out.println("Buenas noches mundo");
    }
}
