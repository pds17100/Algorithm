
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T; t++) {
            int n = Integer.parseInt(br.readLine());
            int d[] = new int[11];
            d[1] = 1;
            d[2] = 2;
            d[3] = 4;
            for (int i = 4; i <= n; i++) {
                d[i] = d[i - 1] + d[i - 2] + d[i - 3];
            }
            sb.append(d[n]).append('\n');
        }
        System.out.println(sb);
    }
}
