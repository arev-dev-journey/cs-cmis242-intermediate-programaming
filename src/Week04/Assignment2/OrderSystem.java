/*
Author: Alex Reveles
Date: 09-13-22
 */

package Week04.Assignment2;

import java.util.Scanner;

public class OrderSystem {
    // method for displaying menu
    public void displayMenu() {
        System.out.println("MENU\n1. Order a Snack\n2. Exit program\nEnter your selection");
    } // end displayMenu

    // method for processing user input
    public void processChoice(int c) {
        switch(c) {
            case 1:
                Scanner scanner = new Scanner(System.in);
                System.out.println("Do you want Fruit Snack (1) or Salty Snack (2): ");
                int fruitInput = scanner.nextInt();
                System.out.println("What size do you want: S, M, or L: ");
                char sizeChoice = scanner.next().charAt(0);
                if(fruitInput == 1) {
                    System.out.println("Do you want citrus fruit included? true/false: ");
                    boolean wantCitrus = scanner.nextBoolean();
                    FruitSnack fruitSnack = new FruitSnack("A001", sizeChoice, wantCitrus);
                    System.out.println(fruitSnack);
                } else {
                    System.out.println("Do you want nut snack include? true/false: ");
                    boolean wantNuts = scanner.nextBoolean();
                    SaltySnack saltySnack = new SaltySnack("B001", sizeChoice, wantNuts);
                    System.out.println(saltySnack);
                }
                break;
        }
    } // end processChoice

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OrderSystem orderSystem = new OrderSystem();
        int input;
        do {
            orderSystem.displayMenu();
            input = scanner.nextInt();
            orderSystem.processChoice(input);

        } while(input != 2);
        System.out.println("Thank you for using the program. Goodbye!");
        scanner.close();
    } // end main
} // end class