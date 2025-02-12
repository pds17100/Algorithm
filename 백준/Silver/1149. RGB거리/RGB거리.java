
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    final static int r = 0;
    final static int g = 1;
    final static int b = 2;
    static int cost[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        cost = new int[N][3];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            cost[i][r] = Integer.parseInt(st.nextToken());
            cost[i][g] = Integer.parseInt(st.nextToken());
            cost[i][b] = Integer.parseInt(st.nextToken());
        }
        for (int i = 1; i < N; i++) {
            cost[i][r] += Math.min(cost[i - 1][g], cost[i - 1][b]);
            cost[i][g] += Math.min(cost[i - 1][r], cost[i - 1][b]);
            cost[i][b] += Math.min(cost[i - 1][r], cost[i - 1][g]);
        }
        System.out.println(Math.min(cost[N - 1][r], Math.min(cost[N - 1][g], cost[N - 1][b])));
    }
}
