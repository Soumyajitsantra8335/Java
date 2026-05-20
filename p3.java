import java.util.Scanner;
public class p3{
    public static void main(String[] args){
        Scanner soumo=new Scanner(System.in);
        System.out.print("Enter Your Number = ");
        int d=soumo.nextInt();
        for (int a=1; a<=d; a++){
            for(int b=1; b<=a; b++){
                System.out.print("* ");
            }
            System.out.println();
        }
            for (int a=1; a<=d; a++){
           for(int b=d-1; b>=a; b--){
                System.out.print("* ");
            }
            
            
    
        System.out.println();
    }
}
}
