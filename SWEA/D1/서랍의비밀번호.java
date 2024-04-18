package D1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 서랍의비밀번호 {

        public static void main(String args[]) throws Exception
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int P = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int sum = 0;
            for(int i=K; i<=P; i++) {
                sum+=1;
            }
            System.out.println(sum);
        }
    }
