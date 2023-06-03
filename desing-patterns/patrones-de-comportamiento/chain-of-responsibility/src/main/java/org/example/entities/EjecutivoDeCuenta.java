package org.example.entities;

import org.example.interfaces.Aprobador;

/**
 * HandlerConcreto
 */
public class EjecutivoDeCuenta implements Aprobador {

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
        if (monto <= 10000) {
            System.out.println("Lo manejo yo, el ejecutivo de cuentas.");
        } else {
            next.solicitudPrestamo(monto);
        }
    }
}
