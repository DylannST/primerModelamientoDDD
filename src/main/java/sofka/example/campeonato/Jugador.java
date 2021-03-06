package sofka.example.campeonato;

import co.com.sofka.domain.generic.Entity;
import sofka.example.campeonato.values.Edad;
import sofka.example.campeonato.values.JugadorId;
import sofka.example.campeonato.values.Puntaje;

public class Jugador extends Entity {
    private JugadorId jugadorId;
    private final Edad edad;
    private final Puntaje puntaje;
    private final String sexo;

    public Jugador(JugadorId jugadorId, Edad edad, Puntaje puntaje, String sexo) {
        super(jugadorId);
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
