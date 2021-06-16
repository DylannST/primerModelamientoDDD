package sofka.example.campeonato;

import co.com.sofka.domain.generic.AggregateEvent;
import sofka.example.campeonato.events.JuegoActualizado;
import sofka.example.campeonato.events.JuegoAgregado;
import sofka.example.campeonato.events.JugadorActualizado;
import sofka.example.campeonato.events.JugadorAgregado;
import sofka.example.campeonato.values.*;
import sofka.example.generalValues.Fecha;
import sofka.example.reserva.values.ReservaId;

import java.util.List;
import java.util.Objects;

public class Campeonato extends AggregateEvent<CampeonatoId> {

    protected Juego juego;
    protected List<Jugador> jugadores;
    protected ReservaId reservaId;


    public Campeonato(CampeonatoId entityId, ReservaId reservaId) {
        super(entityId);
        this.reservaId = reservaId;
    }

    public void agregarJugador(JugadorId jugadorId, Edad edad, Puntaje puntaje, String sexo) {
        Objects.requireNonNull(jugadorId);
        Objects.requireNonNull(edad);
        Objects.requireNonNull(puntaje);
        Objects.requireNonNull(sexo);
        appendChange(new JugadorAgregado(jugadorId, edad, puntaje, sexo)).apply();
    }

    public void agregarJuego(JuegoId juegoId, Fecha fechaJuego, Jugador ganador, Jugador jugador1, Jugador jugador2) {
        Objects.requireNonNull(juegoId);
        Objects.requireNonNull(fechaJuego);
        Objects.requireNonNull(ganador);
        Objects.requireNonNull(jugador1);
        Objects.requireNonNull(jugador2);
        appendChange(new JuegoAgregado(juegoId, fechaJuego, ganador, jugador1, jugador2)).apply();
    }

    public void actualizarJugador(JugadorId jugadorId, Edad edad, Puntaje puntaje, String sexo) {
        Objects.requireNonNull(puntaje);
        appendChange(new JugadorActualizado(jugadorId, edad, puntaje, sexo)).apply();
    }

    public void actualizarJuego(JuegoId juegoId, Fecha fechaJuego, Jugador ganador, Jugador jugador1, Jugador jugador2) {
        Objects.requireNonNull(fechaJuego);
        Objects.requireNonNull(ganador);
        Objects.requireNonNull(jugador1);
        Objects.requireNonNull(jugador2);
        appendChange(new JuegoActualizado(juegoId, fechaJuego, ganador, jugador1, jugador2)).apply();
    }

}
