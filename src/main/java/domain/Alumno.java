package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alumno {
    private String nombre;

    private List<Materia> aprobadas;

    public Alumno(String nombre) {
        this.nombre = nombre;

        aprobadas = new ArrayList<Materia>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public List<Materia> getAprobadas() {
        return aprobadas;
    }

    public void setAprobadas(List<Materia> aprobadas) {
        this.aprobadas = aprobadas;
    }

    public void agregarMateriasAprobadas(Materia ... materia) {
        Collections.addAll(aprobadas, materia);
    }

    public boolean puedeCursar(Materia materia) {
        return materia.getCorrelativas().stream().allMatch(correlativa -> aprobadas.contains(correlativa));
    }
}
