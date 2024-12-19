package codingtest.programmers.coding.codingLevel0;

import java.util.ArrayList;
import java.util.List;

/**
 * TITLE : n의 배수 고르기
 * LEVEL : 0
 */
public class pick_a_multiple_of_n {

    public static int[] solution(int n, int[] numlist) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                list.add(numlist[i]);
            }
        }

        answer = list.stream().mapToInt(Integer::intValue).toArray();


        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] arr2 = {1, 9, 3, 10, 13, 5};
        int[] arr3 = {2, 100, 120, 600, 12, 12};

        solution(3, arr1);
        solution(5, arr2);
        solution(12, arr3);
    }
}
