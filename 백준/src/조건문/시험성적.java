package ���ǹ�;

import java.util.Scanner;

public class ���輺�� {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		scan.close();
		
		if(a>=90) System.out.println("A");
		else if(a>=80) System.out.println("B");
		else if(a>=70) System.out.println("C");
		else if(a>=60) System.out.println("D");
		else System.out.println("F");
		
	}

}
