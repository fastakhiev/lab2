package moves;
import ru.ifmo.se.pokemon.*;

public class Twineedle extends PhysicalMove{
    public Twineedle() {
        super(Type.BUG, 25, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect().chance(0.2).condition(Status.POISON));
    }

    @Override
    protected String describe() {
        return "атакует атакой describe";
    }
    
}
