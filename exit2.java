

public class exit2 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};

        for(int a=0; a<arr.length; a++){
            if(arr[a]==3){
                System.out.println("Exit Loop");
                System.exit(0);
            }else{
                System.out.println("arr["+a+"]=" +arr[a]);
            }
          
        }

  System.out.println("End of programme");
    }
    
}
