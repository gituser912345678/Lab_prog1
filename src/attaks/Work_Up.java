package attaks;

import ru.ifmo.se.pokemon.*;

public class Work_Up extends PhysicalMove {
    public Work_Up() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        super.applySelfEffects(pokemon);
        Effect e = new Effect().stat(Stat.SPECIAL_ATTACK, 1).stat(Stat.ATTACK, 1);
        pokemon.addEffect(e);
    }

    @Override
    protected String describe() {
        return "использует Work Up";
    }
}
