package array;
import java.util.*;

public class Find{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nov= sc.nextInt();
		
		int[] arr = new int[nov];
		
		for(int i=0;i<nov;i++) {
			arr[i] = sc.nextInt();
		}
		int count = 0;
		int element=sc.nextInt();
		
		for(int j=0;j<nov;j++) {
			if(arr[j]==element) {
				System.out.print(j);
				count++;
			}
			}	if(count<=0) {
				System.out.println("not found");
		}
		
	}
}