package com.jah.amuedo_hidalgo_jaime_exmane_tema5;

import java.io.Serializable;

public class Estudiante implements Serializable {

    private String nombre;
    private String ciclo;
    private int edad;

    public Estudiante(){};

    public Estudiante(String nombre, String ciclo, int edad) {
        this.nombre = nombre;
        this.ciclo = ciclo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", ciclo='" + ciclo + '\'' +
                ", edad=" + edad +
                '}';
    }
}
