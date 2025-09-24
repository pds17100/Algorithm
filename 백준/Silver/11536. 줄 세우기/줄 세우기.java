import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String name[] = new String[N];
        String asc[] = new String[N];
        String desc[] = new String[N];
        
        for (int i = 0; i < N; i++) {
            name[i] = br.readLine();
            asc[i] = name[i];
            desc[i] = name[i];
        }
        
        Arrays.sort(asc);
        Arrays.sort(desc, Collections.reverseOrder());
        
        boolean isAscending = true;
        boolean isDescending = true;
        
        for (int j = 0; j < N; j++) {
            if (!name[j].equals(asc[j])) {
                isAscending = false;
                break;
            }
        }
        
        for (int j = 0; j < N; j++) {
            if (!name[j].equals(desc[j])) {
                isDescending = false;
                break;
            }
        }
        
        if (isAscending) {
            System.out.println("INCREASING");
        } else if (isDescending) {
            System.out.println("DECREASING");
        } else {
            System.out.println("NEITHER");
        }
    }
}