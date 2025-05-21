
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution {
    static int N, M;
    static ArrayList<Integer> A[];
    static boolean visited[];
    static int result;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            A = new ArrayList[N + 1];
            visited = new boolean[N + 1];
            result = 0;
            for (int i = 1; i < N + 1; i++) {
                A[i] = new ArrayList<>();
            }

            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                A[start].add(end);
                A[end].add(start);
            }

            for (int i = 1; i < N + 1; i++) {
                if (!visited[i]) {
                    dfs(i);
                    result++;
                }
            }

            sb.append("#").append(t).append(" ").append(result).append("\n");
        }
        System.out.println(sb);
    }

    private static void dfs(int num) {
        visited[num] = true;

        for (int i : A[num]) {
            if (!visited[i]) {
                dfs(i);
            }
        }
    }
}
