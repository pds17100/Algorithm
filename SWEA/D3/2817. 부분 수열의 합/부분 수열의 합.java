
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    
    static int N, K;
    static int arr[];
    static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            arr = new int[N];
            st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            result = 0;
            solve(0, 0);

            System.out.println("#" + t + " " + result);
        }
    }

    private static void solve(int idx, int sum) {
        if (idx == N) {
            if (sum == K) result++;
            return;
        } else {
            solve(idx + 1, sum);
            solve(idx + 1, sum + arr[idx]);
        }
    }
}
