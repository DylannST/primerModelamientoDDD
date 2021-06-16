package sofka.example.campeonato.values;

import co.com.sofka.domain.generic.Identity;

public class JugadorId extends Identity {
    public JugadorId() {

    }

    private JugadorId(String id) {
        super(id);
    }

    public static JugadorId of(String id) {
        return new JugadorId(id);
    }
}
