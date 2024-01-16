package 스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 제로2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		Stack<Integer> stack = new Stack<Integer>();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			
			int a = Integer.parseInt(br.readLine());
			
			if(a == 0) {
				stack.pop();
			}
			else {
				stack.push(a);
			}
		}
		int sum=0;
	
		for(int o : stack) {	//stack에담긴원소합구하기
			sum += o;
		}
		System.out.println(sum);
	}

}
