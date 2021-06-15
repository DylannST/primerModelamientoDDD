package sofka.example.entrenamiento;

import co.com.sofka.domain.generic.Entity;
import sofka.example.entrenamiento.values.AprendizId;
import sofka.example.generalValues.Nombre;

public class Aprendiz extends Entity {

    private final AprendizId aprendizId;
    private final Nombre nombreAprendiz;
    private final String sexo;

    public Aprendiz(AprendizId aprendizId, Nombre nombreAprendiz, String sexo) {
        super(aprendizId);
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
