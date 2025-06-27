package Internship;
import javax.swing.*;
import java.awt.event.*;

	public class WelcomeGUI {
	    public static void main(String[] args) {
	        // Create the main frame (window)
	        JFrame frame = new JFrame("Welcome App");
	        frame.setSize(600, 300);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLayout(null); // Use absolute positioning

	        // Create a button
	        JButton button = new JButton("Click Me");
	        button.setBounds(90, 50, 120, 30); // x, y, width, height

	        // Create a label to show the message
	        JLabel label = new JLabel("");
	        label.setBounds(90, 100, 200, 30);

	        // Add action listener to the button
	        button.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                label.setText("Welcome to Java GUI!");
	            }
	        });

	        // Add components to the frame
	        frame.add(button);
	        frame.add(label);

	        // Set frame visibility
	        frame.setVisible(true);
	    }
	}



