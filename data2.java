public class data2 {
    public static void main(String[] args) {
        int[] r={1,2,3,6,5,89,8,78,7};
        System.out.println(r[1]);
        System.out.println(r[3]);
        for(int b:r){
            System.out.print(b);
            for(int c:r){
                System.out.println(c);
            }
        }
    }
    
}
