package �Ｚ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ���谨�� {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		int arr[] = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) { 
			arr[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		long answer = 0;
		answer += N;
		
		for(int i=0; i<N; i++) {
			arr[i] -=B;
			if(arr[i]<=0) continue;
			answer += arr[i] / C;
			if(arr[i] % C != 0) {
				answer++;
			}
		}
		System.out.println(answer);
		
	}

}
