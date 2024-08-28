package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알파벳개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int alpa[] = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            alpa[c - 97]++;
        }
        for (int i : alpa) {
            System.out.print(i + " ");
        }
    }
}
