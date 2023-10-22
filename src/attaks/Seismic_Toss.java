package attaks;

import pokemons.Chansey;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Seismic_Toss extends PhysicalMove {
    public Seismic_Toss() {
        super(Type.FIGHTING, 0, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        super.applyOppDamage(pokemon, pokemon.getLevel());
    }

    @Override
    protected String describe() {
        return "использует Seismic_Toss";
    }
}
