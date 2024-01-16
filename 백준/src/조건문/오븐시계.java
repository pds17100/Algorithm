package 조건문;

import java.util.Scanner;

public class 오븐시계 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int M = scan.nextInt();
		int T = scan.nextInt();
		scan.close();
		
		int a = (H * 60) + M + T;
		
		H = a/60;
		M = a%60;
		
		if(H>=24) {
			H = H-24;
		}
			System.out.println(H + " " + M);
	}
}
