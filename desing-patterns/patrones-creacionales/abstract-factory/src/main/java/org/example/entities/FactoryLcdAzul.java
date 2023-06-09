package org.example.entities;

/**
 * ConcreteFactory
 */
public class FactoryLcdAzul extends TvAbstractFactory {
    @Override
    public TV createTV() {
        return new LCD();
    }

    @Override
    public Color createColor() {
        return new Azul();
    }
}
