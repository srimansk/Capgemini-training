package array;
import java.util.*;
public class Insert{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length: ");
		int length = sc.nextInt();
		
		int[] array = new int[length+1];
		
		System.out.println("Enter the elements: ");
		for(int i = 0;i<length;i++) {
			array[i] =sc.nextInt();
		}
		System.out.println("Enter the index you want to add :");
		int index = sc.nextInt();
		
		System.out.println("Enter the element you want to insert :");
		int element = sc.nextInt();
		
		for(int i = length;i>index;i--) {
			array[i] = array[i-1];
		}
		array[index] = element;
		
		System.out.println("Replaced array: " + Arrays.toString(array));
	}   
	
}


