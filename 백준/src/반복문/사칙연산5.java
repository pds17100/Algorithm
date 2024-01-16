package 반복문;

import java.util.Scanner;

public class 사칙연산5 {


	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		while(true) {
			int A = in.nextInt();
			int B = in.nextInt();
			
			if(A==0 && B==0) {
				in.close();
				break;
			}
			System.out.println(A+B);
		}


	

	}

}
