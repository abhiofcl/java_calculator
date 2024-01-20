import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class Calculator implements ActionListener {
    JFrame jf;
    JLabel displayLabel;
    JLabel currOperator;

    JButton seven;
    JButton eight;
    JButton nine;
    JButton six;
    JButton five;
    JButton four;
    JButton three;
    JButton two;
    JButton one;
    JButton dot;
    JButton zero;
    JButton equal;
    JButton divide;
    JButton multiply;
    JButton plus;
    JButton minus;
    JButton clear;

    String oldValue = "";
    String newValue = "";
    // String[] prevValue;
    String operator = "";
    boolean isOpClicked = false;
    int count = 0;
    ArrayList<String> arrayList = new ArrayList<String>();
    // String[] arr = new String[arrayList.size()];
    float result = 0;
    int first = 0;

    public Calculator() {
        jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600, 600);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.getContentPane().setBackground(Color.BLACK);

        displayLabel = new JLabel("");
        displayLabel.setBounds(30, 20, 380, 60);
        displayLabel.setBackground(Color.gray);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.white);
        displayLabel.setFont(new Font("Arial", Font.PLAIN, 30));
        jf.add(displayLabel);

        currOperator = new JLabel("");
        currOperator.setBounds(430, 20, 80, 60);
        currOperator.setBackground(Color.GRAY);
        currOperator.setOpaque(true);
        currOperator.setHorizontalAlignment(SwingConstants.CENTER);
        currOperator.setForeground(Color.white);
        currOperator.setFont(new Font("Arial", Font.PLAIN, 30));
        jf.add(currOperator);

        seven = new JButton("7");
        seven.setBounds(30, 120, 80, 80);
        jf.add(seven);
        seven.addActionListener(this);

        eight = new JButton("8");
        eight.setBounds(130, 120, 80, 80);
        jf.add(eight);
        eight.addActionListener(this);

        nine = new JButton("9");
        nine.setBounds(230, 120, 80, 80);
        jf.add(nine);
        nine.addActionListener(this);

        plus = new JButton("+");
        plus.setBounds(330, 120, 80, 80);
        jf.add(plus);
        plus.setBackground(Color.ORANGE);
        plus.addActionListener(this);

        four = new JButton("4");
        four.setBounds(30, 230, 80, 80);
        jf.add(four);
        four.addActionListener(this);

        five = new JButton("5");
        five.setBounds(130, 230, 80, 80);
        jf.add(five);
        five.addActionListener(this);

        six = new JButton("6");
        six.setBounds(230, 230, 80, 80);
        jf.add(six);
        six.addActionListener(this);

        minus = new JButton("-");
        minus.setBounds(430, 120, 80, 80);
        jf.add(minus);
        minus.setBackground(Color.ORANGE);
        minus.addActionListener(this);

        one = new JButton("1");
        one.setBounds(30, 330, 80, 80);
        jf.add(one);
        one.addActionListener(this);

        two = new JButton("2");
        two.setBounds(130, 330, 80, 80);
        jf.add(two);
        two.addActionListener(this);

        three = new JButton("3");
        three.setBounds(230, 330, 80, 80);
        jf.add(three);
        three.addActionListener(this);

        multiply = new JButton("x");
        multiply.setBounds(330, 230, 80, 80);
        jf.add(multiply);
        multiply.setBackground(Color.ORANGE);
        multiply.addActionListener(this);

        dot = new JButton(".");
        dot.setBounds(30, 430, 80, 80);
        dot.addActionListener(this);
        jf.add(dot);

        zero = new JButton("0");
        zero.setBounds(130, 430, 80, 80);
        zero.addActionListener(this);
        jf.add(zero);

        equal = new JButton("=");
        equal.setBounds(230, 430, 80, 80);
        equal.addActionListener(this);
        equal.setBackground(Color.GREEN);
        jf.add(equal);

        divide = new JButton("/");
        divide.setBounds(430, 230, 80, 80);
        divide.addActionListener(this);
        divide.setBackground(Color.ORANGE);
        jf.add(divide);

        clear = new JButton("c");
        clear.setBounds(430, 430, 80, 80);
        clear.addActionListener(this);
        clear.setBackground(Color.RED);
        jf.add(clear);

        nine.setFont(new Font("Arial", Font.PLAIN, 40));
        eight.setFont(new Font("Arial", Font.PLAIN, 40));
        seven.setFont(new Font("Arial", Font.PLAIN, 40));
        six.setFont(new Font("Arial", Font.PLAIN, 40));
        five.setFont(new Font("Arial", Font.PLAIN, 40));
        four.setFont(new Font("Arial", Font.PLAIN, 40));
        three.setFont(new Font("Arial", Font.PLAIN, 40));
        two.setFont(new Font("Arial", Font.PLAIN, 40));
        one.setFont(new Font("Arial", Font.PLAIN, 40));
        minus.setFont(new Font("Arial", Font.PLAIN, 40));
        plus.setFont(new Font("Arial", Font.PLAIN, 40));
        multiply.setFont(new Font("Arial", Font.PLAIN, 40));
        divide.setFont(new Font("Arial", Font.PLAIN, 40));
        equal.setFont(new Font("Arial", Font.PLAIN, 40));
        zero.setFont(new Font("Arial", Font.PLAIN, 40));
        dot.setFont(new Font("Arial", Font.PLAIN, 40));
        clear.setFont(new Font("Arial", Font.PLAIN, 40));

        jf.setVisible(true);

    }

    public static void main(String[] args) {
        new Calculator();
    }

    // public void addItem(String val) {

    // arrayList.add(val);
    // arr = arrayList.toArray(arr);

    // }

    public void clearList() {
        arrayList.clear();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String labelText = displayLabel.getText();
        String valString;

        if (count > 1) {
            System.out.println(arrayList.get(0));
            System.out.println(arrayList.get(1));
            System.out.println(arrayList.get(2));
            switch (arrayList.get(1)) {
                case "+":
                    result = Float.parseFloat(arrayList.get(0)) + Float.parseFloat(arrayList.get(2));
                    break;
                case "-":
                    result = Float.parseFloat(arrayList.get(0)) - Float.parseFloat(arrayList.get(2));
                    break;
                case "x":
                    result = Float.parseFloat(arrayList.get(0)) * Float.parseFloat(arrayList.get(2));
                    break;
                case "/":
                    result = Float.parseFloat(arrayList.get(0)) / Float.parseFloat(arrayList.get(2));
                    break;
                default:
                    System.out.println("Invalid operator 2: " + arrayList.get(1));
                    break;
            }
            arrayList.set(0, Float.toString(result));
            arrayList.remove(1);
            arrayList.remove(1);
            System.out.println("modified: " + arrayList.get(1));
            count = 0;
            // displayLabel.setText(Float.toString(result));
            // oldValue = Float.toString(result);
        }

        if (e.getSource() == seven) {
            if (isOpClicked) {
                displayLabel.setText("7");
                isOpClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "7");
                System.out.println(displayLabel.getText());
            }

        } else if (e.getSource() == eight) {
            if (isOpClicked) {
                displayLabel.setText("8");
                isOpClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "8");
            }
        } else if (e.getSource() == nine) {
            if (isOpClicked) {
                displayLabel.setText("9");
                isOpClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "9");
            }
        } else if (e.getSource() == six) {
            if (isOpClicked) {
                displayLabel.setText("6");
                isOpClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "6");
            }
        } else if (e.getSource() == five) {
            if (isOpClicked) {
                displayLabel.setText("5");
                isOpClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "5");
            }
        } else if (e.getSource() == four) {
            if (isOpClicked) {
                displayLabel.setText("4");
                isOpClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "4");
            }
        } else if (e.getSource() == three) {
            if (isOpClicked) {
                displayLabel.setText("3");
                isOpClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "3");
            }
        } else if (e.getSource() == two) {
            if (isOpClicked) {
                displayLabel.setText("2");
                isOpClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "2");
            }
        } else if (e.getSource() == one) {
            if (isOpClicked) {
                displayLabel.setText("1");
                isOpClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "1");
            }
        } else if (e.getSource() == zero) {
            if (isOpClicked) {
                displayLabel.setText("0");
                isOpClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "0");
            }
        } else if (e.getSource() == dot) {
            if (isOpClicked) {
                displayLabel.setText(".");
                isOpClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + ".");
            }
        } else if (e.getSource() == plus) {
            first += 1;
            isOpClicked = true;
            oldValue = displayLabel.getText();
            operator = "+";
            displayLabel.setText("");
            currOperator.setText("+");
            if (first == 1)
                count += 1;
            else if (first > 1)
                count += 2;
            arrayList.add(oldValue);
            arrayList.add(operator);
        } else if (e.getSource() == minus) {
            first += 1;
            isOpClicked = true;
            operator = "-";
            oldValue = displayLabel.getText();
            displayLabel.setText("");
            currOperator.setText("-");
            if (first == 1)
                count += 1;
            else if (first > 1)
                count += 2;
            arrayList.add(oldValue);
            arrayList.add(operator);
        } else if (e.getSource() == multiply) {
            first += 1;
            isOpClicked = true;
            oldValue = displayLabel.getText();
            operator = "x";
            displayLabel.setText("");
            currOperator.setText("X");
            if (first == 1)
                count += 1;
            else if (first > 1)
                count += 2;
            arrayList.add(oldValue);
            arrayList.add(operator);
        } else if (e.getSource() == divide) {
            first += 1;
            isOpClicked = true;
            oldValue = displayLabel.getText();
            operator = "/";
            displayLabel.setText("");
            currOperator.setText("/");
            if (first == 1)
                count += 1;
            else if (first > 1)
                count += 2;
            arrayList.add(oldValue);
            arrayList.add(operator);
        } else if (e.getSource() == clear) {
            displayLabel.setText("");
            oldValue = "";
            newValue = "";
            currOperator.setText("");
            count = 0;
            first = 0;
            clearList();
        } else if (e.getSource() == equal) {
            newValue = displayLabel.getText();
            arrayList.add(newValue);
            System.out.print("The equal values \n");
            System.out.println(arrayList.get(0));
            System.out.println(arrayList.get(1));
            System.out.println(arrayList.get(2));
            switch (operator) {
                case "+":
                    result = Float.parseFloat(arrayList.get(0)) + Float.parseFloat(newValue);
                    break;
                case "-":
                    result = Float.parseFloat(arrayList.get(0)) - Float.parseFloat(newValue);
                    System.out.println("Rsult is: " + result);
                    break;
                case "x":
                    result = Float.parseFloat(arrayList.get(0)) * Float.parseFloat(newValue);
                    break;
                case "/":
                    result = Float.parseFloat(arrayList.get(0)) / Float.parseFloat(newValue);
                    break;
                default:
                    // Handle unexpected operator (optional)
                    System.out.println("Invalid operator: " + operator);
                    break;
            }

            // newValue = Float.toString(result);
            oldValue = Float.toString(result);
            count = 0;

            displayLabel.setText(oldValue);
        }
    }
}