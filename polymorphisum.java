class Animal {
    void sound(){
        System.out.println("Animal Makes sound");
    }
    
}
class dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
class cat extends dog{
    void sound(){
        System.out.println("Meaw meaw");
    }
}

public class polymorphisum{
    public static void main(String[] args) {
        Animal b;
         b=new dog();
         b.sound();

         b=new cat();
         b.sound();
    }
}