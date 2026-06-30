package array;

import java.util.Arrays;
import java.util.Scanner;

public class IsSorted {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isSorted = true;

        for (int i = 0; i < n - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }

        System.out.println("Array: " + Arrays.toString(arr));

        if (isSorted) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }

        sc.close();
    }
}