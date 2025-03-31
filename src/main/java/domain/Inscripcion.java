package domain;

public class Inscripcion {
    private Alumno alumno;
    private Materia materia ;

    public Inscripcion(Alumno alumno, Materia materia) {
        this.alumno = alumno;
        this.materia = materia;
    }

    public boolean aprobada() {
        return alumno.puedeCursar(this.materia);
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
}
