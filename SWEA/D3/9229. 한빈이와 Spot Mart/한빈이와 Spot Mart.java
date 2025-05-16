
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    static int N, M;
    static int arr[];
    static int result;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            arr = new int[N];
            st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            result = -1;
            dfs(0, 0,0);

            sb.append("#").append(t).append(" ").append(result).append('\n');
        }

        System.out.println(sb);
    }

    private static void dfs(int cnt, int sum, int idx) {
        if (cnt == 2) {
            if (sum <= M) {
                result = Math.max(result, sum);
            }
            return;
        }

        for (int i = idx; i < N; i++) {
            dfs(cnt + 1, sum + arr[i], i + 1);
        }
        
    }

}
