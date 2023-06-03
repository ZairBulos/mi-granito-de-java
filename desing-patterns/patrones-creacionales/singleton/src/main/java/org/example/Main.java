package org.example;

import org.example.entities.InstitutoEducativo;

public class Main {
    public static void main(String[] args) {

        InstitutoEducativo instituto = InstitutoEducativo.getInstance();
        instituto.setNombre("Educación S.A");
        System.out.println("1. " + instituto.getNombre());

        InstitutoEducativo instituto2 = InstitutoEducativo.getInstance();
        System.out.println("2. " + instituto2.getNombre());

        InstitutoEducativo instituto3 = InstitutoEducativo.getInstance();
        System.out.println("3. " + instituto.getNombre());

        // instituto3 cambia el nombre
        instituto3.setNombre("Capacitación S.A");

        // La primer llamada se ve afectada ya que es una referencia a la misma instancia
        System.out.println("1 bis. " + instituto.getNombre());
    }
}