import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class cal3j extends JFrame implements ActionListener{
    TextField display;
    String firstNum = "" , operator = "";

    public cal3j(){

        setTitle("Calculator");
        setSize(700,550);
        setLayout(new BorderLayout(10,10));
        setBackground(new Color(230,230,230));

        display = new TextField();
        display.setFont(new Font("Arial", Font.BOLD, 40));
        display.setBackground(Color.WHITE);
        display.setEditable(false);
        display.setPreferredSize(new Dimension(580, 60));
        add(display, BorderLayout.NORTH);

        Panel panel = new Panel();
        panel.setLayout(new GridLayout(4,4,15,15));
        panel.setBackground(new Color(230,230,230));

        String buttons[] = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "=", "+", "C"
        };

        for (String text : buttons) {
            //Button btn = new Button(text);
            JButton btn = new JButton(text);
            btn.setFont(new Font("Arial", Font.BOLD, 45));
            btn.setPreferredSize(new Dimension(80,80));
            btn.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1, true));
            btn.setFocusPainted(false);
           // btn.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
           //fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
            btn.addActionListener(this);
            
            // Add colors to specific buttons
            if (text.equals("/") || text.equals("*") || text.equals("-") || text.equals("+")) {
                btn.setBackground(new Color(255, 165, 0)); // Orange for operators
                btn.setForeground(Color.WHITE);
            } else if (text.equals("C")) {
                btn.setBackground(new Color(220, 20, 60)); // Crimson for Clear
                btn.setForeground(Color.WHITE);
            } else if (text.equals("=")) {
                btn.setBackground(new Color(50, 205, 50)); // Lime Green for equals
                btn.setForeground(Color.WHITE);
            } else {
                btn.setBackground(new Color(70, 130, 180)); // Steel Blue for numbers
                btn.setForeground(Color.WHITE);
            }
            
            panel.add(btn);
        }
        add(panel, BorderLayout.CENTER);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
    
            }
                
            
        });
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        String value = e.getActionCommand();

        if (value.equals("C")){
            display.setText("");
            firstNum = "";
            operator = "";
        }
        
        else if(value.equals("+") || value.equals("-")
        ||value.equals("*") || value.equals("/")){
            firstNum = display.getText();
            operator =  value;
            display.setText("");
        }
        else if (value.equals("=")){

            try{
                double num1 = Double.parseDouble(firstNum);
                double num2 = Double.parseDouble(display.getText());
                double result = 0;

                switch(operator){
                    case "+":
                        result = num1 + num2;
                        break;

                        case "-":
                            result = num1 - num2;
                            break;

                            case "*":
                                result = num1 * num2;
                                break;

                                case "/":
                                    result = num1 / num2;
                                    break;
                }
                display.setText(String.valueOf(result));
            }
            catch (Exception ex) {
                display.setText("Error");
            }
        }
        else{
            display.setText(display.getText() + value);
        }
    }
    public static void main(String[] args){
        new cal3j();
    }

}


