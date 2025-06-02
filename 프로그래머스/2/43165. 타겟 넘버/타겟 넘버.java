
public class Solution {
    int target;
    int numbers[];
    int answer;

    public int solution(int[] numbers, int target) {
        this.target = target;
        this.numbers = numbers;

        dfs(0, 0);

        return answer;
    }

    public void dfs(int depth, int sum) {
        if (depth == numbers.length) {
            if (sum == target) {
                answer++;
            }
            return;
        } else {
            dfs(depth + 1, sum + numbers[depth]);
            dfs(depth + 1, sum - numbers[depth]);
        }


    }

}
