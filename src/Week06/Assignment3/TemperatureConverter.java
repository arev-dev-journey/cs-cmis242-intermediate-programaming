/*
Author: Alex Reveles
Date: 09/27/2022
Description: TemperatureConverter class that converts F to C
*/
package Week06.Assignment3;

public class TemperatureConverter extends Converter {
    // default constructor
    public TemperatureConverter() {
        super();
    }

    // overloaded constructor
    public TemperatureConverter(double input) {
        super(input);
    }

    // overriding superclass method to return conversion from F to C
    @Override
    public double convert() {
        if(super.getInput() == Double.NaN) {
            return Double.NaN;
        } else {
            return (((super.getInput() - 32) * 5) / 9);
        }
    } // end convert()
} // end class
