package D3;

import java.util.Scanner;

public class 회문 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for(int t=1; t<=10; t++) {
            int result = 0;
            int arr[][] = new int[8][8];
            int N = scan.nextInt();
            for(int i=0; i<8; i++) {
                String str = scan.next();
                for(int j=0; j<8; j++) {
                    arr[i][j] = str.charAt(j);
                }
            }
            //가로
            for(int i=0; i<8; i++) {
                for(int j=0; j<8-N+1; j++) {
                    int temp = 0;
                    for(int k=0; k<N/2; k++) {
                        if(arr[i][j+k] != arr[i][j+N-k-1]) {
                            temp =-1;
                        }
                    }
                    if(temp == 0) {
                        result++;
                    }
                }
            }
            //세로
            for(int i=0; i<8-N+1; i++) {
                for(int j=0; j<8; j++) {
                    int temp = 0;
                    for(int k=0; k<N/2; k++) {
                        if(arr[i+k][j] != arr[i+N-k-1][j]) {
                            temp =-1;
                        }
                    }
                    if(temp == 0) {
                        result++;
                    }
                }
            }
            System.out.println("#" + t + " " + result);
        }
    }

}
