
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T; t++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            double num = Double.parseDouble(st.nextToken());
            while (st.hasMoreTokens()) {
                String operator = st.nextToken();
                if (operator.equals("@")) {
                    num *= 3;
                } else if (operator.equals("%")) {
                    num += 5;
                } else if (operator.equals("#")) {
                    num -= 7;
                }
            }
            System.out.println(String.format("%.2f",num));
        }
    }
}
