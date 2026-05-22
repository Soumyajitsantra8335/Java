 
import java.util.*;
//import java.util.Arrays;


public class sir {
      public static void main(String[] args) {
        //Create a Array
        int[] a={1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(a));
        System.out.println(a[3]);
        //Modify element in Array
        a[3]=85;
       System.out.println(a[3]);
        //Create 2D Arrays
        int[][] b={ 
                    {1,2,3,4,5,6,7,8,9,10}, 
                    {11,12,13,14,15,16,17,18,19,20} 
                                                     };
                                                     //Modify element
                                                     b[1][0]=21;
        System.out.println(Arrays.deepToString(b));
        //Create a blank Array 
       int[] c={};
       //Assign index in blank Array
       c=new int[20];
       //c=new int[6];
       //c=new int[7];
       //Assign value in Array
       c[0]=10;
       
       System.out.println(Arrays.toString(c));

       // Add element in Array List 
       ArrayList<Integer> d= new ArrayList<>(Arrays.asList(10,20,30));
                       System.out.println(d);
                                      d.add(50);
                       System.out.println(d);
                                //Remove element in Array List
                                      d.remove(3);
                       System.out.println(d);

       ArrayList<ArrayList<Integer>> e=new ArrayList<>();
       e.add(new ArrayList<>(Arrays.asList(10,12,30,40,50)));
       e.add(new ArrayList<>(Arrays.asList(11,13,15,16,51)));
       e.add(new ArrayList<>(Arrays.asList(30,12,10,15,52)));
       System.out.println(e);

      }    
}











