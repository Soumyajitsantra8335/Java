public class ope {
    public static void main(String[] args) {
        int a=55;
        int b=10;

        //Arithmetic operator
        System.out.println("Arithmatic Operator");
        System.out.println("addition = "+(a+b));
        System.out.println("subtarction = "+(a-b));
        System.out.println("Multipilaction = "+(a*b));
        System.out.println("Division = "+(a/b));
        System.out.println("Moduls = "+(a%b));
        //main1();
        int d=m();
        int i=n();
        int j=o();
        System.out.println(j);
    }
    //Addition Operator
    public static int m(){
        System.out.println("Addition Operator");
        int c=10;
        System.out.println("c = "+c);
        c+=2;
        System.out.println("Add then Assign = "+c);
        c-=3;
        System.out.println("Subtract then Assign = "+c);
        c*=2;
        System.out.println("Multipilaction then Assign = "+c);
        c/=2;
        System.out.println("Divide then Assign = "+c);
        c%=2;
        System.out.println("Modulus then assign = "+c);
        return c;
    }
    //Relational operator
    public static int n(){
       System.out.println("Relational Operator");
        int e=15;
        int f=10;
        System.out.println("Equal to = "+(e==f));
        System.out.println("Not Equal to = "+(e!=f));
        System.out.println("Greater then = "+(e>f));
        System.out.println("Lees Than = "+(e<f));
        System.out.println("Grete Than or equal = "+(e>=f));
        System.out.println("less Than Equal to = "+(e<=f));
        return 0;
    }
    //Logical operator
    public static int o(){
     System.out.println("Logical Operator");
     int g=20;
     System.out.println("Logical AND Operator = "+(g>5 && g<19));
     System.out.println("Logical OR Operator = "+(g>5 || g>25));
     System.out.println("Logical XOR Operator = "+(!(g>5)));
     return 0;


    }
}


