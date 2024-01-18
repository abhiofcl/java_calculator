import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator {
    public Calculator() {
        JFrame jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600, 600);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel displayLabel = new JLabel("hello");
        displayLabel.setBounds(30, 50, 540, 40);
        displayLabel.setBackground(Color.gray);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.white);
        jf.add(displayLabel);

        JButton seven = new JButton("7");
        seven.setBounds(30, 120, 80, 80);
        jf.add(seven);

        JButton eight = new JButton("8");
        eight.setBounds(130, 120, 80, 80);
        jf.add(eight);

        JButton nine = new JButton("9");
        nine.setBounds(230, 120, 80, 80);
        jf.add(nine);

        JButton four = new JButton("4");
        four.setBounds(30, 230, 80, 80);
        jf.add(four);

        JButton five = new JButton("5");
        five.setBounds(130, 230, 80, 80);
        jf.add(five);

        JButton six = new JButton("6");
        six.setBounds(230, 230, 80, 80);
        jf.add(six);

        JButton one = new JButton("1");
        one.setBounds(30, 330, 80, 80);
        jf.add(one);

        JButton two = new JButton("2");
        two.setBounds(130, 330, 80, 80);
        jf.add(two);

        JButton three = new JButton("3");
        three.setBounds(230, 330, 80, 80);
        jf.add(three);

        JButton dot = new JButton(".");
        dot.setBounds(30, 430, 80, 80);
        jf.add(dot);

        JButton zero = new JButton("0");
        zero.setBounds(130, 430, 80, 80);
        jf.add(zero);

        JButton equal = new JButton("=");
        equal.setBounds(230, 430, 80, 80);
        jf.add(equal);

    }

    public static void main(String[] args) {
        new Calculator();
    }
}