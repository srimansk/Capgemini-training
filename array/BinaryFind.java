package array;
import java.util.Scanner;
import java.util.Arrays;

public class BinaryFind {
	    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter the length:");
	    int length = sc.nextInt();
	    
	    int[] array = new int[length];
	    
	    System.out.println("enter the elements:");
	    for(int i = 0;i<length;i++) {
	    	array[i]=sc.nextInt();
	    }
	    System.out.println("Your Array " + Arrays.toString(array));
	    
	    Arrays.sort(array);
	    System.out.println("Sorted array : " + Arrays.toString(array));
	    
	    System.out.println("Enter the element want to search: ");
	    int targetElement = sc.nextInt();
	    
	    int foundIndex = Arrays.binarySearch(array, targetElement);
	    
	    if(foundIndex>=0) {
	    	System.out.println("Index of the element you asked " + foundIndex );
	    }
	    else {
	    	System.out.println("Element was not found");
	    }
	}
}   