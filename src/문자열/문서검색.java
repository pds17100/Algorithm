package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문서검색 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String word = br.readLine();
        int size1 = str.length();
        int size2 = word.length();
        str = str.replace(word, "");
        int cnt = ((size1 - str.length()) / size2);
        System.out.println(cnt);
    }
}
