package moves;
import ru.ifmo.se.pokemon.*;

public class ThunderWave extends StatusMove{
    public ThunderWave() {
        super(Type.ELECTRIC, 0, 90);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setCondition(new Effect().condition(Status.PARALYZE));
    }

    @Override
    protected String describe() {
        return "атакует атакой ThunderWave";
    }
}
