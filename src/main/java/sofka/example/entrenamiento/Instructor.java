package sofka.example.entrenamiento;

import co.com.sofka.domain.generic.Entity;
import sofka.example.entrenamiento.values.InstructorId;
import sofka.example.generalValues.Nombre;

public class Instructor extends Entity {
    private InstructorId instructorId;
    private Nombre nombreInstructor;
    private String sexo;

    public Instructor(InstructorId instructorId, Nombre nombreInstructor, String sexo) {
        super(instructorId);
        this.instructorId = instructorId;
        this.nombreInstructor = nombreInstructor;
        this.sexo = sexo;
    }

}
