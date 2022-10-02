/*
Author: Alex Reveles
Date: 09/27/2022
Description: GUIConverter program that asks 
for user to input value to convert M to KM 
and F to C using a GUI.
*/
package Week06.Assignment3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIConverter {
    private static class DistanceHandler implements ActionListener {
        private JFrame window = null;

        // setup frame to be used in JOptionPane
        public DistanceHandler(JFrame frame) {
            window = frame;
        }

        public void actionPerformed(ActionEvent e) {
            String msg = "Input miles distance to convert";
            String str = JOptionPane.showInputDialog(window, msg);
            Double miles = Double.parseDouble(str);
            DistanceConverter distanceConverter1 = new DistanceConverter(miles);
            JOptionPane.showMessageDialog(window, str + " Miles equals "
                    + String.format("%.2f", distanceConverter1.convert()) + " Kilometers");
        }
    } // end class DistanceHandler

    private static class ExitHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    } // end class ExitHandler

    private static class TemperatureHandler implements ActionListener {
        private JFrame window = null;

        // setup frame to be used in JOptionPane
        public TemperatureHandler(JFrame frame) {
            window = frame;
        }

        public void actionPerformed(ActionEvent e) {
            String msg = "Enter fahrenheit temperature to convert";
            String str = JOptionPane.showInputDialog(window, msg);
            Double temp = Double.parseDouble(str);
            TemperatureConverter temperatureConverter1 = new TemperatureConverter(temp);
            JOptionPane.showMessageDialog(window, str + " F equals "
                    + String.format("%.2f", temperatureConverter1.convert()) + " C");
        }

    } // end class TemperatureHandler

    public static void main(String[] args) {
        // create JButton instances
        JButton distanceButton = new JButton("Distance Converter");
        JButton temperatureButton = new JButton("Temperature Converter");
        JButton exitButton = new JButton("Exit");

        // create frame
        JFrame window = new JFrame("Welcome to Converter");

        // add buttons to the panel
        JPanel content = new JPanel();
        content.setLayout(new BorderLayout());

        // create listeners and add to buttons
        DistanceHandler distanceListener = new DistanceHandler(window);
        distanceButton.addActionListener(distanceListener);
        ExitHandler exitListener = new ExitHandler();
        exitButton.addActionListener(exitListener);
        TemperatureHandler tempListener = new TemperatureHandler(window);
        temperatureButton.addActionListener(tempListener);

        // add buttons to the panel widget
        content.add(distanceButton, BorderLayout.WEST);
        content.add(exitButton, BorderLayout.SOUTH);
        content.add(temperatureButton, BorderLayout.EAST);

        // adds content we created above
        window.setContentPane(content);

        // setup size and location
        window.setSize(550, 300); // sets the size of the window
        window.setLocation(400, 250); // sets the x,y location of where it should display
        window.setVisible(true);    // makes it visible
    } // end main

} // end class GUIConverter