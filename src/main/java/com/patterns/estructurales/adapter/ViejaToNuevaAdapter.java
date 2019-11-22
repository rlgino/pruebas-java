package com.patterns.estructurales.adapter;

import java.util.GregorianCalendar;

public class ViejaToNuevaAdapter implements IPersonaNueva{
    private IPersonaVieja vieja;

    public ViejaToNuevaAdapter(IPersonaVieja vieja){
        this.vieja = vieja;
    }

    @Override
    public String getNobre() {
        return vieja.getNombre() + " " + vieja.getApellido();
    }

    @Override
    public void setNombre(String nombre) {
        final String[] nombreC = nombre.split(" ");
        String n = nombreC[0];
        String a = nombreC[1];
        vieja.setNombre(n);
        vieja.setApellido(a);
    }

    @Override
    public int getEdad() {
        GregorianCalendar c1 = new GregorianCalendar();
        GregorianCalendar c2 = new GregorianCalendar();
        c2.setTime(vieja.getFechaNacimiento());
        return c1.get(1) - c2.get(1);
    }

    @Override
    public void setEdad(int edad) {
        GregorianCalendar c = new GregorianCalendar();
        int anioActual = c.get(1);
        c.set(1,anioActual-edad);
        vieja.setFechaNacimiento(c.getTime());
    }
}
