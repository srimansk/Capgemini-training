package problems;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class StonePQ1046 {


	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of stones: ");
	        int n = sc.nextInt();

	        int[] stones = new int[n];

	        System.out.println("Enter stone weights:");

	        for (int i = 0; i < n; i++) {
	            stones[i] = sc.nextInt();
	        }

	        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
	        
	        for (int i = 0; i < n; i++) {
	            pq.offer(stones[i]);
	        }

	        while (pq.size() > 1) {

	            int first = pq.poll(); 
	            int second = pq.poll(); 

	            if (first != second) {
	                pq.offer(first - second);
	            }
	        }

	        if (pq.isEmpty()) {
	            System.out.println("Last Stone Weight = 0");	
	        } else {
	            System.out.println("Last Stone Weight = " + pq.peek());
	        }

	        sc.close();
	    }
	}

