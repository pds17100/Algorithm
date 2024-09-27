package 전체문제;

import java.util.Scanner;

public class XORXORXOR {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt() % 2;

        int result = A;
        if (C == 1) {
            result = A^B;
        }
        System.out.println(result);
    }
}
