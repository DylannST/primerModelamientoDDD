package sofka.example.campeonato.events;

import co.com.sofka.domain.generic.DomainEvent;
import sofka.example.campeonato.values.Edad;
import sofka.example.campeonato.values.JugadorId;
import sofka.example.campeonato.values.Puntaje;

public class JugadorAgregado extends DomainEvent {

    private final JugadorId jugadorId;
    private final Edad edad;
    private final Puntaje puntaje;
    private final String sexo;


    public JugadorAgregado(JugadorId jugadorId, Edad edad, Puntaje puntaje, String sexo) {
        super("sofka.jugador.jugadorCreado");
        this.jugadorId = jugadorId;
        this.edad = edad;
        this.puntaje = puntaje;
        this.sexo = sexo;
    }

    public JugadorId getJugadorId() {
        return jugadorId;
    }

    public Edad getEdad() {
        return edad;
    }

    public Puntaje getPuntaje() {
        return puntaje;
    }

    public String getSexo() {
        return sexo;
    }
}
