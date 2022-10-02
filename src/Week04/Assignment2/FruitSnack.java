/*
Author: Alex Reveles
Date: 09-13-22
 */
package Week04.Assignment2;

public class FruitSnack extends Snack {
    // private attribute
    private boolean isCitrus;

    // constructor
    public FruitSnack(String id, char size, boolean isCitrus) {
        super(id, size);
        this.isCitrus = isCitrus;
        if(isCitrus) {
            setPrice(getPrice() + 5.99);
        } // increasing price if isCitrus is true
    } // end constructor

    // get method
    public boolean isCitrus() {
        return isCitrus;
    } // end get method

    // set method
    public void setCitrus(boolean citrus) {
        isCitrus = citrus;
    } // end set method

    // overridden toString
    @Override
    public String toString() {
        return "You have chosen snack type = Fruit Snack, of type = " + getSize()
                + ", and id = " + getId() + " and price = " + getPrice();
    } // end toString
} // end class
