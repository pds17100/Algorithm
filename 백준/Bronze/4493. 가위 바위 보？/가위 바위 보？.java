
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {

            int n = Integer.parseInt(br.readLine());
            int p1Win = 0;
            int p2Win = 0;

            StringTokenizer st;
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());

                String p1 = st.nextToken();
                String p2 = st.nextToken();

                if (p1.equals("R") && p2.equals("S")
                        || p1.equals("S") && p2.equals("P")
                        || p1.equals("P") && p2.equals("R")) { // p1 승
                    p1Win++;

                } else if (p2.equals("R") && p1.equals("S")
                        || p2.equals("S") && p1.equals("P")
                        || p2.equals("P") && p1.equals("R")) { // p2 승
                    p2Win++;
                }
            }

            if (p1Win > p2Win) {
                System.out.println("Player 1");
            } else if (p1Win < p2Win) {
                System.out.println("Player 2");
            } else {
                System.out.println("TIE");
            }
        }
    }
}
