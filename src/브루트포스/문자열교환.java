package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자열교환 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int min = Integer.MAX_VALUE;
        int acnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                acnt++;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            int bcnt = 0;
            for (int j = i; j < i+acnt; j++) {
                int index = j % str.length();
                if (str.charAt(index) == 'b') {
                    bcnt++;
                }
            }
            min = Math.min(min, bcnt);
        }
        System.out.println(min);
    }
}
