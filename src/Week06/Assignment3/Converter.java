/*
Author: Alex Reveles
Date: 09/27/2022
Description: Converter abstract superclass
*/
package Week06.Assignment3;

public abstract class Converter {
    private double input;

    // default constructor
    public Converter() {
        this.input = Double.NaN;
    } // default constructor sends no input to Double.NaN

    // overloaded constructor
    public Converter(double input) {
        this.input = input;
    }

    // accessor method
    public double getInput() {
        return input;
    }

    // mutator method
    public void setInput(double input) {
        this.input = input;
    }

    // abstract method to be defined by subclass
    public abstract double convert();

}

