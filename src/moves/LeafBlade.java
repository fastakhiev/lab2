package moves;
import ru.ifmo.se.pokemon.*;


public class LeafBlade extends PhysicalMove {
    public LeafBlade(){
        super(Type.GRASS, 90, 100);
    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def){
        return 3;
    }

    @Override
    protected String describe(){
        return "атакует атакой LeafBlade";
    }
}
