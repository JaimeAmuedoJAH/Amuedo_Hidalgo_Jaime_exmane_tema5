package com.jah.amuedo_hidalgo_jaime_exmane_tema5;

import java.util.ArrayList;
import java.util.List;

public class GestionEstudiante {

    private static List<Estudiante> arrEstudiante;

    public static List<Estudiante> getArrEstudiante() {
        return arrEstudiante;
    }

    public static void setArrEstudiante(List<Estudiante> arrEstudiante) {
        GestionEstudiante.arrEstudiante = arrEstudiante;
    }

    public static void cargarDatos(){
        arrEstudiante = new ArrayList<>();
        Estudiante e = new Estudiante("Jaime", "Dam", 28);
        arrEstudiante.add(e);
        e = new Estudiante("Pedro", "Dam", 30);
        arrEstudiante.add(e);
        e = new Estudiante("Ruben", "Dam", 27);
        arrEstudiante.add(e);
        e = new Estudiante("Hugo", "Dam", 20);
        arrEstudiante.add(e);
        e = new Estudiante("Antonio", "Daw", 25);
        arrEstudiante.add(e);
        e = new Estudiante("Jose", "Asir", 32);
        arrEstudiante.add(e);
    }
}
