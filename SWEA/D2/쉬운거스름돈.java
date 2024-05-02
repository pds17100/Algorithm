package D2;

import java.util.Scanner;

/**
 * 몫 = 돈단위개수
 * 나머지 = 다음돈단위개수를위한수
 */
public class 쉬운거스름돈 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int money[] = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
        int result[] = new int[8];
        for (int t = 1; t <= T; t++) {
            int N = scan.nextInt();
            for (int i = 0; i < 8; i++) {
                result[i] = N / money[i];
                N %= money[i];
            }
            System.out.println("#" + t);
            for (int i = 0; i < 8; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
        }
    }
}
