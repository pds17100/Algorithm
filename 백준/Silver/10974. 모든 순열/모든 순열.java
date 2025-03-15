
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N;
    static int arr[];
    static int cal[];
    static boolean visited[];
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        cal = new int[N];
        visited = new boolean[N];

        for (int i = 1; i <= N; i++) {
            arr[i - 1] = i;
        }

        dfs(0);
        System.out.println(sb);
    }

    private static void dfs(int depth) {
        if (depth == N) {
            for (int i : cal) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < N; i++) {
            if (visited[i]) {
                continue;
            }
            if (!visited[i]) {
                visited[i] = true;
                cal[depth] = i + 1;
                dfs(depth + 1);
                visited[i] = false;
            }
        }

    }
}
