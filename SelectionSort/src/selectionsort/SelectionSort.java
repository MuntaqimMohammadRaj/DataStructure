package selectionsort;

import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values for the Array: ");
        int[] select = new int[5];

        int temp, minIndex;
        int i, j;

        for (i = 0; i < select.length; i++) {

            select[i] = sc.nextInt();

        }
           
        //using nested for loops
        for (i = 0; i < select.length - 1; i++) {

            minIndex = i;

            for (j = i + 1; j < select.length; j++) {
                if (select[j] < select[minIndex]) {
                    minIndex = j;

                }
              
            }
                temp = select[minIndex];
                select[minIndex] = select[i];
                select[i] = temp;
           

        }
         


 /*
        //using nested while loops
         i = 0, j = i + 1;
        while (i < select.length - 1) {
            minIndex = i;
            while (j < select.length) {
                if (select[j] < select[minIndex]) {
                    minIndex = j;

                }

                j++;
            }
            temp = select[minIndex];
            select[minIndex] = select[i];
            select[i] = temp;

            i++;
            j = i + 1;
        }

         */
 
 /*
        //using do....while loops
        i = 0;
        j = i + 1;
        do {

            minIndex = i;

            do {
                if (select[j] < select[minIndex]) {
                    minIndex = j;

                }

                j++;

            } while (j < select.length);
            
            
            temp = select[minIndex];
            select[minIndex] = select[i];
            select[i] = temp;

            i++;
            j = i + 1;

        } while (i < select.length - 1);

*/

        
        
        
        System.out.print("The sorted bubble is: ");
        for (int x : select) {
            System.out.print(" " + x + "\t");
        }

    }

}
