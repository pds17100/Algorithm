
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int result = 0;
    static int arr[][];
    static boolean cleaned[][];
    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N][M];
        cleaned = new boolean[N][M];

        st = new StringTokenizer(br.readLine(), " ");   //청소기 좌표, 방향
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {   //배열채우기
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] == 1) {
                    cleaned[i][j] = true;
                }
            }
        }

        dfs(x, y, d);
        System.out.println(result);

    }

    private static void dfs(int x, int y, int dir) {
        if (!cleaned[x][y]) {
            cleaned[x][y] = true;
            result++;
        }

        for (int i = 0; i < 4; i++) {   //4방향탐색
            dir = (dir + 3) % 4;    //반시계방향회전
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            if (!cleaned[nx][ny] && arr[nx][ny] == 0 && (0 <= nx && nx < N) && (0 < ny && ny < M)) { //청소되지않는칸이있으면
                dfs(nx, ny, dir);
                return;
            }
        }

        int backDir = (dir + 2) % 4;
        int nx = x + dx[backDir];
        int ny = y + dy[backDir];

        if (arr[nx][ny] == 1) {
            return;
        }

        dfs(nx, ny, dir);
    }

}
