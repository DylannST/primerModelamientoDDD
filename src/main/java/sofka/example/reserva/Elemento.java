package sofka.example.reserva;

import co.com.sofka.domain.generic.Entity;
import sofka.example.generalValues.Nombre;
import sofka.example.reserva.values.ElementoId;
import sofka.example.reserva.values.Estado;

public class Elemento extends Entity<ElementoId> {
    private final Nombre nombreElemento;
    private final Estado estado;

    public Elemento(ElementoId elementoId, Nombre nombreElemento, Estado estado) {
        super(elementoId);
        this.nombreElemento = nombreElemento;
        this.estado = estado;
    }
}
