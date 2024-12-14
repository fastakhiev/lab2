package pokemons;
import ru.ifmo.se.pokemon.Type;
import moves.*;

public class Escavalier extends Karrablast{
    public Escavalier(String name, int level) {
        super(name, level);
        this.setType(Type.BUG, Type.STEEL);
        this.setStats(70, 135, 105, 60, 105, 20);
        this.addMove(new Twineedle());
    }
}
