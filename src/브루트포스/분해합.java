package 브루트포스;

import java.util.Scanner;

public class 분해합 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int reuslt = 0;
        for (int i = 0; i < N; i++) {
            int number = i;
            int sum = 0;
            while (number != 0) {
                sum += number%10;
                number /= 10;
            }
            if (sum + i == N) {
                reuslt = i;
                break;
            }
        }
        System.out.println(reuslt);
    }
}
