package D2;

import java.util.Scanner;

public class 파리퇴치 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for (int t = 1; t <= T; t++) {
            int N = scan.nextInt();
            int M = scan.nextInt();
            int arr[][] = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = scan.nextInt();
                }
            }
            int max = 0;
            for (int i = 0; i < N - M + 1; i++) {
                for (int j = 0; j < N - M + 1; j++) {
                    int sum = 0;
                    for (int k = 0; k < M; k++) {
                        for (int p = 0; p < M; p++) {
                            sum+= arr[i+k][j+p];
                        }
                    }
                    if (sum > max) {
                        max = sum;
                    }
                }
            }
            System.out.println("#" + t + " " + max);
        }
    }
}
