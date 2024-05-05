package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 수도요금경쟁 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int P = Integer.parseInt(st.nextToken());
            int Q = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());
            int S = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            System.out.print("#" + t + " ");
            int A = P*W;
            int B = 0;
            if (W < R) {
                B = Q;
            } else if(W > R) {
                B = ((W - R)*S) + Q;
            }
            if (A > B) {
                System.out.print(B);
                System.out.println();
            } else {
                System.out.print(A);
                System.out.println();
            }
        }
    }
}
