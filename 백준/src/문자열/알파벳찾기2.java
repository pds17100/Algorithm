package ���ڿ�;

import java.util.Scanner;

public class ���ĺ�ã��2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		String word = in.next();
		for(char c = 'a'; c < 'z'; c++)
			System.out.print(word.indexOf(c) + " ");
	}

}
