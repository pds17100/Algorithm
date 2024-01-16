package 스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 균형잡힌세상 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s;
		
		StringBuilder sb = new StringBuilder();//문자열이음

		while(true) {
			s = br.readLine();
			
			if(s.equals(".")) {
				break;
			}
			sb.append(solve(s)).append('\n');
		}
		System.out.println(sb);
		

		
	}

	private static String solve(String s) {
		
		Stack<Character> stack = new Stack<>(); 
		
		for(int i=0; i<s.length(); i++) {
			
			char c = s.charAt(i);
			
			if(c == '(' || c == '[') {
				stack.push(c);
			}
			else if(c == ')') {
				if(stack.empty() || stack.peek() != '(') {
					return "no";
				}
				else {
					stack.pop();
				}
			}
			
			else if(c == ']') {
				if(stack.empty() || stack.peek() != '[') {
					return "no";
				}
				else {
					stack.pop();
				}
			}
		}
		if(stack.empty()) {
			return "yes";
		}
		else {
			return "no";
		}
	}

}
