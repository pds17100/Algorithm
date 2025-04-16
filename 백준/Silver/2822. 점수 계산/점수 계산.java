
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[8];
        int temp[] = new int[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = scan.nextInt();
            temp[i] = arr[i];
        }

        Arrays.sort(arr);

        int sum = 0;
        for (int i = 3; i < 8; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

        for (int i = 0; i < 8; i++) {
            for (int j = 3; j < 8; j++) {
                if (temp[i] == arr[j]) {
                    System.out.print((i + 1) + " ");
                }
            }
        }
    }
}
