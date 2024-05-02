package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 날짜계산기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int day[] = {31,28,31,30,31,30,31,31,30,31,30,31};

        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken())-1;
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken())-1;
            int d = Integer.parseInt(st.nextToken());
            int sum1 = 0;
            for (int i = 0; i < a; i++) {
                sum1 += day[i];
            }
            sum1 = sum1 + b;
            int sum2 = 0;
            for (int i = 0; i < c; i++) {
                sum2 += day[i];
            }
            sum2 = sum2 + d;
            System.out.println("#" + t + " " + (sum2-sum1+1));
        }
    }

}
