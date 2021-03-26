package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<FuegoArtificial> fuegos = new ArrayList<>();
        ArrayList<Invitado> invitados = new ArrayList<>();
        FuegoArtificial fuego1 = new FuegoBoom();
        FuegoArtificial fuego2 = new FuegoFi();

        Invitado invitado1 = new InvitadoMeli("Galperin");
        Invitado invitado2 = new InvitadoMeli("Tinelli");
        Invitado invitado3 = new InvitadoStandard("Pepe");
        Invitado invitado4 = new InvitadoStandard("Jorge");

        invitados.add(invitado1);
        invitados.add(invitado2);
        invitados.add(invitado3);
        invitados.add(invitado4);

        fuegos.add(fuego1);
        fuegos.add(fuego2);
        for (FuegoArtificial f : fuegos ) {
            f.explotar();
        }

        for (Invitado i : invitados ) {
            i.gritar();
        }
    }
}
