package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 네수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String A = st.nextToken();
        String B = st.nextToken();
        String C = st.nextToken();
        String D = st.nextToken();
        long str1 = Long.parseLong(A + B);
        long str2 = Long.parseLong(C + D);
           System.out.println(str1 + str2);
    }
}
