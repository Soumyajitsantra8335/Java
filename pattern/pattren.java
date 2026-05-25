

public class pattren {
    public static void main(String[] args) {
        int a= 4;
        for(int i=1; i <=a; i++){
            for (int j=i; j<a; j++){
                System.out.println("");
            }
            for (int j=1; j<= (2*i -1); j++){
                if(j == 1 || j == (2 * i-1) || i == a){
                    System.out.println("*");
                }else{
                    System.out.println("");
                }
            }
            System.out.println();
        }
    }
    
}
