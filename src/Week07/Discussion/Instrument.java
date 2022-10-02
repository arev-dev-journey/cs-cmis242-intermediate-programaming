package Week07.Discussion;

public abstract class Instrument {
    // private variables
    private String name;
    private int numStrings;

    // default constructor
    public Instrument() {
        name = null;
        numStrings = 0;
    }

    // overloaded constructor
    public Instrument(String name, int numStrings) {
        this.name = name;
        this.numStrings = numStrings;
    } // end overloaded constructor

    // accessor functions
    public String getName() {
        return name;
    }

    public int getNumStrings() {
        return numStrings;
    }
    // end accessor functions

    // mutator functions
    public void setName(String name) {
        this.name = name;
    }

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }
    // end mutator functions

    // overridden toString() displays objects values
    @Override
    public String toString() {
        return "name = [" + getName() + "], number of strings = [" + getNumStrings() + "]";
    } // end toString()
} // end abstract class
