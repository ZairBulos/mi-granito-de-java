package org.example;

import org.example.entities.EnsamblajeTV;
import org.example.entities.FactoryLcdAzul;
import org.example.entities.FactoryPlasmaAmarillo;
import org.example.entities.TvAbstractFactory;

public class Main {
    public static void main(String[] args) {
        TvAbstractFactory factory1 = new FactoryLcdAzul();
        EnsamblajeTV ensamblajeTV1 = new EnsamblajeTV(factory1);

        TvAbstractFactory factory2 = new FactoryPlasmaAmarillo();
        EnsamblajeTV ensamblajeTV2 = new EnsamblajeTV(factory2);
    }
}