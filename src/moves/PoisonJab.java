package moves;
import ru.ifmo.se.pokemon.*;


public class PoisonJab extends PhysicalMove {
    public PoisonJab () {
        super(Type.POISON, 80, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().condition(Status.POISON).chance(0.3));
    }

    @Override
    protected String describe() {
        return "атакует атакой Poison Jab";
    }
}
