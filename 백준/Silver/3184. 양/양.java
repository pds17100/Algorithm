
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int R, C;
    static int totalsheep = 0, totalwolf = 0;
    static char arr[][];
    static boolean visited[][];
    static int dx[] = {0, -1, 1, 0};
    static int dy[] = {1, 0, 0, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        arr = new char[R][C];
        visited = new boolean[R][C];

        for (int i = 0; i < R; i++) {
            String str = br.readLine();
            for (int j = 0; j < C; j++) {
                arr[i][j] = str.charAt(j);
                if(arr[i][j] == 'o') totalsheep++;
                if(arr[i][j] == 'v') totalwolf++;
            }
        }


        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if ((arr[i][j] == 'o' || arr[i][j] == 'v') && !visited[i][j]) {
                    int result[] = dfs(i, j);
                    int nsheep = result[0];
                    int nwolf = result[1];

                    if (nsheep > nwolf) {
                        totalwolf -= nwolf;
                    } else {
                        totalsheep -= nsheep;
                    }
                }
            }
        }

        System.out.println(totalsheep + " " + totalwolf);

    }

    private static int[] dfs(int x, int y) {
        int sheep = 0;
        int wolf = 0;

        if(arr[x][y] == 'o') sheep++;
        if(arr[x][y] == 'v') wolf++;

        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < R && ny >= 0 && ny < C && arr[nx][ny] != '#' && !visited[nx][ny]) {
                int res[] = dfs(nx, ny);
                sheep += res[0];
                wolf += res[1];
            }
        }

        return new int[]{sheep, wolf};
    }

}
