package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 몬스터사냥 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int D = Integer.parseInt(st.nextToken()); //기본데미지
            int L = Integer.parseInt(st.nextToken()); //레벨
            int N = Integer.parseInt(st.nextToken()); //때린횟수
            int damage = 0;
            for (int i = 0; i < N; i++) {
                damage += D*(1+i*(L*0.01));
            }
            sb.append("#" + t + " " + damage + "\n");
        }
        System.out.println(sb);
    }
}
