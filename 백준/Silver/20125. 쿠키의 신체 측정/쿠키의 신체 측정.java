
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char arr[][] = new char[N][N];
        int headX = 0;
        int headY = 0;
        int heartX = 0;
        int heartY = 0;

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        boolean found = false;
        for (int i = 0; i < N; i++) {   //머리위치
            if (found == true) {
                break;
            }
            for (int j = 0; j < N; j++) {
                if (arr[i][j] == '*') {
                    headX = i;
                    headY = j;
                    found = true;
                    break;
                }
            }
        }

        heartX = headX + 1;
        heartY = headY;

        int leftHand = 0;
        for (int i = 0; i < heartY; i++) {  //왼팔
            if (arr[heartX][i] == '*') {
                leftHand++;
            }
        }

        int rightHand = 0;
        for (int i = heartY + 1; i < N; i++) {  //오른팔
            if (arr[heartX][i] == '*') {
                rightHand++;
            } else {
                break;
            }
        }

        int back = 0;
        for (int i = heartX + 1; i < N; i++) {  //허리
            if (arr[i][heartY] == '*') {
                back++;
            }
        }

        int left_legx = back + headX + 2;
        int left_legy = heartY - 1;
        int right_legx = back + headX + 2;
        int right_legy = heartY + 1;


        int leftLeg = 0;
        for (int i = left_legx; i < N; i++) {
            if (arr[i][left_legy] == '*') {
                leftLeg++;
            }
        }

        int rightLeg = 0;
        for (int i = right_legx; i < N; i++) {
            if (arr[i][right_legy] == '*') {
                rightLeg++;
            }
        }

        System.out.println((heartX + 1) + " " + (heartY + 1));
        System.out.println(leftHand + " " + rightHand + " " + back + " " + leftLeg + " " + rightLeg);
    }
}
