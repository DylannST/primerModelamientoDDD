package sofka.example.reserva;

import co.com.sofka.domain.generic.EventChange;
import sofka.example.reserva.events.ElementoAsociado;
import sofka.example.reserva.events.ParticularAgregado;
import sofka.example.reserva.events.ReservaCreada;

import java.util.ArrayList;

public class ReservaChange extends EventChange {
    public ReservaChange(Reserva reserva) {
        apply((ReservaCreada event) -> {
            reserva.fecha = event.getFecha();
            reserva.particulares = new ArrayList<>();
        });
        apply((ElementoAsociado event) -> {
            reserva.elementos = new ArrayList<>();

        });
        apply((ParticularAgregado event)->{
        });
    }
}
