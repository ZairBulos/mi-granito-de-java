package org.example.entities;

import org.example.interfaces.LibroMalEstado;

/**
 * ObserverConcreto
 */
public class Stock implements LibroMalEstado {
    @Override
    public void update() {
        System.out.println("Stock");
        System.out.println("Le doy de baja...");
    }
}
