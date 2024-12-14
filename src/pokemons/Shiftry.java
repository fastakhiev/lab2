package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Shiftry extends Seedot {
    public Shiftry(String name, int level) {
        super(name, level);
        this.setStats(90, 100, 60, 90, 60, 80);
        this.setType(Type.GRASS, Type.DARK);
        this.addMove(new LeafBlade());
        this.addMove(new Snarl());
    }
}
