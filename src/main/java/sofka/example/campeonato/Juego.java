package sofka.example.campeonato;

import co.com.sofka.domain.generic.Entity;
import sofka.example.campeonato.values.JuegoId;
import sofka.example.generalValues.Fecha;

public class Juego extends Entity {

    private final Fecha fechaJuego;
    private final Jugador ganador;
    private final Jugador jugador1;
    private final Jugador jugador2;

    public Juego(JuegoId juegoId, Fecha fechaJuego, Jugador ganador, Jugador jugador1, Jugador jugador2) {
        super(juegoId);
        this.fechaJuego = fechaJuego;
        this.ganador = ganador;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
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
