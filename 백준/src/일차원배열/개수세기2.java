package 일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 개수세기2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int cnt=0;
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int b = Integer.parseInt(br.readLine());
		
		for(int j=0; j<arr.length; j++) {
			if(arr[j] == b) {
				cnt++;
			}
		}
		System.out.println(cnt);
		br.close();
		
	}

}
