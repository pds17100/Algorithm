
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static boolean visited[];
    static int result[];
    static ArrayList<Integer> list[];
    static int cnt = 1;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        list = new ArrayList[N + 1];
        visited = new boolean[N + 1];
        result = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            list[start].add(end);
            list[end].add(start);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(list[i], Collections.reverseOrder());
        }

        bfs(R);
        for (int i = 1; i <= N; i++) {
            sb.append(result[i]).append("\n");
        }
        System.out.println(sb);
    }

    private static void bfs(int R) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(R);
        visited[R] = true;
        result[R] = cnt++;

        while (!queue.isEmpty()) {
            int cur = queue.poll();
            for (int i : list[cur]) {
                if (!visited[i]) {
                    visited[i] = true;
                    result[i] = cnt++;
                    queue.offer(i);
                }
            }
        }
    }
}
