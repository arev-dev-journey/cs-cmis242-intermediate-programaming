package Week03.Discussion;

public abstract class Animal {
    // attributes
    private String name;
    private double weight;
    public double price;

    // constructor
    public Animal(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    } // end constructor

    // accessor functions
    public String getName() {
        return name;
    } // end getName()

    public double getWeight() {
        return weight;
    } // end getWeight()

    public double getPrice() {
        return price;
    } // end getPrice()

    public String eat() {
        return getName() + " is eating";
    } // end eat()

    public String eat(double n) {
        this.weight += n;
        return getName() + " is eating " + n + "lbs of food";
    } // end eat(n)

    public String sellAnimal(double weight, double price) {
        return "Selling " + getName() + " for a total of $" + (weight * price);
    } // end sellAnimal()

    public String buyAnimal(double weight, double price) {
        return "Buying " + getName() + " weighing " + getWeight() + "lbs for $" + getPrice() + "/lb.";
    } // end buyAnimal()

    @Override
    public String toString() {
        return getName() + " weights " + getWeight() + "lbs and sells for $" + getPrice() + "/lb";
    } // end toString()
} // end class
