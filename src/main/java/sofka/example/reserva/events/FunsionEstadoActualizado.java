package sofka.example.reserva.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.example.reserva.values.Estado;

public class FunsionEstadoActualizado extends DomainEvent {
    private final Estado estado;

    public FunsionEstadoActualizado(Estado estado) {
        super("sofka.reserva.FunsionEstadoActualizado");
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }
}
