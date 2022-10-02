package Week07.Discussion;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        boolean invalidValue = true;
        String name;
        int numStrings;
        Guitar guitar = null;

        while(invalidValue) {

            String strInput;
            name = JOptionPane.showInputDialog(null, "Enter name of guitar");
            strInput = JOptionPane.showInputDialog(null, "Select number of strings");
            numStrings = Integer.parseInt(strInput);

            try {

                guitar = new Guitar(name, numStrings);
                invalidValue = false;

            } catch(IllegalGuitarNameArgumentException e) {
                System.out.println("\nError! Invalid guitar name: " + e.getMessage());

            } catch(IllegalGuitarStringsArgumentException e2) {
                System.out.println("\nError! Invalid number of guitar strings: " + e2.getMessage());
            }
        }
        System.out.println(guitar);
    }
}
