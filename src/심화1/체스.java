package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 체스 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = 1;
        int B = 1;
        int C = 2;
        int D = 2;
        int E = 2;
        int F = 8;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        A = A - Integer.parseInt(st.nextToken());
        B = B - Integer.parseInt(st.nextToken());
        C = C - Integer.parseInt(st.nextToken());
        D = D - Integer.parseInt(st.nextToken());
        E = E - Integer.parseInt(st.nextToken());
        F = F - Integer.parseInt(st.nextToken());

        System.out.print(A + " ");
        System.out.print(B + " ");
        System.out.print(C + " ");
        System.out.print(D + " ");
        System.out.print(E + " ");
        System.out.print(F + " ");
    }
}
