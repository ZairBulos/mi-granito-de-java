package org.example.entities;

public class Libro {

    private String titulo;
    private String estado;

    public Libro() {
    }

    public Libro(String titulo, String estado) {
        this.titulo = titulo;
        this.estado = estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
