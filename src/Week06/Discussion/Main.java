package Week06.Discussion;

import javax.swing.*;

public class Main {
    static String guitarName, color;
    static int numStrings;

    public static void main(String[] args) {

        getInput();
        Instrument instrument1 = new Guitar(guitarName, color, numStrings);
        getInput();
        Instrument instrument2 = new Bass(guitarName, color, numStrings);

        // print out object's variables
        System.out.println(instrument1);
        System.out.println(instrument2);

        // call run-time method tune() that displays tuning depending on object calling
        System.out.println(instrument1.tune());
        System.out.println(instrument2.tune());
        // testing tuning for different numString values entered
        instrument2.setNumStrings(5);
        System.out.println(instrument2.tune());
        instrument2.setNumStrings(4);
        System.out.println(instrument2.tune());
    } // end main

    // get user input
    public static void getInput() {
        String strInput;
        guitarName = JOptionPane.showInputDialog(null, "Enter name of guitar");
        color = JOptionPane.showInputDialog(null, "Select color");
        strInput = JOptionPane.showInputDialog(null, "Select number of strings");
        numStrings = Integer.parseInt(strInput);

    } // end getInput()
} // end class
