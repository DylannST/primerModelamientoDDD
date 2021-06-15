package sofka.example.reserva.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.example.generalValues.Nombre;
import sofka.example.reserva.values.ElementoId;
import sofka.example.reserva.values.Estado;

public class ElementoAsociado extends DomainEvent {
    private final ElementoId elementoId;
    private final Nombre nombreElemento;
    private final Estado estado;

    public ElementoAsociado(ElementoId elementoId, Nombre nombreElemento, Estado estado) {
        super("sofka.elemento.ElementoAsociado");
        this.elementoId = elementoId;
        this.nombreElemento = nombreElemento;
        this.estado = estado;
    }

    public Nombre getNombreElemento() {
        return nombreElemento;
    }

    public ElementoId getElementoId() {
        return elementoId;
    }

    public Estado getEstado() {
        return estado;
    }
}
