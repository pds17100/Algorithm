package level1;

import java.util.HashSet;

public class 폰켓몬 {
    public static void main(String[] args) {
        int arr[] = {3,1,2,3};
        System.out.println(solution(arr));
    }
    public static int solution(int[] nums) {
        int max = nums.length/2;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        if (set.size() > max) {
            return max;
        } else {
            return set.size();
        }
    }
}
