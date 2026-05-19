import java.util.Scanner;
public class prime {
public static void main(String[] args) {
    int num, count=0;
    System.out.println("Enter Your Number = ");
    Scanner b =new Scanner(System.in);
    num=b.nextInt();

    for (int i=1; i<=num; i++){
      if(num%i==0){
        count++;
      }
    }
    if(count==2){
      System.out.println(num + " Number Is prime");
    }else{
      System.out.println(num + " Number is not prime");
    }

}
    
}
