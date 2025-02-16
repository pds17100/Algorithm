
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int arr[] = new int[10];
        for (int i = 0; i < N.length(); i++) {
            int num = N.charAt(i) - '0';
            if (num == 9) {
                num = 6;
            }
            arr[num]++;
        }
        arr[6] = arr[6] / 2 + arr[6] % 2;
        Arrays.sort(arr);
        System.out.println(arr[9]);
    }
}
