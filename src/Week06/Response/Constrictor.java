/*Shane Andrews  CMIS242 6383  24 Sept 2022
 *
 * simple program using dynamic binding
 *
 */

package Week06.Response;

public class Constrictor extends Predator {

    public Constrictor(String species, String vector) {
        super(species, vector);
    }

    @Override
    public String setAttack() {
        // TODO Auto-generated method stub
        return "suffocating";
    }

    public String toString() {
        return getSpecies() + " kills its prey by " + setAttack() + ", using its powerful " + getVector() + ".";
    }
}
