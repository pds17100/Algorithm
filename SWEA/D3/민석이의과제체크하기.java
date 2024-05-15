package D3;

import java.util.Arrays;
import java.util.Scanner;

public class 민석이의과제체크하기 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int t = 1; t <= T; t++) {
            int N = scan.nextInt(); //수강생수
            int K = scan.nextInt(); //제출한사람수
            int a[] = new int[N + 1];
            for (int i = 0; i < K; i++) {
                int tmp = scan.nextInt();
                a[tmp] = 1;
            }
            System.out.print("#" + t + " ");
            for (int i = 1; i <= N; i++) {
                if (a[i] == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
}
