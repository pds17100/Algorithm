package practice;

import java.util.Arrays;
import java.util.Scanner;

public class 평균구하기 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        int max = arr[N - 1];
        double sum = 0;
        double avr;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
        }
        avr = sum/max*100/N;
        System.out.println(avr);
    }
}
