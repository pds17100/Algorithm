
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        String kind = st.nextToken();

        HashSet<String> hashSet = new HashSet<>();

        for (int i = 0; i < N; i++) {
            hashSet.add(br.readLine());
        }

        int num = 0;

        if (kind.equals("Y")) {
            num = 1;
        } else if (kind.equals("F")) {
            num = 2;
        } else if (kind.equals("O")) {
            num = 3;
        }

        System.out.println(hashSet.size() / num);

    }
}
