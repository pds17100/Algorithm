package 스택_큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 식당메뉴 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 대기열을 관리하는 큐
        Deque<int[]> queue = new LinkedList<>();

        // 결과 리스트
        LinkedList<Integer> A = new LinkedList<>();
        LinkedList<Integer> B = new LinkedList<>();
        LinkedList<Integer> C = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int type = Integer.parseInt(st.nextToken());

            if (type == 1) {
                // 학생이 줄을 섬 (1 a b)
                int studentNumber = Integer.parseInt(st.nextToken());
                int preferredMenu = Integer.parseInt(st.nextToken());
                queue.add(new int[] { studentNumber, preferredMenu });
            } else {
                // 식사가 준비됨 (2 b)
                int preparedMenu = Integer.parseInt(st.nextToken());

                // 줄 맨 앞의 학생 정보를 가져옴
                int[] frontStudent = queue.poll();
                int studentNumber = frontStudent[0];
                int preferredMenu = frontStudent[1];

                // 좋아하는 메뉴인지 아닌지 판단
                if (preparedMenu == preferredMenu) {
                    A.add(studentNumber);  // 좋아하는 메뉴
                } else {
                    B.add(studentNumber);  // 좋아하지 않는 메뉴
                }
            }
        }

        // 줄에 남아있는 학생들은 식사를 못 함
        while (!queue.isEmpty()) {
            C.add(queue.poll()[0]);
        }

        // 결과 출력
        printList(A);
        printList(B);
        printList(C);
    }

    // 결과 리스트를 출력하는 함수
    public static void printList(LinkedList<Integer> list) {
        if (list.isEmpty()) {
            System.out.println("None");
        } else {
            list.sort(null);  // 오름차순 정렬
            for (int student : list) {
                System.out.print(student + " ");
            }
            System.out.println();
        }
    }
}
