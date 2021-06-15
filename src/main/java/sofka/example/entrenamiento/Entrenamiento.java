package sofka.example.entrenamiento;

import co.com.sofka.domain.generic.AggregateEvent;
import sofka.example.entrenamiento.events.AprendizAgregado;
import sofka.example.entrenamiento.events.InstructorAgregado;
import sofka.example.entrenamiento.events.NombreAprendizActualizado;
import sofka.example.entrenamiento.values.AprendizId;
import sofka.example.entrenamiento.values.EntrenamientoId;
import sofka.example.entrenamiento.values.InstructorId;
import sofka.example.generalValues.Nombre;
import sofka.example.reserva.values.ReservaId;

import java.util.List;
import java.util.Objects;

public class Entrenamiento extends AggregateEvent<EntrenamientoId> {
    protected List<Aprendiz> aprendices;
    protected Instructor instructor;
    protected ReservaId reservaId;

    public Entrenamiento(EntrenamientoId entrenamientoId) {
        super(entrenamientoId);
    }


    public void agregarAprendiz(AprendizId aprendizId, Nombre nombreAprendiz, String sexo) {
        Objects.requireNonNull(aprendizId);
        Objects.requireNonNull(nombreAprendiz);
        Objects.requireNonNull(sexo);
        appendChange(new AprendizAgregado(aprendizId, nombreAprendiz, sexo)).apply();
    }

    public void agregarInstructor(InstructorId instructorId, Nombre nombreInstructor) {
        Objects.requireNonNull(instructorId);
        Objects.requireNonNull(nombreInstructor);
        appendChange(new InstructorAgregado(instructorId, nombreInstructor, sexo));
    }

    public void actualizarNombreAprendiz(AprendizId aprendizId, Nombre nombreAprendiz) {
        Objects.requireNonNull(nombreAprendiz);
        appendChange(new NombreAprendizActualizado(aprendizId, nombreAprendiz, sexo)).apply();
    }

}
