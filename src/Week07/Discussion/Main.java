package Week07.Discussion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanstr = new Scanner(System.in);
        Scanner scanint = new Scanner(System.in);

        boolean invalidValue = true; // Controls while loop for input
        String name = null;
        int strings = 0;
        Guitar guitar = null;

        // loop until get valid name and age
        while(invalidValue) {

            // prompt for name
            System.out.println("\nEnter guitar name: ");
            name = scanstr.nextLine();

            // prompt for age
            System.out.println("Enter number of strings: ");
            strings = scanint.nextInt();

            try {

                guitar = new Guitar(name, strings); // create instance of Pet
                invalidValue = false; // constructor did not throw exception so can exit loop

            } catch(IllegalGuitarNameArgumentException e) {
                System.out.println("\nTRY AGAIN! Invalid guitar name: " + e.getMessage());

            } catch(IllegalGuitarStringsArgumentException e2) {
                System.out.println("\nTRY AGAIN! Invalid number of guitar strings: " + e2.getMessage());
            }
        }
        // code doing something with Pet instance
        System.out.println("\nSuccessfully create guitar with name=" + guitar.getName() + " strings=" + guitar.getStrings());
    }
}
