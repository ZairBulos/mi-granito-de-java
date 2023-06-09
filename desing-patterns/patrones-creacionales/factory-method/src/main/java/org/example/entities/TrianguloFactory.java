package org.example.entities;

import org.example.interfaces.TrianguloFactoryMethod;

/**
 * ConcreteCreator
 */
public class TrianguloFactory implements TrianguloFactoryMethod {
    @Override
    public Triangulo createTriangulo(int ladoA, int ladoB, int ladoC) {
        // Tres lados iguales
        if ((ladoA == ladoB) && (ladoA == ladoC)) {
            return new Equilatero(ladoA, ladoB, ladoC);
        }
        // Tres lados diferentes
        else if ((ladoA != ladoB) && (ladoA != ladoC) && (ladoB != ladoC)) {
            return new Escaleno(ladoA, ladoB, ladoC);
        }
        // Dos lados iguales
        else {
            return new Isosceles(ladoA, ladoB, ladoC);
        }
    }
}
