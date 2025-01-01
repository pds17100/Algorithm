
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int k;
    static int arr[];
    static boolean visited[];
    static int result[];
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            k = Integer.parseInt(st.nextToken());
            if (k == 0) {
                break;
            }
            arr = new int[k];
            for (int i = 0; i < k; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            result = new int[6];
            visited = new boolean[k];
            back(0, 0);
            sb.append("\n");
        }
        System.out.println(sb);
    }

    private static void back(int start, int depth) {
        if (depth == 6) {
            for (int val : result) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = start; i < k; i++) {
                result[depth] = arr[i];
            back(i + 1, depth + 1);
            }
        }
}
