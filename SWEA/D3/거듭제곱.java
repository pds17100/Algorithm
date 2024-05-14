package D3;

import java.util.Scanner;

public class 거듭제곱 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int t = 1; t <= 10; t++) {
            scan.nextInt();
            int N = scan.nextInt();
            int M = scan.nextInt();
            System.out.println("#" + t + " " + recursion(N, M));
        }
    }
    public static int recursion(int N, int M) {
        if (M == 0) {
            return 1;
        }
        return N*recursion(N,M-1);
    }
}
