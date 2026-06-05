import java.awt.*;
import java.awt.event.*;
class Calculator extends Frame implements ActionListener{
    TextField t1, t2, result;
    Button add, sub, mul, div;

    Calculator(){
        setTitle("AWT CALCULATOR");
        setSize(300, 250);
        setLayout(new FlowLayout());

        add(new Label("First Number : - " ));
        t1 = new TextField(15);
        add(t1);

        add(new Label("First Number : - " ));
        t2 = new TextField(15);
        add(t2);

        add = new Button("Add");
        sub = new Button("Sub");
        mul = new Button("Mul");
        div = new Button("Div");

        add(add);
        add(sub);
        add(mul);
        add(div);

        add(new Label("Result : "));
        result= new TextField(15);
        result.setEditable(false);
        add(result);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        double a = Double.parseDouble(t1.getText());
        double b = Double.parseDouble(t2.getText());
        double f = 0;

        if (e.getSource() == add)
            f = a + b;

        else if (e.getSource() == sub)
            f = a - b;

        else if (e.getSource() == mul)
            f = a * b;

        else if (e.getSource() == div)
            f = a / b;

        result.setText(String.valueOf(f));
    }
    
}
public class javacalawt{
    public static void main(String[] args) {
        new Calculator();
    }
    }

