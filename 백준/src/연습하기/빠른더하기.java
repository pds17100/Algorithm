package 연습하기;

import java.util.Scanner;

public class 빠른더하기 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		int arr[] = new int[T];
		for(int i=0; i<T; i++) {
			int A = in.nextInt();
			int B = in.nextInt();
			arr[i] = A+B;
		}
		for(int i=0; i<T; i++) {
		System.out.println(arr[i]);
		}
		in.close();
	}

}
