class inher {
    void teach(){
        System.out.println("Teachet Teaches Students");
    }
    
}
class inter2 extends inher{
    void study(){
        System.out.println("Student studies");
    }
}
public class inheritance{
    public static void main(String[] args) {
        inter2 a= new inter2();
        a.teach();
        a.study();
    }
} 
