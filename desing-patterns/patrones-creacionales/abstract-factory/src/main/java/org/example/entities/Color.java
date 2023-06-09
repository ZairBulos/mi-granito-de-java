package org.example.entities;

/**
 * AbstractProductB
 */
public abstract class Color {

    private String descripcion;

    public abstract void colorea(TV tv);

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
