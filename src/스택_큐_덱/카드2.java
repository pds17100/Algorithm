package 스택_큐_덱;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 카드2 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Queue<Integer> q = new LinkedList<>();

    int N = scan.nextInt();

    for(int i=1; i<=N; i++) {
        q.offer(i);
    }

    while(q.size()>1) {
        q.poll();
        q.offer(q.poll());
    }
        System.out.println(q.poll());
}
}
