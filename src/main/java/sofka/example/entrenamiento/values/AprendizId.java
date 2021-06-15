package sofka.example.entrenamiento.values;

import co.com.sofka.domain.generic.Identity;

public class AprendizId extends Identity {
    public AprendizId() {

    }

    private AprendizId(String id) {
        super(id);
    }

    public static AprendizId of(String id) {
        return new AprendizId(id);
    }
}
