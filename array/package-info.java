package array;
import java.util.*;
import java.util.Arrays;

public class y {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[]arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int count=0;
		int ele = sc.nextInt();
		
		for(int j=0;j<n;j++) {
				if(arr[j]==ele) {
					System.out.print(j);
					count++;
				}
			}if(count==0) {
			System.out .print("Element not found");
		}
	}

}