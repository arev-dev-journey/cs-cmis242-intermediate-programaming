package Week06.Discussion;

public class Guitar extends Instrument {
    // default constructor
    public Guitar() {
        super();
    } // end default constructor

    // overloaded constructor
    public Guitar(String name, String color, int numStrings) {
        super(name, color, numStrings);
    } // end overloaded constructor

    @Override // method defined at run-time
    public String tune() {
        if(getNumStrings() == 6) {
            return "Tuning guitar to E, A, D, G, B, E";
        } else {
            return "Unknown tuning for guitar";
        }
    } // end tune()
} // end class
