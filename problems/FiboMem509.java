package problems;
import java.util.Scanner;

public class FiboMem509 {

	    static int[] dp = new int[100];

	    public static int fib(int n) {

	        if (n == 0 || n == 1) {
	            return n;
	        }

	        if (dp[n] != 0) {
	            return dp[n];
	        }

	        dp[n] = fib(n - 1) + fib(n - 2);

	        return dp[n];
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter n: ");
	        int n = sc.nextInt();

	        System.out.println("Fibonacci = " + fib(n));
	        sc.close();
	    }
	}

