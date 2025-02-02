
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static ArrayList<Integer> list[];
    static boolean visited[];
    static int num1, num2;
    static int result = -1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        list = new ArrayList[N + 1];
        visited = new boolean[N + 1];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        num1 = Integer.parseInt(st.nextToken());
        num2 = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {
            list[i] = new ArrayList<>();
        }

        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list[x].add(y);
            list[y].add(x);
        }

        dfs(num1,0);
        System.out.println(result);

    }

    private static void dfs(int cur, int cnt) {
        visited[cur] = true;

        if (cur == num2) {
            result = cnt;
            return;
        }
        for (int i : list[cur]) {
            if (!visited[i]) {
                dfs(i, cnt + 1);
            }
        }
    }
}
