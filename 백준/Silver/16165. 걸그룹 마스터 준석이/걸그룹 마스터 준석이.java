
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, List<String>> hashMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String group = br.readLine();
            int num = Integer.parseInt(br.readLine());
            ArrayList<String> list = new ArrayList<>();
            for (int j = 0; j < num; j++) {
                list.add(br.readLine());
            }
            hashMap.put(group, list);
        }

        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            int member = Integer.parseInt(br.readLine());
            if (member == 1) {
                for (String s : hashMap.keySet()) {
                    if (hashMap.get(s).contains(name)) {
                        sb.append(s).append("\n");
                        break;
                    }
                }
            } else {
                List<String> list = hashMap.get(name);
                Collections.sort(list);
                for (String s : list) {
                    sb.append(s).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
