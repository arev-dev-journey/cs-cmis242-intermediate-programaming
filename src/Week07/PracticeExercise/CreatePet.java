package Week07.PracticeExercise;

import java.util.Scanner;

public class CreatePet {

    public static void main(String[] args) {

        Scanner scanstr = new Scanner(System.in);
        Scanner scanint = new Scanner(System.in);

        boolean invalidValue = true; // Controls while loop for input
        String name = null;
        int age = 0;
        Pet pet = null;

        // loop until get valid name and age
        while(invalidValue) {

            // prompt for name
            System.out.println("\nEnter pet name: ");
            name = scanstr.nextLine();

            // prompt for age
            System.out.println("Enter pet age: ");
            age = scanint.nextInt();

            try {

                pet = new Pet(name, age); // create instance of Pet
                invalidValue = false; // constructor did not throw exception so can exit loop

            } catch(IllegalPetNameArgumentException e) {
                System.out.println("\nTRY AGAIN! Invalid pet name: " + e.getMessage());

            } catch(IllegalPetAgeArgumentException e2) {
                System.out.println("\nTRY AGAIN! Invalid pet age: " + e2.getMessage());
            }
        }
        // code doing something with Pet instance
        System.out.println("\nSuccessfully create Pet with name=" + pet.getName() + " age=" + pet.getAge());
    }
}
