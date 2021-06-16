package sofka.example.campeonato.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.example.campeonato.Juego;
import sofka.example.campeonato.Jugador;
import sofka.example.campeonato.values.JuegoId;
import sofka.example.generalValues.Fecha;

public class JuegoActualizado extends DomainEvent {
    private JuegoId juegoId;
    private final Fecha fechaJuego;
    private final Jugador ganador;
    private final Jugador jugador1;
    private final Jugador jugador2;

    public JuegoActualizado(JuegoId juegoId, Fecha fechaJuego, Jugador ganador, Jugador jugador1, Jugador jugador2) {
        super("sofka.juego.juegoAgregado");
        this.juegoId = juegoId;
        this.fechaJuego = fechaJuego;
        this.ganador = ganador;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }


    public Juego juegoActualizado() {
        return new Juego(this.juegoId, this.fechaJuego, this.ganador, this.jugador1, this.jugador2);
    }
}
