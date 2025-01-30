
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N,M;
    static int map[][];
    static int dx[] = {0, 1, -1, 0};
    static int dy[] = {1, 0, 0, -1};
    static int maxSafeZone = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dfs(0);
        System.out.println(maxSafeZone);

    }

    private static void dfs(int wallCnt) {
        if (wallCnt == 3) {
            bfs();
            return;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 0) {
                    map[i][j] = 1;
                    dfs(wallCnt + 1);
                    map[i][j] = 0;
                }
            }
        }
    }

    static void bfs() {
        Queue<Node> q = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 2) {
                    q.add(new Node(i, j));
                }
            }
        }
        int copyMap[][] = new int[N][M];
        for (int i = 0; i < N; i++) {
            copyMap[i] = map[i].clone();
        }

        while (!q.isEmpty()) {
            Node now = q.poll();
            int x = now.x;
            int y = now.y;
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 0 && ny >= 0 && nx < N && ny < M && copyMap[nx][ny] == 0) {
                    q.add(new Node(nx, ny));
                    copyMap[nx][ny] = 2;
                }
            }
        }
        funcSafeZone(copyMap);
    }

    private static void funcSafeZone(int[][] copyMap) {
        int safeZone = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (copyMap[i][j] == 0) {
                    safeZone++;
                }
            }
        }
        if (safeZone > maxSafeZone) {
            maxSafeZone = safeZone;
        }
    }

    static class Node {
        int x;
        int y;
        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}
