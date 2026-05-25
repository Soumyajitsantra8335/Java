abstract class tv {
    abstract void on();
    
}
class sony extends tv{
    void on(){
        System.out.println("TV On");
    }
}

public class abstraction{
    public static void main(String[] args) {
        sony v = new sony();
        v.on();
    }
}



