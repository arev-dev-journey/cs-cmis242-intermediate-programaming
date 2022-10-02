package Week03.Discussion;

public class Cow extends Animal {
    // attributes
    private boolean hasHorns;

    // constructor
    public Cow(String name, double weight, double price, boolean hasHorns) {
        super(name, weight, price);
        this.hasHorns = hasHorns;
        if(!hasHorns) {
            this.price *= 2;
        } // set price *= 2 if !hasHorns
    } // end constructor

    // overridden eat()
    @Override
    public String eat() {
        return getName() + " is chewing its food";
    } // end eat()

    // overridden eat(n)
    @Override
    public String eat(double n) {
        super.eat(n);
        return getName() + " is chewing " + n + "lbs of food";
    } // end eat(n)

    // overridden buyAnimal()
    @Override
    public String buyAnimal(double weight, double price) {
        return super.buyAnimal(weight, price) + " Be sure to keep " + getName() + " in a large grassy area";
    } // end buyAnimal()

    // overridden toString()
    @Override
    public String toString() {
        if(hasHorns) {
            return super.toString() + " and has horns";
        } else {
            return super.toString();
        }
    } // end toString
} // end class
