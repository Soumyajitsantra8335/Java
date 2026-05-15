public class enumm {
    public static void main(String[] args) {
        enum s{
            Monday("Nsti Howrah"),
            Tuesday("Radha Krishna");

            String a;
             s(String a){
                this.a= a;
             }

            
        }
        System.out.println(s.Monday);
        System.out.println(s.Tuesday.a);
    }
    
}
