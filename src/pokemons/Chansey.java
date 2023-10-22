package pokemons;

import attaks.Dream_Eater;
import attaks.Rest;
import attaks.Seismic_Toss;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Chansey extends Pokemon {
    public Chansey(String name, int lvl) {
        super(name, lvl);
        this.setType(Type.NORMAL);
        this.setStats(250, 5,5,35,105,50);

        Dream_Eater dream_eater = new Dream_Eater();
        Rest rest = new Rest();
        Seismic_Toss seismic_toss = new Seismic_Toss();


        this.setMove(dream_eater, rest, seismic_toss);
    }

}
