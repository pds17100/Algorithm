package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 단어공부4 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int arr[] = new int[26];
		
		for(int i=0; i<str.length(); i++) {
			if('a'<= str.charAt(i) && str.charAt(i) <= 'z') {
				arr[str.charAt(i) - 'a']++;
			}
			else if('A'<= str.charAt(i) && str.charAt(i) <= 'Z') {
				arr[str.charAt(i) - 'A']++;
			}
		}
		int max = -1;
		char ch = '?';
		
		for(int i=0; i<26; i++) {
			if(arr[i] > max) {
				max = arr[i];
				ch = (char)(i+65);
			}else if(arr[i] == max){
				ch = '?';
			}
		}
		System.out.println(ch);
	}

}
