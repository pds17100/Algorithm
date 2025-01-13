
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int cnt = 0;
    static int turn = 1;
    static int bingo[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bingo = new int[5][5];
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 5; j++) {
                bingo[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 5; j++) {
                int n = Integer.parseInt(st.nextToken());
                for (int k = 0; k < 5; k++) {
                    for (int l = 0; l < 5; l++) {
                        if (bingo[k][l] == n) {
                            bingo[k][l] = 0;
                        }
                    }
                }
                col();
                row();
                diag1();
                diag2();
                if (cnt >= 3) {
                    System.out.println(turn);
                    return;
                }
                cnt = 0;
                turn++;
            }
        }

    }

    //세로
    private static void col() {
        for (int i = 0; i < 5; i++) {
            int check = 0;
            for (int j = 0; j < 5; j++) {
                if (bingo[j][i] == 0) {
                    check++;
                }
                if (check == 5) {
                    cnt++;
                }
            }
        }
    }

    //가로
    private static void row() {
        for (int i = 0; i < 5; i++) {
            int check = 0;
            for (int j = 0; j < 5; j++) {
                if (bingo[i][j] == 0) {
                    check++;
                }
                if (check == 5) {
                    cnt++;
                }
            }
        }
    }

    //대각1
    private static void diag1() {
        int check = 0;
        for (int i = 0; i < 5; i++) {
            if (bingo[i][i] == 0) {
                check++;
            }
            if (check == 5) {
                cnt++;
            }
        }
    }

    //대각2
    private static void diag2() {
        int check = 0;
        for (int i = 0; i < 5; i++) {
            if (bingo[i][4 - i] == 0) {
                check++;
            }
            if (check == 5) {
                cnt++;
            }
        }
    }

}
