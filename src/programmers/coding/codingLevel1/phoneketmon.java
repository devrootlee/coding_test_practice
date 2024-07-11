package programmers.coding.codingLevel1;


import java.util.HashSet;

/**
 * TITLE : 폰켓몬
 * LEVEL : 1
 */
public class phoneketmon {
    public static int solution(int[] nums) {
        int answer = nums.length / 2;

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        answer = set.size() > answer ? answer : set.size();

        return answer;
    }

    public static void main(String[] args) {
        int[] intArr1 = {3,1,2,3};
        int[] intArr2 = {3,3,3,2,2,4};
        int[] intArr3 = {3,3,3,2,2,2};

        solution(intArr1);
        solution(intArr2);
        solution(intArr3);
    }
}
