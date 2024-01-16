package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 스택 {

	public static int[] stack;
	public static int size = 0;
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());

		stack = new int[N];
		
		while(N-->0) {
			st = new StringTokenizer(br.readLine()," ");
			
			switch(st.nextToken()) {
			
			case "push":
				//push(Integer.parseInt(st.nextToken()));
				break;
			}
		}
	}

	public static void push() {
		
	}
}
