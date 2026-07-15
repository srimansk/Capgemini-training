package problems;
import java.util.Scanner;

public class stairCaseMem70 {

    static int[] dp;

    public static int climbStairs(int n) {
        dp = new int[n + 1];
        return solve(n);
    }

    public static int solve(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        if (dp[n] != 0) {
            return dp[n];
        }

        dp[n] = solve(n - 1) + solve(n - 2);
        return dp[n];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of stairs: ");
        int n = sc.nextInt();

        int ways = climbStairs(n);

        System.out.println("Number of ways = " + ways);

        sc.close();
    }
}