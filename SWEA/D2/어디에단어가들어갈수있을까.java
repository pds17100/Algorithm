package D2;

import java.util.Scanner;

/**
 * 2차원배열
 */
public class 어디에단어가들어갈수있을까 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int t = 1; t <= T; t++) {
            int N = scan.nextInt();
            int K = scan.nextInt();
            int arr[][] = new int[N][N];
            int result = 0;

            for (int i = 0; i < N; i++) { //N*N 배열
                for (int j = 0; j < N; j++) {
                    arr[i][j] = scan.nextInt();
                }
            }
            //가로
            for (int i = 0; i < N; i++) {
                int count = 0;
                for (int j = 0; j < N; j++) {
                    if (arr[i][j] == 0) {
                        if (count == K) {
                            result++;
                        }
                        count = 0;
                    } else {
                        count++;
                    }
                }
                if (count == K) {
                    result++;
                }
            }
            // 세로
            for (int i = 0; i < N; i++) {
                int count = 0;
                for (int j = 0; j < N; j++) {
                    if (arr[j][i] == 0) {
                        if (count == K) {
                            result++;
                        }
                        count = 0;
                    } else {
                        count++;
                    }
                }
                if (count == K) {
                    result++;
                }
            }
            System.out.println("#" + t + " " + result);
        }
    }
}
