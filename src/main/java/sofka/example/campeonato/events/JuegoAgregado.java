package sofka.example.campeonato.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.example.campeonato.Jugador;
import sofka.example.campeonato.values.JuegoId;
import sofka.example.generalValues.Fecha;

public class JuegoAgregado extends DomainEvent {

    private final JuegoId juegoId;
    private final Fecha fechaJuego;
    private final Jugador ganador;
    private final Jugador jugador1;
    private final Jugador jugador2;

    public JuegoAgregado(JuegoId juegoId, Fecha fechaJuego, Jugador ganador, Jugador jugador1, Jugador jugador2) {
        super("sofka.juego.juegoAgregado");
        this.juegoId = juegoId;
        this.fechaJuego = fechaJuego;
        this.ganador = ganador;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    public JuegoId getJuegoId() {
        return juegoId;
    }

    public Fecha getFechaJuego() {
        return fechaJuego;
    }

    public Jugador getGanador() {
        return ganador;
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }
}
