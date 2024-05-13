package D2;

import java.util.Scanner;

public class 파스칼의삼각형_s {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int t = 1; t <= T; t++) {
            int N = scan.nextInt();
            int arr[][] = new int[N][N];
            arr[0][0] = 1;
            for (int i = 1; i < N; i++) {
                for (int j = 0; j <= i; j++) {
                    if (j == 0 || j == i) {
                        arr[i][j] = 1;
                    } else {
                        arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
                    }
                }
            }
            System.out.print("#" + t);
            System.out.println();
            for (int i = 0; i < N; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
