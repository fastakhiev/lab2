package pokemons;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import moves.*;


public class HoopaConfined extends Pokemon{
    
    public HoopaConfined(String name, int level) {
        super(name, level);
        this.setType(Type.PSYCHIC, Type.GHOST);
        this.setStats(80, 110, 60, 150, 130, 70);
        this.setMove(new Facade(), new Thunderbolt(), new Psychic());
    }
}
