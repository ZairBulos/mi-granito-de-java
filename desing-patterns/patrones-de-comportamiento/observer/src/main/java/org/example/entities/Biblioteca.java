package org.example.entities;

public class Biblioteca {
    
    public void returnLibro(Libro libro) {
        if (libro.getEstado().equals("MALO")) {
            AlarmaLibro alarmaLibro = new AlarmaLibro();
            alarmaLibro.notifyObservers();
        }
    }
    
}
