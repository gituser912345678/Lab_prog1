package pokemons;

import attaks.Blizzard;
import attaks.Nasty_Plot;
import attaks.Scald;
import attaks.Zan_Headbutt;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Slowking extends Pokemon {
    public Slowking(String name, int lvl) {
        super(name, lvl);
        this.setType(Type.WATER, Type.PSYCHIC);
        this.setStats(95, 75, 80, 100, 110, 30);

        Blizzard blizzard = new Blizzard();
        Scald scald = new Scald();
        Zan_Headbutt zan_headbutt = new Zan_Headbutt();
        Nasty_Plot nasty_plot = new Nasty_Plot();

        this.setMove(blizzard, scald, zan_headbutt, nasty_plot);
    }
}
