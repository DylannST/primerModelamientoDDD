package sofka.example.entrenamiento;

import co.com.sofka.domain.generic.EventChange;
import sofka.example.entrenamiento.events.AprendizAgregado;
import sofka.example.entrenamiento.events.InstructorAgregado;
import sofka.example.entrenamiento.events.NombreAprendizActualizado;

public class EntrenamientoChange extends EventChange {

    public EntrenamientoChange(Entrenamiento entrenamiento) {
        apply((AprendizAgregado event) -> {
            Aprendiz aprendizAux = new Aprendiz(event.getAprendizId(), event.getNombreAprendiz(), event.getSexo());
            entrenamiento.aprendices.add(aprendizAux);
        });

        apply((InstructorAgregado event) -> {
            entrenamiento.instructor = new Instructor(event.getInstructorId(), event.getNombreInstructor(), event.getSexo());
        });

        apply((NombreAprendizActualizado event) -> {
            int contador = 0;
            for (Aprendiz aprendiz : entrenamiento.aprendices) {
                contador++;
                if (aprendiz.getAprendizId().equals(event.getAprendizId())) {
                    break;
                }
            }
            Aprendiz aprendiz = new Aprendiz(event.getAprendizId(), event.getNombreAprendiz(), event.getSexo());
            entrenamiento.aprendices.set(contador, aprendiz);
        });
    }
}
