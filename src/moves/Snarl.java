package moves;

import ru.ifmo.se.pokemon.*;

public class Snarl extends SpecialMove {
    public Snarl() {
        super(Type.DARK, 55.0, 0.95);
    }

    @Override
    protected String describe() {
        return "атакует атакой Snarl";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);

        pokemon.addEffect(
                new Effect().stat(Stat.SPECIAL_ATTACK, -1)
        );
    }
}
