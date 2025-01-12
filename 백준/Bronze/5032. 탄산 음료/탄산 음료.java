
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int sum = e + f;
        int result = 0;
        while (sum >= c) {
            int mok = sum / c;
            result += mok;
            sum = mok + (sum % c);
        }
        System.out.println(result);
    }
}
