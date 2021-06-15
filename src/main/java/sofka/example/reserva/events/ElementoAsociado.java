package sofka.example.reserva.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.example.reserva.values.ElementoId;

public class ElementoAsociado extends DomainEvent {
    private ElementoId elementoId;

    public ElementoAsociado(ElementoId elementoId) {
        super("sofka.elemento.ElementoAsociado");
        this.elementoId = elementoId;
    }
}
