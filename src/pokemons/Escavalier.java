package pokemons;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import moves.*;

public class Escavalier extends Pokemon{
    public Escavalier(String name, int level) {
        super(name, level);
        this.setType(Type.BUG, Type.STEEL);
        this.setStats(70, 135, 105, 60, 105, 20);
        this.setMove(new SwordsDance(), new PoisonJab(), new BugBuzz(), new Twineedle());
    }
}
