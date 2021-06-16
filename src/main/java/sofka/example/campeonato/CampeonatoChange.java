package sofka.example.campeonato;

import co.com.sofka.domain.generic.EventChange;
import sofka.example.campeonato.events.JuegoActualizado;
import sofka.example.campeonato.events.JuegoAgregado;
import sofka.example.campeonato.events.JugadorActualizado;
import sofka.example.campeonato.events.JugadorAgregado;

public class CampeonatoChange extends EventChange {
    public CampeonatoChange(Campeonato campeonato) {
        apply((JugadorAgregado event) -> {
            Jugador jugadorAux = new Jugador(event.getJugadorId(), event.getEdad(), event.getPuntaje(), event.getSexo());
            campeonato.jugadores.add(jugadorAux);
        });
        apply((JuegoAgregado event) -> {
            campeonato.juego = new Juego(event.getJuegoId(), event.getFechaJuego(), event.getGanador(), event.getJugador1(), event.getJugador2());
        });
        apply((JuegoActualizado event) -> {
            campeonato.juego = event.juegoActualizado();
        });
        apply((JugadorActualizado event) -> {
            int contador = 0;
            for (Jugador jugador : campeonato.jugadores) {
                contador++;
                if (jugador.getJugadorId().equals(event.getJugadorId())) {
                    break;
                }
            }
            Jugador jugador = event.juegoActualizado();
            campeonato.jugadores.set(contador, jugador);
            contador = 0;
        });
    }
}
