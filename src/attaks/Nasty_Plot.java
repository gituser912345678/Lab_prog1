package attaks;

import ru.ifmo.se.pokemon.*;

public class Nasty_Plot extends PhysicalMove {
    public Nasty_Plot() {
        super(Type.DARK, 0, 0);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect e = new Effect().stat(Stat.SPECIAL_ATTACK, 2);
        pokemon.addEffect(e);
    }

    @Override
    protected String describe() {
        return "использует Nasty Plot";
    }
}
