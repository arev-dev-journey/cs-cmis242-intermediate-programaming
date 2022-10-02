/*
Author: Alex Reveles
Date: 09-13-22
 */
package Week04.Assignment2;

public class SaltySnack extends Snack {
    // private attribute
    private boolean hasNuts;

    // SaltySnack constructor
    public SaltySnack(String id, char size, boolean hasNuts) {
        super(id, size);
        this.hasNuts = hasNuts;
        if(hasNuts) {
            setPrice(getPrice() + 4.5);
        }
    } // end constructor

    // get method
    public boolean isHasNuts() {
        return hasNuts;
    } // end get method

    // set method
    public void setHasNuts(boolean hasNuts) {
        this.hasNuts = hasNuts;
    } // end set method

    // overrifdden toString
    @Override
    public String toString() {
        return "You have chosen snack type = Salty Snack, of type = " + getSize()
                + ", and id = " + getId() + " and price = " + getPrice();
    } // end toString
} // end class
