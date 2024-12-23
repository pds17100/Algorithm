
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        int alpa1[] = new int[26];
        int alpa2[] = new int[26];
        int result = 0;
        for (int i = 0; i < word1.length(); i++) {
            alpa1[word1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < word2.length(); i++) {
            alpa2[word2.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            int compare = alpa1[i] - alpa2[i];
            if (compare != 0) {
                result += Math.abs(compare);
            }
        }
        System.out.println(result);
    }
}
