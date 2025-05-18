
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
            sb.append("#").append(t).append(" ");
            String line = br.readLine();
            line = line.replaceAll("[DOPQR]", "A");
            line = line.replaceAll("[EFGHIJKLMNSTUVWXYZ]", "C");

            StringTokenizer st = new StringTokenizer(line, " ");
            String word1 = st.nextToken();
            String word2 = st.nextToken();

            if (word1.length() != word2.length()) {
                sb.append("DIFF").append("\n");
                continue;
            } else {
                if (word1.equals(word2)) {
                    sb.append("SAME").append("\n");
                } else {
                    sb.append("DIFF").append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
