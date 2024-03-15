package 일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 과제안내신분 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int[31];

        for(int i=1; i<29; i++) {
            int N = Integer.parseInt(br.readLine());
            arr[N] = 1;
        }
        for(int j=1; j<arr.length; j++) {
            if(arr[j] != 1) {
                System.out.println(j);
            }
        }
    }
}
