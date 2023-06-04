package org.example.entities;

import java.util.HashMap;

/**
 * Client
 */
public class TvPrototype {

    private HashMap<String, TV> prototypes = new HashMap<>();

    public TvPrototype() {
        // Aca se han hardcodeado los dos tipos de tvs, lo ideal sería crear dos métodos para add/remove prototypes.
        LCD lcd = new LCD("Panasonic", 42, "Plateado", 599.99, 290);
        Plasma plasma = new Plasma("Sony", 21, "Plateado", 399.99, 90, 0.05);

        prototypes.put("LCD", lcd);
        prototypes.put("Plasma", plasma);
    }

    public Object prototype(String tipo) throws CloneNotSupportedException {
        return prototypes.get(tipo).clone();
    }

}
