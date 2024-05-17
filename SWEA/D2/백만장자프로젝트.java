package D2;

import java.util.Scanner;

public class 백만장자프로젝트 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int t=1; t<=T; t++) {
            int N = scan.nextInt();
            long diff = 0;
            int max = 0;
            int arr[] = new int[N];
            for(int j=0; j<N; j++) {
                arr[j] = scan.nextInt();
            }
            for(int j=N-1; j>=0; j--) {
                if(arr[j]>max) {
                    max = arr[j];
                }
                diff+=max-arr[j];
            }
            System.out.println("#" + t + " " + diff);
        }
        scan.close();
    }

}
