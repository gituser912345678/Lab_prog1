package attaks;

import pokemons.Happiny;
import ru.ifmo.se.pokemon.*;

public class Rest extends PhysicalMove {
    public Rest() {
        super(Type.PSYCHIC, 0, 0);
    }
    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect e = new Effect().turns(3);
        pokemon.addEffect(e);
        Effect.sleep(pokemon);
        int hpp = (100 - ((int)pokemon.getHP()));
        pokemon.setMod(Stat.HP, -hpp);
    }

    @Override
    protected String describe() {
        return "использует Rest";
    }
}
