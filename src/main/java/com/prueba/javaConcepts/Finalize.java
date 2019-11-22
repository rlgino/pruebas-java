package com.prueba.javaConcepts;

public class Finalize {
    public static void main(String[] args){
        Finalize fin = new Finalize();
        System.out.println(fin.toString());
        fin = null;
        System.runFinalization();
    }

    /**
     * Método que se ejecuta al destruir un objeto
     * @throws Throwable
     */
    protected void finalize() throws Throwable{
        System.out.println("Se va a finalizar un objeto");
        super.finalize();
    }
}
