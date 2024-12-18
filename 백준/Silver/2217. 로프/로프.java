import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        int total = 0;
        for (int i = 0; i < N; i++) {
            total = Math.max(total, arr[i] * (N - i));
        }
        System.out.println(total);
    }
}
