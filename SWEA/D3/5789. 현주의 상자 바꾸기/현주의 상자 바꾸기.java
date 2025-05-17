
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int Q = Integer.parseInt(st.nextToken());
            int arr[] = new int[N + 1];

            for (int i = 1; i <= Q; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                int L = Integer.parseInt(st.nextToken());
                int R = Integer.parseInt(st.nextToken());
                for (int j = L; j <= R; j++) {
                    arr[j] = i;
                }
            }
            sb.append("#").append(t).append(" ");
            for (int i = 1; i <= N; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
