package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 간단한압축풀기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); //테스트케이스개수
        for (int t = 1; t <= T; t++) { //테스트케이스만큼반복
            System.out.println("#" + t); //테스트케이스개수출력
            int N = Integer.parseInt(br.readLine()); //N개수입력
            String str[] = new String[N]; //N개의문자열배열
            int num[] = new int[N]; //N개의숫자배열
            for (int i = 0; i < N; i++) { //0~N만큼반복
                StringTokenizer st = new StringTokenizer(br.readLine()); //공백을두고입력
                str[i] = st.nextToken(); //문자열에알파벳입력
                num[i] = Integer.parseInt(st.nextToken()); //숫자배열에숫자입력
            }
            int index = 1; //
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < num[i]; j++) { //num[i]의수만큼반복(알파벳개수)
                    System.out.print(str[i]); //문자열알파벳출력
                    index++; //증가
                    if (index > 10) { //문자열배열10이넘어가면
                        System.out.println(); //줄바꿈
                        index = 1; //인덱스초기화
                    }
                }
            }
            System.out.println();
        }
    }
}
