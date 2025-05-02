
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int arr[][] = new int[N][N];
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int j = 0; j < N; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            int result = 0;
            
            //가로
            for (int i = 0; i < N; i++) {
                int sum = 0;
                for (int j = 0; j < N; j++) {
                    if (arr[i][j] == 1) {
                        sum++;
                    } else {
                        if (sum == K) {
                            result++;
                        }
                        sum = 0;
                    }
                }
                if (sum == K) {
                    result++;
                }
            }
            
            //세로
            for (int i = 0; i < N; i++) {
                int sum = 0;
                for (int j =0 ; j < N; j++) {
                    if (arr[j][i] == 1) {
                        sum++;
                    } else {
                        if (sum == K) {
                            result++;
                        }
                        sum = 0;
                    }
                }
                if (sum == K) {
                    result++;
                }
            }
            
            sb.append("#").append(t).append(" ").append(result).append("\n");
        }
        System.out.println(sb);
    }
}
