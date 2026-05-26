import java.util.*;

class calculator{
    void add(int a, int b){
        System.out.println("Sum = "+(a+b));
    }
    void add(int a, int b, int c){
        System.out.println("Sum & Subtract answer = "+(a+b-c));
    }

    
}
public class overloading2{
    public static void main(String[] args) {
        Scanner b=new Scanner(System.in);
        calculator a = new calculator();
        System.out.print("Enter your first no = ");
        int x=b.nextInt();
        System.out.print("Enter your second number = ");
        int y=b.nextInt();
        System.out.print("Enter third no = ");
        int z=b.nextInt();
        a.add(x,y,z);
    }
}
