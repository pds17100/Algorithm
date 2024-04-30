package D2;

import java.util.Scanner;

public class 숫자배열회전_s {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int t = 1; t <= T; t++) {
            int N = scan.nextInt();
            int arr[][] = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = scan.nextInt();
                }
            }
            System.out.println("#" + t + " ");
            //90도
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(arr[N-j-1][i]);
                }
                System.out.print(" ");
                for (int j = 0; j < N ; j++) {
                    System.out.print(arr[N-i-1][N-j-1]);
                }
                System.out.print(" ");
                for (int j = 0; j < N; j++) {
                    System.out.print(arr[j][N-i-1]);
                }
                System.out.println();
            }
        }
    }
}
