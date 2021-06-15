package sofka.example.entrenamiento.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.example.entrenamiento.values.AprendizId;
import sofka.example.generalValues.Nombre;

public class AprendizAgregado extends DomainEvent {
    private final AprendizId aprendizId;
    private final Nombre nombreAprendiz;
    private final String sexo;

    public AprendizAgregado(AprendizId aprendizId, Nombre nombreAprendiz, String sexo) {
        super("sofka.aprendis.aprendizAgregado");
        this.aprendizId = aprendizId;
        this.nombreAprendiz = nombreAprendiz;
        this.sexo = sexo;
    }

    public AprendizId getAprendizId() {
        return aprendizId;
    }

    public Nombre getNombreAprendiz() {
        return nombreAprendiz;
    }

    public String getSexo() {
        return sexo;
    }
}
