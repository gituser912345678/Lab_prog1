package attaks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import Main.Main;
public class Zan_Headbutt extends PhysicalMove {
    public Zan_Headbutt() {
        super(Type.PSYCHIC, 80, 90);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Main.chance(0.3)){
            Effect.confuse(pokemon);
        }
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        super.applyOppDamage(pokemon, v);
    }

    @Override
    protected String describe() {
        return "использует Zan Headbutt";
    }
}
