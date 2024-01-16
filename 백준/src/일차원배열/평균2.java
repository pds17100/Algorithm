package 일차원배열;

import java.util.Scanner;

public class 평균2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		double record[]  = new double[N];
		double max = 0;
		double avg = 0;
		
		for(int i=0; i<record.length; i++) {
			record[i] = in.nextInt();
			if(record[i]>max) {
				max = record[i];
			}
		}
		for(int i=0; i<record.length; i++) {
			avg += (record[i]/max*100)/N;
		}
		System.out.println(avg);
	}

}
