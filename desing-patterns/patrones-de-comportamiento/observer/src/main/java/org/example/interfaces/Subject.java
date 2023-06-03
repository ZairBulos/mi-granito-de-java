package org.example.interfaces;

/**
 * Subject
 */
public interface Subject {

    public void attach(LibroMalEstado observer);
    public void dettach(LibroMalEstado observer);
    public void notifyObservers();

}
