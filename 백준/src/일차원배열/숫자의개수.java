package 일차원배열;

import java.util.Scanner;

public class 숫자의개수 {	//이해x

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int arr[] = new int[10];
		
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		int sum = A*B*C;
		
		while(sum>0) {
			arr[sum%10]++;
			sum /= 10;
		}
		for(int i=0; i<10; i++)
			System.out.println(arr[i]);
	}

}
