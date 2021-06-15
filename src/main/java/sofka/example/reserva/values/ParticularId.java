package sofka.example.reserva.values;

import co.com.sofka.domain.generic.Identity;

public class ParticularId extends Identity {
    public ParticularId() {
    }

    private ParticularId(String id) {
        super(id);
    }

    public static ParticularId of(String id) {
        return new ParticularId(id);
    }
}
