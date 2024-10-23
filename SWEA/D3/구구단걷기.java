package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 구구단걷기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T; t++) {
            long N = Long.parseLong(br.readLine());
            long result = 0;
            if (isPrime(N)) {
                result = (N-1);
            } else {
            for (int i = (int)Math.sqrt(N); i >= 1; i--) {
                if (N % i == 0) {
                    result = ((i + N / i) - 2);
                    break;
                }
            }
        }
            sb.append("#" + t + " " + result + "\n");
    }
        System.out.println(sb);
    }

    private static boolean isPrime(long N) {
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }
}
