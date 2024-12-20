package codingtest.programmers.coding.codingLevel1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * TITLE : 제일 적은 수 제거하기
 * LEVEL : 1
 */
public class eliminate_the_smallest_number {

    public static int[] solution(int[] arr) {
        int[] answer = {};

        if (arr.length == 1) {
            answer = new int[]{-1};
        } else {
            answer = new int[arr.length - 1];

            //최소값 찾기
            int min = arr[0];

            for (int i = 1; i < arr.length; i++) {
                if (min > arr[i]) {
                    min = arr[i];
                }
            }

            List<Integer> answerList = new ArrayList<>();
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] != min) {
                    answerList.add(arr[i]);
                }
            }

            for(int i = 0; i < answerList.size(); i++) {
                answer[i] = answerList.get(i);
            }
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{4,3,2,1});
        solution(new int[]{10,4,5});
    }
}
