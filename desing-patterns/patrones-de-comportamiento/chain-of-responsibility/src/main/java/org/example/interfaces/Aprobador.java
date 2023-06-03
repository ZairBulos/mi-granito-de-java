package org.example.interfaces;

/**
 * Handler
 */
public interface Aprobador {

    public Aprobador getNext();
    public void setNext(Aprobador aprobador);
    public void solicitudPrestamo(int monto);
}
