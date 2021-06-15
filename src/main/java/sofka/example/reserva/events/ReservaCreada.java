package sofka.example.reserva.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.example.generalValues.Fecha;

public class ReservaCreada extends DomainEvent {
    private final Fecha fecha;

    public ReservaCreada(Fecha fecha) {
        super("sofka.reserva.reservaCreada");
        this.fecha = fecha;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
