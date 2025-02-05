import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M, H;
    static int map[][][];
    static int dx[] = {0, 1, -1, 0, 0, 0};
    static int dy[] = {1, 0, 0, -1, 0, 0};
    static int dz[] = {0, 0, 0, 0, -1, 1};
    static Queue<Tomato> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        map = new int[H][N][M];
        for (int k = 0; k < H; k++) {
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int j = 0; j < M; j++) {
                    map[k][i][j] = Integer.parseInt(st.nextToken());
                    if (map[k][i][j] == 1) {
                        q.offer(new Tomato(k, i, j));
                    }
                }
            }
        }

        int date = bfs();

        for (int k = 0; k < H; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (map[k][i][j] == 0) {
                        System.out.println(-1);
                        return;
                    }
                }
            }
        }

        System.out.println(date);
    }

    private static int bfs() {
        int days = -1;

        while (!q.isEmpty()) {
            int size = q.size();
            days++;
            for (int i = 0; i < size; i++) {
                Tomato cur = q.poll();
                for (int k = 0; k < 6; k++) {
                    int nx = cur.x + dx[k];
                    int ny = cur.y + dy[k];
                    int nz = cur.z + dz[k];
                    if (nx >= 0 && nx < N && ny >= 0 && ny < M && nz>=0 && nz<H &&  map[nz][nx][ny] == 0) {
                        map[nz][nx][ny] = 1;
                        q.offer(new Tomato(nz, nx, ny));
                    }
                }
            }
        }
        return days;
    }

    static class Tomato {
        int z;
        int x;
        int y;

        Tomato(int z, int x, int y) {
            this.z = z;
            this.x = x;
            this.y = y;
        }
    }

}
