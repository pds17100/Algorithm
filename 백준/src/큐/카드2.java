package 큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class 카드2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		Deque<Integer> q = new LinkedList<Integer>();
		
		for(int i=1; i<=N; i++) {
			q.offer(i);	//offer는맨뒤에요소를추가
		}
		while(q.size() > 1) {
			q.poll();	//poll은맨앞에요소버림
			q.offer(q.poll());	//맨앞에원소버림과동시에버려진원소를맨뒤에삽입
		}
		System.out.println(q.poll());	//마지막남은원소출력
	}

}
