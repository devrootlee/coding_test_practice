package codingtest.leetcode.coding.easy;
/**
 * TITLE : Two Sum
 * LEVEL : easy
 */
public class two_sum {
    public static int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        twoSum(new int[]{2,7,11,15}, 9);
        twoSum(new int[]{3,2,4}, 6);
        twoSum(new int[]{3,3}, 6);
    }
}
