package Week06.Discussion;

public class Bass extends Instrument {

    // default constructor
    public Bass() {
        super();
    } // end default constructor

    // overloaded constructor
    public Bass(String name, String color, int numStrings) {
        super(name, color, numStrings);
    } // end overloaded constructor

    @Override // method defined at run-time
    public String tune() {
        if(getNumStrings() == 4) {
            return "Tuning 4-string bass to E, A, D, G";
        } else if(getNumStrings() == 5) {
            return "Tuning 5-string bass to B, E, A, D, G";
        } else if(getNumStrings() == 6) {
            return "Tuning 6-string bass to B, E, A, D, G, C";
        } else {
            return "Unknown tuning for bass";
        }
    } // end tune()
} // end class
