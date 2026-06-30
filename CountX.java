package array;

import java.util.Arrays;
import java.util.Scanner;

public class CountX {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the length of the array: ");
		int length = sc.nextInt();
		
		int[] array = new int[length];
		
		System.out.print("Enter the elements of the array: ");
		for(int i = 0;i<length;i++) {
			array[i] = sc.nextInt();
		   }
			System.out.print("enter the value of x:");
			int x = sc.nextInt();
			
			int count = 0;
			for(int i = 0;i<length;i++) {
				if (array[i]>x) {
					count++;
				}
			}
			System.out.println("Your array " + Arrays.toString(array));
			System.out.print("count of elements greater that x:" +count);
		
	}
}
