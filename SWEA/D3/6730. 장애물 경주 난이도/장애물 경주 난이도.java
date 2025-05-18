
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
            int N = Integer.parseInt(br.readLine());
            int arr[] = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            int up = 0;
            int down = 0;
            for (int i = 0; i < N - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    down = Math.max(down, arr[i] - arr[i + 1]);
                } else {
                    up = Math.max(up, arr[i + 1] - arr[i]);
                }
            }
            sb.append("#").append(t).append(" ").append(up).append(" ").append(down).append("\n");
        }
        System.out.println(sb);
    }
}
