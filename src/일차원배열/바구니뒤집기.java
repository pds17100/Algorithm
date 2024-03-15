package 일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 바구니뒤집기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }
        for(int j=0; j<M; j++) {
            st = new StringTokenizer(br.readLine()," ");
            int A = Integer.parseInt(st.nextToken())-1;
            int B = Integer.parseInt(st.nextToken())-1;

            while (A<B) {
                int temp = arr[A];
                arr[A++] = arr[B];
                arr[B--] = temp;
            }
        }
        br.close();
        for(int baguni : arr) {
            System.out.print(baguni + " ");
        }

//        for(int i=0; i<arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
    }
}