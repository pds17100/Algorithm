
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution {
    static ArrayList<Integer> A[];
    static boolean visited[];
    static StringBuilder sb = new StringBuilder();
    static int result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int t = 1; t <= 10; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int caseNum = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            A = new ArrayList[100];
            visited = new boolean[100];
            for (int i = 0; i < 100; i++) {
                A[i] = new ArrayList<>();
            }

            st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < N; i++) {
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                A[start].add(end);
            }

            result = 0;
            dfs(0);

            sb.append("#").append(t).append(" ").append(result).append("\n");
        }

        System.out.println(sb);
    }

    private static void dfs(int v) {
        if (v == 99) {
            result = 1;
            return;
        }

        visited[v] = true;

        for (int i : A[v]) {
            if (!visited[i]) {
                dfs(i);
                if (result == 1) {
                    return;
                }
            }
        }
    }

}
