package array;

import java.util.Scanner;

public class Duplicate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array after removing duplicates:");

        // Check each element
        for (int i = 0; i < n; i++) {

            boolean duplicate = false;

            // Check previous elements
            for (int j = 0; j < i; j++) {

                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}