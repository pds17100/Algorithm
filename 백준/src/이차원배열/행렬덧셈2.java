package ÀÌÂ÷¿ø¹è¿­;

import java.util.Scanner;

public class Çà·Äµ¡¼À2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[][] arr = new int[N][M];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				arr[i][j] += scan.nextInt();
				System.out.print(arr[i][j] + " ");
			}
		}
	}

}
