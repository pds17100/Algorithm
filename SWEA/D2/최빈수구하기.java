package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최빈수구하기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t=1; t<=T; t++) {
            Integer.parseInt(br.readLine());
            int jumsu[] = new int[101];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0; i<1000; i++) {
                jumsu[Integer.parseInt(st.nextToken())] += 1;
            }

            int max = 0;
            int result = 0;
            for(int i=0; i<jumsu.length; i++) {
                if(jumsu[i] >= max) {
                    max = jumsu[i];
                    result = i;
                }
            }
            System.out.println("#" + t + " " + result);
        }
        br.close();
    }

}
