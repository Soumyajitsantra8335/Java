import java.util.Scanner;
public class prime1 {

    public static void main(String[] args){
        Scanner soumo=new Scanner(System.in);
        System.out.print("Enter Your Number = ");
        int a=soumo.nextInt();
        boolean primenum= true;

        if(a<=1){
            primenum = false;
        }
        else{
            for(int b=2; b<a*0.5; b++){
                if (a % b ==0){
                    primenum = false;
                    break;
                }
            }
            if(primenum == false){
                System.out.println(a + " this is not a prime number");
            }else{
                System.out.println(a + " this is prime number");
            }
            soumo.close();
        }
    }
}