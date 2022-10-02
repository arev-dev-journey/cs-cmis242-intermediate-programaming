package Week06.Response;

public class Killers {

    public static void main(String[] args) {
        Predator polarBear = new Bear("polar bear", "claws");
        System.out.println("The " + polarBear + "\n");

        Predator boaConstrictor = new Constrictor("boa constrictor", "coils");
        System.out.println("The " + boaConstrictor + "\n");

        Predator gilaMonster = new Gila("gila monster", "toxic saliva");
        System.out.println("The " + gilaMonster + "\n");

        Predator alligator = new Alligator("alligator", "jaws");
        System.out.println("The " + alligator + "\n");
    }

}
