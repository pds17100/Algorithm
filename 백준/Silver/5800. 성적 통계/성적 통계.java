
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        for (int i = 1; i <= K; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int num[] = new int[Integer.parseInt(st.nextToken())];
            for (int j = 0; j < num.length; j++) {
                num[j] = Integer.parseInt(st.nextToken());
            }
            cal(num, i);
        }
    }

    private static void cal(int[] num, int i) {
        Arrays.sort(num);
        int gap = 0;
        for (int k = 0; k < num.length-1; k++) {
            gap = Math.max(gap, Math.abs(num[k] - num[k + 1]));
        }
        System.out.println("Class " + i);
        System.out.println(
                "Max " + num[num.length - 1] + ", " +
                        "Min " + num[0] + ", " +
                        "Largest gap " + gap);
    }
}
