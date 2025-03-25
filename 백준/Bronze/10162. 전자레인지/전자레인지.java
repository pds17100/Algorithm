
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int arr[] = new int[3];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

            if (T >= 300) {
                arr[0] += T / 300;
                T %= 300;
            }
            if (T >= 60) {
                arr[1] += T / 60;
                T %= 60;
            }
            if (T >= 10) {
                arr[2] += T / 10;
                T %= 10;
            }

            if (T == 0) {
                for (int i : arr) {
                    System.out.print(i + " ");
                }
            } else if (T > 0) {
                System.out.println(-1);
            }

    }
}
