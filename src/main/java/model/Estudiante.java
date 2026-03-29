package model;

public class Estudiante {

    private String nombre;
    private boolean esNuevo;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.esNuevo = false;
    }

    public Estudiante(String nombre, boolean esNuevo) {
        this.nombre = nombre;
        this.esNuevo = esNuevo;
    }

    public boolean esNuevo() {
        return esNuevo;
    }
}