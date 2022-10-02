/*
Author: Alex Reveles
Date: 09/27/2022
Description: DistanceConverter class that converts M to KM
*/
package Week06.Assignment3;

public class DistanceConverter extends Converter {
    // default constructor
    public DistanceConverter() {
        super();
    }

    // overloaded constructor
    public DistanceConverter(double input) {
        super(input);
    }

    // overriding superclass method to return conversion M to KM
    @Override
    public double convert() {
        if(super.getInput() == Double.NaN) {
            return Double.NaN;
        } else {
            return super.getInput() * 1.609;
        }
    } // end convert()

} // end class
