package com.company;

public class InvitadoMeli extends Invitado{

    public InvitadoMeli(String nombre) {
        super(nombre);
    }

    @Override
    public void gritar() {
        System.out.println("Viva la Chiqui!");
    }
}
