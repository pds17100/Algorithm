
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Solution {
    static String num[] = {"ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T; t++) {
            StringBuilder sb = new StringBuilder();
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            st.nextToken();
            int N = Integer.parseInt(st.nextToken());
            HashMap<String, Integer> hashMap = new HashMap<>();
            st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < N; i++) {
                String word = st.nextToken();
                if (hashMap.containsKey(word)) {
                    hashMap.replace(word, hashMap.get(word) + 1);
                } else {
                    hashMap.put(word, 1);
                }
            }

            sb.append("#").append(t).append('\n');
            for (int i = 0; i < 10; i++) {
                int size = hashMap.get(num[i]);
                for (int j = 0; j < size; j++) {
                    sb.append(num[i]).append(" ");
                }
            }

            System.out.println(sb);
        }
    }
}
