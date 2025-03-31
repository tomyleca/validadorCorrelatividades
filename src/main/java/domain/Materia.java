package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> correlativas;

    public Materia(String nombre) {
        this.nombre = nombre;
        correlativas = new ArrayList<Materia>();
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public void setCorrelativas(List<Materia> correlativas) {
        this.correlativas = correlativas;
    }

    public void agregarCorrelativas(Materia ... nuevasCorrelativas) {
        Collections.addAll(this.correlativas, nuevasCorrelativas);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

