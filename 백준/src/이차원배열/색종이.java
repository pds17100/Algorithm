package 이차원배열;

import java.util.Scanner;

public class 색종이 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[][] paper = new int[100][100];
		int N = scan.nextInt();
		
		for(int i=0; i<N; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			for(int j=x; j<x+10; j++) {
				for(int k=y; k<j+10; k++) {
					paper[k][j] = 1;
				}
			}
		}
		int result = 0;
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				if(paper[i][j] == 1) {
					result += paper[i][j];
				}
			}
		}
		System.out.println(result);
	}

}
