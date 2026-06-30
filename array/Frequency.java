package array;

import java.util.Scanner;

public class Frequency {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of the array: ");
		int length = sc.nextInt();
		
		int[] array = new int[length];
		
		System.out.println("Enter the elements of the array: ");
		for(int i = 0;i<length;i++) {
			array[i] = sc.nextInt();
			
		
		}
		System.out.println("Enter the value of x: ");
		int x = sc.nextInt();
		
		System.out.println("Enter the value of y: ");
		int y = sc.nextInt();
		
		int countX = 0;
		int countY = 0;
		
		for(int i = 0;i<length;i++) {
			if(array[i]==x) {
				countX++;
			}
			else if(array[i]==y) {
				countY++;
			}
		}
		if (countX == countY) {
            System.out.println(Math.min(x, y)); // If tied, return smaller element
        } else {
            System.out.println(countX > countY ? x : y); // Return the one with higher count
        }
	}
}
