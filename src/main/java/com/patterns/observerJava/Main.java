package com.patterns.observerJava;

public class Main {
    public static void main(String[] args){
        Saludador saludador = new Saludador();
        saludador.addObserver(new Suma());
        saludador.addObserver(new Resta());
        saludador.addObserver(new Multiplicacion());
        new Thread(saludador).run();
    }
}
