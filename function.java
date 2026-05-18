import java.util.Scanner;

public class function{
   static void add(){
    Scanner src= new Scanner(System.in);

    System.out.println("Addition Function");

        System.out.print("First Number = ");
        int a = src.nextInt();

        System.out.print("Second Number = ");
        int b= src.nextInt();

        int sum = a + b;
        System.out.println("sum result = "+sum);

    }
    static void Subtract(){
    Scanner src1= new Scanner(System.in);

    System.out.println("Subtraction function");

        System.out.print("First Number = ");
        int a = src1.nextInt();

        System.out.print("Second Number = ");
        int b= src1.nextInt();

        int sub = a - b;
        System.out.println("Subtract result = "+sub);

    }
     static void Multiple(){
    Scanner src1= new Scanner(System.in);

    System.out.println("Multiple function");

        System.out.print("First Number = ");
        int a = src1.nextInt();

        System.out.print("Second Number = ");
        int b= src1.nextInt();

        int mul = a * b;
        System.out.println("Multiple result = "+mul);

    }
    static void Division(){
    Scanner src1= new Scanner(System.in);

    System.out.println("Division function");

        System.out.print("First Number = ");
        int a = src1.nextInt();

        System.out.print("Second Number = ");
        int b= src1.nextInt();

        int div = a / b;
        System.out.println("Division result = "+div);

    }
    static void Modulus(){
    Scanner src1= new Scanner(System.in);

    System.out.println("Modulus function");

        System.out.print("First Number = ");
        int a = src1.nextInt();

        System.out.print("Second Number = ");
        int b= src1.nextInt();

        int mod = a % b;
        System.out.println("Modulus result = "+mod);

    }
    
   



   public static void main(String[] args){
      add();
      Subtract();
      Multiple();
      Division();
      Modulus();
      
   }



   }


        
    
