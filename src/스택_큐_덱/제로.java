package 스택_큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.Stack;

public class 제로 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int K = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i=0; i<K; i++) {
            int N = Integer.parseInt(br.readLine());
            if(N == 0) {
                stack.pop();
            }
            else {
                stack.push(N);
            }
        }
        for(int o : stack) {
            sum += o;
        }
        System.out.println(sum);
        System.out.println("ㅎㅇ");
    }

}
