
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }
        
        int cnt1 = 1;
        int max_left = arr[0];
        for (int i = 1; i < N; i++) {
            if (max_left < arr[i]) {
                cnt1++;
                max_left = arr[i];
            }
        }
        System.out.println(cnt1);
        
        int cnt2 = 1;
        int max_right = arr[N - 1];
        for (int i = N - 1; i > 0; i--) {
            if (max_right < arr[i - 1]) {
                cnt2++;
                max_right = arr[i - 1];
            }
        }
        System.out.println(cnt2);
    }
}
