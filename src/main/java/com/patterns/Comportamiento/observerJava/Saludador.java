package com.patterns.Comportamiento.observerJava;

import java.util.Observable;

public class Saludador extends Observable implements Runnable{

    @Override
    public void run() {
        System.out.println("Se van a correr los observers...");
        setChanged();
        final Valores val = new Valores();
        val.setN1(1);
        val.setN2(2);
        notifyObservers(val);
    }
}
