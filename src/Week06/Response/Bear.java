/*Shane Andrews  CMIS242 6383  24 Sept 2022
 *
 * simple program using dynamic binding
 *
 */

package Week06.Response;


public class Bear extends Predator {

    public Bear(String species, String vector) {
        super(species, vector);
    }

    @Override
    public String setAttack() {
        return "mauling";
    }

    public String toString() {
        return getSpecies() + " kills its prey by " + setAttack() + ", using its razor-sharp " + getVector() + ".";
    }
}
