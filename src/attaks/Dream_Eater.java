package attaks;

import pokemons.Happiny;
import ru.ifmo.se.pokemon.*;

public class Dream_Eater extends SpecialMove {
    public Dream_Eater() {
        super(Type.PSYCHIC, 100, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        super.applyOppDamage(pokemon, v);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        super.applySelfEffects(pokemon);
        int hpp = (100 - ((int)pokemon.getHP()))/2;
        pokemon.setMod(Stat.HP, -hpp);
    }

    @Override
    protected String describe() {
        return "использует Dream Eater";
    }
}
