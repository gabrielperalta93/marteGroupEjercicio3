package com.company;

import java.util.ArrayList;

public class Pack extends FuegoArtificial{
    private ArrayList<FuegoArtificial> fuegosArtificiales;

    @Override
    public void explotar() {
        for (FuegoArtificial fuegosArtificiales : fuegosArtificiales) {
            fuegosArtificiales.explotar();
        }
    }

    public Pack(){
        this.fuegosArtificiales = new ArrayList<>();
    }

    public void agregarFuegoArtificial(FuegoArtificial fuegoArtificial){
        fuegosArtificiales.add(fuegoArtificial);
    }
}
