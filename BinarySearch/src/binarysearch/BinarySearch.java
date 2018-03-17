package binarysearch;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binary[] = new int[5];
        int item;

        System.out.println("Enter the inputs: ");
        for (int i = 0; i < binary.length; i++) {
            binary[i] = sc.nextInt();

        }
        System.out.println("Enter the input for search: ");
        item = sc.nextInt();

        int result = Binary.binary(binary, item);

        if (result != -1) {
            System.out.println("Item at position: " + result);
        } else {
            System.out.println("!Exist");
        }

    }

}

class Binary {

    public static int binary(int binary[], int item) {
        int beg = 0, end = binary.length - 1, mid;

        while (beg <= end) {
            mid = (beg + end) / 2;

            if (item < binary[mid]) {
                end = mid - 1;
            } else if (item == binary[mid]) {
                return mid;

            } else {
                beg = mid + 1;
            }

        }
        return -1;
    }
}
