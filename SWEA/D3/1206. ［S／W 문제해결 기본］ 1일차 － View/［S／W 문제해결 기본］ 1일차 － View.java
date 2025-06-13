
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int t=1; t<=10; t++) {
			int result = 0;
			int N = Integer.parseInt(br.readLine());
			int arr[] = new int[N];
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int i=0; i<N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			for(int i=2; i<N-2; i++) {
				int max = Math.max(arr[i-2], Math.max(arr[i-1], Math.max(arr[i+1], arr[i+2])));
				if(arr[i] - max > 0) {
					result+=arr[i]-max;
				}
			}
			System.out.println("#" + t + " " + result);
		}
	}

}
