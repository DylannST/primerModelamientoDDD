package sofka.example.reserva.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.example.generalValues.Fecha;

public class ReservaCreada extends DomainEvent {
    private final Fecha fecha;
    private final int hora;

    public ReservaCreada(Fecha fecha, int hora) {
        super("sofka.reserva.reservaCreada");
        this.fecha = fecha;
        this.hora = hora;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
