package sofka.example.reserva.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.example.generalValues.Fecha;

public class ReservaActualizada extends DomainEvent {
    private final Fecha fecha;

    public ReservaActualizada(Fecha fecha) {
        super("sofka.reserva.reservaactualizada");
        this.fecha = fecha;
    }

    public Fecha getReserva() {
        return fecha;
    }
}
