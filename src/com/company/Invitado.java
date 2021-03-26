package com.company;

public abstract class Invitado {
    private String nombre;

    public abstract void gritar();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Invitado(String nombre) {
        this.nombre = nombre;
    }
}
