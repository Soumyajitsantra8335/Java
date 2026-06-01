class Mytread extends Thread {
    public void run(){
        System.out.println("New threads practice " + getName());
    }
    
}
public class  starthreads{
    public static void main(String[] args) {
        Mytread t1=new Mytread();
        Mytread t2=new Mytread();
        t1.start();
        t2.setName("soumo");
        t2.start();
    }
}