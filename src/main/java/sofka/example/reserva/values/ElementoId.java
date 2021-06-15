package sofka.example.reserva.values;

import co.com.sofka.domain.generic.Identity;

public class ElementoId extends Identity {
    public ElementoId() {
    }

    private ElementoId(String id) {
        super(id);
    }

    public static ElementoId of(String id) {
        return new ElementoId(id);
    }
}
