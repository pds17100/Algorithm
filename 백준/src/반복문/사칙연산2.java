package �ݺ���;

import java.util.Scanner;

public class ��Ģ����2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		int arr[] = new int [T];
		
		for(int i=0; i<T; i++) {
			int A = in.nextInt();
			int B = in.nextInt();
			arr[i] = A + B;
		}
		for(int j=0; j<T; j++) {
		System.out.println(arr[j]);
		}
	}
}
