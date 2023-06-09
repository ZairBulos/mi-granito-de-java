package org.example.entities;

/**
 * ConcreteProduct
 */
public class Escaleno extends Triangulo {
    public Escaleno(int anguloA, int anguloB, int anguloC) {
        super(anguloA, anguloB, anguloC);
    }

    @Override
    public String getDescripcion() {
        return "Soy un Triangulo Escaleno";
    }

    @Override
    public double getSuperficie() {
        return 0;
    }

    @Override
    public void dibujate() {
    }
}
