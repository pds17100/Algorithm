
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N, M;
    static ArrayList<Integer> list[];
    static boolean visited[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        list = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            list[s].add(e);
            list[e].add(s);
        }

        int result = bfs(1);
        System.out.println(result);

    }

    private static int bfs(int R) {
        Queue<Integer> q = new LinkedList<>();
        visited[R] = true;
        q.offer(R);
        int cnt = 0;

        while (!q.isEmpty()) {
            int now = q.poll();
            for (int i : list[now]) {
                if (!visited[i]) {
                    visited[i] = true;
                    q.offer(i);
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
