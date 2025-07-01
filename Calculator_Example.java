package Internship;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator_Example extends JFrame implements ActionListener {

    // Components
    JTextField input;
    JButton[] numButtons = new JButton[10];
    JButton addBtn, subBtn, mulBtn, divBtn, eqBtn, clrBtn;
    JPanel panel;

    double num1 = 0, num2 = 0, result = 0;
    char operator;

    public Calculator_Example() {
        setTitle("Calculator");
        setSize(350, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        input = new JTextField();
        input.setFont(new Font("Arial", Font.BOLD, 24));
        input.setEditable(false);
        input.setHorizontalAlignment(JTextField.RIGHT);
        add(input, BorderLayout.NORTH);

        // Buttons
        addBtn = new JButton("+");
        subBtn = new JButton("-");
        mulBtn = new JButton("*");
        divBtn = new JButton("/");
        eqBtn = new JButton("=");
        clrBtn = new JButton("C");

        for (int i = 0; i < 10; i++) {
            numButtons[i] = new JButton(String.valueOf(i));
            numButtons[i].addActionListener(this);
        }

        addBtn.addActionListener(this);
        subBtn.addActionListener(this);
        mulBtn.addActionListener(this);
        divBtn.addActionListener(this);
        eqBtn.addActionListener(this);
        clrBtn.addActionListener(this);

        // Panel Layout
        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Add buttons to panel
        panel.add(numButtons[7]);
        panel.add(numButtons[8]);
        panel.add(numButtons[9]);
        panel.add(addBtn);

        panel.add(numButtons[4]);
        panel.add(numButtons[5]);
        panel.add(numButtons[6]);
        panel.add(subBtn);

        panel.add(numButtons[1]);
        panel.add(numButtons[2]);
        panel.add(numButtons[3]);
        panel.add(mulBtn);

        panel.add(clrBtn);
        panel.add(numButtons[0]);
        panel.add(eqBtn);
        panel.add(divBtn);

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numButtons[i]) {
                input.setText(input.getText() + i);
            }
        }

        if (e.getSource() == addBtn) {
            num1 = Double.parseDouble(input.getText());
            operator = '+';
            input.setText("");
        }
        if (e.getSource() == subBtn) {
            num1 = Double.parseDouble(input.getText());
            operator = '-';
            input.setText("");
        }
        if (e.getSource() == mulBtn) {
            num1 = Double.parseDouble(input.getText());
            operator = '*';
            input.setText("");
        }
        if (e.getSource() == divBtn) {
            num1 = Double.parseDouble(input.getText());
            operator = '/';
            input.setText("");
        }
        if (e.getSource() == eqBtn) {
            num2 = Double.parseDouble(input.getText());
            switch (operator) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': 
                    if (num2 == 0)
                        input.setText("Cannot divide by 0");
                    else
                        result = num1 / num2;
                    break;
            }
            if (operator != '/' || num2 != 0) {
                input.setText(String.valueOf(result));
            }
        }
        if (e.getSource() == clrBtn) {
            input.setText("");
            num1 = num2 = result = 0;
            operator = '\0';
        }
    }

    public static void main(String[] args) {
        new Calculator_Example();
    }
}
