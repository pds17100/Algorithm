package ����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class �������ϱ�2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		//Selection sort
		for(int i=0; i<N-1; i++) {
			for(int j = i+1; j<N; j++) {
				if(arr[i]>arr[j]) {
					int tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
			}
		}
		for(int val : arr) {	//for(�迭�ǿ�Ұ�:�ݺ����迭��)
			System.out.println(val);
		}
	}

}
