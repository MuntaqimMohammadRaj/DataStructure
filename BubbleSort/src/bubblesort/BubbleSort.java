package bubblesort;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values for the Array: ");
        int[] bubble = new int[5];

        int temp;
        int i, j;

        for (i = 0; i < bubble.length; i++) {

            bubble[i] = sc.nextInt();

        }

        
        //using nested for loop
        for (i = 0; i < bubble.length - 1; i++) {
            for (j = 0; j < bubble.length - 1; j++) {

                if (bubble[j] > bubble[j + 1]) {
                    temp = bubble[j];
                    bubble[j] = bubble[j + 1];
                    bubble[j + 1] = temp;
                }

            }

        }

        // using nested do...while loop
       /* 
       i=0; j=0;
       
        do{
            
            do{
                
                if(bubble[j]>bubble[j+1])
                {
                    temp=bubble[j];
                    bubble[j]=bubble[j+1];
                    bubble[j+1]=temp;
                }
                
                j++;
        
        
        
        }while(j<bubble.length-1);
        
        i++;
        j=0;
        
        }while(i<bubble.length-1);
        
        */
       
       /*
        
        //using nested while loops...
       
       i=0;j=0;
        
        while(i<bubble.length-1)
        {
            while(j<bubble.length-1)
            {
                if(bubble[j]>bubble[j+1])
                {
                    temp=bubble[j+1];
                    bubble[j+1]=bubble[j];
                    bubble[j]=temp;
                }
                j++;
            }
            i++;
            j=0;
        }
      */
         
        //ForEach Loop
        System.out.print("The sorted bubble is: ");
        for (int x : bubble) {
            System.out.print(" " + x + "\t");
        }

        System.out.println("");

        //Normal For Loop
        System.out.print("The sorted bubble is: ");
        for (int k = 0; k < bubble.length; k++) {
            System.out.print(" " + bubble[k] + "\t");

        }

    }

}
