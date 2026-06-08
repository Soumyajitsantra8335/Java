import java.awt.*;
import java.awt.event.*;

public class caculator1 extends Frame implements ActionListener {
    // Component declaration
    private TextField display;
    private Button[] numberButtons = new Button[10];
    private Button addBtn, subBtn, mulBtn, divBtn, eqBtn, clrBtn;
    private Panel panel;

    // Variables to hold operands and operations
    private double num1 = 0, num2 = 0, result = 0;
    private char operator;

    public caculator1() {
        // 1. Frame setup
        setTitle("AWT Calculator");
        setSize(400, 500);
        setLayout(new BorderLayout(10, 10));
        setBackground(Color.LIGHT_GRAY);

        // 2. Display Field setup
        display = new TextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setBackground(Color.WHITE);
        add(display, BorderLayout.NORTH);

        // 3. Initialize operator buttons
        addBtn = new Button("+");
        subBtn = new Button("-");
        mulBtn = new Button("*");
        divBtn = new Button("/");
        eqBtn = new Button("=");
        clrBtn = new Button("C");

        // 4. Create the button panel (4x4 Grid)
        panel = new Panel();
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        // 5. Initialize and add number buttons to the panel
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new Button(String.valueOf(i));
            numberButtons[i].setFont(new Font("Arial", Font.BOLD, 18));
            numberButtons[i].addActionListener(this);
        }

        // Font setup for operators
        Button[] opButtons = {addBtn, subBtn, mulBtn, divBtn, eqBtn, clrBtn};
        for (Button btn : opButtons) {
            btn.setFont(new Font("Arial", Font.BOLD, 18));
            btn.addActionListener(this);
        }

        // 6. Arrange buttons in the calculator grid layout
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addBtn);

        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subBtn);

        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulBtn);

        panel.add(clrBtn);
        panel.add(numberButtons[0]);
        panel.add(eqBtn);
        panel.add(divBtn);

        add(panel, BorderLayout.CENTER);

        // 7. Window Closing Event listener
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });
    }

    // 8. Event Handling Logic
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        // Check if a number button was clicked
        for (int i = 0; i < 10; i++) {
            if (source == numberButtons[i]) {
                display.setText(display.getText() + i);
                return;
            }
        }

        // Clear button logic
        if (source == clrBtn) {
            display.setText("");
            num1 = num2 = result = 0;
        } 
        // Operator button logic
        else if (source == addBtn || source == subBtn || source == mulBtn || source == divBtn) {
            if (!display.getText().isEmpty()) {
                num1 = Double.parseDouble(display.getText());
                operator = ((Button) source).getLabel().charAt(0);
                display.setText(""); // clear display for next number
            }
        } 
        // Equals button logic
        else if (source == eqBtn) {
            if (!display.getText().isEmpty()) {
                num2 = Double.parseDouble(display.getText());

                switch (operator) {
                    case '+': result = num1 + num2; break;
                    case '-': result = num1 - num2; break;
                    case '*': result = num1 * num2; break;
                    case '/': 
                        if (num2 != 0) result = num1 / num2;
                        else {
                            display.setText("Error");
                            return;
                        }
                        break;
                }
                // Display result without trailing zero if it's a whole number
                if (result % 1 == 0) {
                    display.setText(String.valueOf((int) result));
                } else {
                    display.setText(String.valueOf(result));
                }
                num1 = result; // Allow chaining operations
            }
        }
    }

    // Main Method to Run
    public static void main(String[] args) {
        caculator1 calculator = new caculator1();
        calculator.setVisible(true);
    }
} 
