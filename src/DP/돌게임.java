package DP;

import java.util.Scanner;

public class 돌게임 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int dp[] = new int[1001];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;

        for (int i = 4; i <= N; i++) {
            dp[i] = Math.min(dp[i-1], dp[i-3]) + 1;
        }
        if (dp[N] % 2 == 0) {
            System.out.println("CY");
        } else {
            System.out.println("SK");
        }
    }
}
