package com.patterns.Comportamiento.observerJava;

import java.util.Observable;
import java.util.Observer;

public class Suma implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        final Valores val = (Valores) arg;
        val.setRes(val.getN1()+val.getN2());
        System.out.println(val.getRes());
    }
}
