package com.patterns.observer;

public class SMSUsuarios implements Observer {

    //~ Instance Fields ..............................................................................................................................

    private String desc;
    private String info;

    private final Sujeto sujeto;

    //~ Constructors .................................................................................................................................

    public SMSUsuarios(Sujeto sujeto, String info) {
        this.sujeto = sujeto;
        this.info   = info;
    }

    //~ Methods ......................................................................................................................................

    private void display(){
        System.out.println("["+info+"]: "+desc);
    }

    @Override public void actualizar(String desc) {
        this.desc = desc;
        display();
    }

    @Override public void desuscribir() {}

    @Override public void subscribir() {
        System.out.println("Subscribing " + info + " to " + sujeto.sujetoDetalles() + " ...");
        sujeto.registrar(this);
        System.out.println("Subscribed successfully.");
    }
}
