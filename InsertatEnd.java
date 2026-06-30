package array;

import java.util.Arrays;
import java.util.Scanner;

public class InsertatEnd {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of the array: ");
		int length = sc.nextInt();
		
		int[] array = new int[length+1];
		
		System.out.println("Enter the elements of the array: ");
		for(int i = 0;i<length;i++) {
			array[i] = sc.nextInt();
		}
		
			System.out.println("Before aading" + Arrays.toString(array));
		
			System.out.println("Enter the elements you want to insert :");
			int element = sc.nextInt();
			
			array[length] = element;
			
			System.out.print("After aading :" + Arrays.toString(array));
			
	}
}
