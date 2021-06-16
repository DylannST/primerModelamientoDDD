package sofka.example.campeonato.values;

import co.com.sofka.domain.generic.Identity;

public class JuegoId extends Identity {
    public JuegoId() {

    }

    private JuegoId(String id) {
        super(id);
    }

    public static JuegoId of(String id) {
        return new JuegoId(id);
    }
}
