package 입출력과사칙연산;

import java.util.Scanner;

public class A마이너스B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = A-B;

        System.out.println(C);
    }
}
