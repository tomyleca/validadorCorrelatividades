package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {


    @Test
    public void InscripcionTest() {

        Materia am2 = new Materia();
        Materia am = new Materia();
        Materia aga = new Materia();

        am.agregarCorrelativas(am,aga);

        Alumno juan = new Alumno("Juan");
        Inscripcion inscripcionJuanAM2 = new Inscripcion(juan,am2);

        juan.agregarMateriasAprobadas(aga);

        Assertions.assertEquals(inscripcionJuanAM2.aprobada(),false);

        juan.agregarMateriasAprobadas(am);

        Assertions.assertEquals(inscripcionJuanAM2,true);





    }

}