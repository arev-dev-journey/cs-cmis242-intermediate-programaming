package Week06.Discussion;

public abstract class Instrument {
    // private variables
    private String name;
    private String color;
    private int numStrings;

    // default constructor
    public Instrument() {
        name = null;
        color = null;
        numStrings = 0;
    }

    // overloaded constructor
    public Instrument(String name, String color, int numStrings) {
        this.name = name;
        this.color = color;
        this.numStrings = numStrings;
    } // end overloaded constructor

    // accessor functions
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getNumStrings() {
        return numStrings;
    }
    // end accessor functions

    // mutator functions
    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }
    // end mutator functions

    // abstract method that is defined by child classes
    public abstract String tune();

    // overridden toString() displays objects values
    @Override
    public String toString() {
        return "name = [" + getName() + "], color = [" + getColor() + "], number of strings = [" + getNumStrings() + "]";
    } // end toString()
} // end abstract class
