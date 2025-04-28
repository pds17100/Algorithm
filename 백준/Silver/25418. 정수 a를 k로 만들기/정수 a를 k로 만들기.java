
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int A, K;
    static int result = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        A = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        int tmp = K;
        while (tmp != A) {
            if (tmp % 2 == 0 && tmp / 2 >= A) {
                tmp /= 2;
            } else {
                tmp--;
            }
            result++;
        }

        System.out.println(result);
    }

}
