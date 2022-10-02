package Week06.Response;

public class Alligator extends Predator {

    public Alligator(String species, String vector) {
        super(species, vector);
    }

    @Override
    public String setAttack() {
        return "thrashing";
    }

    public String toString() {
        return getSpecies() + " kills its prey by " + setAttack() + ", using its powerful " + getVector() + ".";

    }
}
