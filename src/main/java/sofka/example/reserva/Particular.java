package sofka.example.reserva;

import co.com.sofka.domain.generic.Entity;
import sofka.example.generalValues.Nombre;
import sofka.example.reserva.values.ParticularId;

public class Particular extends Entity<ParticularId> {
    private final Nombre nombreParticular;

    public Particular(ParticularId entityId, Nombre nombreParticular) {
        super(entityId);
        this.nombreParticular = nombreParticular;
    }


    public Nombre nombreParticular() {
        return nombreParticular;
    }
}
