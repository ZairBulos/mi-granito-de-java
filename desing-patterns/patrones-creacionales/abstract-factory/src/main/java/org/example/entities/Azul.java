package org.example.entities;

/**
 * ProductB1
 */
public class Azul extends Color {

    private boolean esPrimario;

    public Azul() {
    }

    public Azul(boolean esPrimario) {
        this.esPrimario = esPrimario;
    }

    @Override
    public void colorea(TV tv) {
        System.out.println("Pintando de azul el " + tv.getDescripcion());
    }

    public boolean isEsPrimario() {
        return esPrimario;
    }

    public void setEsPrimario(boolean esPrimario) {
        this.esPrimario = esPrimario;
    }
}
