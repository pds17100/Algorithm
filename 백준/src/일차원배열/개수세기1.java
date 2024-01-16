package 일차원배열;

import java.util.Scanner;

public class 개수세기1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<arr.length; i++) {
			int v = scan.nextInt();
			arr[i] = v;
		}
		int sum = 0;
		int i = scan.nextInt();
		for(int j=0; j<arr.length; j++) {
			if(arr[j] == i) {
				sum++;
			}
		}
		System.out.println(sum);
	}

}
