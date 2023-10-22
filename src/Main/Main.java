package Main;
import pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;
import pokemons.Slowking;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon[] str = new Pokemon[]{new Slowpoke("slowpoke", 1), new Slowking("slowking", 1), new Kyogre("kyogre", 1), new Blissey("blissey", 1), new Happiny("happiny", 1), new Chansey("chansey", 1)};
        int Team1 = 0;
        int Team2 = 0;
        for (Pokemon i : str) {
            if (Math.random() > 0.5){
                b.addAlly(i);
                Team1 += 1;
            }
            else {
                b.addFoe(i);
                Team2 += 1;
            }
        }
        if (Team1 == 0){
            System.out.println("Team1 - нет игроков");
        }
        else if (Team2 == 0){
            System.out.println("Team1 - нет игроков");
        }
        else {
            b.go();
        }
    }
    public static boolean chance(double chance){
        return chance > Math.random();
    }
}
