package moves;
import ru.ifmo.se.pokemon.*;



public class Psychic extends SpecialMove{
    public Psychic() {
        super(Type.PSYCHIC, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
		p.addEffect(new Effect().chance(0.1).turns(1).stat(Stat.SPECIAL_DEFENSE,-1));
    }

    @Override
    protected String describe() {
        return "атакует атакой Psychic";
    }
    
}
