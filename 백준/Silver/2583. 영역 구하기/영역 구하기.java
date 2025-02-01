
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int M, N, K;
    static int map[][];
    static boolean visited[][];
    static int result = 0;
    static int dx[] = {0, 1, -1, 0};
    static int dy[] = {1, 0, 0, -1};
    static int areaSize;
    static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        map = new int[M][N];
        visited = new boolean[M][N];

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int lx = Integer.parseInt(st.nextToken());
            int ly = Integer.parseInt(st.nextToken());
            int rx = Integer.parseInt(st.nextToken());
            int ry = Integer.parseInt(st.nextToken());

            for (int x = ly; x < ry; x++) {
                for (int y = lx; y < rx; y++) {
                    map[x][y] = 1;
                }
            }
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 0 && !visited[i][j]) {
                    areaSize = 0;
                    dfs(i, j);
                    list.add(areaSize);
                    result++;
                }
            }
        }

        Collections.sort(list);
        System.out.println(result);
        for (int i : list) {
            System.out.print(i + " ");
        }
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;
        areaSize++;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < M && ny >= 0 && ny < N && !visited[nx][ny] && map[nx][ny] == 0) {
                dfs(nx, ny);
            }
        }
    }
}


