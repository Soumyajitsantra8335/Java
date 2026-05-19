import java.util.Scanner;

public class ifelse2 {
        public static void main(String[] var0){
          Scanner soumo=new Scanner(System.in);
          System.out.print("Enter Your Score = ");
          int Result=soumo.nextInt();
          
          if(Result >= 90){
            System.out.println("Excellent");
          }
          else if(Result >= 70){
            System.out.println("Very Good");
          }
          else if (Result >= 60){
            System.out.println("bohut Bura Result Hai");
          }
          else{
            System.out.println("Tumha parai karna ki jarurat nahi hai");
          }
        
    }
    
}

