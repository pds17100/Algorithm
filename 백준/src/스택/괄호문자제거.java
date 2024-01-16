package 스택;

import java.util.Scanner;
import java.util.Stack;

public class 괄호문자제거 {	//(A(BC)D)EF(G(H)(IJ)K)LM(N)입력 -> EFLM

	public String solution(String str) {
		String answer ="";
		Stack<Character> stack = new Stack<>();
		for(char x : str.toCharArray()) {
			if(x==')') {
				while(stack.pop()!='(');
			}
			else stack.push(x);
		}
		for(int i=0; i<stack.size(); i++) answer+=stack.get(i);{
			return answer;
		}
	}
	public static void main(String[] args) {

		괄호문자제거 T = new 괄호문자제거();
		Scanner in = new Scanner(System.in);
		String str = in.next();
		System.out.println(T.solution(str));
	}

}
