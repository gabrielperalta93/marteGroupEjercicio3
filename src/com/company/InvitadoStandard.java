package com.company;

public class InvitadoStandard extends Invitado{
    public InvitadoStandard(String nombre) {
        super(nombre);
    }

    @Override
    public void gritar() {
        System.out.println("Viva Susana!");
    }
}
