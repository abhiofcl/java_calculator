import javax.swing.JFrame;
import javax.swing.JLabel;

public class Calculator {
    public Calculator() {
        JFrame jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600, 600);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel displayLabel = new JLabel();
        displayLabel.setBounds(30, 50, 540, 40);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}