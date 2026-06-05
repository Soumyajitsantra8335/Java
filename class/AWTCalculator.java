import java.awt.*;
import java.awt.event.*;

public class AWTCalculator extends Frame implements ActionListener {
    // Components
    TextField tf1, tf2, result;
    Button add, sub, mul, div, clear;

    public AWTCalculator() {
        setTitle("AWT Calculator");
        setSize(400, 300);
        setLayout(null);
        setVisible(true);
        setBackground(Color.LIGHT_GRAY);

        // Labels
        Label l1 = new Label("Number 1:");
        l1.setBounds(50, 50, 70, 30);
        add(l1);

        Label l2 = new Label("Number 2:");
        l2.setBounds(50, 90, 70, 30);
        add(l2);

        Label l3 = new Label("Result:");
        l3.setBounds(50, 130, 70, 30);
        add(l3);

        // TextFields
        tf1 = new TextField();
        tf1.setBounds(130, 50, 200, 30);
        add(tf1);

        tf2 = new TextField();
        tf2.setBounds(130, 90, 200, 30);
        add(tf2);

        result = new TextField();
        result.setBounds(130, 130, 200, 30);
        result.setEditable(false);
        add(result);

        // Buttons
        add = new Button("+");
        sub = new Button("-");
        mul = new Button("*");
        div = new Button("/");
        clear = new Button("Clear");

        add.setBounds(50, 180, 50, 30);
        sub.setBounds(110, 180, 50, 30);
        mul.setBounds(170, 180, 50, 30);
        div.setBounds(230, 180, 50, 30);
        clear.setBounds(290, 180, 60, 30);

        add(add);
        add(sub);
        add(mul);
        add(div);
        add(clear);

        // Event Handling
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        clear.addActionListener(this);

        // Close button functionality
        addWindowListener(new WindowAdapter() {


            
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double n1 = Double.parseDouble(tf1.getText());
            double n2 = Double.parseDouble(tf2.getText());
            double res = 0;

            if (e.getSource() == add) {
                res = n1 + n2;
            } else if (e.getSource() == sub) {
                res = n1 - n2;
            } else if (e.getSource() == mul) {
                res = n1 * n2;
            } else if (e.getSource() == div) {
                if (n2 != 0)
                    res = n1 / n2;
                else {
                    result.setText("Cannot divide by zero");
                    return;
                }
            } else if (e.getSource() == clear) {
                tf1.setText("");
                tf2.setText("");
                result.setText("");
                return;
            }
            result.setText(String.valueOf(res));
        } catch (NumberFormatException ex) {
            result.setText("Invalid Input");
        }
    }

    public static void main(String[] args) {
        new AWTCalculator();
    }
}

