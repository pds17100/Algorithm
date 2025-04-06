
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int M, N;
    static int arr[][];
    static boolean visited[][];
    static int dx[] = {0, 1, -1, 0, -1, 1, 1, -1};
    static int dy[] = {1, 0, 0, -1, -1, 1, -1, 1};
    static int result = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        arr = new int[M][N];
        visited = new boolean[M][N];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j] && arr[i][j] == 1) {
                    bfs(i, j);
                    result++;
                }
            }
        }
        System.out.println(result);
    }

    private static void bfs(int x, int y) {
        Queue<Position> q = new LinkedList<>();
        q.offer(new Position(x, y));
        visited[x][y] = true;

        while (!q.isEmpty()) {
            Position now = q.poll();
            for (int i = 0; i < 8; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];
                if (nx >= 0 && nx < M && ny >= 0 && ny < N && !visited[nx][ny] && arr[nx][ny] == 1) {
                    q.offer(new Position(nx, ny));
                    visited[nx][ny] = true;
                }
            }
        }

    }

    static class Position {
        int x;
        int y;

        Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}
