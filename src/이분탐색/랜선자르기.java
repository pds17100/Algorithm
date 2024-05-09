package 이분탐색;

import java.util.Scanner;

public class 랜선자르기 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int K = scan.nextInt();
        int arr[] = new int[K];
        long max = 0;
        int N = scan.nextInt();
        //입력과 동시에 해당 랜선의 길이가 최댓값인지를 확인하고 max를 갱신
        for (int i = 0; i < K; i++) {
            arr[i] = scan.nextInt();
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        max++;

        long min = 0; //탐색길이최솟값
        long mid = 0;
        while (min < max) {
            mid = (max+min) / 2;
            long count = 0;
            for (int i = 0; i < arr.length; i++) {
                count += (arr[i] / mid);
            }
            if (count < N) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        System.out.println(min - 1);
    }
}
