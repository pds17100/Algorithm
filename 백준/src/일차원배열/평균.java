package �������迭;

import java.util.Arrays;
import java.util.Scanner;

public class ��� {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		double arr[] = new double[N];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = in.nextDouble();
			}
		in.close();
		
		double sum = 0;
		Arrays.sort(arr);//������������
		
		for(int i=0; i<arr.length; i++) {
			sum += ((arr[i] / arr[arr.length-1]) * 100);
		}
		System.out.println(sum / arr.length);
	}

}
