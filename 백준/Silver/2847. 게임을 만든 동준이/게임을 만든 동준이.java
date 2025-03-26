
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int result = 0;
        int tmp = 0;
        while (true) {
            for (int i = arr.length-1; i > 0; i--) {
                if (arr[i] <= arr[i - 1]) {
                    arr[i - 1] -= 1;
                    result++;
                }
            }
            if (result != tmp) {
                tmp = result;
            } else {
                System.out.println(result);
                return;
            }
        }
    }
    
}
