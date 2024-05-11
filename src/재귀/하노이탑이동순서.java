package 재귀;

import java.util.Scanner;

import static java.lang.System.in;

public class 하노이탑이동순서 {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        int N = scan.nextInt();
        sb.append((int) (Math.pow(2, N) - 1)).append('\n');
        Hanoi(N, 1, 2, 3);
        System.out.println(sb);
    }
    /*
    N : 원판의개수
    start : 출발지
    mid : 옮기기위해이동해야하는장소
    to : 목적지
    */
    private static void Hanoi(int N, int start, int mid, int to) {
        if (N == 1) {
            sb.append(start + " " + to + "\n");
            return;
        }
        Hanoi(N - 1, start, to, mid); //N=1개를A에서B로이동

        sb.append(start + " " + to + "\n"); //1개를A에서C로이동

        Hanoi(N - 1, mid, start, to); //N-1개를B에서C로이동
    }
}
