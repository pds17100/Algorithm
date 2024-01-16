package 스택;

import java.util.Scanner;
import java.util.Stack;

public class 제로3 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		Scanner scan = new Scanner(System.in);
		int K = scan.nextInt();
		for(int i=0; i<K; i++) {
			int N = scan.nextInt();
			if(N != 0) {
				stack.push(N);
			}else {
				stack.pop();
			}
		}
		int sum = 0;
		for(int o:stack){
			sum += o;
		}
		System.out.println(sum);
	}

}
