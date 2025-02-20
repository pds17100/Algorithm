import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 4; j++) {
                sum += Integer.parseInt(st.nextToken());
            }
            if (sum == 0) {
                sb.append('D').append('\n');
            } else if (sum == 1) {
                sb.append('C').append('\n');
            } else if (sum == 2) {
                sb.append('B').append('\n');
            } else if (sum == 3) {
                sb.append('A').append('\n');
            } else if (sum == 4) {
                sb.append('E').append('\n');
            }
        }
        System.out.println(sb);
    }
}
