package exceptionHandling;

import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ex {

    public static void main(String[] args) {

        // 1. ArithmeticException
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Cannot divide by zero.");
        }

        // 2. NullPointerException
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: String is null.");
        }

        // 3. ArrayIndexOutOfBoundsException
        try {
            int[] arr = {10, 20, 30};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Invalid array index.");
        }

        // 4. StringIndexOutOfBoundsException
        try {
            String s = "Java";
            System.out.println(s.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException: Invalid string index.");
        }

        // 5. NumberFormatException
        try {
            int num = Integer.parseInt("abc");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid number format.");
        }

        // 6. InputMismatchException
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int n = sc.nextInt();
            System.out.println("You entered: " + n);
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException: Please enter an integer.");
        }

        // 7. NegativeArraySizeException
        try {
            int[] arr = new int[-5];
        } catch (NegativeArraySizeException e) {
            System.out.println("NegativeArraySizeException: Array size cannot be negative.");
        }

        // 8. ClassCastException
        try {
            Object obj = "Java";
            Integer num = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: Invalid type casting.");
        }

        // 9. FileNotFoundException
        try {
            FileReader file = new FileReader("sample.txt");
        } catch (IOException e) {
            System.out.println("IOException/FileNotFoundException: File not found.");
        }

        // 10. InterruptedException
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException: Thread interrupted.");
        }

        sc.close();
    }
}