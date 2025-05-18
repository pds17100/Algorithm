
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    static char c[] = {'a', 'e', 'i', 'o', 'u'};
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int t = 1; t <= T; t++) {
            String str = br.readLine();
            String answer = "";
            for (int i = 0; i < str.length(); i++) {
                boolean same = false;
                for (int j = 0; j < 5; j++) {
                    if (str.charAt(i) == c[j]) {
                        same = true;
                    }
                }
                if (same == false) {
                    answer += str.charAt(i);
                }
            }
            sb.append("#").append(t).append(" ").append(answer).append("\n");
        }
        System.out.println(sb);
    }
}
