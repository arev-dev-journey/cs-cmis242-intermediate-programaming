/*Shane Andrews  CMIS242 6383  24 Sept 2022
 *
 * simple program using dynamic binding
 *
 */

package Week06.Response;

public class Gila extends Predator {

    public Gila(String species, String vector) {
        super(species, vector);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String setAttack() {
        return "poisoning";
    }

    public String toString() {
        return getSpecies() + " kills its prey by " + setAttack() + ", using its lethal " + getVector() + ".";
    }
}