package org.example.entities;

import org.example.interfaces.LibroMalEstado;

/**
 * ObserverConcreto
 */
public class Compra implements LibroMalEstado {
    @Override
    public void update() {
        System.out.println("Compras");
        System.out.println("Solicito nueva cotizacion...");
    }
}
