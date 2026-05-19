 public class func2 {
    int add(int a, int b){
        return a + b;
    }
    int sub(int a, int b){
        return a - b;
    }
    int mul(int a, int b){
        return a * b;

    }
    int div(int a, int b){
        return a / b;
    } 
    public static void main(String[] args) {
        func a = new func();
        System.out.println("Addition = "+a.add(2,3));
        System.out.println("Subtraction = "+a.sub(1,3));
        System.out.println("Multipilication = "+a.mul(3,3));
        System.out.println("Division = "+a.div(2,3));
       
    }
    
}
 
