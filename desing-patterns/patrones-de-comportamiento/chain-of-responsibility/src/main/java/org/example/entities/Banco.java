package org.example.entities;

import org.example.interfaces.Aprobador;

/**
 * Cliente
 * En nuestro caso será el banco quién organice la cadena, pero seguramente en la práctica utilizaremos un factory.
 */
public class Banco implements Aprobador {

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
        EjecutivoDeCuenta ejecutivo = new EjecutivoDeCuenta();
        this.setNext(ejecutivo);

        LiderTeamEjecutivo lider = new LiderTeamEjecutivo();
        ejecutivo.setNext(lider);

        Gerente gerente = new Gerente();
        lider.setNext(gerente);

        Director director = new Director();
        gerente.setNext(director);

        next.solicitudPrestamo(monto);
    }
}
