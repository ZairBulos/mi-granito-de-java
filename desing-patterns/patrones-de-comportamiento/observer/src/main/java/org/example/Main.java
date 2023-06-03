package org.example;

import org.example.entities.*;

public class Main {
    public static void main(String[] args) {

        Compra compra = new Compra();
        Administracion administracion = new Administracion();
        Stock stock = new Stock();

        AlarmaLibro alarmaLibro = new AlarmaLibro();
        alarmaLibro.attach(compra);
        alarmaLibro.attach(administracion);
        alarmaLibro.attach(stock);

        Libro libro = new Libro("100 años de soledad", "MALO");

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.returnLibro(libro);
    }
}