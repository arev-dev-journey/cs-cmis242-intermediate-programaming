/*
Author: Alex Reveles
Date: 09-13-22
 */
package Week04.Assignment2;

public class Snack {
    // private attributes
    private String id;
    private char size;
    private double price;

    // Snack constructor
    public Snack(String id, char size) {
        this.id = id;
        this.size = size;
        if(this.size == 'S') {
            price = 19.99;
        } else if(this.size == 'M') {
            price = 29.99;
        } else if(this.size == 'L') {
            price = 39.99;
        }
    }

    // overridden toString to return values chosen
    @Override
    public String toString() {
        return "You have chosen snack type = , of type = "
                + getSize() + ", id = " + getId() + " and price = " + getPrice();
    } // end toString

    // get methods for Snack
    public String getId() {
        return id;
    }

    public char getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }
    // end get methods

    // set methods for Snack
    public void setId(String id) {
        this.id = id;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    // end set methods
}
