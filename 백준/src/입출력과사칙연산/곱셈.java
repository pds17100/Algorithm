package 입출력과사칙연산;

import java.util.Scanner;


public class 곱셈 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		scan.close();
		
		System.out.println(a*(b%10));
		System.out.println(a*(b/100%10));
		System.out.println(a*(b/100));
		System.out.println(a*b);
	}

}
