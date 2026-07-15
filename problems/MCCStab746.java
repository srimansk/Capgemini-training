package problems;
import java.util.Scanner;
public class MCCStab746 {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of steps: ");
	        int n = sc.nextInt();

	        int[] cost = new int[n];

	        System.out.println("Enter the cost of each step:");

	        for (int i = 0; i < n; i++) {
	            cost[i] = sc.nextInt();
	        }

	        int[] dp = new int[n + 1];

	        dp[0] = 0;
	        dp[1] = 0;

	        for (int i = 2; i <= n; i++) {

	            dp[i] = Math.min(dp[i - 1] + cost[i - 1],
	                             dp[i - 2] + cost[i - 2]);
	        }

	        System.out.println("Minimum Cost = " + dp[n]);

	        sc.close();
	    }
	}


