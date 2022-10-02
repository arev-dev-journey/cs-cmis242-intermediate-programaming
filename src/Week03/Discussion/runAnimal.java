package Week03.Discussion;

public class runAnimal {

    public static void main(String[] args) {
        Cow cow = new Cow("Bessy", 500.0, 10.0, false);
        Snake snake = new Snake("Andy", 150.0, 10.0, true);
        System.out.println(cow);
        System.out.println(cow.sellAnimal(cow.getWeight(), cow.getPrice()));
        System.out.println(cow.buyAnimal(cow.getWeight(), cow.getPrice()));
        System.out.println(snake);
        System.out.println(snake.sellAnimal(snake.getWeight(), snake.getPrice()));
        System.out.println(snake.buyAnimal(snake.getWeight(), snake.getPrice()));
        System.out.println(cow.eat());
        System.out.println(cow.eat(10.0));
        System.out.println(cow);
        System.out.println(snake.eat(12.0));
        System.out.println(snake);
        System.out.println(snake.buyAnimal(snake.getWeight(), snake.getPrice()));
    } // end main
} // end class
