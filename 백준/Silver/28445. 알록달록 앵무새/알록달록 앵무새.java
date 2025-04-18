
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            list.add(st.nextToken());
            list.add(st.nextToken());
        }
        Collections.sort(list);
        List<String> list2 = new ArrayList<>(list);
        TreeSet<String> set = new TreeSet<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                StringBuilder sb = new StringBuilder();
                set.add(sb.append(list.get(i)).append(" ").append(list2.get(j)).toString());
            }
        }
        for (String s : set) {
            System.out.println(s);
        }
    }
}
