package D3;

import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = 10;
        for (int t = 1; t <= T; t++) {
            int N = scan.nextInt();
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scan.nextInt();
            }
            int cnt = 0;
            for (int i = 2; i < N - 2; i++) {
                int max = Math.max(arr[i - 2], Math.max(arr[i - 1], Math.max(arr[i + 1], arr[i + 2])));
                if (arr[i] - max > 0) {
                    cnt += arr[i] - max;
                }
            }
            System.out.println("#" + t + " " + cnt);
        }
    }
}
