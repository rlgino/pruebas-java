package com.patterns.adapter;

import java.util.Date;

public class PersonaVieja implements IPersonaVieja {
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;


    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre= nombre;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    @Override
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento= fechaNacimiento;
    }
}
