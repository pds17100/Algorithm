package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자열2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String[] name = new String[T];
		
		for(int i=0; i<T; i++) {
			String S = br.readLine();
			name[i] = S.substring(0, 1) + S.substring(S.length()-1, S.length());
		}
		br.close();
		for(int j=0; j<T; j++) {
			System.out.println(name[j]);
		}
	}
}
