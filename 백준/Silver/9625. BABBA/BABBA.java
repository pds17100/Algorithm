
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        int a[] = new int[46];
        int b[] = new int[46];

        a[0] = 1;
        b[0] = 0;

        for (int i = 1; i <= K; i++) {
            a[i] = b[i - 1];
            b[i] = a[i - 1] + b[i - 1];
        }

        System.out.println(a[K] + " " + b[K]);
    }
}
