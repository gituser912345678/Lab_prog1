package pokemons;

import attaks.Zan_Headbutt;
import attaks.Blizzard;
import attaks.Scald;
import attaks.Zan_Headbutt;
import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

import java.util.concurrent.locks.Condition;

public class Slowpoke extends Pokemon {

    public Slowpoke(String name, int lvl){
        super(name, lvl);
        this.setType(Type.WATER, Type.PSYCHIC);
        this.setStats(90,65,65,40,40,15);


        Scald scald = new Scald();
        Zan_Headbutt zan_headbutt = new Zan_Headbutt();

        this.setMove(new Blizzard(), scald, zan_headbutt);
    }

}
