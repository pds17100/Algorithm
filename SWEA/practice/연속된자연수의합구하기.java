package practice;

import java.util.Scanner;

public class 연속된자연수의합구하기 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int cnt = 1;
        int start = 1;
        int end = 1;
        int sum = 1;
        while (end != N) {
            if (sum == N) {
                cnt++;
                end++;
                sum += end;
            } else if (sum > N) {
                sum -= start;
                start++;
            } else if (sum < N) {
                end++;
                sum += end;
            }
        }
        System.out.println(cnt);
    }
}
