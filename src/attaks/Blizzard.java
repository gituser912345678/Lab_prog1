package attaks;
import Main.Main;
import ru.ifmo.se.pokemon.*;
public class Blizzard extends SpecialMove {
    public Blizzard() {
        super(Type.ICE, 110, 70);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        if (Main.chance(0.1)) {
            Effect.freeze(pokemon);
        }
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        super.applyOppDamage(pokemon, v);
    }

    @Override
    protected String describe() {
        return "использует Blizzard";
    }
}
