package com.patterns.observer;

public interface Sujeto {
    public void registrar(Observer o);
    public void eliminar(Observer o);
    public void notificar();

    public String sujetoDetalles();
}
