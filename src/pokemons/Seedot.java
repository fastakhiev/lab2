package pokemons;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import moves.*;

public class Seedot extends Pokemon{
    
    public Seedot(String name, int level) {
        super(name, level);
        this.setType(Type.GRASS);
        this.setStats(40, 40, 50, 30, 30, 30);
        this.setMove(new Swagger(), new DoubleTeam());
    }


}
