package D3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 암호생성기 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<Integer>();
        for (int t = 1; t <= 10; t++) {
            scan.nextInt();
            for (int i = 0; i < 8; i++) {
                q.add(scan.nextInt());
            }
            int count = 1;
            while (true) {
                int tmp = q.poll();
                tmp -= count;
                if (tmp <= 0) {
                    q.add(0);
                    break;
                }
                q.add(tmp);
                if (count < 5) {
                    count+=1;
                } else {
                    count = 1;
                }
//                count = count + 1 > 5 ? 1 : count + 1;
            }
            System.out.print("#" + t + " ");
            for (int i = 0; i < 8; i++) {
                System.out.print(q.poll() + " ");
            }
            System.out.println();
        }
    }
}
