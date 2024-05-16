package D3;

import java.util.Arrays;
import java.util.Scanner;

public class 최대성적표만들기 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int t = 1; t <= T; t++) {
            int N = scan.nextInt();
            int K = scan.nextInt();
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scan.nextInt();
            }
            Arrays.sort(arr);
            int result = 0;
            int a = 1;
            for (int i = 0; i < K; i++) {
                result += arr[N-a];
                a++;
            }
            System.out.println("#" + t + " " + result);
        }
    }
}
