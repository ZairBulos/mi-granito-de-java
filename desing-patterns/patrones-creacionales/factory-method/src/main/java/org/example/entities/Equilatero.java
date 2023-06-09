package org.example.entities;

/**
 * ConcreteProduct
 */
public class Equilatero extends Triangulo {

    public Equilatero(int anguloA, int anguloB, int anguloC) {
        super(anguloA, anguloB, anguloC);
    }

    @Override
    public String getDescripcion() {
        return "Soy un Triangulo Equilatero";
    }

    @Override
    public double getSuperficie() {
        return 0;
    }

    @Override
    public void dibujate() {
    }
}
