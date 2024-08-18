package D2;

import java.io.IOException;
import java.util.Scanner;

public class 달팽이숫자 {
    static int dx[] = {0, 1, 0, -1}; //우 하 좌 상
    static int dy[] = {1, 0, -1, 0};
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int t = 1; t <= T; t++) {
            int N = scan.nextInt();
            int arr[][] = new int[N][N];
            int x = 0;
            int y = 0;
            int dir = 0;
            int num = 1;
            while (num <= N * N) {
                arr[x][y] = num++;
                int nx = x + dx[dir];
                int ny = y + dy[dir];
                if (nx < 0 || nx >= N || ny < 0 || ny >= N || arr[nx][ny] != 0) {
                    dir = (dir + 1) % 4;
                    nx = x + dx[dir];
                    ny = y + dy[dir];
                }
                x = nx;
                y = ny;
            }
            System.out.println("#" + t);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
