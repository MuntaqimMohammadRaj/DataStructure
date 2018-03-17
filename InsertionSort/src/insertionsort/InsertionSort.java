package insertionsort;

import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values for the Array: ");
        int[] insert = new int[5];

       
        int i,j,item;

        for (i = 0; i < insert.length; i++) {

            insert[i] = sc.nextInt();

        }
        
        for ( i =1; i <insert.length; i++) {
            
            item=insert[i];
            for ( j =i-1; j>=0&&insert[j]>item; j--) {
                
                insert[j+1]=insert[j];
                
               
            }
           
            insert[j+1]=item;
            
        }

        //using nested while loop
      /*
      i=1;
      while(i<insert.length)
      {
          int item=insert[i];
          int j=i-1;
          while(j>=0&&insert[j]>item)
          {
              insert[j+1]=insert[j];
              j--;
          }
          insert[j+1]=item;
          i++;
      }
      */
      
    
     
      
      
        System.out.print("The sorted list is: ");
        for(int x:insert)
        {
            System.out.print("\t"+x);
        }
        System.out.println("");

    }

}
