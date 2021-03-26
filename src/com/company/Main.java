package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Invitado> invitados = new ArrayList<>();
        FuegoArtificial fuego1 = new FuegoBoom();
        FuegoArtificial fuego2 = new FuegoFi();

        Pack pack = new Pack();
        pack.agregarFuegoArtificial(fuego1);
        pack.agregarFuegoArtificial(fuego2);

        pack.explotar();
        Invitado invitado1 = new InvitadoMeli("Galperin");
        Invitado invitado2 = new InvitadoMeli("Tinelli");
        Invitado invitado3 = new InvitadoStandard("Pepe");
        Invitado invitado4 = new InvitadoStandard("Jorge");

        invitados.add(invitado1);
        invitados.add(invitado2);
        invitados.add(invitado3);
        invitados.add(invitado4);

        for (Invitado i : invitados ) {
            i.gritar();
        }
    }
}
