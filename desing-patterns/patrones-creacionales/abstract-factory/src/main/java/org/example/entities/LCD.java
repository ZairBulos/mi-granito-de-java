package org.example.entities;

/**
 * ProductA1
 */
public class LCD extends TV {

    private double costoFabricacion;

    public LCD() {
        setDescripcion("LCD");
    }

    public LCD(String marca, int pulgadas, String color, double precio, double costoFabricacion) {
        super(marca, pulgadas, color, precio);
        setCostoFabricacion(costoFabricacion);
    }

    public double getCostoFabricacion() {
        return costoFabricacion;
    }

    public void setCostoFabricacion(double costoFabricacion) {
        this.costoFabricacion = costoFabricacion;
    }
}
