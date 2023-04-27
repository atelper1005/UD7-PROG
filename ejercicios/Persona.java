package ejercicios;

import java.io.Serializable;

public class Persona implements Serializable {

    private final static long serialVersionUID = 1L;

    String nombre;
    private Persona padre;


    public Persona(String nombre) {
        this.nombre = nombre;
    }
    public Persona() {
        this.nombre = "Pedro Sanchez";
    }
}
