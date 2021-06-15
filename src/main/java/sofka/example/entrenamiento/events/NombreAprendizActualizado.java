package sofka.example.entrenamiento.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.example.entrenamiento.values.AprendizId;
import sofka.example.generalValues.Nombre;

public class NombreAprendizActualizado extends DomainEvent {
    private final AprendizId aprendizId;
    private final Nombre nombreAprendiz;
    private final String sexo;

    public NombreAprendizActualizado(AprendizId aprendizId, Nombre nombreAprendiz1, String sexo) {
        super("sofka.aprendiz.nombreAprendizActualizado");
        this.aprendizId = aprendizId;
        this.nombreAprendiz = nombreAprendiz1;
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public AprendizId getAprendizId() {
        return aprendizId;
    }

    public Nombre getNombreAprendiz() {
        return nombreAprendiz;
    }
}
