package sofka.example.reserva.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.example.generalValues.Nombre;
import sofka.example.reserva.values.ParticularId;

public class ParticularAgregado extends DomainEvent {
    private final ParticularId particularId;
    private final Nombre nombreParticular;

    public ParticularAgregado(ParticularId particularId, Nombre nombreParticular) {
        super("sofka.particular.particularAgregado");

        this.particularId = particularId;
        this.nombreParticular = nombreParticular;
    }

    public ParticularId getParticularId() {
        return particularId;
    }

    public Nombre getNombreParticular() {
        return nombreParticular;
    }
}
