
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int arr[];
    static boolean visited[];
    static ArrayList<Integer> A[];
    static int distance[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N + 1];
        visited = new boolean[N + 1];
        distance = new int[N + 1];
        A = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            A[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e);
            A[e].add(s);
        }

        bfs(1);

        int maxDistance = 0;
        int node = 0;
        int cnt = 0;

        for (int i = 1; i <= N; i++) {
            if (distance[i] > maxDistance) {
                maxDistance = distance[i];
                node = i;
                cnt = 1;
            } else if (distance[i] == maxDistance) {
                cnt++;
            }
        }

        System.out.println(node + " " + maxDistance + " " + cnt);

    }

    private static void bfs(int R) {
        Queue<Integer> q = new LinkedList<>();
        visited[R] = true;
        q.offer(R);

        while (!q.isEmpty()) {
            int now = q.poll();
            for (int i : A[now]) {
                if (!visited[i]) {
                    visited[i] = true;
                    distance[i] = distance[now] + 1;
                    q.offer(i);
                }
            }
        }
    }
}
