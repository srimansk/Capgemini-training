package array;
import java.util.*;
public class MaxMin{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the length of the array: ");
		int length = sc.nextInt();
		
		int[] array = new int[length];
		
		System.out.print("Enter the elements of the array: ");
		for(int i = 0;i<length;i++) {
			array[i] = sc.nextInt();
		}
		int min = array[0];
		int max = array[0];
		
		for(int i = 0;i<length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
			if(array[i]<min) {
				min=array[i];
			}
		}
		System.out.println("Maximim = " + max);
		System.out.print("Minimum = " + min);
		
		
	}
}
