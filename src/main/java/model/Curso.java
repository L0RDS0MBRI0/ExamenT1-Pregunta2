package model;

public class Curso {

    private String nombre;
    private int creditos;

    public Curso(String nombre) {
        this.nombre = nombre;
    }

    public Curso(String nombre, int creditos) {
        this.nombre = nombre;
        this.creditos = creditos;
    }

    public int getCreditos() {
        return creditos;
    }
}