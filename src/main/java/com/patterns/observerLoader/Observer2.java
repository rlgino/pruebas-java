package com.patterns.observerLoader;

public class Observer2 implements Observable {
    @Override
    public void saludar() {
        System.out.println("Hello");
    }

    @Override
    public void charlar() {
        System.out.println("How are you?");
    }

    @Override
    public void despedir() {
        System.out.println("Good bye");
    }
}
