package 스택_큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 도키도키간식드리미 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        for(int i=0; i<N; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
        }
        for(int j=0; j<N; j++) {
            if(arr[j] > arr[j+1]) {
                stack.push(arr[j]);
            }
            else if(arr[j] < arr[j+1]) {
                stack2.push(arr[j]);
            }
        }
        for(int k=stack.size()-1; k<=0; k--) {
            stack2.push(stack2.pop());
        }
    }
}
