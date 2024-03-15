package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 팰린드롬인지확인하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int a = 0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == str.charAt(str.length()-1-i)) {
                a+=1;
            }
            else {
                a = 0;
            }
        }
        if(a == str.length()) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}
