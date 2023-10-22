package pokemons;

import attaks.Dream_Eater;
import attaks.Rest;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Happiny extends Pokemon {
    public Happiny(String name, int lvl) {
        super(name, lvl);
        this.setType(Type.NORMAL);
        this.setStats(100, 5, 5, 15, 65, 30);

        Dream_Eater dream_eater = new Dream_Eater();
        Rest rest = new Rest();

        this.setMove(dream_eater, rest);
    }

}
