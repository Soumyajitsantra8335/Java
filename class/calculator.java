import java.awt.*;
import java.awt.event.*;

public class calculator extends Frame implements ActionListener{
    TextField display;
    String firstNum = "" , operator = "";

    public calculator(){

        setTitle("Calculator");
        setSize(400,500);
        setLayout(new BorderLayout(10,10));

        display = new TextField();
        display.setFont(new Font("Arial", Font.BOLD, 25));
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        Panel panel = new Panel();
        panel.setLayout(new GridLayout(4,4,10,10));

        String buttons[] = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "=", "+", "C"
        };

        for (String text : buttons) {
            Button btn = new Button(text);
            btn.setFont(new Font("Arial", Font.BOLD, 20));
            btn.addActionListener(this);
            panel.add(btn);
        }
        add(panel, BorderLayout.CENTER);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
    
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
        new calculator();
    }

}
