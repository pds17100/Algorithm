import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int arr[][];
    static boolean visited[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            n = Integer.parseInt(br.readLine());
            arr = new int[n + 2][2];
            visited = new boolean[n + 2];

            for (int i = 0; i < n + 2; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                arr[i][0] = Integer.parseInt(st.nextToken());
                arr[i][1] = Integer.parseInt(st.nextToken());
            }

            bfs(0);

        }
    }

    private static void bfs(int index) {
        Queue<Integer> q = new LinkedList<>();
        q.add(index);
        visited[index] = true;

        while (!q.isEmpty()) {
            int p = q.poll();
            if (p == n + 1) {
                System.out.println("happy");
                return;
            }
            for (int i = 1; i < n + 2; i++) {
                if (!visited[i]) {
                    int distance = Math.abs(arr[p][0] - arr[i][0]) + Math.abs(arr[p][1] - arr[i][1]);
                    if (distance <= 1000) {
                        visited[i] = true;
                        q.add(i);
                    }
                }
            }
        }

        System.out.println("sad");
    }
}
