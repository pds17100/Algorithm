
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str[] = new String[N];
        for (int i = 0; i < N; i++) {
            str[i] = br.readLine();
        }
        int len = str[0].length();

        HashSet<String> set = new HashSet<>();
        for (int i = 1; i <= len; i++) {
            set.clear();
            for (int j = 0; j < N; j++) {
                String code = str[j].substring(len - i, len);
                    set.add(code);
            }
            if (set.size() == N) {
                System.out.println(i);
                return;
            }
        }

    }
}
