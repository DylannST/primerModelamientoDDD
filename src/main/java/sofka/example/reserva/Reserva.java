package sofka.example.reserva;

import co.com.sofka.domain.generic.AggregateEvent;
import sofka.example.generalValues.Fecha;
import sofka.example.generalValues.Nombre;
import sofka.example.reserva.events.ElementoAsociado;
import sofka.example.reserva.events.FunsionEstadoActualizado;
import sofka.example.reserva.events.ParticularAgregado;
import sofka.example.reserva.events.ReservaCreada;
import sofka.example.reserva.values.ElementoId;
import sofka.example.reserva.values.Estado;
import sofka.example.reserva.values.ParticularId;
import sofka.example.reserva.values.ReservaId;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Reserva extends AggregateEvent<ReservaId> {

    protected int hora;
    protected Fecha fecha;
    protected List<Particular> particulares;
    protected List<Elemento> elementos;


    public Reserva(ReservaId entityId, Fecha fecha, int hora) {
        super(entityId);
        appendChange(new ReservaCreada(fecha, hora)).apply();
    }

    public Reserva(ReservaId entityId) {
        super(entityId);
        subscribe(new ReservaChange(this));
    }

    public void agregarParticular(ParticularId entityId, Nombre nombreParticular) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombreParticular);
        appendChange(new ParticularAgregado(entityId, nombreParticular)).apply();
    }

    public void agregarElemento(ElementoId elementoId, Nombre nombreElemento, Estado estado) {
        appendChange(new ElementoAsociado(elementoId, nombreElemento, estado)).apply();
    }

    public void actualizarEstadoFunsion(Estado estado) {
        appendChange(new FunsionEstadoActualizado(estado)).apply();
    }

    public Optional<Particular> obtenerParticularPorId(ParticularId particularId) {
        return particulares
                .stream()
                .filter(particular -> particular.identity().equals(particularId))
                .findFirst();
    }


    public int hora() {
        return hora;
    }

    public Fecha fecha() {
        return fecha;
    }

    public List<Particular> particulares() {
        return particulares;
    }

    public List<Elemento> elementos() {
        return elementos;
    }
}
