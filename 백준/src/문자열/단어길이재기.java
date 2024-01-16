package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 단어길이재기 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		int sum=0;
		for(int i=0; i<S.length(); i++) {
			S.charAt(i);
			sum++;
		}
		System.out.println(sum);
	}

}
