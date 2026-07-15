package problems;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KthLargest215 {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter array size: ");
	        int n = sc.nextInt();

	        int[] nums = new int[n];

	        System.out.println("Enter array elements:");

	        for (int i = 0; i < n; i++) {
	            nums[i] = sc.nextInt();
	        }

	        System.out.print("Enter k: ");
	        int k = sc.nextInt();

	        PriorityQueue<Integer> pq = new PriorityQueue<>();

	        for (int i = 0; i < n; i++) {

	            pq.offer(nums[i]);

	            if (pq.size() > k) {
	                pq.poll();
	            }
	        }

	        System.out.println(k + "th Largest Element = " + pq.peek());

	        sc.close();
	    }
	}

