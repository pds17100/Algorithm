
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int max = 15 * 28 * 19;

        int year = 1;
        int s = 1;
        int m = 1;
        int e = 1;

        for (int i = 1; i < max; i++) {
            if (s == S && m == M & e == E) {
                break;
            }
            s++;
            m++;
            e++;
            year++;
            if (e == 16) {
                e = 1;
            }
            if (m == 20) {
                m = 1;
            }
            if (s == 29) {
                s = 1;
            }

        }

        System.out.println(year);

    }
}
