package D3;

import java.util.Scanner;

public class Magnetic_s {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int t = 1; t <= 10; t++) {
            int N = scan.nextInt();
            int arr[][] = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = scan.nextInt();
                }
            }
            System.out.print("#" + t + " ");
            System.out.println(solve(N, arr));
        }
    }

    public static int solve(int N, int arr[][]) {
        int count = 0;
        //1=빨 2=파
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[j][i] == 0 || arr[j][i] == 2) { //파란색일경우
                    continue;
                }
                for (int k = j + 1; k < N; k++) { //빨간색일경우
                    j=k;
                    if (arr[k][i] == 2) {
                        count++;
                        break;
                    }
                }
            }
        }
        return count;
    }
}
