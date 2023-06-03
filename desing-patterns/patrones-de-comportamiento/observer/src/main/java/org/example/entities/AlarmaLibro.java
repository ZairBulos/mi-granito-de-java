package org.example.entities;

import org.example.interfaces.LibroMalEstado;
import org.example.interfaces.Subject;

import java.util.ArrayList;

/**
 * SubjectConcreto
 */
public class AlarmaLibro implements Subject {

    private static ArrayList<LibroMalEstado> observers = new ArrayList<>();

    @Override
    public void attach(LibroMalEstado observer) {
        observers.add(observer);
    }

    @Override
    public void dettach(LibroMalEstado observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update();
        }
    }
}
