import java.util.Scanner;
public class cal3 {
    static int add(int a,int b){
    return a + b;
    }

    static int subtarction(int a, int b){
        return a - b;
    }

    static int Multiple(int a, int b){
        return a * b;
    }

    static int Division(int a, int b){
        if(b == 0){
            System.out.println("Error: Cannot divide by zero");
            return 0;
        }
        return a / b;
    }

    static int module(int a, int b){
        return a % b;
    }

    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
            int a,b, choice;

            System.out.print("Enter Your First number = ");
            a=d.nextInt();

            System.out.print("Enter Your second Number = ");
            b=d.nextInt();

            System.out.println("\n1. Addition  ");
            System.out.println("2. Subtraction  ");
            System.out.println("3. Multipilication  ");
            System.out.println("4. Division  ");
            System.out.println("5. Module  ");

            System.out.println("Choose Option: ");
            choice= d.nextInt();

           switch(choice){
            case 1:
                System.out.println("Answer = " + add(a, b) );
                break;

                case 2:
                    System.out.println("Answer = " + subtarction(a, b));
                    break;

                    case 3:
                        System.out.println("Answer = " + Multiple(a, b));
                        break;

                        case 4:
                            System.out.println("Answer = " + Division(a, b));
                            break;

                            case 5:
                                System.out.println("Answer = " + module(a, b) );
                                break;

                                default:
                                    System.out.println("Invalid Operator");


        }
    }


    
}
