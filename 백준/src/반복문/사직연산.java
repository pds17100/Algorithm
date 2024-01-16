package 반복문;

import java.util.Scanner;

public class 사직연산 {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();

		for(int i=0; i<T; i++) {
			int A = in.nextInt();
			int B = in.nextInt();
			System.out.println(A + B);
		}
	
		in.close();
	}
}
