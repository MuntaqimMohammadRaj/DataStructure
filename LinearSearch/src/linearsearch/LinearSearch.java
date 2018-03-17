package linearsearch;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int linear[] = new int[5];
        int item;

        System.out.println("Enter the inputs: ");
        for (int i = 0; i < linear.length; i++) {
            linear[i] = sc.nextInt();

        }
        System.out.println("Enter the input for search: ");
        item = sc.nextInt();

        int result = Linear.linear(linear, item);

        if (result != -1) {
            System.out.println("Item at position: " + result);
        } else {
            System.out.println("!Exist");
        }

    }

}

class Linear {

    public static int linear(int linear[], int item) {
        int size = linear.length;
        for (int i = 0; i < size; i++) {

            if (item == linear[i]) {
                return i;
            }

        }
        return -1;
    }

}
