package 약수배수와소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 약수구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int p = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        int count = 0;
        int result = 0;
        for (int i = 1; i <= p; i++) {
            if (p % i == 0) {
                count++;
            }
            if(count == q) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
