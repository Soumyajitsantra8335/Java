class calculator{
    void add(int a, int b){
        System.out.println("Sum = "+(a+b));
    }
    void add(int a, int b, int c){
        System.out.println("Sum & Subtract = "+(a+b-c));
    }

    
}
public class overloading{
    public static void main(String[] args) {
        calculator a = new calculator();
        a.add(50,60,10);
    }
}
