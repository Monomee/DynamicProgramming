package Fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(dp_fib(3));
        System.out.println(recursive_fib(3));
    }

    public static int dp_fib(int n){
        if (n <= 1) return n;

        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2; i < n+1; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }

    public static int recursive_fib(int n){
        if (n <= 1) return n;

        return recursive_fib(n -1) + recursive_fib(n - 2);
    }
}
