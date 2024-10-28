package practice;

import java.util.Scanner;

public class 숫자의합구하기 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int N = scan.nextInt();
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum += N % 10;
            N /= 10;
        }
        System.out.println(sum);
    }
}
