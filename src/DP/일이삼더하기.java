package DP;

import java.util.Scanner;

public class 일이삼더하기 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int t = 1; t <= T; t++) {
            int N = scan.nextInt();
            int D[] = new int[11];
            D[1] = 1;
            D[2] = 2;
            D[3] = 4;
            for (int i = 4; i <= N; i++) {
                D[i] = D[i - 1] + D[i - 2] + D[i - 3];
            }
            System.out.println(D[N]);
        }

    }
}
