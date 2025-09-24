
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int arr[][] = new int[101][101];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int lx = Integer.parseInt(st.nextToken());
            int ly = Integer.parseInt(st.nextToken());
            int rx = Integer.parseInt(st.nextToken());
            int ry = Integer.parseInt(st.nextToken());
            for (int x = lx; x <= rx; x++) {
                for (int y = ly; y <= ry; y++) {
                    arr[x][y]++;
                }
            }

        }

        int result = 0;

        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 101; j++) {
                if (arr[i][j] > M) {
                    result++;
                }
            }
        }

        System.out.println(result);

    }
}
