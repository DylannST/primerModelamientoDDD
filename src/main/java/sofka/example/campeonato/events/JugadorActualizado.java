package sofka.example.campeonato.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.example.campeonato.Jugador;
import sofka.example.campeonato.values.Edad;
import sofka.example.campeonato.values.JugadorId;
import sofka.example.campeonato.values.Puntaje;

public class JugadorActualizado extends DomainEvent {
    private JugadorId jugadorId;
    private final Edad edad;
    private final Puntaje puntaje;
    private final String sexo;

    public JugadorActualizado(JugadorId jugadorId, Edad edad, Puntaje puntaje, String sexo) {
        super("sofka.jugador.jugadorActualizado");
        this.jugadorId = jugadorId;
        this.edad = edad;
        this.puntaje = puntaje;
        this.sexo = sexo;
    }

    public Jugador juegoActualizado() {
        return new Jugador(this.jugadorId, this.edad, this.puntaje, this.sexo);
    }

    public JugadorId getJugadorId() {
        return jugadorId;
    }
}
