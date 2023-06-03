package org.example.entities;

import org.example.interfaces.Aprobador;

/**
 * HandlerConcreto
 */
public class Gerente implements Aprobador {

    private Aprobador next;

    @Override
    public Aprobador getNext() {
        return next;
    }

    @Override
    public void setNext(Aprobador aprobador) {
        this.next = aprobador;
    }

    @Override
    public void solicitudPrestamo(int monto) {
        if (monto > 50000 && monto <= 100000) {
            System.out.println("Lo manejo yo, el gerente.");
        } else {
            next.solicitudPrestamo(monto);
        }
    }
}
