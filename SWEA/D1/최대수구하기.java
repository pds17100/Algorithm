package D1;

import java.util.Arrays;
import java.util.Scanner;

public class 최대수구하기 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int arr[] = new int[10];
        for (int t = 1; t <= T; t++) {
            for (int i = 0; i < 10; i++) {
                arr[i] = scan.nextInt();
            }
            Arrays.sort(arr);
            System.out.println("#" + t + " " + arr[9]);
        }
    }
}
