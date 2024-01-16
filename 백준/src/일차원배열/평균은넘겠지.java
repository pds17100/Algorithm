package 일차원배열;

import java.util.Scanner;

public class 평균은넘겠지 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int arr[];
		int C = in.nextInt();
		
		for(int i=0; i<C; i++) {
		int N = in.nextInt();
		arr = new int[N];
		
		double sum = 0;
		
		for(int j=0; j<N; j++) {
			int val = in.nextInt();
			arr[j] = val;
			sum+= val;
		}
		double mean = (sum/N);
		double count = 0;
		
		for(int j=0; j<N; j++) {
			if(arr[j]>mean) {
				count++;
			}
		}
		System.out.printf("%.3f%%\n",(count/N)*100);
		}
		in.close();
	}

}
