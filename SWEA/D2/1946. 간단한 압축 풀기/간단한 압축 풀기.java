
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int t=1; t<=T; t++) {
			System.out.println("#" + t);
			int N = Integer.parseInt(br.readLine());
			String str[] = new String[N];
			int arr[] = new int[N];
			for(int i=0; i<N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				str[i] = st.nextToken();
				arr[i] = Integer.parseInt(st.nextToken());
			}
			int index = 1;
			for(int i=0; i<N; i++) {
				for(int j=0; j<arr[i]; j++) {
					System.out.print(str[i]);
					index++;
					if(index>10) {
						System.out.println();
						index = 1;
					}
				}
			}
			System.out.println();
		}
	}

}
