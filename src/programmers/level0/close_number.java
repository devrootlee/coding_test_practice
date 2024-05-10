package programmers.level0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * TITLE : 가까운 수
 * LEVEL : 0
 */
public class close_number {
    public static int solution(int[] array, int n) {
        int answer = 0;
        int diff = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            diff = Math.abs(n - array[i]);
            if (diff < min) {
                min = diff;
                answer = array[i];

            } else if (diff == min && array[i] < answer) {
                answer = array[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {3,3,4,4,5,5,6,6};
        int[] arr2 = {10, 11, 12};


        solution(arr1,5);
//        solution(arr2,13);
    }
}
