package ť;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class ī��2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		Deque<Integer> q = new LinkedList<Integer>();
		
		for(int i=1; i<=N; i++) {
			q.offer(i);	//offer�¸ǵڿ���Ҹ��߰�
		}
		while(q.size() > 1) {
			q.poll();	//poll���Ǿտ���ҹ���
			q.offer(q.poll());	//�Ǿտ����ҹ��������ÿ����������Ҹ��ǵڿ�����
		}
		System.out.println(q.poll());	//�����������������
	}

}
