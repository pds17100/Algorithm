package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 플는 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int t = 1; t <= T; t++) {
            int cnt = 0;
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            while (true) {
                if (A > B) {
                    B += A;
                    cnt++;
                    if (N < B) {
                        sb.append(cnt + "\n");
                        break;
                    }
                } else {
                    A += B;
                    cnt++;
                    if (N < A) {
                        sb.append(cnt + "\n");
                        break;
                    }
                }
            }
        }
        System.out.println(sb);
    }
}
