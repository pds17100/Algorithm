package ���ǹ�;

import java.util.Scanner;

public class ����1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		scan.close();
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			year = 1;
			System.out.println(year);
		}else {
			year = 0;
			System.out.println(year);
		}
	}
}
