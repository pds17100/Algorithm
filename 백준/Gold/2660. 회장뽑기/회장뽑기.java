
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int arr[][];
    static final int INF = 987654321;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N + 1][N + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i == j) {
                    arr[i][j] = 0;
                }
                arr[i][j] = INF;
            }
        }

        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            if (s == -1 && e == -1) {
                break;
            }
            arr[s][e] = 1;
            arr[e][s] = 1;
            
}



        for (int k = 1; k <= N; k++) {
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    if (arr[i][j] > arr[i][k] + arr[k][j]) {
                        arr[i][j] = arr[i][k] + arr[k][j];
                    }
                }
            }
        }

        int min = INF;
        int result[] = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            int score = 0;
            for (int j = 1; j <= N; j++) {
                if (i!=j && arr[i][j] != INF) {
                    score = Math.max(score, arr[i][j]);
                }
            }

            result[i] = score;
            min = Math.min(min, score);

        }

        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            if (result[i] == min) {
                cnt++;
                sb.append(i).append(' ');
            }
        }

        System.out.println(min + " " + cnt);
        System.out.println(sb);
    }



}
