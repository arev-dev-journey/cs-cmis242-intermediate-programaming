package Week03.Discussion;

public class Snake extends Animal {
    // attributes
    private boolean isVenomous;

    // constructor
    public Snake(String name, double weight, double price, boolean isVenomous) {
        super(name, weight, price);
        this.isVenomous = isVenomous;
        if(isVenomous) {
            this.price *= 3;
        }    // set price *=3 if venomous
    } // end constructor

    // overridden eat()
    @Override
    public String eat() {
        return getName() + " is swallowing its food whole";
    } // end eat()

    // overridden eat(n)
    @Override
    public String eat(double n) {
        super.eat(n);
        return getName() + " is swallowing " + n + "lbs of food whole";
    } // end eat(n)

    // overridden buyAnimal()
    @Override
    public String buyAnimal(double weight, double price) {
        return super.buyAnimal(weight, price) + " Be sure to keep " + getName() + " in a heated tank";
    } // end buyAnimal()

    // overridden toString()
    @Override
    public String toString() {
        if(isVenomous) {
            return super.toString() + " and is venomous";
        } else {
            return super.toString();
        }
    } // end toString()
} // end class
