import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i=0; i<N; i++) {
            if(check() == true) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean check() throws IOException {
        boolean[] check = new boolean[26];
        int prev = 0;
        String str = br.readLine();
        for(int i=0; i<str.length(); i++) {
            int now = str.charAt(i);
            if(prev != now) {
                if(check[now - 'a'] == false) {
                    check[now - 'a'] = true;
                    prev = now;
                }
                else{
                    return false;
                }
            }
            else{
                continue;
            }
        }
        return true;
    }
}
