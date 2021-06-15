package sofka.example.entrenamiento.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.example.entrenamiento.values.InstructorId;
import sofka.example.generalValues.Nombre;

public class InstructorAgregado extends DomainEvent {
    private final InstructorId instructorId;
    private final Nombre nombreInstructor;
    private final String sexo;

    public InstructorAgregado(InstructorId instructorId, Nombre nombreInstructor, String sexo) {
        super("sofka.instructor.instructorAgregado");
        this.instructorId = instructorId;
        this.nombreInstructor = nombreInstructor;
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public InstructorId getInstructorId() {
        return instructorId;
    }

    public Nombre getNombreInstructor() {
        return nombreInstructor;
    }
}
