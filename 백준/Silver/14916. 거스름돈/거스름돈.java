
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int coin[] = new int[n + 1];

        Arrays.fill(coin, Integer.MAX_VALUE);
        coin[0] = 0;

        for (int i = 2; i <= n; i++) {
            if (i >= 2 && coin[i - 2] != Integer.MAX_VALUE) {
                coin[i] = Math.min(coin[i], coin[i - 2]) + 1;
            }
            if (i >= 5 && coin[i - 5] != Integer.MAX_VALUE) {
                coin[i] = Math.min(coin[i], coin[i - 5]) + 1;
            }
        }

        if (coin[n] == Integer.MAX_VALUE) {
            System.out.println("-1");
        } else {
            System.out.println(coin[n]);
        }

    }

}
