
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int t=1; t<=T; t++) {
			int arr[] = new int[10];
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int i=0; i<10; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);
			float sum = 0;
			for(int i=1; i<9; i++) {
				sum += arr[i];
			}
			System.out.println("#" + t + " " + Math.round(sum/8));
		}
	}

}
