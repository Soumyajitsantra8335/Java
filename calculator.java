import java.util.Scanner;


public class calculator {
    public static void main(String[] args){
    Scanner n=new Scanner(System.in);
    int x, y;
    System.out.print("Enter Your First Number = ");
    x=n.nextInt();
    System.out.print("Enter your second Number = ");
    y=n.nextInt();
    System.out.println("Addition = " + (x+y));
    System.out.println("Subtraction = " + (x-y));
    System.out.println("Multipilaction = " + (x*y));
    if(y!=0){
        System.out.println("Division = " + (x/y));
    }else{
        System.out.println("Number is zero");
    }
    if(y!=0){
        System.out.println("Modulus = " + (x%y));

    }else{
        System.out.println("number Is Zero");
    }

    
    }
}
