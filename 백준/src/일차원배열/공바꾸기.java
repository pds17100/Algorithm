package 일차원배열;

import java.util.Scanner;

public class 공바꾸기 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = i+1;
		}
		
		for(int i=0; i<M; i++) {
			int temp;
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		temp = arr[a-1];
		arr[a-1] = arr[b-1];
		arr[b-1] = temp;
		}
		
		for(int k=0; k<arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
		
	}

}
