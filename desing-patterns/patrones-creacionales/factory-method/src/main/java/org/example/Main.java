package org.example;

import org.example.entities.Triangulo;
import org.example.entities.TrianguloFactory;
import org.example.interfaces.TrianguloFactoryMethod;

public class Main {
    public static void main(String[] args) {
        TrianguloFactoryMethod factory = new TrianguloFactory();

        Triangulo triangulo1 = factory.createTriangulo(10, 10, 10);
        System.out.println(triangulo1.getDescripcion());

        Triangulo triangulo2 = factory.createTriangulo(10, 10, 5);
        System.out.println(triangulo2.getDescripcion());

        Triangulo triangulo3 = factory.createTriangulo(10, 11, 12);
        System.out.println(triangulo3.getDescripcion());
    }
}