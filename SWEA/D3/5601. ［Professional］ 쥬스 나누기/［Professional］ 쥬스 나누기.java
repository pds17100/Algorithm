
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());
            sb.append("#").append(t).append(" ");
            for (int i = 0; i < N; i++) {
                sb.append("1/").append(N).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
