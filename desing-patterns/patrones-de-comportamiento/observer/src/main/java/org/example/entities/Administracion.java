package org.example.entities;

import org.example.interfaces.LibroMalEstado;

/**
 * ObserverConcreto
 */
public class Administracion implements LibroMalEstado {
    @Override
    public void update() {
        System.out.println("Administracion.");
        System.out.println("Envio una queja formal...");
    }
}
