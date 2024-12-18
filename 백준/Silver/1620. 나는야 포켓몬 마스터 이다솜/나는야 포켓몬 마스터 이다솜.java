
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> hashMap1 = new HashMap<>();
        HashMap<Integer, String> hashMap2 = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String poketmon = br.readLine();
            hashMap1.put(poketmon, i);
            hashMap2.put(i, poketmon);
        }

        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            if (hashMap1.containsKey(str)) {
                sb.append(hashMap1.get(str)).append("\n");
            } else {
                int num = Integer.parseInt(str);
                sb.append(hashMap2.get(num)).append("\n");
            }
        }

        System.out.println(sb);
    }

}
