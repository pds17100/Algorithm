package D2;

import java.util.Scanner;

public class 스도쿠검증 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int t = 1; t <= T; t++) {
            int ans = 1;
            int arr[][] = new int[9][9];
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    arr[i][j] =scan.nextInt();
                }
            }
            //row, col 검사
            for (int i = 0; i < 9; i++) {
                int rsum = 0;
                int csum = 0;
                for (int j = 0; j < 9; j++) {
                    rsum += arr[i][j];
                    csum += arr[j][i];
                }
                if (rsum != 45 || csum != 45) {
                    ans = 0;
                    break;
                }
            }
            if (ans == 0) {
                System.out.println("#" + t + " " + "0");
                continue;
            }
            //정사각형 구역 검사
            for (int i = 0; i < 9; i += 3) {
                for (int j = 0; j < 9; j += 3) {
                    int sum = 0;
                    for (int x = 0; x < 3; x++)
                        for (int y = 0; y < 3; y++)
                            sum += arr[i+x][j+y];
                    if (sum != 45) {
                        ans = 0;
                        break;
                    }
                }
                if (ans == 0) {
                    break;
                }
            }
            System.out.println("#" + t + " " + ans);
        }
        scan.close();
    }
}
