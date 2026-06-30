package array;

import java.util.Scanner;

public class Count {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter the length:");
	    int length = sc.nextInt();
	    
	    int[] array = new int[length];
	    
	    System.out.println("enter the elements:");
	    for(int i = 0;i<length;i++) {
	    	array[i]=sc.nextInt();
	    }
	    System.out.println("enter the elements you want to count: ");
	    int element = sc.nextInt();
	    
	    int count = 0;
	    for(int i = 0;i<length;i++) {
	    	if (array[i]==element) {
	    		count++;
	    	}
	    }
	    System.out.println("count of the element " + element + " = " + count);
	}
}
