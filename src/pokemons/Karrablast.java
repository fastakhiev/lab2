package pokemons;
import moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Karrablast extends Pokemon{
    public Karrablast(String name, int level) {
        super(name, level);
        this.setType(Type.BUG);
        this.setStats(50, 75, 45, 40, 45, 60);
        this.setMove(new SwordsDance(), new PoisonJab(), new BugBuzz());
    }
}
