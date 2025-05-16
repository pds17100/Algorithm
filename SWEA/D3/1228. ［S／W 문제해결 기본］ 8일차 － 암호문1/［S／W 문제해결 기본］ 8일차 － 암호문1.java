
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int t = 1; t <= 10; t++) {
            int len = Integer.parseInt(br.readLine());
            ArrayList<String> list = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < len; i++) {
                list.add(st.nextToken());
            }

            int num = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < num; i++) {
                String command = st.nextToken();
                int idx = Integer.parseInt(st.nextToken());
                int cnt = Integer.parseInt(st.nextToken());
                for (int j = 0; j < cnt; j++) {
                    String word = st.nextToken();
                    list.add(idx + j, word);
                }
            }

            sb.append("#").append(t).append(" ");

            for (int i = 0; i < 10; i++) {
                sb.append(list.get(i)).append(" ");
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
