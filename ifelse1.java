import java.util.Scanner;


public class ifelse1 {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);

        System.out.print("Enter Your Score = ");
        int score=v.nextInt();
        
        if(score >=90){
            System.out.println("You are =  Excellent");
        }
        else if(score >= 70){
            System.out.println("You are = Very good");
        }
        else if(score >= 50){
            System.out.println("You are = Good");
        }
        else if (score >= 45){
            System.out.println("You are = Poor Good");
        }
        else{
            System.out.println("You are fail");
        }

        }
    }


