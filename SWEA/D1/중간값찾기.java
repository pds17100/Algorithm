package D1;

import java.util.Arrays;
import java.util.Scanner;

public class 중간값찾기 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[N/2]);
    }
}
