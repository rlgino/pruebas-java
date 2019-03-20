package com.patterns.adapter;

import java.util.Date;

public interface IPersonaVieja {
    public String getNombre();
    public void setNombre(String nombre);
    public String getApellido();
    public void setApellido(String apellido);
    public Date getFechaNacimiento();
    public void setFechaNacimiento(Date fechaNacimiento);
}
