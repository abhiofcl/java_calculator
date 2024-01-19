import java.awt.Color;

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

    public Calculator() {
        jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600, 600);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.getContentPane().setBackground(Color.BLUE);

        displayLabel = new JLabel("");
        displayLabel.setBounds(30, 50, 540, 40);
        displayLabel.setBackground(Color.gray);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.white);
        jf.add(displayLabel);

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
        minus.setBounds(330, 230, 80, 80);
        jf.add(minus);
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
        multiply.setBounds(330, 330, 80, 80);
        jf.add(multiply);
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
        jf.add(equal);

        divide = new JButton("/");
        divide.setBounds(330, 430, 80, 80);
        divide.addActionListener(this);
        jf.add(divide);

        clear = new JButton("c");
        clear.setBounds(430, 430, 80, 80);
        clear.addActionListener(this);
        jf.add(clear);

        jf.setVisible(true);

    }

    public static void main(String[] args) {
        new Calculator();
    }

    public String[] addItem(String[] prevs, String val) {
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(prevs));
        arrayList.add(val);
        prevs = arrayList.toArray(prevs);
        return prevs;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String labelText = displayLabel.getText();
        String newValue;
        String[] prevValue;
        if (e.getSource() == seven) {
            displayLabel.setText(labelText + "7");
        } else if (e.getSource() == eight) {
            displayLabel.setText(labelText + "8");
        } else if (e.getSource() == nine) {
            displayLabel.setText(labelText + "9");
        } else if (e.getSource() == six) {
            displayLabel.setText(labelText + "6");
        } else if (e.getSource() == five) {
            displayLabel.setText(labelText + "5");
        } else if (e.getSource() == four) {
            displayLabel.setText(labelText + "4");
        } else if (e.getSource() == three) {
            displayLabel.setText(labelText + "3");
        } else if (e.getSource() == two) {
            displayLabel.setText(labelText + "2");
        } else if (e.getSource() == one) {
            displayLabel.setText(labelText + "1");
        } else if (e.getSource() == zero) {
            displayLabel.setText(labelText + "0");
        } else if (e.getSource() == dot) {
            displayLabel.setText(labelText + ".");
        } else if (e.getSource() == plus) {

            displayLabel.setText("");
        } else if (e.getSource() == minus) {
            displayLabel.setText("");
        } else if (e.getSource() == multiply) {
            displayLabel.setText("");
        } else if (e.getSource() == divide) {
            displayLabel.setText("");
        } else if (e.getSource() == clear) {
            displayLabel.setText("");
        }

    }
}