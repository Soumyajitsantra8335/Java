import java.util.Scanner;
public class prime {
public static void main(String[] args) {
    int num, count=0;
    System.out.print("Enter Your Number = ");
    Scanner b =new Scanner(System.in);
    num=b.nextInt();

    for (int i=1; i<=num; i++){
      if(num%i==0){
        count++;
      }
    }
    if(count==2){
      System.out.println(num + " Number Is not prime Number");
    }else{
      System.out.println(num + " Number is prime Num");
    }

}
    

}
