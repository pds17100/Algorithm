package ���ǹ�;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ����2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int year = Integer.parseInt(br.readLine());
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			year = 1;
			System.out.println(year);
		}else {
			year = 0;
			System.out.println(year);
		}
	}

}
