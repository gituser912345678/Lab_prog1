package pokemons;

import attaks.Dream_Eater;
import attaks.Rest;
import attaks.Seismic_Toss;
import attaks.Work_Up;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Blissey extends Pokemon {
    public Blissey(String name, int lvl) {
        super(name, lvl);
        this.setType(Type.NORMAL);
        this.setStats(255, 10, 10, 75, 135, 55);

        Dream_Eater dream_eater = new Dream_Eater();
        Rest rest = new Rest();
        Seismic_Toss seismic_toss = new Seismic_Toss();
        Work_Up work_up = new Work_Up();

        this.setMove(dream_eater, rest, seismic_toss, work_up);
    }
}
