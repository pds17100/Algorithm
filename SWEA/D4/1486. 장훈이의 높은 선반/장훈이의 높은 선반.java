
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    static int N, B, result;
    static int H[];
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            N = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            H = new int[N];
            st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < N; i++) {
                H[i] = Integer.parseInt(st.nextToken());
            }
            result = Integer.MAX_VALUE;
            dfs(0, 0);
            sb.append("#").append(t).append(" ").append(result).append("\n");
        }
        System.out.println(sb);
    }

    private static void dfs(int idx, int sum) {
        if (sum >= B) {
            result = Math.min(result, sum - B);
            return;
        }
        if (idx == N) {
            return;
        }

        dfs(idx + 1, sum + H[idx]);
        dfs(idx + 1, sum);

    }
}
