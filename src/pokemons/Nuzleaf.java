package pokemons;
import moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Nuzleaf extends Pokemon{
    public Nuzleaf(String name, int level) {
        super(name, level);
        this.setType(Type.GRASS, Type.DARK);
        this.setStats(70, 70, 40, 60, 40, 60);
        this.setMove(new Swagger(), new DoubleTeam(), new LeafBlade());
    }
}
