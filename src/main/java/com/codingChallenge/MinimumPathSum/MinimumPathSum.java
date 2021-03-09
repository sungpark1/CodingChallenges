package com.codingChallenge.MinimumPathSum;

public class MinimumPathSum {

    public static int minPathSum(int[][] grid) {
        int row = grid[0].length;
        int col = grid.length;
        int[][] dp = new int[col][row];

        dp[0][0] = grid[0][0];

        for (int i = 1; i < row; i++) {
            dp[0][i] = dp[0][i - 1] + grid[0][i];
        }

        for (int i = 1; i < col; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }

        for (int i = 1; i < col; i++) {
            for (int j = 1; j < row; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }


        return dp[col - 1][row - 1];
    }

    public static void main(String[] args) {

    }
}