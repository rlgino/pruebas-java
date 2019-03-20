package com.patterns.observer;

import javax.security.auth.Subject;
import java.util.List;

public class ObjetoComentario implements Sujeto,Comentario {

    private List<Observer> observers;
    private String desc;
    private final String detalles;

    public ObjetoComentario(List<Observer> observers, String detalles){
        this.detalles = detalles;
        this.observers = observers;
    }

    @Override
    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public void registrar(Observer o) {
        observers.add(o);
    }

    @Override
    public void eliminar(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notificar() {
        System.out.println();
        for (Observer o : observers) {
            o.actualizar(desc);
        }
    }

    @Override
    public String sujetoDetalles() {
        return detalles;
    }
}
