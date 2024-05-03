package 이분탐색;

import java.util.Arrays;
import java.util.Scanner;

/**
 * upper bound활용
 */
public class 숫자카드2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        int M = scan.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int cardNum = scan.nextInt();
            sb.append(binarySearch_last(arr, cardNum) - binarySearch_first(arr, cardNum)).append(" ");
        }
        System.out.println(sb);
    }

    private static int binarySearch_first(int[] arr, int cardNum) {
        int lo = 0;
        int hi = arr.length;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (cardNum <= arr[mid]) {
                hi = mid;
            }
            else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    private static int binarySearch_last(int[] arr, int cardNum) {
        int lo = 0;
        int hi = arr.length;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (cardNum < arr[mid]) {
                hi = mid;
            }
            else {
                lo = mid + 1;
            }
        }
        return lo;
    }
}
