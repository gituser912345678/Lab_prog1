package pokemons;

import attaks.Confide;
import attaks.Ice_Beam;
import attaks.Scald;
import attaks.Thunder;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Kyogre extends Pokemon {
    public Kyogre(String name, int lvl) {
        super(name, lvl);
        this.setType(Type.WATER);
        this.setStats(100, 100, 90, 150, 140, 90);

        Scald scald = new Scald();
        Ice_Beam ice_beam = new Ice_Beam();
        Confide confide = new Confide();
        Thunder thunder = new Thunder();

        this.setMove(scald, ice_beam, confide, thunder);
    }
}
