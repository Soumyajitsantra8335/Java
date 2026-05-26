class bird {
void sound(){
    System.out.println("Bird Makes sound");
}
}  
class parrot extends bird{
    void sound(){
        System.out.println("Parrot makes sound");
    }
} 


public class overriding{
    public static void main(String[] args) {
        parrot b = new parrot();
        b.sound();
    }
}
