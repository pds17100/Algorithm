package 일차원배열;

import java.util.HashSet;
import java.util.Scanner;

public class 나머지 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		HashSet<Integer> h = new HashSet<Integer>();
		//HashSet은 중복을허용하지않는다.
		for(int i =0; i<10; i++) {
			h.add(in.nextInt() % 42);
		}
		in.close();
		System.out.println(h.size());
	}

}
