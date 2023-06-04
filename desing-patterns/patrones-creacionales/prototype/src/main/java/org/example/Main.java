package org.example;

import org.example.entities.TV;
import org.example.entities.TvPrototype;

public class Main {
    public static void main(String[] args) {

        TvPrototype tvp = new TvPrototype();

        try {
            TV tv = (TV) tvp.prototype("LCD");
            System.out.println(tv.toString());
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }

    }
}