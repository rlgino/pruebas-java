package com.patterns.estructurales.adapter;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Patron estructural
 */
public class Main {

    public static void main(String[] args) {
        PersonaVieja personaVieja = new PersonaVieja();
        personaVieja.setNombre("Gino");
        personaVieja.setApellido("Luraschi");
        GregorianCalendar g = new GregorianCalendar();
        g.set(1995,04,30);
        Date d = g.getTime();
        personaVieja.setFechaNacimiento(g.getTime());

        ViejaToNuevaAdapter personaNueva = new ViejaToNuevaAdapter(personaVieja);

        System.out.println(personaNueva.getNobre() + ": " + personaNueva.getEdad());
        personaNueva.setEdad(33);
        personaNueva.setNombre("Jorge Lopez");

        System.out.println(personaNueva.getEdad());
        System.out.println(personaNueva.getNobre());
    }
}
