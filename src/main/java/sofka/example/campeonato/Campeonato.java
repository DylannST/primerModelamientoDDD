package sofka.example.campeonato;

import co.com.sofka.domain.generic.AggregateEvent;
import sofka.example.campeonato.values.CampeonatoId;
import sofka.example.reserva.values.ReservaId;

import java.util.List;

public class Campeonato extends AggregateEvent<CampeonatoId> {

    protected Juego juego;
    protected List<Jugador> jugadores;
    protected ReservaId reservaId;


    public Campeonato(CampeonatoId entityId) {
        super(entityId);
    }

    public void agregarJugadorAsociado(){

    }
}
