package com.codingChallenge.FibonacciNumber;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fibRecursion(4));
        System.out.println(fib(4));
    }

    public static int fibRecursion(int N) {
        if (N <= 1) {
            return N;
        }
        return fibRecursion(N - 1) + fibRecursion(N - 2);
    }

    public static int fib(int N) {
        int[] f = new int[N + 1];

        if (N == 0) {
            return N;
        }
        f[1] = 1; //so we dont go below 0.

        for (int i = 2; i <= N; i++) { //covering 0 and 1 with above methods so here we just need to sum 2 and above
            f[i] = f[i - 1] + f[i - 2];
        }

        return f[N];
    }

    public static int fibMemoization(int n) {
        int[] memory = new int[n + 1];

        return memoization(memory, n);
    }

    public static int memoization(int[] storage, int n) {
        if (n < 2) return n;

        if (storage[n] != 0) {
            return storage[n];
        }

        storage[n] = memoization(storage, n - 1) + memoization(storage, n - 2);

        return storage[n];
    }

    public int fibTabulation(int n) {
        if (n == 0) return 0;
        int[] arr = new int[n + 1];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n];
    }

    public static int fibIII(int n) {
        if (n < 2) return n;

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

}
