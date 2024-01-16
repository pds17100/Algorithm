package 스택;

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
		//String과문자열을더할때새로운객체를생성하는것이아니라기존의데이터에더하는방식
		//sb.append
		StringTokenizer st;	//문자열을띄어쓰기기준으로나눈다
		
		int N = Integer.parseInt(br.readLine());
		
		stack = new int[N];
		
		while(N-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");	//공백을기준으로문자열을분리
			//StringTokenizer st = new StringTokenizer(문자열,구분자); ->구분자를기준으로문자열을분리
			switch(st.nextToken()) {
			
			case "push":
				push(Integer.parseInt(st.nextToken()));
				break;
				
			case "pop":
				sb.append(pop()).append('\n');
				break;
				
			case "size":
				sb.append(size()).append('\n');
				break;
				
			case "empty":
				sb.append(empty()).append('\n');
				break;
				
			case "top":
				sb.append(top()).append('\n');
			}
		}
		System.out.println(sb);
	}
	
	public static void push(int item) {
		stack[size] = item;
		size++;
	}
	
	public static int pop() {
		if(size == 0) {
			return -1;
		}
		else {
			int res = stack[size -1];
			stack[size - 1] = 0;
			size--;
			return res;
		}
	}
	
	public static int size() {
		return size;
	}
	
	public static int empty() {
		if(size == 0) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	public static int top() {
		if(size == 0) {
			return -1;
		}
		else {
			return stack[size - 1];
		}
	}

}
