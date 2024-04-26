package D1;

import java.util.Scanner;

public class 자릿수더하기 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int sum = 0;
        while (N != 0) {
            sum += (N % 10);
            N = N / 10;
        }
        System.out.println(sum);
    }
}
