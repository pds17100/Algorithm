
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());   //세로
        int M = Integer.parseInt(st.nextToken());   //가로
        char arr[][] = new char[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        //가로개수
        int row = 0;
        for (int i = 0; i < N; i++) {
            int cnt = 0;
            for (int j = 0; j < M; j++) {
                if (arr[i][j] == '-') {
                    cnt = 1;
                } else {
                    row += cnt;
                    cnt = 0;
                }
            }
            row += cnt;
        }

        //세로개수
        int col = 0;
        for (int i = 0; i < M; i++) {
            int cnt = 0;
            for (int j = 0; j < N; j++) {
                if (arr[j][i] == '|') {
                    cnt = 1;
                } else {
                    col += cnt;
                    cnt = 0;
                }
            }
            col += cnt;
        }

        int result = row + col;
        System.out.println(result);

    }
}
