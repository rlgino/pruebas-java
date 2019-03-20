package com.patterns.singleton;

public class Coneccion {
    public static Coneccion con = null;// Es nulo para que cuando se cree no arranque ocupand memoria
    private String valor = "";

    private Coneccion(){ }

    public void setValor(String v){
        valor = v;
    }

    public String getValor(){
        return valor;
    }

    public static Coneccion getInstance(){
        if(con == null) con = new Coneccion();
        return con;
    }
}
