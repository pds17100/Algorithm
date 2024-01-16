package 문자열;

import java.util.Scanner;

public class 알파벳찾기2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		String word = in.next();
		for(char c = 'a'; c < 'z'; c++)
			System.out.print(word.indexOf(c) + " ");
	}

}
