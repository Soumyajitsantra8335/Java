import java.util.Scanner;

public class cal2{
  public static void main(String[] args){
    Scanner c = new Scanner(System.in);

    int a, b;
    char operator;

    System.out.println("Enter Your first number = ");
    a=c.nextInt();

    System.out.println("Enter your Operator (+,-,*,/,%): ");
    operator=c.next().charAt(0);
    
    System.out.println("Enter Your Second Number");
    b=c.nextInt();

    int result = 1;

    switch(operator){
        case '+':
            result= a + b;
            break;

            case '-':
                result= a - b;
                break;

                case '*':
                    result= a * b;
                    break;

                    case '/':
                        result= a / b;
                        break;

                        case '%':
                        result= a % b;
                        break;

                        default:
                            System.out.println("invalid Operator");
    }
    System.out.println("Result = " + result);

  }
}