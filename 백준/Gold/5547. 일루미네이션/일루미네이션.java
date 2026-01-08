
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int W, H;
    static int arr[][];
    static boolean visited[][];
    static int wall = 0;
    // 짝수 행일 때의 6방향 (왼쪽 위, 오른쪽 위, 오른쪽, 오른쪽 아래, 왼쪽 아래, 왼쪽)
    static int evenDx[] = {-1, 0, 1, 0, -1, -1};
    static int evenDy[] = {-1, -1, 0, 1, 1, 0};

    // 홀수 행일 때의 6방향 (왼쪽 위, 오른쪽 위, 오른쪽, 오른쪽 아래, 왼쪽 아래, 왼쪽)
    static int oddDx[] = {0, 1, 1, 1, 0, -1};
    static int oddDy[] = {-1, -1, 0, 1, 1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        W = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        arr = new int[H + 2][W + 2];
        visited = new boolean[H + 2][W + 2];

        for (int i = 1; i <= H; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 1; j <= W; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, 0);

        System.out.println(wall);

    }

    private static void dfs(int y, int x) {
        visited[y][x] = true;
        // y좌표(행)가 홀수인지 짝수인지에 따라 방향 배열 선택
        int[] dx = (y % 2 == 1) ? oddDx : evenDx;
        int[] dy = (y % 2 == 1) ? oddDy : evenDy;

        for (int i = 0; i < 6; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];

            if (ny < 0 || nx < 0 || ny >= H + 2 || nx >= W + 2) continue;

            if (arr[ny][nx] == 1) {  // 건물을 만나면 벽 카운트
                wall++;
            } else if (!visited[ny][nx]) {  // 빈 공간이고 방문 안했으면 계속 탐색
                dfs(ny, nx);
            }

        }


    }
}
