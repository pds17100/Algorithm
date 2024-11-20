package DP;

import java.util.Scanner;

public class 부녀회장이될테야 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
            int arr[][] = new int[15][15];
            for (int i = 0; i < 15; i++) {
                arr[i][1] = 1;
                arr[0][i] = i;
            }
            for (int i = 1; i < 15; i++) {
                for (int j = 2; j < 15; j++) {
                    arr[i][j] = arr[i][j - 1] + arr[i - 1][j];
                }
            }
        for (int t = 0; t < T; t++) {
            int k = scan.nextInt(); //층
            int n = scan.nextInt(); //호
            System.out.println(arr[k][n]);
        }
        }
}
