
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static ArrayList<Integer> A[];
    static boolean visited[];
    static int result = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        A = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            A[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e);
            A[e].add(s);
        }

        bfs(1,0);

        System.out.println(result);

    }

    private static void bfs(int num, int depth) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{num, depth});
        visited[num] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int now = cur[0];
            int d = cur[1];

            if (d >= 2) continue;

            for (int i : A[now]) {
                if (!visited[i]) {
                    visited[i] = true;
                    result++;
                    q.offer(new int[]{i, d + 1});
                }
            }
        }

    }


}
