
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int result = 0;
		for(int i=0; i<N; i++) {
			HashSet<Character> set = new HashSet<>();
			boolean check = true;
			String str = br.readLine();
			set.add(str.charAt(0));
			for(int j=1; j<str.length(); j++) {
				if(set.contains(str.charAt(j)) && str.charAt(j) != str.charAt(j-1)) {
					check = false;
					break;
				} else {
					set.add(str.charAt(j));
				}
			}
			if(check) result++;
		}
		System.out.println(result);
	}

}
