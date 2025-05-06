
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String key = st.nextToken();
            String value = st.nextToken();
            if (set.contains(key)) {
                set.remove(key);
            } else {
                set.add(key);
            }
        }
        br.close();
        ArrayList<String> arrayList = new ArrayList<>(set);
        Collections.sort(arrayList, Collections.reverseOrder());
        for (String s : arrayList) {
            bw.write(s);
            bw.newLine();
//            System.out.println(s);
        }
        bw.flush();
        bw.close();
    }
}
