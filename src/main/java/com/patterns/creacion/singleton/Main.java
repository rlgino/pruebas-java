package com.patterns.creacion.singleton;

public class Main {

    public static void main(String[] args){
        Coneccion c = Coneccion.getInstance();
        System.out.println(c.getValor());
        c.setValor("Hola");
        System.out.println(c.getValor());

        Coneccion c1 = Coneccion.getInstance();
        System.out.println(c1.getValor());
        c1.setValor("Ultimo valor");
        System.out.println(c.getValor());
    }
}
