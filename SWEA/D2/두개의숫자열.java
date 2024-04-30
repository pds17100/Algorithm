package D2;

import java.util.Scanner;

public class 두개의숫자열 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int t = 1; t <= T; t++) {
            int N = scan.nextInt();
            int M = scan.nextInt();
            int arrA[] = new int[N];
            int arrB[] = new int[M];
            int max = 0;

            for (int i = 0; i < N; i++) {
                arrA[i] = scan.nextInt();
            }
            for (int i = 0; i < M; i++) {
                arrB[i] = scan.nextInt();
            }

            if (N < M) {
                for (int i = 0; i < M - N + 1; i++) {
                    int sum = 0;
                    for (int j = 0; j < N; j++) {
                        sum += arrA[j] * arrB[i + j];
                    }
                    max = Math.max(sum, max);
                }
            } else if (N > M) {
                for (int i = 0; i < N - M + 1; i++) {
                    int sum = 0;
                    for (int j = 0; j < M; j++) {
                        sum += arrA[i+j] * arrB[j];
                    }
                    max = Math.max(sum, max);
                }
            } else if (N == M) {
                int sum=0;
                for (int i = 0; i < N; i++) {
                    sum += arrA[i] * arrB[i];
                }
                max = Math.max(sum, max);
            }
            System.out.println("#" + t + " " + max);
        }
    }
}