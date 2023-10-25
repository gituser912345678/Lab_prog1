package Main;
import org.w3c.dom.Node;
import pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;
import pokemons.Slowking;
import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.Type;

import java.util.ArrayList;
import java.util.Queue;
import java.lang.reflect.*;
import java.util.LinkedList;


public class Main {
    private static Class cls;

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        Battle privateObject = new Battle();

        privateObject.addAlly(new Slowpoke("slowpoke", 1));
        privateObject.addAlly(new Slowpoke("slowpoke", 1));
        privateObject.addFoe(new Slowpoke("slowpoke", 1));

        Field privateStringField = Battle.class.getDeclaredField("allies");
        privateStringField.setAccessible(true);

        Object o = privateStringField.get(privateObject);

        Field f = o.getClass().getDeclaredField("team");
        f.setAccessible(true);
        LinkedList<Pokemon> f1 = (LinkedList) f.get(o);

        Field privateStringField1 = Battle.class.getDeclaredField("foes");
        privateStringField1.setAccessible(true);

        Object o1 = privateStringField1.get(privateObject);

        Field f3 = o1.getClass().getDeclaredField("team");
        f3.setAccessible(true);
        LinkedList<Pokemon> f2 = (LinkedList) f3.get(o1);

        if (f1.isEmpty() == true || f2.isEmpty() == true){
            System.out.println("Неполная команда");
        }
        else {
            privateObject.go();
        }
    }
    public static boolean chance(double chance){
        return chance > Math.random();
    }
}
