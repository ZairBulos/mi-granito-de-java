package org.example.entities;

/**
 * ProductB2
 */
public class Amarillo extends Color {

    private boolean esPrimario;

    public Amarillo() {
    }

    public Amarillo(boolean esPrimario) {
        this.esPrimario = esPrimario;
    }

    @Override
    public void colorea(TV tv) {
        System.out.println("Pintando de amarillo el " + tv.getDescripcion());
    }

    public boolean isEsPrimario() {
        return esPrimario;
    }

    public void setEsPrimario(boolean esPrimario) {
        this.esPrimario = esPrimario;
    }
}
