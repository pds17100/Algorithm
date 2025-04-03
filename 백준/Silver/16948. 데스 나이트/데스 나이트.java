
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int arr[][];
    static boolean visited[][];
    static int dx[] = {-2, -2, 0, 0, 2, 2};
    static int dy[] = {-1, 1, -2, 2, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        visited = new boolean[N][N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int r1 = Integer.parseInt(st.nextToken());
        int c1 = Integer.parseInt(st.nextToken());
        int r2 = Integer.parseInt(st.nextToken());
        int c2 = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            Arrays.fill(arr[i], -1);
        }

        bfs(r1, c1);
        System.out.println(arr[r2][c2]);
    }

    private static void bfs(int r, int c) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{r, c});
        visited[r][c] = true;
        arr[r][c] = 0;

        while (!q.isEmpty()) {
            int[] knight = q.poll();
            for (int i = 0; i < 6; i++) {
                int nx = knight[0] + dx[i];
                int ny = knight[1] + dy[i];
                if (nx >= 0 && nx < N && ny >= 0 && ny < N && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    arr[nx][ny] = arr[knight[0]][knight[1]] + 1;
                    q.offer(new int[]{nx, ny});
                }
            }
        }
    }
}
