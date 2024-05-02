package 이분탐색;

import java.util.Arrays;
import java.util.Scanner;

public class 수찾기 {
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
            if (binarySearch(arr, scan.nextInt()) >= 0) {
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        }
        System.out.println(sb);
    }

    public static int binarySearch(int arr[], int key) {
        int lo = 0;
        int hi = arr.length-1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (key < arr[mid]) {
                hi = mid - 1;
            }
            else if (key > arr[mid]) {
                lo = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
