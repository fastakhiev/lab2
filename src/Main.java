import ru.ifmo.se.pokemon.*;
import pokemons.*;


public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Karrablast karrablast = new Karrablast("Karrablast", 44);
        HoopaConfined hoopa = new HoopaConfined("Hoopa Confinded", 1);
        Escavalier escavalier = new Escavalier("Escavalier", 44);
        Seedot seedot = new Seedot("Seedot", 1);
        Nuzleaf nuzleaf = new Nuzleaf("Nuzleaf", 57);
        Shiftry shiftry = new Shiftry("Shiftry", 1);
        b.addAlly(karrablast);
        b.addAlly(escavalier);
        b.addAlly(nuzleaf);
        b.addFoe(hoopa);
        b.addFoe(seedot);
        b.addFoe(shiftry);
        b.go();

    }
}