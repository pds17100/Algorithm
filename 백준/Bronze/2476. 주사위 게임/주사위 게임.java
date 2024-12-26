
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int money = cal(a, b, c);
            result = Math.max(result, money);
        }
        System.out.println(result);
    }

    private static int cal(int a, int b, int c) {
        if (a == b && b == c) {
            return 10000 + a * 1000;
        } else if (a != b && b != c && a != c) {
            int max = Math.max(a, Math.max(b, c));
            return max * 100;
        } else {
            if (a == b || a == c) {
                return 1000 + a * 100;
            } else {
                return 1000 + b * 100;
            }
        }
    }
}
