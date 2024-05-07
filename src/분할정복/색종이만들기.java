package 분할정복;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 색종이만들기 {
    public static int blue = 0;
    public static int whilte = 0;
    public static int[][] board;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); //N입력
        board = new int[N][N]; //N*N 2차원배열
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken()); //공백을두고값입력
            }
        }
        partition(0, 0, N); //분할함수(board[0][0]의시작위치와이차원배열N의사이즈)
        System.out.println(whilte);
        System.out.println(blue);
    }

    public static void partition(int row, int col, int size) {
        if (colorCheck(row, col, size)) { //colorCheck가true이면
            if (board[row][col] == 0) { //값이0이면white++
                whilte++;
            } else { //아니면blue++
                blue++;
            }
            return;
        }
        int newSize = size/2; //사이즈를반으로줄임 board[N/2][N/2]
        //재귀호출
        partition(row, col+newSize, newSize); //1
        partition(row, col, newSize); //2
        partition(row+newSize, col, newSize); //3
        partition(row+newSize, col+newSize, newSize); //4
    }

    public static boolean colorCheck(int row, int col, int size) { //board[row][col]값이모두1이거나모두0일경우true
        int color = board[row][col]; //color에값을넣고기준이되어비교
        for (int i = row; i < row+size; i++) {
            for (int j = col; j < col + size; j++) {
                if (board[i][j] != color) { //값이다르면false
                    return false;
                }
            }
        }
        return true;
    }
}
