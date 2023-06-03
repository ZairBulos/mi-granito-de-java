package org.example.entities;

/**
 * Singleton
 */
public class InstitutoEducativo {

    // Se coloca una variable del mismo tipo que la clase llamada, por convención 'instance'.
    // Aquí reside todo el secreto del patrón, ya que es dicha variable la que se instancia por única vez.
    private static InstitutoEducativo instance;

    private String nombre;

    // Se privatiza el constructor para que no se pueda hacer un new InstitutoEducativo() desde otro lugar.
    private InstitutoEducativo() {}

    /**
     * Devuelve la única instancia de la clase InstitutoEducativo.
     * @return InstitutoEducativo
     */
    public static InstitutoEducativo getInstance() {
        if (instance == null) {
            instance = new InstitutoEducativo();
        }

        return instance;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
