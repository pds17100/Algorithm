
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int t=1; t<=T; t++) {
			String str = br.readLine();
			char bit = '0';
			int cnt = 0;
			for(int i=0; i<str.length(); i++) {
				if(bit != str.charAt(i)) {
					bit = str.charAt(i);
					cnt++;
				}
			}
			System.out.println("#" + t + " " + cnt);
		}
	}

}
