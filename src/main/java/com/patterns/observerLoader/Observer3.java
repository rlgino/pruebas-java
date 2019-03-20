package com.patterns.observerLoader;

public class Observer3 implements Observable {
    @Override
    public void saludar() {
        System.out.println("Hola");
    }

    @Override
    public void charlar() {
        System.out.println("Codeando");
    }

    @Override
    public void despedir() {
        System.out.println("...");
    }
}
