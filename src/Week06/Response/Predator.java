package Week06.Response;

public abstract class Predator {
    private String species;
    private String vector;


    public Predator(String species, String vector) {
        this.species = species;
        this.vector = vector;
    }

    //getter methods
    public String getSpecies() {
        return species;
    }

    public String getVector() {
        return vector;
    }

    //Abstract method to be defined in iPhone and Android
    public abstract String setAttack();

    public String toString() {
        return species + " attacks by " + vector;
    }
}
