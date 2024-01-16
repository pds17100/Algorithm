package 반복문;

import java.util.Scanner;

public class 사칙연산6 {

	public static void main(String[] args) {

		 Scanner in = new Scanner(System.in);
		 
		 while(in.hasNextInt()) {
			 int A = in.nextInt();
			 int B = in.nextInt();
			 System.out.println(A+B);
			
		 }
		in.close();
	}

}
