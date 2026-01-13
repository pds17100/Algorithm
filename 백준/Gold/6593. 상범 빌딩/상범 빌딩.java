
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int L, R, C;
    static char building[][][];
    static boolean visited[][][];
    static int[] dl = {-1, 1, 0, 0, 0, 0};
    static int[] dr = {0, 0, -1, 1, 0, 0};
    static int[] dc = {0, 0, 0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            L = Integer.parseInt(st.nextToken());
            R = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());

            if (L == 0 && R == 0 && C == 0) {
                break;
            }

            building = new char[L][R][C];
            visited = new boolean[L][R][C];
            int sl = 0, sr = 0, sc = 0;

            for (int l = 0; l < L; l++) {
                for (int r = 0; r < R; r++) {
                    String str = br.readLine();
                    for (int c = 0; c < C; c++) {
                        building[l][r][c] = str.charAt(c);
                        if (building[l][r][c] == 'S') {
                            sl = l;
                            sr = r;
                            sc = c;
                        }
                    }
                }

                br.readLine();
            }

            int result = bfs(sl, sr, sc);
            if (result == -1) {
                System.out.println("Trapped!");
            } else {
                System.out.println("Escaped in " + result + " minute(s).");
            }

        }


    }

    private static int bfs(int startL, int startR, int startC) {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(startL, startR, startC, 0));
        visited[startL][startR][startC] = true;

        while (!q.isEmpty()) {
            Point cur = q.poll();

            if (building[cur.l][cur.r][cur.c] == 'E') {
                return cur.time;
            }

            for (int i = 0; i < 6; i++) {
                int nl = cur.l + dl[i];
                int nr = cur.r + dr[i];
                int nc = cur.c + dc[i];

                if (nl < 0 || nl >= L || nr < 0 || nr >= R || nc < 0 || nc >= C) {
                    continue;
                }

                if (visited[nl][nr][nc] || building[nl][nr][nc] == '#') {
                    continue;
                }

                visited[nl][nr][nc] = true;
                q.offer(new Point(nl, nr, nc, cur.time + 1));
            }

        }

        return -1;

    }

    static class Point {
        int l;
        int r;
        int c;
        int time;

        public Point(int l, int r, int c, int time) {
            this.l = l;
            this.r = r;
            this.c = c;
            this.time = time;
        }

    }

}
