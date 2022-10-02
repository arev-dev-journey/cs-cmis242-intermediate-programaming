package Week05.PracticeExercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons {
    // counter event handler
    private static class CounterHandler implements ActionListener {
        private int clicks = 0;
        private JFrame window = null;

        // setup frame to be used in JOptionPane
        public CounterHandler(JFrame frame) {
            window = frame;
        }

        public void actionPerformed(ActionEvent e) {
            clicks++;
            String msg = "Counter clicked = " + clicks;
            JOptionPane.showMessageDialog(window, msg);
        }
    }

    // exit event handler
    private static class ExitHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    // message event handler
    private static class MessageHandler implements ActionListener {
        private JFrame window = null;

        // setup frame to be used in JOptionPane
        public MessageHandler(JFrame frame) {
            window = frame;
        }

        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(window, "Hello World!!!");
        }
    }

    public static void main(String[] args) {
        // create JButton instances
        JButton countButton = new JButton("COUNTER");
        JButton msgButton = new JButton("MESSAGE");
        JButton exitButton = new JButton("EXIT");
        // create frame
        JFrame window = new JFrame("Welcome");
        // add buttons to the panel
        JPanel content = new JPanel();
        content.setLayout(new BorderLayout());
        // create listeners and add to buttons
        CounterHandler countListener = new CounterHandler(window);
        countButton.addActionListener(countListener);
        ExitHandler exitListener = new ExitHandler();
        exitButton.addActionListener(exitListener);
        MessageHandler msgListener = new MessageHandler(window);
        msgButton.addActionListener(msgListener);
        // add buttons to panel widget to the pa
        content.add(countButton, BorderLayout.EAST);
        content.add(exitButton, BorderLayout.CENTER);
        content.add(msgButton, BorderLayout.WEST);
        // adds content we created above
        window.setContentPane(content);
        // setup size and location
        window.setSize(450, 200); // sets size of the window
        window.setLocation(300, 400); // sets x,y location where it should display
        window.setVisible(true); // makes it visible
    }
}