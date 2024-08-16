package 약수배수와소수2;

import java.util.Scanner;

public class 최소공배수 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();

            int d = gcd(a, b);
            sb.append(a * b / d).append('\n');
            System.out.println(sb);
        }
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
