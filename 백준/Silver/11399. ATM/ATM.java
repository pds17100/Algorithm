
import java.util.Arrays;
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
        int sum = 0;
        int prev = 0;
        for (int i = 0; i < N; i++) {
            sum += prev + arr[i];
            prev += arr[i];
        }
        System.out.println(sum);
    }
}
