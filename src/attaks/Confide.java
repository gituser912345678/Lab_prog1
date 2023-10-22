package attaks;

import ru.ifmo.se.pokemon.*;

public class Confide extends PhysicalMove {
    public Confide() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect e = new Effect().stat(Stat.SPECIAL_ATTACK, -1);
        pokemon.addEffect(e);
    }

    @Override
    protected String describe() {
        return "использует Confide";
    }
}
